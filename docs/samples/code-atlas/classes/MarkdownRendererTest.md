# MarkdownRendererTest

## Summary

* Package: `io.github.codeatlas.renderer.markdown`
* Declaration: `CLASS`
* Type: `UNKNOWN`
* Source: `code-atlas-renderer-markdown/src/test/java/io/github/codeatlas/renderer/markdown/MarkdownRendererTest.java`

## Role

コードから機械的に判定できる役割情報はありません。

## Annotations

None

## Methods

| Method | Return Type | Parameters | Annotations |
| --- | --- | --- | --- |
| generatesAllMarkdownDocuments | `void` |  | Test |

## Fields

| Name | Type | Annotations |
| --- | --- | --- |
| tempDir | `Path` | TempDir |

## Method Calls

| Source Method | Scope | Called Method | Expression |
| --- | --- | --- | --- |
| generatesAllMarkdownDocuments | Files | readString | `Files.readString(tempDir.resolve("index.md"))` |
| generatesAllMarkdownDocuments | List | of | `List.of("Mapper")` |
| generatesAllMarkdownDocuments | List | of | `List.of("RestController")` |
| generatesAllMarkdownDocuments | List | of | `List.of("Service")` |
| generatesAllMarkdownDocuments | List | of | `List.of("users")` |
| generatesAllMarkdownDocuments | List | of | `List.of()` |
| generatesAllMarkdownDocuments | List | of | `List.of()` |
| generatesAllMarkdownDocuments | List | of | `List.of()` |
| generatesAllMarkdownDocuments | List | of | `List.of()` |
| generatesAllMarkdownDocuments | List | of | `List.of()` |
| generatesAllMarkdownDocuments | List | of | `List.of()` |
| generatesAllMarkdownDocuments | List | of | `List.of(controller, service, mapper)` |
| generatesAllMarkdownDocuments | List | of | `List.of(new ApiEndpointDoc("UserController", "findAll", "GET", "/api/users", "src/main/java/example/UserController.java"))` |
| generatesAllMarkdownDocuments | List | of | `List.of(new ClassRelationDoc("UserController", "UserService", RelationType.FIELD, "userService"), new ClassRelationDoc("UserController", "ExternalClient", RelationType.FIELD, "externalClient"))` |
| generatesAllMarkdownDocuments | List | of | `List.of(new ConfigDoc(Path.of("src/main/resources/application.yml"), "application.yml"))` |
| generatesAllMarkdownDocuments | List | of | `List.of(new MethodCallDoc("UserController", "findAll", "userService", "findAll", "userService.findAll()", Path.of("src/main/java/example/UserController.java")))` |
| generatesAllMarkdownDocuments | List | of | `List.of(new TableUsageDoc("users", "example.UserMapper", "SELECT", "findAll", Path.of("src/main/resources/mapper/UserMapper.xml")))` |
| generatesAllMarkdownDocuments | List | of | `List.of(statement)` |
| generatesAllMarkdownDocuments | Path | of | `Path.of("")` |
| generatesAllMarkdownDocuments | Path | of | `Path.of("")` |
| generatesAllMarkdownDocuments | Path.of("") | toAbsolutePath | `Path.of("").toAbsolutePath()` |
| generatesAllMarkdownDocuments | Path.of("") | toAbsolutePath | `Path.of("").toAbsolutePath()` |
| generatesAllMarkdownDocuments | Path.of("").toAbsolutePath() | getFileName | `Path.of("").toAbsolutePath().getFileName()` |
| generatesAllMarkdownDocuments | Path.of("").toAbsolutePath() | normalize | `Path.of("").toAbsolutePath().normalize()` |
| generatesAllMarkdownDocuments | Path.of("").toAbsolutePath().normalize() | resolve | `Path.of("").toAbsolutePath().normalize().resolve("examples/sample")` |
| generatesAllMarkdownDocuments | Path | of | `Path.of("src/main/java/example/UserController.java")` |
| generatesAllMarkdownDocuments | Path | of | `Path.of("src/main/java/example/UserController.java")` |
| generatesAllMarkdownDocuments | Path | of | `Path.of("src/main/java/example/UserMapper.java")` |
| generatesAllMarkdownDocuments | Path | of | `Path.of("src/main/java/example/UserService.java")` |
| generatesAllMarkdownDocuments | Path | of | `Path.of("src/main/resources/application.yml")` |
| generatesAllMarkdownDocuments | Path | of | `Path.of("src/main/resources/mapper/UserMapper.xml")` |
| generatesAllMarkdownDocuments | Path | of | `Path.of("src/main/resources/mapper/UserMapper.xml")` |
| generatesAllMarkdownDocuments |  | assertThat | `assertThat(Files.readString(tempDir.resolve("index.md")))` |
| generatesAllMarkdownDocuments | assertThat(Files.readString(tempDir.resolve("index.md"))) | contains | `assertThat(Files.readString(tempDir.resolve("index.md"))).contains("API Endpoints: 1")` |
| generatesAllMarkdownDocuments | assertThat(Files.readString(tempDir.resolve("index.md"))).contains("API Endpoints: 1") | contains | `assertThat(Files.readString(tempDir.resolve("index.md"))).contains("API Endpoints: 1").contains("* [SQL Statements](sql.md)")` |
| generatesAllMarkdownDocuments | assertThat(Files.readString(tempDir.resolve("index.md"))).contains("API Endpoints: 1").contains("* [SQL Statements](sql.md)") | contains | `assertThat(Files.readString(tempDir.resolve("index.md"))).contains("API Endpoints: 1").contains("* [SQL Statements](sql.md)").contains("* [Tables](tables.md)")` |
| generatesAllMarkdownDocuments | assertThat(Files.readString(tempDir.resolve("index.md"))).contains("API Endpoints: 1").contains("* [SQL Statements](sql.md)").contains("* [Tables](tables.md)") | contains | `assertThat(Files.readString(tempDir.resolve("index.md"))).contains("API Endpoints: 1").contains("* [SQL Statements](sql.md)").contains("* [Tables](tables.md)").contains("* [MyBatis Mappers](mybatis.md)")` |
| generatesAllMarkdownDocuments | assertThat(Files.readString(tempDir.resolve("index.md"))).contains("API Endpoints: 1").contains("* [SQL Statements](sql.md)").contains("* [Tables](tables.md)").contains("* [MyBatis Mappers](mybatis.md)") | contains | `assertThat(Files.readString(tempDir.resolve("index.md"))).contains("API Endpoints: 1").contains("* [SQL Statements](sql.md)").contains("* [Tables](tables.md)").contains("* [MyBatis Mappers](mybatis.md)").contains("* Source: `/" + Path.of("").toAbsolutePath().getFileName() + "/examples/sample`")` |
| generatesAllMarkdownDocuments |  | assertThat | `assertThat(tempDir.resolve("_config.yml"))` |
| generatesAllMarkdownDocuments | assertThat(tempDir.resolve("_config.yml")) | content | `assertThat(tempDir.resolve("_config.yml")).content()` |
| generatesAllMarkdownDocuments | assertThat(tempDir.resolve("_config.yml")).content() | contains | `assertThat(tempDir.resolve("_config.yml")).content().contains("theme: minima")` |
| generatesAllMarkdownDocuments |  | assertThat | `assertThat(tempDir.resolve("api.md"))` |
| generatesAllMarkdownDocuments |  | assertThat | `assertThat(tempDir.resolve("api.md"))` |
| generatesAllMarkdownDocuments | assertThat(tempDir.resolve("api.md")) | content | `assertThat(tempDir.resolve("api.md")).content()` |
| generatesAllMarkdownDocuments | assertThat(tempDir.resolve("api.md")) | content | `assertThat(tempDir.resolve("api.md")).content()` |
| generatesAllMarkdownDocuments | assertThat(tempDir.resolve("api.md")).content() | contains | `assertThat(tempDir.resolve("api.md")).content().contains("GET", "/api/users")` |
| generatesAllMarkdownDocuments | assertThat(tempDir.resolve("api.md")).content() | contains | `assertThat(tempDir.resolve("api.md")).content().contains("[UserController](classes/UserController.md)")` |
| generatesAllMarkdownDocuments |  | assertThat | `assertThat(tempDir.resolve("architecture.md"))` |
| generatesAllMarkdownDocuments | assertThat(tempDir.resolve("architecture.md")) | content | `assertThat(tempDir.resolve("architecture.md")).content()` |
| generatesAllMarkdownDocuments | assertThat(tempDir.resolve("architecture.md")).content() | contains | `assertThat(tempDir.resolve("architecture.md")).content().contains("UserController")` |
| generatesAllMarkdownDocuments | assertThat(tempDir.resolve("architecture.md")).content().contains("UserController") | contains | `assertThat(tempDir.resolve("architecture.md")).content().contains("UserController").contains("## Dependency Overview")` |
| generatesAllMarkdownDocuments | assertThat(tempDir.resolve("architecture.md")).content().contains("UserController").contains("## Dependency Overview") | contains | `assertThat(tempDir.resolve("architecture.md")).content().contains("UserController").contains("## Dependency Overview").contains("\| [UserController](classes/UserController.md) " + "\| [UserService](classes/UserService.md) \| FIELD \| userService \|")` |
| generatesAllMarkdownDocuments | assertThat(tempDir.resolve("architecture.md")).content().contains("UserController").contains("## Dependency Overview").contains("\| [UserController](classes/UserController.md) " + "\| [UserService](classes/UserService.md) \| FIELD \| userService \|") | contains | `assertThat(tempDir.resolve("architecture.md")).content().contains("UserController").contains("## Dependency Overview").contains("\| [UserController](classes/UserController.md) " + "\| [UserService](classes/UserService.md) \| FIELD \| userService \|").contains("\| [UserController](classes/UserController.md) " + "\| ExternalClient \| FIELD \| externalClient \|")` |
| generatesAllMarkdownDocuments | assertThat(tempDir.resolve("architecture.md")).content().contains("UserController").contains("## Dependency Overview").contains("\| [UserController](classes/UserController.md) " + "\| [UserService](classes/UserService.md) \| FIELD \| userService \|").contains("\| [UserController](classes/UserController.md) " + "\| ExternalClient \| FIELD \| externalClient \|") | doesNotContain | `assertThat(tempDir.resolve("architecture.md")).content().contains("UserController").contains("## Dependency Overview").contains("\| [UserController](classes/UserController.md) " + "\| [UserService](classes/UserService.md) \| FIELD \| userService \|").contains("\| [UserController](classes/UserController.md) " + "\| ExternalClient \| FIELD \| externalClient \|").doesNotContain("[ExternalClient]")` |
| generatesAllMarkdownDocuments |  | assertThat | `assertThat(tempDir.resolve("classes/UserController.md"))` |
| generatesAllMarkdownDocuments | assertThat(tempDir.resolve("classes/UserController.md")) | content | `assertThat(tempDir.resolve("classes/UserController.md")).content()` |
| generatesAllMarkdownDocuments | assertThat(tempDir.resolve("classes/UserController.md")).content() | contains | `assertThat(tempDir.resolve("classes/UserController.md")).content().contains("## Role")` |
| generatesAllMarkdownDocuments | assertThat(tempDir.resolve("classes/UserController.md")).content().contains("## Role") | contains | `assertThat(tempDir.resolve("classes/UserController.md")).content().contains("## Role").contains("## Method Calls")` |
| generatesAllMarkdownDocuments | assertThat(tempDir.resolve("classes/UserController.md")).content().contains("## Role").contains("## Method Calls") | contains | `assertThat(tempDir.resolve("classes/UserController.md")).content().contains("## Role").contains("## Method Calls").contains("\| findAll \| userService \| findAll \| `userService.findAll()` \|")` |
| generatesAllMarkdownDocuments | assertThat(tempDir.resolve("classes/UserController.md")).content().contains("## Role").contains("## Method Calls").contains("\| findAll \| userService \| findAll \| `userService.findAll()` \|") | contains | `assertThat(tempDir.resolve("classes/UserController.md")).content().contains("## Role").contains("## Method Calls").contains("\| findAll \| userService \| findAll \| `userService.findAll()` \|").contains("## Related Classes")` |
| generatesAllMarkdownDocuments | assertThat(tempDir.resolve("classes/UserController.md")).content().contains("## Role").contains("## Method Calls").contains("\| findAll \| userService \| findAll \| `userService.findAll()` \|").contains("## Related Classes") | contains | `assertThat(tempDir.resolve("classes/UserController.md")).content().contains("## Role").contains("## Method Calls").contains("\| findAll \| userService \| findAll \| `userService.findAll()` \|").contains("## Related Classes").contains("### Outgoing References")` |
| generatesAllMarkdownDocuments | assertThat(tempDir.resolve("classes/UserController.md")).content().contains("## Role").contains("## Method Calls").contains("\| findAll \| userService \| findAll \| `userService.findAll()` \|").contains("## Related Classes").contains("### Outgoing References") | contains | `assertThat(tempDir.resolve("classes/UserController.md")).content().contains("## Role").contains("## Method Calls").contains("\| findAll \| userService \| findAll \| `userService.findAll()` \|").contains("## Related Classes").contains("### Outgoing References").contains("\| [UserService](UserService.md) \| FIELD \| userService \|")` |
| generatesAllMarkdownDocuments |  | assertThat | `assertThat(tempDir.resolve("classes/UserMapper.md"))` |
| generatesAllMarkdownDocuments | assertThat(tempDir.resolve("classes/UserMapper.md")) | content | `assertThat(tempDir.resolve("classes/UserMapper.md")).content()` |
| generatesAllMarkdownDocuments | assertThat(tempDir.resolve("classes/UserMapper.md")).content() | contains | `assertThat(tempDir.resolve("classes/UserMapper.md")).content().contains("## MyBatis Statements")` |
| generatesAllMarkdownDocuments | assertThat(tempDir.resolve("classes/UserMapper.md")).content().contains("## MyBatis Statements") | contains | `assertThat(tempDir.resolve("classes/UserMapper.md")).content().contains("## MyBatis Statements").contains("\| SELECT \| findAll \| users \|")` |
| generatesAllMarkdownDocuments | assertThat(tempDir.resolve("classes/UserMapper.md")).content().contains("## MyBatis Statements").contains("\| SELECT \| findAll \| users \|") | contains | `assertThat(tempDir.resolve("classes/UserMapper.md")).content().contains("## MyBatis Statements").contains("\| SELECT \| findAll \| users \|").contains("## Related Tables")` |
| generatesAllMarkdownDocuments | assertThat(tempDir.resolve("classes/UserMapper.md")).content().contains("## MyBatis Statements").contains("\| SELECT \| findAll \| users \|").contains("## Related Tables") | contains | `assertThat(tempDir.resolve("classes/UserMapper.md")).content().contains("## MyBatis Statements").contains("\| SELECT \| findAll \| users \|").contains("## Related Tables").contains("\| users \| findAll \| SELECT \|")` |
| generatesAllMarkdownDocuments |  | assertThat | `assertThat(tempDir.resolve("classes/UserService.md"))` |
| generatesAllMarkdownDocuments | assertThat(tempDir.resolve("classes/UserService.md")) | content | `assertThat(tempDir.resolve("classes/UserService.md")).content()` |
| generatesAllMarkdownDocuments | assertThat(tempDir.resolve("classes/UserService.md")).content() | contains | `assertThat(tempDir.resolve("classes/UserService.md")).content().contains("### Incoming References")` |
| generatesAllMarkdownDocuments | assertThat(tempDir.resolve("classes/UserService.md")).content().contains("### Incoming References") | contains | `assertThat(tempDir.resolve("classes/UserService.md")).content().contains("### Incoming References").contains("\| [UserController](UserController.md) \| FIELD \| userService \|")` |
| generatesAllMarkdownDocuments |  | assertThat | `assertThat(tempDir.resolve("configs/application.md"))` |
| generatesAllMarkdownDocuments | assertThat(tempDir.resolve("configs/application.md")) | content | `assertThat(tempDir.resolve("configs/application.md")).content()` |
| generatesAllMarkdownDocuments | assertThat(tempDir.resolve("configs/application.md")).content() | contains | `assertThat(tempDir.resolve("configs/application.md")).content().contains("application.yml")` |
| generatesAllMarkdownDocuments |  | assertThat | `assertThat(tempDir.resolve("index.md"))` |
| generatesAllMarkdownDocuments | assertThat(tempDir.resolve("index.md")) | exists | `assertThat(tempDir.resolve("index.md")).exists()` |
| generatesAllMarkdownDocuments |  | assertThat | `assertThat(tempDir.resolve("mybatis.md"))` |
| generatesAllMarkdownDocuments | assertThat(tempDir.resolve("mybatis.md")) | content | `assertThat(tempDir.resolve("mybatis.md")).content()` |
| generatesAllMarkdownDocuments | assertThat(tempDir.resolve("mybatis.md")).content() | contains | `assertThat(tempDir.resolve("mybatis.md")).content().contains("\| example.UserMapper \|", "\| 1 \|")` |
| generatesAllMarkdownDocuments |  | assertThat | `assertThat(tempDir.resolve("sql.md"))` |
| generatesAllMarkdownDocuments | assertThat(tempDir.resolve("sql.md")) | content | `assertThat(tempDir.resolve("sql.md")).content()` |
| generatesAllMarkdownDocuments | assertThat(tempDir.resolve("sql.md")).content() | contains | `assertThat(tempDir.resolve("sql.md")).content().contains("example.UserMapper", "select * from users")` |
| generatesAllMarkdownDocuments | assertThat(tempDir.resolve("sql.md")).content().contains("example.UserMapper", "select * from users") | contains | `assertThat(tempDir.resolve("sql.md")).content().contains("example.UserMapper", "select * from users").contains("\\\| active = true")` |
| generatesAllMarkdownDocuments |  | assertThat | `assertThat(tempDir.resolve("tables.md"))` |
| generatesAllMarkdownDocuments | assertThat(tempDir.resolve("tables.md")) | content | `assertThat(tempDir.resolve("tables.md")).content()` |
| generatesAllMarkdownDocuments | assertThat(tempDir.resolve("tables.md")).content() | contains | `assertThat(tempDir.resolve("tables.md")).content().contains("\| users \| example.UserMapper \| SELECT \| findAll \|")` |
| generatesAllMarkdownDocuments | new MarkdownRenderer() | render | `new MarkdownRenderer().render(result, tempDir)` |
| generatesAllMarkdownDocuments | tempDir | resolve | `tempDir.resolve("_config.yml")` |
| generatesAllMarkdownDocuments | tempDir | resolve | `tempDir.resolve("api.md")` |
| generatesAllMarkdownDocuments | tempDir | resolve | `tempDir.resolve("api.md")` |
| generatesAllMarkdownDocuments | tempDir | resolve | `tempDir.resolve("architecture.md")` |
| generatesAllMarkdownDocuments | tempDir | resolve | `tempDir.resolve("classes/UserController.md")` |
| generatesAllMarkdownDocuments | tempDir | resolve | `tempDir.resolve("classes/UserMapper.md")` |
| generatesAllMarkdownDocuments | tempDir | resolve | `tempDir.resolve("classes/UserService.md")` |
| generatesAllMarkdownDocuments | tempDir | resolve | `tempDir.resolve("configs/application.md")` |
| generatesAllMarkdownDocuments | tempDir | resolve | `tempDir.resolve("index.md")` |
| generatesAllMarkdownDocuments | tempDir | resolve | `tempDir.resolve("index.md")` |
| generatesAllMarkdownDocuments | tempDir | resolve | `tempDir.resolve("mybatis.md")` |
| generatesAllMarkdownDocuments | tempDir | resolve | `tempDir.resolve("sql.md")` |
| generatesAllMarkdownDocuments | tempDir | resolve | `tempDir.resolve("tables.md")` |

## Related Classes

### Outgoing References

| Target | Relation | Member |
| --- | --- | --- |
| - | - | - |

### Incoming References

| Source | Relation | Member |
| --- | --- | --- |
| - | - | - |
