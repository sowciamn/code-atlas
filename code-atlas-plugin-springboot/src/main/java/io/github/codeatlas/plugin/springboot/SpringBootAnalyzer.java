package io.github.codeatlas.plugin.springboot;

import com.github.javaparser.ast.CompilationUnit;
import com.github.javaparser.ast.body.MethodDeclaration;
import com.github.javaparser.ast.body.TypeDeclaration;
import com.github.javaparser.ast.expr.AnnotationExpr;
import com.github.javaparser.ast.expr.ArrayInitializerExpr;
import com.github.javaparser.ast.expr.Expression;
import com.github.javaparser.ast.expr.FieldAccessExpr;
import com.github.javaparser.ast.expr.NormalAnnotationExpr;
import com.github.javaparser.ast.expr.SingleMemberAnnotationExpr;
import com.github.javaparser.ast.expr.StringLiteralExpr;
import io.github.codeatlas.core.model.AnalysisResult;
import io.github.codeatlas.core.model.ApiEndpointDoc;
import io.github.codeatlas.core.model.ClassDoc;
import io.github.codeatlas.core.model.ComponentType;
import io.github.codeatlas.core.model.ProjectOverview;
import io.github.codeatlas.core.model.ProjectSource;
import io.github.codeatlas.core.spi.CodeAnalyzerPlugin;
import io.github.codeatlas.plugin.java.JavaAnalyzer;
import io.github.codeatlas.plugin.java.RoleResolver;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.Map;
import java.util.Optional;

/**
 * Spring Boot固有のコンポーネント分類とWebエンドポイント抽出を行う解析プラグイン。
 *
 * <p>Java共通情報は{@link JavaAnalyzer}で抽出し、Springのアノテーションに基づいて
 * コンポーネント種別とHTTPマッピングを付加する。</p>
 */
public final class SpringBootAnalyzer implements CodeAnalyzerPlugin {
    private static final Map<String, ComponentType> COMPONENT_ANNOTATIONS = Map.of(
            "SpringBootApplication", ComponentType.APPLICATION,
            "RestController", ComponentType.CONTROLLER,
            "Controller", ComponentType.CONTROLLER,
            "Service", ComponentType.SERVICE,
            "Repository", ComponentType.REPOSITORY,
            "Entity", ComponentType.ENTITY,
            "Configuration", ComponentType.CONFIGURATION,
            "Component", ComponentType.COMPONENT);
    private static final Map<String, String> HTTP_METHOD_ANNOTATIONS = Map.of(
            "GetMapping", "GET",
            "PostMapping", "POST",
            "PutMapping", "PUT",
            "DeleteMapping", "DELETE",
            "PatchMapping", "PATCH");

    private final JavaAnalyzer javaAnalyzer = new JavaAnalyzer();

    /**
     * {@inheritDoc}
     */
    @Override
    public String pluginId() {
        return "springboot";
    }

    /**
     * pom.xmlのSpring Boot依存関係、またはJavaソースのSpring系アノテーションを確認する。
     *
     * @param source 収集済みのプロジェクトソース情報
     * @return Spring Bootプロジェクトとして解析可能な場合はtrue
     */
    @Override
    public boolean supports(ProjectSource source) {
        if (source.pomXml().map(this::containsSpringBoot).orElse(false)) {
            return true;
        }
        return source.javaFiles().stream().anyMatch(this::containsSpringAnnotation);
    }

    /**
     * Java共通解析、Springコンポーネント分類、APIエンドポイント抽出を実行する。
     *
     * @param source 収集済みのプロジェクトソース情報
     * @return Spring Boot固有情報を含む解析結果
     */
    @Override
    public AnalysisResult analyze(ProjectSource source) {
        return enrich(source, javaAnalyzer.analyze(source));
    }

    /**
     * Java共通解析結果へSpring固有の分類とAPIエンドポイントを追加する。
     *
     * @param source 収集済みのプロジェクトソース情報
     * @param currentResult 先行プラグインまでの解析結果
     * @return Spring固有情報を反映した解析結果
     */
    @Override
    public AnalysisResult analyze(ProjectSource source, AnalysisResult currentResult) {
        AnalysisResult base = currentResult.classes().isEmpty()
                ? javaAnalyzer.analyze(source)
                : currentResult;
        return enrich(source, base);
    }

    private AnalysisResult enrich(ProjectSource source, AnalysisResult base) {
        List<ClassDoc> classes = base.classes().stream()
                .map(classDoc -> classDoc
                        .withComponentType(componentType(classDoc))
                        .withRoleSummary(roleSummary(classDoc)))
                .sorted(Comparator.comparing(ClassDoc::className))
                .toList();
        List<ApiEndpointDoc> endpoints = extractEndpoints(source);

        ProjectOverview overview = new ProjectOverview(
                source.rootDirectory().getFileName().toString(),
                source.rootDirectory(),
                classes.size(),
                endpoints.size(),
                count(classes, ComponentType.CONTROLLER),
                count(classes, ComponentType.SERVICE),
                count(classes, ComponentType.REPOSITORY),
                count(classes, ComponentType.ENTITY));
        return new AnalysisResult(
                overview,
                classes,
                endpoints,
                base.configs(),
                base.relations(),
                base.methodCalls(),
                base.sqlStatements(),
                base.tableUsages());
    }

