# MyBatisAnalyzerTest

## Summary

* Package: `io.github.codeatlas.plugin.mybatis`
* Declaration: `CLASS`
* Type: `UNKNOWN`
* Source: `code-atlas-plugin-mybatis/src/test/java/io/github/codeatlas/plugin/mybatis/MyBatisAnalyzerTest.java`

## Role

コードから機械的に判定できる役割情報はありません。

## Annotations

None

## Methods

| Method | Return Type | Parameters | Annotations |
| --- | --- | --- | --- |
| addsSqlTableUsageAndMapperRoleToCurrentResult | `void` |  | Test |

## Fields

| Name | Type | Annotations |
| --- | --- | --- |
| tempDir | `Path` | TempDir |

## Method Calls

| Source Method | Scope | Called Method | Expression |
| --- | --- | --- | --- |
| addsSqlTableUsageAndMapperRoleToCurrentResult | Files | createDirectories | `Files.createDirectories(javaFile.getParent())` |
| addsSqlTableUsageAndMapperRoleToCurrentResult | Files | createDirectories | `Files.createDirectories(xml.getParent())` |
| addsSqlTableUsageAndMapperRoleToCurrentResult | Files | writeString | `Files.writeString(javaFile, "@Mapper interface UserMapper {}")` |
| addsSqlTableUsageAndMapperRoleToCurrentResult | Files | writeString | `Files.writeString(xml, """     <mapper namespace="example.UserMapper">         <select id="findAll">select * from users</select>     </mapper>     """)` |
| addsSqlTableUsageAndMapperRoleToCurrentResult | List | of | `List.of("Mapper")` |
| addsSqlTableUsageAndMapperRoleToCurrentResult | List | of | `List.of()` |
| addsSqlTableUsageAndMapperRoleToCurrentResult | List | of | `List.of()` |
| addsSqlTableUsageAndMapperRoleToCurrentResult | List | of | `List.of()` |
| addsSqlTableUsageAndMapperRoleToCurrentResult | List | of | `List.of()` |
| addsSqlTableUsageAndMapperRoleToCurrentResult | List | of | `List.of()` |
| addsSqlTableUsageAndMapperRoleToCurrentResult | List | of | `List.of()` |
| addsSqlTableUsageAndMapperRoleToCurrentResult | List | of | `List.of()` |
| addsSqlTableUsageAndMapperRoleToCurrentResult | List | of | `List.of()` |
| addsSqlTableUsageAndMapperRoleToCurrentResult | List | of | `List.of(mapper)` |
| addsSqlTableUsageAndMapperRoleToCurrentResult | Path | of | `Path.of("src/main/java/example/UserMapper.java")` |
| addsSqlTableUsageAndMapperRoleToCurrentResult | analyzer | analyze | `analyzer.analyze(source, current)` |
| addsSqlTableUsageAndMapperRoleToCurrentResult | analyzer | supports | `analyzer.supports(source)` |
| addsSqlTableUsageAndMapperRoleToCurrentResult |  | assertThat | `assertThat(analyzer.supports(source))` |
| addsSqlTableUsageAndMapperRoleToCurrentResult | assertThat(analyzer.supports(source)) | isTrue | `assertThat(analyzer.supports(source)).isTrue()` |
| addsSqlTableUsageAndMapperRoleToCurrentResult |  | assertThat | `assertThat(result.classes().getFirst().roleSummary())` |
| addsSqlTableUsageAndMapperRoleToCurrentResult | assertThat(result.classes().getFirst().roleSummary()) | contains | `assertThat(result.classes().getFirst().roleSummary()).contains("MyBatis Mapper interface")` |
| addsSqlTableUsageAndMapperRoleToCurrentResult |  | assertThat | `assertThat(result.sqlStatements())` |
| addsSqlTableUsageAndMapperRoleToCurrentResult | assertThat(result.sqlStatements()) | singleElement | `assertThat(result.sqlStatements()).singleElement()` |
| addsSqlTableUsageAndMapperRoleToCurrentResult | assertThat(result.sqlStatements()).singleElement() | satisfies | `assertThat(result.sqlStatements()).singleElement().satisfies(statement -> {     assertThat(statement.ownerName()).isEqualTo("example.UserMapper");     assertThat(statement.tableNames()).containsExactly("users"); })` |
| addsSqlTableUsageAndMapperRoleToCurrentResult |  | assertThat | `assertThat(result.tableUsages())` |
| addsSqlTableUsageAndMapperRoleToCurrentResult | assertThat(result.tableUsages()) | singleElement | `assertThat(result.tableUsages()).singleElement()` |
| addsSqlTableUsageAndMapperRoleToCurrentResult | assertThat(result.tableUsages()).singleElement() | satisfies | `assertThat(result.tableUsages()).singleElement().satisfies(usage -> {     assertThat(usage.tableName()).isEqualTo("users");     assertThat(usage.sourceName()).isEqualTo("findAll"); })` |
| addsSqlTableUsageAndMapperRoleToCurrentResult |  | assertThat | `assertThat(statement.ownerName())` |
| addsSqlTableUsageAndMapperRoleToCurrentResult | assertThat(statement.ownerName()) | isEqualTo | `assertThat(statement.ownerName()).isEqualTo("example.UserMapper")` |
| addsSqlTableUsageAndMapperRoleToCurrentResult |  | assertThat | `assertThat(statement.tableNames())` |
| addsSqlTableUsageAndMapperRoleToCurrentResult | assertThat(statement.tableNames()) | containsExactly | `assertThat(statement.tableNames()).containsExactly("users")` |
| addsSqlTableUsageAndMapperRoleToCurrentResult |  | assertThat | `assertThat(usage.sourceName())` |
| addsSqlTableUsageAndMapperRoleToCurrentResult | assertThat(usage.sourceName()) | isEqualTo | `assertThat(usage.sourceName()).isEqualTo("findAll")` |
| addsSqlTableUsageAndMapperRoleToCurrentResult |  | assertThat | `assertThat(usage.tableName())` |
| addsSqlTableUsageAndMapperRoleToCurrentResult | assertThat(usage.tableName()) | isEqualTo | `assertThat(usage.tableName()).isEqualTo("users")` |
| addsSqlTableUsageAndMapperRoleToCurrentResult | javaFile | getParent | `javaFile.getParent()` |
| addsSqlTableUsageAndMapperRoleToCurrentResult | new SourceScanner() | scan | `new SourceScanner().scan(tempDir)` |
| addsSqlTableUsageAndMapperRoleToCurrentResult | result | classes | `result.classes()` |
| addsSqlTableUsageAndMapperRoleToCurrentResult | result.classes() | getFirst | `result.classes().getFirst()` |
| addsSqlTableUsageAndMapperRoleToCurrentResult | result.classes().getFirst() | roleSummary | `result.classes().getFirst().roleSummary()` |
| addsSqlTableUsageAndMapperRoleToCurrentResult | result | sqlStatements | `result.sqlStatements()` |
| addsSqlTableUsageAndMapperRoleToCurrentResult | result | tableUsages | `result.tableUsages()` |
| addsSqlTableUsageAndMapperRoleToCurrentResult | statement | ownerName | `statement.ownerName()` |
| addsSqlTableUsageAndMapperRoleToCurrentResult | statement | tableNames | `statement.tableNames()` |
| addsSqlTableUsageAndMapperRoleToCurrentResult | tempDir | resolve | `tempDir.resolve("src/main/java/example/UserMapper.java")` |
| addsSqlTableUsageAndMapperRoleToCurrentResult | tempDir | resolve | `tempDir.resolve("src/main/resources/mapper/UserMapper.xml")` |
| addsSqlTableUsageAndMapperRoleToCurrentResult | usage | sourceName | `usage.sourceName()` |
| addsSqlTableUsageAndMapperRoleToCurrentResult | usage | tableName | `usage.tableName()` |
| addsSqlTableUsageAndMapperRoleToCurrentResult | xml | getParent | `xml.getParent()` |

## Related Classes

### Outgoing References

| Target | Relation | Member |
| --- | --- | --- |
| - | - | - |

### Incoming References

| Source | Relation | Member |
| --- | --- | --- |
| - | - | - |
