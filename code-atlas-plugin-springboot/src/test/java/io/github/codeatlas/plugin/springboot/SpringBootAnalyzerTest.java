package io.github.codeatlas.plugin.springboot;

import io.github.codeatlas.core.model.AnalysisResult;
import io.github.codeatlas.core.model.ComponentType;
import io.github.codeatlas.core.scan.SourceScanner;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.io.TempDir;

import java.nio.file.Files;
import java.nio.file.Path;

import static org.assertj.core.api.Assertions.assertThat;

class SpringBootAnalyzerTest {
    @TempDir
    Path tempDir;

    @Test
    void classifiesComponentsAndExtractsCombinedEndpointPaths() throws Exception {
        write("src/main/java/example/UserController.java", """
                package example;
                import org.springframework.web.bind.annotation.*;
                @RestController
                @RequestMapping("/api/users")
                class UserController {
                    private UserService userService;

                    @GetMapping("/{id}")
                    String findById(Long id) { return ""; }

                    @RequestMapping(path = "/search", method = RequestMethod.GET)
                    String search() { return ""; }
                }
                """);
        write("src/main/java/example/UserService.java", """
                package example;
                @Service class UserService {}
                """);
        write("src/main/java/example/UserRepository.java", """
                package example;
                @Repository interface UserRepository {}
                """);
        write("src/main/java/example/User.java", """
                package example;
                @Entity class User {}
                """);

        AnalysisResult result = new SpringBootAnalyzer().analyze(new SourceScanner().scan(tempDir));

        assertThat(result.classes()).anySatisfy(doc -> {
            assertThat(doc.className()).isEqualTo("UserController");
            assertThat(doc.componentType()).isEqualTo(ComponentType.CONTROLLER);
        });
        assertThat(result.classes())
                .filteredOn(doc -> doc.className().equals("UserService"))
                .extracting(doc -> doc.componentType())
                .containsExactly(ComponentType.SERVICE);
        assertThat(result.classes())
                .filteredOn(doc -> doc.className().equals("UserService"))
                .extracting(doc -> doc.roleSummary())
                .singleElement()
                .asString()
                .contains("業務ロジックコンポーネント");
        assertThat(result.classes())
                .filteredOn(doc -> doc.className().equals("UserRepository"))
                .extracting(doc -> doc.componentType())
                .containsExactly(ComponentType.REPOSITORY);
        assertThat(result.classes())
                .filteredOn(doc -> doc.className().equals("User"))
                .extracting(doc -> doc.componentType())
                .containsExactly(ComponentType.ENTITY);
        assertThat(result.endpoints())
                .extracting(endpoint -> endpoint.httpMethod() + " " + endpoint.path())
                .containsExactly("GET /api/users/search", "GET /api/users/{id}");
        assertThat(result.relations())
                .anySatisfy(relation -> {
                    assertThat(relation.sourceClassName()).isEqualTo("UserController");
                    assertThat(relation.targetClassName()).isEqualTo("UserService");
                    assertThat(relation.sourceMemberName()).isEqualTo("userService");
                });
    }

    private void write(String relativePath, String content) throws Exception {
        Path path = tempDir.resolve(relativePath);
        Files.createDirectories(path.getParent());
        Files.writeString(path, content);
    }
}
