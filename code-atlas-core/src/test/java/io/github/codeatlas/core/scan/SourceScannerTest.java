package io.github.codeatlas.core.scan;

import io.github.codeatlas.core.model.ProjectSource;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.io.TempDir;

import java.nio.file.Files;
import java.nio.file.Path;
import java.util.Set;

import static org.assertj.core.api.Assertions.assertThat;

class SourceScannerTest {
    @TempDir
    Path tempDir;

    @Test
    void collectsSourcesAndExcludesGeneratedAndDocumentationDirectories() throws Exception {
        Path javaFile = create("src/main/java/example/App.java");
        Path configFile = create("src/main/resources/application.yml");
        Path mapperXml = create("src/main/resources/mapper/AppMapper.xml");
        create("target/generated/Generated.java");
        create(".git/internal/Hidden.java");
        create("docs/generated/Documented.java");

        ProjectSource source = new SourceScanner().scan(tempDir);

        assertThat(source.javaFiles()).containsExactly(javaFile);
        assertThat(source.resourceFiles()).containsExactly(configFile, mapperXml);
        assertThat(source.configFiles()).containsExactly(configFile);
        assertThat(source.javaFiles())
                .noneMatch(path -> path.toString().contains("target"))
                .noneMatch(path -> path.toString().contains(".git"))
                .noneMatch(path -> path.toString().contains("docs"));
    }

    @Test
    void excludesAdditionalDirectoryNamesAndRelativePaths() throws Exception {
        Path included = create("src/main/java/example/App.java");
        create("examples/demo/src/main/java/example/Demo.java");
        create("fixtures/generated/src/main/java/example/Generated.java");
        create("fixtures/kept/src/main/java/example/Kept.java");

        ProjectSource source = new SourceScanner(Set.of("examples", "fixtures/generated"))
                .scan(tempDir);

        assertThat(source.javaFiles())
                .containsExactly(
                        tempDir.resolve("fixtures/kept/src/main/java/example/Kept.java"),
                        included);
    }

    @Test
    void excludesMultipleAdditionalDirectoryNames() throws Exception {
        Path included = create("src/main/java/example/App.java");
        create("examples/Demo.java");
        create("samples/Sample.java");

        ProjectSource source = new SourceScanner(Set.of("examples", "samples")).scan(tempDir);

        assertThat(source.javaFiles()).containsExactly(included);
    }

    private Path create(String relativePath) throws Exception {
        Path path = tempDir.resolve(relativePath);
        Files.createDirectories(path.getParent());
        return Files.writeString(path, "");
    }
}
