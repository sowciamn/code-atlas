# MyBatisAnalyzer

## Summary

* Package: `io.github.codeatlas.plugin.mybatis`
* Declaration: `CLASS`
* Type: `UNKNOWN`
* Source: `code-atlas-plugin-mybatis/src/main/java/io/github/codeatlas/plugin/mybatis/MyBatisAnalyzer.java`

## Role

このクラスは `CodeAnalyzerPlugin` を実装しているため、ソース解析プラグインです。

## Annotations

None

## Methods

| Method | Return Type | Parameters | Annotations |
| --- | --- | --- | --- |
| pluginId | `String` |  | Override |
| supports | `boolean` | ProjectSource source | Override |
| analyze | `AnalysisResult` | ProjectSource source | Override |
| analyze | `AnalysisResult` | ProjectSource source, AnalysisResult currentResult | Override |
| parseStatements | `List<SqlStatementDoc>` | ProjectSource source |  |
| mapperXmlFiles | `List<Path>` | ProjectSource source |  |
| isMainResource | `boolean` | Path relativePath |  |
| applyMapperRole | `ClassDoc` | ClassDoc classDoc |  |
| containsMapperAnnotation | `boolean` | Path javaFile |  |

## Fields

| Name | Type | Annotations |
| --- | --- | --- |
| MAPPER_ROLE | `String` |  |
| parser | `MyBatisMapperXmlParser` |  |

## Method Calls

