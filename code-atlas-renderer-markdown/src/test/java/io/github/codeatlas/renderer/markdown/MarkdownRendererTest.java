package io.github.codeatlas.renderer.markdown;

import io.github.codeatlas.core.model.AnalysisResult;
import io.github.codeatlas.core.model.ApiEndpointDoc;
import io.github.codeatlas.core.model.ClassDoc;
import io.github.codeatlas.core.model.ClassRelationDoc;
import io.github.codeatlas.core.model.ComponentType;
import io.github.codeatlas.core.model.ConfigDoc;
import io.github.codeatlas.core.model.ProjectOverview;
import io.github.codeatlas.core.model.RelationType;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.io.TempDir;

import java.nio.file.Files;
import java.nio.file.Path;
import java.util.List;

import static org.assertj.core.api.Assertions.assertThat;

class MarkdownRendererTest {
    @TempDir
    Path tempDir;

    @Test
    void generatesAllMarkdownDocuments() throws Exception {
        Path sourceRoot = Path.of("").toAbsolutePath().normalize().resolve("examples/sample");
        ClassDoc controller = new ClassDoc(
                "example",
                "UserController",
                "CLASS",
                Path.of("src/main/java/example/UserController.java"),
                ComponentType.CONTROLLER,
                List.of("RestController"),
                List.of(),
                List.of());
        ClassDoc service = new ClassDoc(
                "example",
                "UserService",
                "CLASS",
                Path.of("src/main/java/example/UserService.java"),
                ComponentType.SERVICE,
                List.of("Service"),
                List.of(),
                List.of());
        AnalysisResult result = new AnalysisResult(
                new ProjectOverview("sample", sourceRoot, 2, 1, 1, 1, 0, 0),
                List.of(controller, service),
                List.of(new ApiEndpointDoc(
                        "UserController",
                        "findAll",
                        "GET",
                        "/api/users",
                        "src/main/java/example/UserController.java")),
                List.of(new ConfigDoc(
                        Path.of("src/main/resources/application.yml"),
                        "application.yml")),
                List.of(new ClassRelationDoc(
                        "UserController",
                        "UserService",
                        RelationType.FIELD,
                        "userService")));

        new MarkdownRenderer().render(result, tempDir);

        assertThat(tempDir.resolve("index.md")).exists();
        assertThat(tempDir.resolve("api.md")).content().contains("GET", "/api/users");
        assertThat(tempDir.resolve("architecture.md")).content()
                .contains("UserController")
                .contains("## Dependency Overview")
                .contains("| UserController | UserService | FIELD | userService |");
        assertThat(tempDir.resolve("classes/UserController.md")).content()
                .contains("## Related Classes")
                .contains("### Outgoing References")
                .contains("| UserService | FIELD | userService |");
        assertThat(tempDir.resolve("classes/UserService.md")).content()
                .contains("### Incoming References")
                .contains("| UserController | FIELD | userService |");
        assertThat(tempDir.resolve("configs/application.md")).content().contains("application.yml");
        assertThat(tempDir.resolve("_config.yml")).content().contains("theme: minima");
        assertThat(Files.readString(tempDir.resolve("index.md")))
                .contains("API Endpoints: 1")
                .contains("* Source: `/" + Path.of("").toAbsolutePath().getFileName()
                        + "/examples/sample`");
    }
}
