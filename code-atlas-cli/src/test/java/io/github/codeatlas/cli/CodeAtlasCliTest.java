package io.github.codeatlas.cli;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.io.TempDir;
import picocli.CommandLine;

import java.nio.file.Files;
import java.nio.file.Path;

import static org.assertj.core.api.Assertions.assertThat;

class CodeAtlasCliTest {
    @TempDir
    Path tempDir;

    @Test
    void acceptsRepeatedExcludeOptions() throws Exception {
        Path source = createSourceTree();
        Path output = tempDir.resolve("output-repeated");

        int exitCode = new CommandLine(new CodeAtlasCli()).execute(
                "generate",
                "--source", source.toString(),
                "--output", output.toString(),
                "--exclude", "examples",
                "--exclude", "fixtures");

        assertThat(exitCode).isZero();
        assertGeneratedClasses(output);
    }

    @Test
    void acceptsCommaSeparatedExcludeOptions() throws Exception {
        Path source = createSourceTree();
        Path output = tempDir.resolve("output-comma");

        int exitCode = new CommandLine(new CodeAtlasCli()).execute(
                "generate",
                "--source", source.toString(),
                "--output", output.toString(),
                "--exclude", "examples,fixtures");

        assertThat(exitCode).isZero();
        assertGeneratedClasses(output);
    }

    private Path createSourceTree() throws Exception {
        Path source = tempDir.resolve("source");
        write(source, "src/main/java/example/App.java", "package example; class App {}");
        write(source, "examples/Demo.java", "class Demo {}");
        write(source, "fixtures/Fixture.java", "class Fixture {}");
        return source;
    }

    private void assertGeneratedClasses(Path output) {
        assertThat(output.resolve("classes/App.md")).exists();
        assertThat(output.resolve("classes/Demo.md")).doesNotExist();
        assertThat(output.resolve("classes/Fixture.md")).doesNotExist();
    }

    private void write(Path source, String relativePath, String content) throws Exception {
        Path file = source.resolve(relativePath);
        Files.createDirectories(file.getParent());
        Files.writeString(file, content);
    }
}