    /**
     * Java共通解析で確定したSPI・CLIの役割を優先し、未判定またはDTOの場合だけ
     * Springアノテーション由来の役割へ更新する。
     *
     * @param classDoc Java共通解析で得た型情報
     * @return Spring固有判定を反映した役割説明
     */
    private String roleSummary(ClassDoc classDoc) {
        String current = classDoc.roleSummary();
        if (!RoleResolver.UNKNOWN_ROLE.equals(current)
                && !current.contains("DTOです。")) {
            return current;
        }
        for (String annotation : classDoc.annotations()) {
            String role = switch (annotation) {
                case "RestController" ->
                        "このクラスは `@RestController` が付与されているため、Web API Controllerです。";
                case "Controller" ->
                        "このクラスは `@Controller` が付与されているため、Web Controllerです。";
                case "Service" ->
                        "このクラスは `@Service` が付与されているため、業務ロジックコンポーネントです。";
                case "Repository" ->
                        "このクラスは `@Repository` が付与されているため、データアクセスコンポーネントです。";
                case "Entity" ->
                        "このクラスは `@Entity` が付与されているため、永続化Entityです。";
                case "Configuration" ->
                        "このクラスは `@Configuration` が付与されているため、Spring設定クラスです。";
                default -> null;
            };
            if (role != null) {
                return role;
            }
        }
        return current;
    }

    /**
     * 型に付与されたSpringアノテーションからコンポーネント種別を決定する。
     *
     * <p>対応するアノテーションがない場合、型名の末尾がDtoまたはDTOであればDTO、
     * それ以外はUNKNOWNとして扱う。</p>
     *
     * @param classDoc Java共通解析で得た型情報
     * @return 判定したコンポーネント種別
     */
    private ComponentType componentType(ClassDoc classDoc) {
        for (String annotation : classDoc.annotations()) {
            ComponentType type = COMPONENT_ANNOTATIONS.get(annotation);
            if (type != null) {
                return type;
            }
        }
        if (classDoc.className().endsWith("Dto") || classDoc.className().endsWith("DTO")) {
            return ComponentType.DTO;
        }
        return ComponentType.UNKNOWN;
    }

    /**
     * Controller型のマッピングアノテーションからAPIエンドポイントを抽出する。
     *
     * <p>解析に失敗したファイルは標準エラーへ理由を出力し、ほかのファイルの処理を継続する。</p>
     *
     * @param source 収集済みのプロジェクトソース情報
     * @return パスとHTTPメソッドで安定ソートしたエンドポイント一覧
     */
    private List<ApiEndpointDoc> extractEndpoints(ProjectSource source) {
        List<ApiEndpointDoc> endpoints = new ArrayList<>();
        for (Path javaFile : source.javaFiles()) {
            try {
                CompilationUnit unit = javaAnalyzer.parse(javaFile);
                for (TypeDeclaration<?> type : unit.getTypes()) {
                    if (!isController(type)) {
                        continue;
                    }
                    String classPath = mappingPath(findAnnotation(type.getAnnotations(), "RequestMapping"));
                    for (MethodDeclaration method : type.getMethods()) {
                        endpoints.addAll(toEndpoints(
                                type.getNameAsString(),
                                method,
                                classPath,
                                source.relativePath(javaFile).toString()));
                    }
                }
            } catch (RuntimeException | IOException exception) {
                System.err.printf("Failed to extract endpoints from %s: %s%n",
                        javaFile, exception.getMessage());
            }
        }
        return endpoints.stream()
                .sorted(Comparator.comparing(ApiEndpointDoc::path)
                        .thenComparing(ApiEndpointDoc::httpMethod))
                .toList();
    }

    private List<ApiEndpointDoc> toEndpoints(
            String className,
            MethodDeclaration method,
            String classPath,
            String sourcePath
    ) {
        List<ApiEndpointDoc> endpoints = new ArrayList<>();
        for (AnnotationExpr annotation : method.getAnnotations()) {
            String annotationName = annotation.getName().getIdentifier();
            String httpMethod = HTTP_METHOD_ANNOTATIONS.get(annotationName);
            if (httpMethod != null) {
                endpoints.add(endpoint(
                        className, method, httpMethod, classPath, mappingPath(Optional.of(annotation)), sourcePath));
            } else if ("RequestMapping".equals(annotationName)) {
                List<String> methods = requestMethods(annotation);
                if (methods.isEmpty()) {
                    methods = List.of("REQUEST");
                }
                for (String requestMethod : methods) {
                    endpoints.add(endpoint(
                            className, method, requestMethod, classPath, mappingPath(Optional.of(annotation)), sourcePath));
                }
            }
        }
        return endpoints;
    }

