package io.github.codeatlas.plugin.mybatis;

import io.github.codeatlas.core.model.AnalysisResult;
import io.github.codeatlas.core.model.ClassDoc;
import io.github.codeatlas.core.model.ProjectOverview;
import io.github.codeatlas.core.model.ProjectSource;
import io.github.codeatlas.core.model.SqlStatementDoc;
import io.github.codeatlas.core.model.TableUsageDoc;
import io.github.codeatlas.core.spi.CodeAnalyzerPlugin;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

/**
 * MyBatis Mapper XMLからSQL文とテーブル利用情報を抽出する解析プラグイン。
 */
public final class MyBatisAnalyzer implements CodeAnalyzerPlugin {
    private static final String MAPPER_ROLE =
            "このインターフェースは `@Mapper` が付与されているため、MyBatis Mapper interfaceです。";
    private final MyBatisMapperXmlParser parser = new MyBatisMapperXmlParser();

    /**
     * {@inheritDoc}
     */
    @Override
    public String pluginId() {
        return "mybatis";
    }

    /**
     * MyBatis Mapper XMLまたは@Mapper付きJavaソースが存在するか確認する。
     *
     * @param source 収集済みのプロジェクトソース情報
     * @return MyBatis固有の解析対象が1件以上存在する場合はtrue
     */
    @Override
    public boolean supports(ProjectSource source) {
        boolean hasMapperXml = mapperXmlFiles(source).stream().anyMatch(path -> {
            try {
                return parser.parse(path, source.relativePath(path)).isPresent();
            } catch (IOException | IllegalArgumentException exception) {
                return false;
            }
        });
        return hasMapperXml || source.javaFiles().stream().anyMatch(this::containsMapperAnnotation);
    }

    /**
     * MyBatis情報だけを持つ解析結果を作成する。
     *
     * @param source 収集済みのプロジェクトソース情報
     * @return SQL文とテーブル利用情報を含む解析結果
     */
    @Override
    public AnalysisResult analyze(ProjectSource source) {
        ProjectOverview overview = new ProjectOverview(
                source.rootDirectory().getFileName().toString(),
                source.rootDirectory(),
                0, 0, 0, 0, 0, 0);
        AnalysisResult empty = new AnalysisResult(
                overview, List.of(), List.of(), List.of(), List.of(), List.of(), List.of());
        return analyze(source, empty);
    }

    /**
     * 先行解析結果へMyBatis SQL、テーブル利用、Mapper interfaceの役割を追加する。
     *
     * @param source 収集済みのプロジェクトソース情報
     * @param currentResult 先行プラグインまでの解析結果
     * @return MyBatis情報を反映した解析結果
     */
    @Override
    public AnalysisResult analyze(ProjectSource source, AnalysisResult currentResult) {
        List<SqlStatementDoc> statements = parseStatements(source);
        List<TableUsageDoc> tableUsages = statements.stream()
                .flatMap(statement -> statement.tableNames().stream()
                        .map(tableName -> new TableUsageDoc(
                                tableName,
                                statement.ownerName(),
                                statement.statementType().name(),
                                statement.statementId(),
                                statement.sourcePath())))
                .sorted(Comparator.comparing(TableUsageDoc::tableName)
                        .thenComparing(TableUsageDoc::usedBy)
                        .thenComparing(TableUsageDoc::sourceName))
                .toList();
        List<ClassDoc> classes = currentResult.classes().stream()
                .map(this::applyMapperRole)
                .toList();
        return new AnalysisResult(
                currentResult.overview(),
                classes,
                currentResult.endpoints(),
                currentResult.configs(),
                currentResult.relations(),
                statements,
                tableUsages);
    }

    /**
     * Mapper XMLを個別に解析し、解析不能なファイルがあっても残りの処理を継続する。
     *
     * @param source 収集済みのプロジェクトソース情報
     * @return namespaceとstatement IDで安定ソートしたSQL文
     */
    private List<SqlStatementDoc> parseStatements(ProjectSource source) {
        List<SqlStatementDoc> statements = new ArrayList<>();
        for (Path xmlFile : mapperXmlFiles(source)) {
            try {
                parser.parse(xmlFile, source.relativePath(xmlFile))
                        .ifPresent(mapper -> statements.addAll(mapper.statements()));
            } catch (IOException | IllegalArgumentException exception) {
                System.err.printf("Failed to analyze MyBatis Mapper %s: %s%n",
                        xmlFile, exception.getMessage());
            }
        }
        return statements.stream()
                .sorted(Comparator.comparing(SqlStatementDoc::ownerName)
                        .thenComparing(SqlStatementDoc::statementId))
                .toList();
    }

    /**
     * resourceFilesのうち、src/main/resources配下にあるXMLだけを候補として返す。
     *
     * @param source 収集済みのプロジェクトソース情報
     * @return MyBatis Mapper XMLの解析候補
     */
    private List<Path> mapperXmlFiles(ProjectSource source) {
        return source.resourceFiles().stream()
                .filter(path -> path.getFileName().toString().endsWith(".xml"))
                .filter(path -> isMainResource(source.relativePath(path)))
                .toList();
    }

    private boolean isMainResource(Path relativePath) {
        for (int index = 0; index + 2 < relativePath.getNameCount(); index++) {
            if ("src".equals(relativePath.getName(index).toString())
                    && "main".equals(relativePath.getName(index + 1).toString())
                    && "resources".equals(relativePath.getName(index + 2).toString())) {
                return true;
            }
        }
        return false;
    }

    private ClassDoc applyMapperRole(ClassDoc classDoc) {
        if (!classDoc.annotations().contains("Mapper")) {
            return classDoc;
        }
        if (classDoc.roleSummary().contains("DTOです。")
                || classDoc.roleSummary().startsWith("コードから")) {
            return classDoc.withRoleSummary(MAPPER_ROLE);
        }
        return classDoc;
    }

    private boolean containsMapperAnnotation(Path javaFile) {
        try {
            return Files.readString(javaFile).contains("@Mapper");
        } catch (IOException exception) {
            System.err.printf("Failed to inspect %s: %s%n", javaFile, exception.getMessage());
            return false;
        }
    }
}
