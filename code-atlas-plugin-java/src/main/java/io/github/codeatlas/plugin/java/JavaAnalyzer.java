package io.github.codeatlas.plugin.java;

import com.github.javaparser.JavaParser;
import com.github.javaparser.ParseResult;
import com.github.javaparser.ParserConfiguration;
import com.github.javaparser.ast.CompilationUnit;
import com.github.javaparser.ast.body.AnnotationDeclaration;
import com.github.javaparser.ast.body.ClassOrInterfaceDeclaration;
import com.github.javaparser.ast.body.ConstructorDeclaration;
import com.github.javaparser.ast.body.EnumDeclaration;
import com.github.javaparser.ast.body.FieldDeclaration;
import com.github.javaparser.ast.body.MethodDeclaration;
import com.github.javaparser.ast.body.TypeDeclaration;
import com.github.javaparser.ast.expr.AnnotationExpr;
import com.github.javaparser.ast.expr.MethodCallExpr;
import com.github.javaparser.ast.type.ClassOrInterfaceType;
import com.github.javaparser.ast.type.Type;
import io.github.codeatlas.core.model.AnalysisResult;
import io.github.codeatlas.core.model.ClassDoc;
import io.github.codeatlas.core.model.ClassRelationDoc;
import io.github.codeatlas.core.model.ComponentType;
import io.github.codeatlas.core.model.ConfigDoc;
import io.github.codeatlas.core.model.FieldDoc;
import io.github.codeatlas.core.model.MethodDoc;
import io.github.codeatlas.core.model.MethodCallDoc;
import io.github.codeatlas.core.model.ParameterDoc;
import io.github.codeatlas.core.model.ProjectOverview;
import io.github.codeatlas.core.model.ProjectSource;
import io.github.codeatlas.core.model.RelationType;
import io.github.codeatlas.core.spi.CodeAnalyzerPlugin;

import java.io.IOException;
import java.nio.file.Path;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Set;

/**
 * JavaParserを使用してJavaソースの構文情報を抽出する解析プラグイン。
 *
 * <p>型解決は行わず、ソースに記述された型名、アノテーション、メソッド、
 * フィールド、メソッド呼び出し式、および同一プロジェクト内クラスへの参照を
 * 解析結果へ変換する。</p>
 */
public final class JavaAnalyzer implements CodeAnalyzerPlugin {
    private final JavaParser parser = new JavaParser(
            new ParserConfiguration().setLanguageLevel(ParserConfiguration.LanguageLevel.JAVA_21));

    /**
     * {@inheritDoc}
     */
    @Override
    public String pluginId() {
        return "java";
    }

    /**
     * Javaソースが1件以上存在するプロジェクトを解析対象とする。
     *
     * @param source 収集済みのプロジェクトソース情報
     * @return Javaソースが存在する場合はtrue
     */
    @Override
    public boolean supports(ProjectSource source) {
        return !source.javaFiles().isEmpty();
    }

    /**
     * Javaソースと設定ファイルを解析し、Java共通の解析結果を作成する。
     *
     * <p>フレームワーク固有の分類やAPI抽出は行わないため、コンポーネント種別は
     * {@link ComponentType#UNKNOWN}、エンドポイント一覧は空となる。</p>
     *
     * @param source 収集済みのプロジェクトソース情報
     * @return Java共通の解析結果
     */
    @Override
    public AnalysisResult analyze(ProjectSource source) {
        List<ClassDoc> classes = analyzeClasses(source);
        List<ClassRelationDoc> relations = analyzeRelations(source, classes);
        List<MethodCallDoc> methodCalls = analyzeMethodCalls(source);
        List<ConfigDoc> configs = source.configFiles().stream()
                .map(path -> new ConfigDoc(source.relativePath(path), path.getFileName().toString()))
                .toList();
        ProjectOverview overview = new ProjectOverview(
                source.rootDirectory().getFileName().toString(),
                source.rootDirectory(),
                classes.size(),
                0,
                0,
                0,
                0,
                0);
        return new AnalysisResult(
                overview, classes, List.of(), configs, relations, methodCalls, List.of(), List.of());
    }