    private ApiEndpointDoc endpoint(
            String className,
            MethodDeclaration method,
            String httpMethod,
            String classPath,
            String methodPath,
            String sourcePath
    ) {
        return new ApiEndpointDoc(
                className,
                method.getNameAsString(),
                httpMethod,
                combinePaths(classPath, methodPath),
                sourcePath);
    }

    private Optional<AnnotationExpr> findAnnotation(
            Iterable<AnnotationExpr> annotations, String annotationName) {
        for (AnnotationExpr annotation : annotations) {
            if (annotationName.equals(annotation.getName().getIdentifier())) {
                return Optional.of(annotation);
            }
        }
        return Optional.empty();
    }

    /**
     * マッピングアノテーションのvalueまたはpath属性から先頭のパス文字列を取得する。
     *
     * <p>複数パスが配列で指定されている場合、MVPでは先頭要素のみを使用する。</p>
     *
     * @param annotation 対象のマッピングアノテーション
     * @return パス。取得できない場合は空文字
     */
    private String mappingPath(Optional<AnnotationExpr> annotation) {
        if (annotation.isEmpty()) {
            return "";
        }
        AnnotationExpr value = annotation.orElseThrow();
        if (value instanceof SingleMemberAnnotationExpr single) {
            return firstString(single.getMemberValue()).orElse("");
        }
        if (value instanceof NormalAnnotationExpr normal) {
            return normal.getPairs().stream()
                    .filter(pair -> "value".equals(pair.getNameAsString())
                            || "path".equals(pair.getNameAsString()))
                    .map(pair -> firstString(pair.getValue()))
                    .flatMap(Optional::stream)
                    .findFirst()
                    .orElse("");
        }
        return "";
    }

    /**
     * 文字列リテラルまたは配列式から先頭の文字列値を取得する。
     *
     * @param expression アノテーション属性の式
     * @return 取得した文字列。対応外の式の場合は空
     */
    private Optional<String> firstString(Expression expression) {
        if (expression instanceof StringLiteralExpr stringLiteral) {
            return Optional.of(stringLiteral.asString());
        }
        if (expression instanceof ArrayInitializerExpr array) {
            return array.getValues().stream()
                    .map(this::firstString)
                    .flatMap(Optional::stream)
                    .findFirst();
        }
        return Optional.empty();
    }

    /**
     * RequestMappingのmethod属性からHTTPメソッド名を抽出する。
     *
     * @param annotation RequestMappingアノテーション
     * @return 指定されたHTTPメソッド名。method属性がない場合は空
     */
    private List<String> requestMethods(AnnotationExpr annotation) {
        if (!(annotation instanceof NormalAnnotationExpr normal)) {
            return List.of();
        }
        return normal.getPairs().stream()
                .filter(pair -> "method".equals(pair.getNameAsString()))
                .flatMap(pair -> expressions(pair.getValue()).stream())
                .map(this::requestMethodName)
                .flatMap(Optional::stream)
                .toList();
    }

    private List<Expression> expressions(Expression expression) {
        if (expression instanceof ArrayInitializerExpr array) {
            return array.getValues();
        }
        return List.of(expression);
    }

    private Optional<String> requestMethodName(Expression expression) {
        if (expression instanceof FieldAccessExpr fieldAccess) {
            return Optional.of(fieldAccess.getNameAsString());
        }
        String text = expression.toString();
        int separator = text.lastIndexOf('.');
        return Optional.of(separator >= 0 ? text.substring(separator + 1) : text);
    }

    private boolean isController(TypeDeclaration<?> type) {
        return type.getAnnotations().stream()
                .map(annotation -> annotation.getName().getIdentifier())
                .anyMatch(name -> "RestController".equals(name) || "Controller".equals(name));
    }

    /**
     * クラスレベルとメソッドレベルのパスを単一の絶対パスへ結合する。
     *
     * @param classPath クラスレベルのパス
     * @param methodPath メソッドレベルのパス
     * @return スラッシュを正規化した結合パス
     */
    private String combinePaths(String classPath, String methodPath) {
        String combined = ("/" + classPath + "/" + methodPath).replaceAll("/+", "/");
        if (combined.length() > 1 && combined.endsWith("/")) {
            return combined.substring(0, combined.length() - 1);
        }
        return combined;
    }

    private int count(List<ClassDoc> classes, ComponentType type) {
        return Math.toIntExact(
                classes.stream().filter(classDoc -> classDoc.componentType() == type).count());
    }

    private boolean containsSpringBoot(Path pomXml) {
        try {
            return Files.readString(pomXml).contains("spring-boot");
        } catch (IOException exception) {
            System.err.printf("Failed to inspect %s: %s%n", pomXml, exception.getMessage());
            return false;
        }
    }

    private boolean containsSpringAnnotation(Path javaFile) {
        try {
            String source = Files.readString(javaFile);
            return COMPONENT_ANNOTATIONS.keySet().stream()
                    .anyMatch(annotation -> source.contains("@" + annotation));
        } catch (IOException exception) {
            System.err.printf("Failed to inspect %s: %s%n", javaFile, exception.getMessage());
            return false;
        }
    }
}