| Source Method | Scope | Called Method | Expression |
| --- | --- | --- | --- |
| analyze | Comparator | comparing | `Comparator.comparing(TableUsageDoc::tableName)` |
| analyze | Comparator.comparing(TableUsageDoc::tableName) | thenComparing | `Comparator.comparing(TableUsageDoc::tableName).thenComparing(TableUsageDoc::usedBy)` |
| analyze | Comparator.comparing(TableUsageDoc::tableName).thenComparing(TableUsageDoc::usedBy) | thenComparing | `Comparator.comparing(TableUsageDoc::tableName).thenComparing(TableUsageDoc::usedBy).thenComparing(TableUsageDoc::sourceName)` |
| analyze | List | of | `List.of()` |
| analyze | List | of | `List.of()` |
| analyze | List | of | `List.of()` |
| analyze | List | of | `List.of()` |
| analyze | List | of | `List.of()` |
| analyze | List | of | `List.of()` |
| analyze | List | of | `List.of()` |
| analyze |  | analyze | `analyze(source, empty)` |
| analyze | currentResult | classes | `currentResult.classes()` |
| analyze | currentResult.classes() | stream | `currentResult.classes().stream()` |
| analyze | currentResult.classes().stream() | map | `currentResult.classes().stream().map(this::applyMapperRole)` |
| analyze | currentResult.classes().stream().map(this::applyMapperRole) | toList | `currentResult.classes().stream().map(this::applyMapperRole).toList()` |
| analyze | currentResult | configs | `currentResult.configs()` |
| analyze | currentResult | endpoints | `currentResult.endpoints()` |
| analyze | currentResult | methodCalls | `currentResult.methodCalls()` |
| analyze | currentResult | overview | `currentResult.overview()` |
| analyze | currentResult | relations | `currentResult.relations()` |
| analyze |  | parseStatements | `parseStatements(source)` |
| analyze | source | rootDirectory | `source.rootDirectory()` |
| analyze | source | rootDirectory | `source.rootDirectory()` |
| analyze | source.rootDirectory() | getFileName | `source.rootDirectory().getFileName()` |
| analyze | source.rootDirectory().getFileName() | toString | `source.rootDirectory().getFileName().toString()` |
| analyze | statement | ownerName | `statement.ownerName()` |
| analyze | statement | sourcePath | `statement.sourcePath()` |
| analyze | statement | statementId | `statement.statementId()` |
| analyze | statement | statementType | `statement.statementType()` |
| analyze | statement.statementType() | name | `statement.statementType().name()` |
| analyze | statement | tableNames | `statement.tableNames()` |
| analyze | statement.tableNames() | stream | `statement.tableNames().stream()` |
| analyze | statement.tableNames().stream() | map | `statement.tableNames().stream().map(tableName -> new TableUsageDoc(tableName, statement.ownerName(), statement.statementType().name(), statement.statementId(), statement.sourcePath()))` |
| analyze | statements | stream | `statements.stream()` |
| analyze | statements.stream() | flatMap | `statements.stream().flatMap(statement -> statement.tableNames().stream().map(tableName -> new TableUsageDoc(tableName, statement.ownerName(), statement.statementType().name(), statement.statementId(), statement.sourcePath())))` |
| analyze | statements.stream().flatMap(statement -> statement.tableNames().stream().map(tableName -> new TableUsageDoc(tableName, statement.ownerName(), statement.statementType().name(), statement.statementId(), statement.sourcePath()))) | sorted | `statements.stream().flatMap(statement -> statement.tableNames().stream().map(tableName -> new TableUsageDoc(tableName, statement.ownerName(), statement.statementType().name(), statement.statementId(), statement.sourcePath()))).sorted(Comparator.comparing(TableUsageDoc::tableName).thenComparing(TableUsageDoc::usedBy).thenComparing(TableUsageDoc::sourceName))` |
| analyze | statements.stream().flatMap(statement -> statement.tableNames().stream().map(tableName -> new TableUsageDoc(tableName, statement.ownerName(), statement.statementType().name(), statement.statementId(), statement.sourcePath()))).sorted(Comparator.comparing(TableUsageDoc::tableName).thenComparing(TableUsageDoc::usedBy).thenComparing(TableUsageDoc::sourceName)) | toList | `statements.stream().flatMap(statement -> statement.tableNames().stream().map(tableName -> new TableUsageDoc(tableName, statement.ownerName(), statement.statementType().name(), statement.statementId(), statement.sourcePath()))).sorted(Comparator.comparing(TableUsageDoc::tableName).thenComparing(TableUsageDoc::usedBy).thenComparing(TableUsageDoc::sourceName)).toList()` |
| applyMapperRole | classDoc | annotations | `classDoc.annotations()` |
| applyMapperRole | classDoc.annotations() | contains | `classDoc.annotations().contains("Mapper")` |
| applyMapperRole | classDoc | roleSummary | `classDoc.roleSummary()` |
| applyMapperRole | classDoc | roleSummary | `classDoc.roleSummary()` |
| applyMapperRole | classDoc.roleSummary() | contains | `classDoc.roleSummary().contains("DTOです。")` |
| applyMapperRole | classDoc.roleSummary() | startsWith | `classDoc.roleSummary().startsWith("コードから")` |
| applyMapperRole | classDoc | withRoleSummary | `classDoc.withRoleSummary(MAPPER_ROLE)` |
| containsMapperAnnotation | Files | readString | `Files.readString(javaFile)` |
| containsMapperAnnotation | Files.readString(javaFile) | contains | `Files.readString(javaFile).contains("@Mapper")` |
| containsMapperAnnotation | System.err | printf | `System.err.printf("Failed to inspect %s: %s%n", javaFile, exception.getMessage())` |
| containsMapperAnnotation | exception | getMessage | `exception.getMessage()` |
| isMainResource | "main" | equals | `"main".equals(relativePath.getName(index + 1).toString())` |
| isMainResource | "resources" | equals | `"resources".equals(relativePath.getName(index + 2).toString())` |
| isMainResource | "src" | equals | `"src".equals(relativePath.getName(index).toString())` |
| isMainResource | relativePath | getName | `relativePath.getName(index + 1)` |
| isMainResource | relativePath.getName(index + 1) | toString | `relativePath.getName(index + 1).toString()` |
| isMainResource | relativePath | getName | `relativePath.getName(index + 2)` |
| isMainResource | relativePath.getName(index + 2) | toString | `relativePath.getName(index + 2).toString()` |
| isMainResource | relativePath | getName | `relativePath.getName(index)` |
| isMainResource | relativePath.getName(index) | toString | `relativePath.getName(index).toString()` |
| isMainResource | relativePath | getNameCount | `relativePath.getNameCount()` |
| mapperXmlFiles |  | isMainResource | `isMainResource(source.relativePath(path))` |
| mapperXmlFiles | path | getFileName | `path.getFileName()` |
| mapperXmlFiles | path.getFileName() | toString | `path.getFileName().toString()` |
| mapperXmlFiles | path.getFileName().toString() | endsWith | `path.getFileName().toString().endsWith(".xml")` |
| mapperXmlFiles | source | relativePath | `source.relativePath(path)` |
| mapperXmlFiles | source | resourceFiles | `source.resourceFiles()` |
| mapperXmlFiles | source.resourceFiles() | stream | `source.resourceFiles().stream()` |
| mapperXmlFiles | source.resourceFiles().stream() | filter | `source.resourceFiles().stream().filter(path -> path.getFileName().toString().endsWith(".xml"))` |
| mapperXmlFiles | source.resourceFiles().stream().filter(path -> path.getFileName().toString().endsWith(".xml")) | filter | `source.resourceFiles().stream().filter(path -> path.getFileName().toString().endsWith(".xml")).filter(path -> isMainResource(source.relativePath(path)))` |
| mapperXmlFiles | source.resourceFiles().stream().filter(path -> path.getFileName().toString().endsWith(".xml")).filter(path -> isMainResource(source.relativePath(path))) | toList | `source.resourceFiles().stream().filter(path -> path.getFileName().toString().endsWith(".xml")).filter(path -> isMainResource(source.relativePath(path))).toList()` |
| parseStatements | Comparator | comparing | `Comparator.comparing(SqlStatementDoc::ownerName)` |
| parseStatements | Comparator.comparing(SqlStatementDoc::ownerName) | thenComparing | `Comparator.comparing(SqlStatementDoc::ownerName).thenComparing(SqlStatementDoc::statementId)` |
| parseStatements | System.err | printf | `System.err.printf("Failed to analyze MyBatis Mapper %s: %s%n", xmlFile, exception.getMessage())` |
| parseStatements | exception | getMessage | `exception.getMessage()` |
| parseStatements | mapper | statements | `mapper.statements()` |
| parseStatements |  | mapperXmlFiles | `mapperXmlFiles(source)` |
| parseStatements | parser | parse | `parser.parse(xmlFile, source.relativePath(xmlFile))` |
| parseStatements | parser.parse(xmlFile, source.relativePath(xmlFile)) | ifPresent | `parser.parse(xmlFile, source.relativePath(xmlFile)).ifPresent(mapper -> statements.addAll(mapper.statements()))` |
| parseStatements | source | relativePath | `source.relativePath(xmlFile)` |
| parseStatements | statements | addAll | `statements.addAll(mapper.statements())` |
| parseStatements | statements | stream | `statements.stream()` |
| parseStatements | statements.stream() | sorted | `statements.stream().sorted(Comparator.comparing(SqlStatementDoc::ownerName).thenComparing(SqlStatementDoc::statementId))` |
| parseStatements | statements.stream().sorted(Comparator.comparing(SqlStatementDoc::ownerName).thenComparing(SqlStatementDoc::statementId)) | toList | `statements.stream().sorted(Comparator.comparing(SqlStatementDoc::ownerName).thenComparing(SqlStatementDoc::statementId)).toList()` |
| supports |  | mapperXmlFiles | `mapperXmlFiles(source)` |
| supports | mapperXmlFiles(source) | stream | `mapperXmlFiles(source).stream()` |
| supports | mapperXmlFiles(source).stream() | anyMatch | `mapperXmlFiles(source).stream().anyMatch(path -> {     try {         return parser.parse(path, source.relativePath(path)).isPresent();     } catch (IOException \| IllegalArgumentException exception) {         return false;     } })` |
| supports | parser | parse | `parser.parse(path, source.relativePath(path))` |
| supports | parser.parse(path, source.relativePath(path)) | isPresent | `parser.parse(path, source.relativePath(path)).isPresent()` |
| supports | source | javaFiles | `source.javaFiles()` |
| supports | source.javaFiles() | stream | `source.javaFiles().stream()` |
| supports | source.javaFiles().stream() | anyMatch | `source.javaFiles().stream().anyMatch(this::containsMapperAnnotation)` |
| supports | source | relativePath | `source.relativePath(path)` |

## Related Classes

### Outgoing References

| Target | Relation | Member |
| --- | --- | --- |
| [AnalysisResult](AnalysisResult.md) | METHOD_PARAMETER | currentResult |
| [AnalysisResult](AnalysisResult.md) | METHOD_RETURN_TYPE | analyze |
| [ClassDoc](ClassDoc.md) | METHOD_PARAMETER | classDoc |
| [ClassDoc](ClassDoc.md) | METHOD_RETURN_TYPE | applyMapperRole |
| [MyBatisMapperXmlParser](MyBatisMapperXmlParser.md) | FIELD | parser |
| [ProjectSource](ProjectSource.md) | METHOD_PARAMETER | source |
| [SqlStatementDoc](SqlStatementDoc.md) | METHOD_RETURN_TYPE | parseStatements |

### Incoming References

| Source | Relation | Member |
| --- | --- | --- |
| - | - | - |