    /**
     * 各Javaメソッド内のメソッド呼び出し式を構文木から抽出する。
     *
     * <p>型解決や呼び出し先クラスの特定は行わない。解析できないファイルは理由を
     * 標準エラーへ出力し、残りのファイルの解析を継続する。</p>
     *
     * @param source 収集済みのプロジェクトソース情報
     * @return 呼び出し元と式で安定した順序に並べたメソッド呼び出し
     */
    public List<MethodCallDoc> analyzeMethodCalls(ProjectSource source) {
        List<MethodCallDoc> methodCalls = new ArrayList<>();
        for (Path javaFile : source.javaFiles()) {
            try {
                CompilationUnit unit = parse(javaFile);
                Path sourcePath = source.relativePath(javaFile);
                for (TypeDeclaration<?> type : unit.getTypes()) {
                    for (MethodDeclaration method : type.getMethods()) {
                        method.findAll(MethodCallExpr.class).stream()
                                .map(call -> new MethodCallDoc(
                                        type.getNameAsString(),
                                        method.getNameAsString(),
                                        call.getScope().map(Object::toString).orElse(""),
                                        call.getNameAsString(),
                                        call.toString(),
                                        sourcePath))
                                .forEach(methodCalls::add);
                    }
                }
            } catch (RuntimeException | IOException exception) {
                System.err.printf("Failed to analyze method calls in %s: %s%n",
                        javaFile, exception.getMessage());
            }
        }
        return methodCalls.stream()
                .sorted(Comparator.comparing(MethodCallDoc::sourceClassName)
                        .thenComparing(MethodCallDoc::sourceMethodName)
                        .thenComparing(call -> call.sourcePath().toString())
                        .thenComparing(MethodCallDoc::expression))
                .toList();
    }

    /**
     * 各Javaファイルのトップレベル型を解析する。
     *
     * <p>解析できないファイルは標準エラーへ理由を出力し、残りのファイルの解析を継続する。</p>
     *
     * @param source 収集済みのプロジェクトソース情報
     * @return 正常に解析できた型情報
     */
    public List<ClassDoc> analyzeClasses(ProjectSource source) {
        List<ClassDoc> classes = new ArrayList<>();
        for (Path javaFile : source.javaFiles()) {
            try {
                CompilationUnit unit = parse(javaFile);
                for (TypeDeclaration<?> type : unit.getTypes()) {
                    classes.add(toClassDoc(unit, type, source.relativePath(javaFile)));
                }
            } catch (RuntimeException | IOException exception) {
                System.err.printf("Failed to analyze %s: %s%n", javaFile, exception.getMessage());
            }
        }
        return List.copyOf(classes);
    }

    /**
     * Javaメンバーの型から同一プロジェクト内クラスへの参照を抽出する。
     *
     * <p>型解決は行わず、型構文に含まれる単純名と解析済みクラス名を照合する。
     * 解析できないファイルは理由を標準エラーへ出力し、残りの解析を継続する。</p>
     *
     * @param source 収集済みのプロジェクトソース情報
     * @param classes 照合対象の解析済みクラス
     * @return 安定した順序に並べたクラス間参照
     */
    private List<ClassRelationDoc> analyzeRelations(ProjectSource source, List<ClassDoc> classes) {
        Set<String> projectClassNames = new HashSet<>();
        classes.forEach(classDoc -> projectClassNames.add(classDoc.className()));
        Set<ClassRelationDoc> relations = new LinkedHashSet<>();

        for (Path javaFile : source.javaFiles()) {
            try {
                CompilationUnit unit = parse(javaFile);
                for (TypeDeclaration<?> type : unit.getTypes()) {
                    extractRelations(type, projectClassNames, relations);
                }
            } catch (RuntimeException | IOException exception) {
                System.err.printf("Failed to analyze relations in %s: %s%n",
                        javaFile, exception.getMessage());
            }
        }

        return relations.stream()
                .sorted(Comparator.comparing(ClassRelationDoc::sourceClassName)
                        .thenComparing(ClassRelationDoc::targetClassName)
                        .thenComparing(relation -> relation.relationType().name())
                        .thenComparing(ClassRelationDoc::sourceMemberName))
                .toList();
    }

