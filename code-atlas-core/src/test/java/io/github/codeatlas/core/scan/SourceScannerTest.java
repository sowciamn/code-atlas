package io.github.codeatlas.core.scan;

import io.github.codeatlas.core.model.ProjectSource;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.io.TempDir;

import java.nio.file.Files;
import java.nio.file.Path;

import static org.assertj.core.api.Assertions.assertThat;

class SourceScannerTest {
    @TempDir
    Path tempDir;

    @Test
    void collectsJavaAndApplicationConfigAndExcludesGeneratedDirectories() throws Exception {
        Path javaFile = create("src/main/java/example/App.java");
        Path configFile = create("src/main/resources/application.yml");
        create("target/generated/Generated.java");
        create(".git/internal/Hidden.java");

        ProjectSource source = new SourceScanner().scan(tempDir);

        assertThat(source.javaFiles()).containsExactly(javaFile);
        assertThat(source.resourceFiles()).contains(configFile);
        assertThat(source.configFiles()).containsExactly(configFile);
        assertThat(source.javaFiles())
                .noneMatch(path -> path.toString().contains("target"))
                .noneMatch(path -> path.toString().contains(".git"));
    }

    private Path create(String relativePath) throws Exception {
        Path path = tempDir.resolve(relativePath);
        Files.createDirectories(path.getParent());
        return Files.writeString(path, "");
    }
}
