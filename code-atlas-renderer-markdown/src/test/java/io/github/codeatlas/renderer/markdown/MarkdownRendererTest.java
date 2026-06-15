package io.github.codeatlas.renderer.markdown;

import io.github.codeatlas.core.model.AnalysisResult;
import io.github.codeatlas.core.model.ApiEndpointDoc;
import io.github.codeatlas.core.model.ClassDoc;
import io.github.codeatlas.core.model.ClassRelationDoc;
import io.github.codeatlas.core.model.ComponentType;
import io.github.codeatlas.core.model.ConfigDoc;
import io.github.codeatlas.core.model.ProjectOverview;
import io.github.codeatlas.core.model.RelationType;
import io.github.codeatlas.core.model.SqlStatementDoc;
import io.github.codeatlas.core.model.SqlStatementType;
import io.github.codeatlas.core.model.TableUsageDoc;
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
                List.of(),
                "このクラスは `@RestController` が付与されているため、Web API Controllerです。");
        ClassDoc service = new ClassDoc(
                "example",
                "UserService",
                "CLASS",
                Path.of("src/main/java/example/UserService.java"),
                ComponentType.SERVICE,
                List.of("Service"),
                List.of(),
                List.of(),
                "このクラスは `@Service` が付与されているため、業務ロジックコンポーネントです。");
        ClassDoc mapper = new ClassDoc(
                "example",
                "UserMapper",
                "INTERFACE",
                Path.of("src/main/java/example/UserMapper.java"),
                ComponentType.UNKNOWN,
                List.of("Mapper"),
                List.of(),
                List.of(),
                "このインターフェースは `@Mapper` が付与されているため、MyBatis Mapper interfaceです。");
        SqlStatementDoc statement = new SqlStatementDoc(
                "example.UserMapper",
                "findAll",
                SqlStatementType.SELECT,
                "select * from users where name = #{name} | active = true",
                Path.of("src/main/resources/mapper/UserMapper.xml"),
                List.of("users"));
        AnalysisResult result = new AnalysisResult(
                new ProjectOverview("sample", sourceRoot, 3, 1, 1, 1, 0, 0),
                List.of(controller, service, mapper),
                List.of(new ApiEndpointDoc(
                        "UserController",
                        "findAll",
                        "GET",
                        "/api/users",
                        "src/main/java/example/UserController.java")),
                List.of(new ConfigDoc(
                        Path.of("src/main/resources/application.yml"),
                        "application.yml")),
                List.of(
                        new ClassRelationDoc(
                                "UserController",
                                "UserService",
                                RelationType.FIELD,
                                "userService"),
                        new ClassRelationDoc(
                                "UserController",
                                "ExternalClient",
                                RelationType.FIELD,
                                "externalClient")),
                List.of(statement),
                List.of(new TableUsageDoc(
                        "users",
                        "example.UserMapper",
                        "SELECT",
                        "findAll",
                        Path.of("src/main/resources/mapper/UserMapper.xml"))));

        new MarkdownRenderer().render(result, tempDir);

        assertThat(tempDir.resolve("index.md")).exists();
        assertThat(tempDir.resolve("api.md")).content().contains("GET", "/api/users");
        assertThat(tempDir.resolve("api.md")).content()
                .contains("[UserController](classes/UserController.md)");
        assertThat(tempDir.resolve("architecture.md")).content()
                .contains("UserController")
                .contains("## Dependency Overview")
                .contains("| [UserController](classes/UserController.md) "
                        + "| [UserService](classes/UserService.md) | FIELD | userService |")
                .contains("| [UserController](classes/UserController.md) "
                        + "| ExternalClient | FIELD | externalClient |")
                .doesNotContain("[ExternalClient]");
        assertThat(tempDir.resolve("classes/UserController.md")).content()
                .contains("## Role")
                .contains("## Related Classes")
                .contains("### Outgoing References")
                .contains("| [UserService](UserService.md) | FIELD | userService |");
        assertThat(tempDir.resolve("classes/UserService.md")).content()
                .contains("### Incoming References")
                .contains("| [UserController](UserController.md) | FIELD | userService |");
        assertThat(tempDir.resolve("classes/UserMapper.md")).content()
                .contains("## MyBatis Statements")
                .contains("| SELECT | findAll | users |");
        assertThat(tempDir.resolve("sql.md")).content()
                .contains("example.UserMapper", "select * from users")
                .contains("\\| active = true");
        assertThat(tempDir.resolve("tables.md")).content()
                .contains("| users | example.UserMapper | SELECT | findAll |");
        assertThat(tempDir.resolve("mybatis.md")).content()
                .contains("| example.UserMapper |", "| 1 |");
        assertThat(tempDir.resolve("configs/application.md")).content().contains("application.yml");
        assertThat(tempDir.resolve("_config.yml")).content().contains("theme: minima");
        assertThat(Files.readString(tempDir.resolve("index.md")))
                .contains("API Endpoints: 1")
                .contains("* [SQL Statements](sql.md)")
                .contains("* [Tables](tables.md)")
                .contains("* [MyBatis Mappers](mybatis.md)")
                .contains("* Source: `/" + Path.of("").toAbsolutePath().getFileName()
                        + "/examples/sample`");
    }
}
