package io.github.codeatlas.plugin.mybatis;

import io.github.codeatlas.core.model.AnalysisResult;
import io.github.codeatlas.core.model.ClassDoc;
import io.github.codeatlas.core.model.ComponentType;
import io.github.codeatlas.core.model.ProjectOverview;
import io.github.codeatlas.core.scan.SourceScanner;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.io.TempDir;

import java.nio.file.Files;
import java.nio.file.Path;
import java.util.List;

import static org.assertj.core.api.Assertions.assertThat;

class MyBatisAnalyzerTest {
    @TempDir
    Path tempDir;

    @Test
    void addsSqlTableUsageAndMapperRoleToCurrentResult() throws Exception {
        Path javaFile = tempDir.resolve("src/main/java/example/UserMapper.java");
        Files.createDirectories(javaFile.getParent());
        Files.writeString(javaFile, "@Mapper interface UserMapper {}");
        Path xml = tempDir.resolve("src/main/resources/mapper/UserMapper.xml");
        Files.createDirectories(xml.getParent());
        Files.writeString(xml, """
                <mapper namespace="example.UserMapper">
                    <select id="findAll">select * from users</select>
                </mapper>
                """);
        ClassDoc mapper = new ClassDoc(
                "example",
                "UserMapper",
                "INTERFACE",
                Path.of("src/main/java/example/UserMapper.java"),
                ComponentType.UNKNOWN,
                List.of("Mapper"),
                List.of(),
                List.of(),
                "コードから機械的に判定できる役割情報はありません。");
        AnalysisResult current = new AnalysisResult(
                new ProjectOverview("sample", tempDir, 1, 0, 0, 0, 0, 0),
                List.of(mapper),
                List.of(),
                List.of(),
                List.of(),
                List.of(),
                List.of(),
                List.of());

        var source = new SourceScanner().scan(tempDir);
        MyBatisAnalyzer analyzer = new MyBatisAnalyzer();
        assertThat(analyzer.supports(source)).isTrue();

        AnalysisResult result = analyzer.analyze(source, current);

        assertThat(result.classes().getFirst().roleSummary())
                .contains("MyBatis Mapper interface");
        assertThat(result.sqlStatements()).singleElement().satisfies(statement -> {
            assertThat(statement.ownerName()).isEqualTo("example.UserMapper");
            assertThat(statement.tableNames()).containsExactly("users");
        });
        assertThat(result.tableUsages()).singleElement().satisfies(usage -> {
            assertThat(usage.tableName()).isEqualTo("users");
            assertThat(usage.sourceName()).isEqualTo("findAll");
        });
    }
}