    /**
     * Javaファイルを構文解析してCompilationUnitへ変換する。
     *
     * @param javaFile 解析対象のJavaファイル
     * @return 構文解析済みのCompilationUnit
     * @throws IOException ファイルを読み取れない場合
     * @throws IllegalArgumentException JavaParserが有効な構文木を生成できない場合
     */
    public CompilationUnit parse(Path javaFile) throws IOException {
        ParseResult<CompilationUnit> result = parser.parse(javaFile);
        if (!result.isSuccessful() || result.getResult().isEmpty()) {
            throw new IllegalArgumentException(result.getProblems().toString());
        }
        return result.getResult().orElseThrow();
    }

    private ClassDoc toClassDoc(CompilationUnit unit, TypeDeclaration<?> type, Path sourcePath) {
        String packageName = unit.getPackageDeclaration()
                .map(declaration -> declaration.getNameAsString())
                .orElse("");
        List<MethodDoc> methods = type.getMethods().stream()
                .map(this::toMethodDoc)
                .toList();
        List<FieldDoc> fields = type.getFields().stream()
                .flatMap(field -> field.getVariables().stream()
                        .map(variable -> new FieldDoc(
                                variable.getTypeAsString(),
                                variable.getNameAsString(),
                                annotationNames(field.getAnnotations()))))
                .toList();

        return new ClassDoc(
                packageName,
                type.getNameAsString(),
                declarationKind(type),
                sourcePath,
                ComponentType.UNKNOWN,
                annotationNames(type.getAnnotations()),
                methods,
                fields,
                new RoleResolver().resolve(type));
    }

    private void extractRelations(
            TypeDeclaration<?> type,
            Set<String> projectClassNames,
            Set<ClassRelationDoc> relations
    ) {
        String sourceClassName = type.getNameAsString();
        for (FieldDeclaration field : type.getFields()) {
            field.getVariables().forEach(variable -> addRelations(
                    relations,
                    projectClassNames,
                    sourceClassName,
                    variable.getType(),
                    RelationType.FIELD,
                    variable.getNameAsString()));
        }
        for (ConstructorDeclaration constructor : type.getConstructors()) {
            constructor.getParameters().forEach(parameter -> addRelations(
                    relations,
                    projectClassNames,
                    sourceClassName,
                    parameter.getType(),
                    RelationType.CONSTRUCTOR_PARAMETER,
                    parameter.getNameAsString()));
        }
        for (MethodDeclaration method : type.getMethods()) {
            method.getParameters().forEach(parameter -> addRelations(
                    relations,
                    projectClassNames,
                    sourceClassName,
                    parameter.getType(),
                    RelationType.METHOD_PARAMETER,
                    parameter.getNameAsString()));
            addRelations(
                    relations,
                    projectClassNames,
                    sourceClassName,
                    method.getType(),
                    RelationType.METHOD_RETURN_TYPE,
                    method.getNameAsString());
        }
    }

    private void addRelations(
            Set<ClassRelationDoc> relations,
            Set<String> projectClassNames,
            String sourceClassName,
            Type type,
            RelationType relationType,
            String sourceMemberName
    ) {
        type.findAll(ClassOrInterfaceType.class).stream()
                .map(ClassOrInterfaceType::getNameAsString)
                .filter(projectClassNames::contains)
                .map(targetClassName -> new ClassRelationDoc(
                        sourceClassName, targetClassName, relationType, sourceMemberName))
                .forEach(relations::add);
    }

    private MethodDoc toMethodDoc(MethodDeclaration method) {
        List<ParameterDoc> parameters = method.getParameters().stream()
                .map(parameter -> new ParameterDoc(
                        parameter.getTypeAsString(),
                        parameter.getNameAsString()))
                .toList();
        return new MethodDoc(
                method.getNameAsString(),
                method.getTypeAsString(),
                parameters,
                annotationNames(method.getAnnotations()));
    }

    private List<String> annotationNames(Iterable<AnnotationExpr> annotations) {
        List<String> names = new ArrayList<>();
        annotations.forEach(annotation -> names.add(annotation.getName().getIdentifier()));
        return List.copyOf(names);
    }

    private String declarationKind(TypeDeclaration<?> type) {
        if (type instanceof ClassOrInterfaceDeclaration declaration) {
            return declaration.isInterface() ? "INTERFACE" : "CLASS";
        }
        if (type instanceof EnumDeclaration) {
            return "ENUM";
        }
        if (type instanceof AnnotationDeclaration) {
            return "ANNOTATION";
        }
        return "TYPE";
    }
}
