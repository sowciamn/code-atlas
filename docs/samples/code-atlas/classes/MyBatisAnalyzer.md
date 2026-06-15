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
| mapperStatementRelations | `List<MapperStatementRelationDoc>` | List<ClassDoc> classes, List<SqlStatementDoc> statements |  |
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

## Method Call Relations

### Outgoing Calls

| Target | Expression |
| --- | --- |
| [AnalysisResult](AnalysisResult.md).classes | `currentResult.classes()` |
| [AnalysisResult](AnalysisResult.md).configs | `currentResult.configs()` |
| [AnalysisResult](AnalysisResult.md).endpoints | `currentResult.endpoints()` |
| [AnalysisResult](AnalysisResult.md).methodCallRelations | `currentResult.methodCallRelations()` |
| [AnalysisResult](AnalysisResult.md).methodCalls | `currentResult.methodCalls()` |
| [AnalysisResult](AnalysisResult.md).overview | `currentResult.overview()` |
| [AnalysisResult](AnalysisResult.md).relations | `currentResult.relations()` |
| [AnalysisResult](AnalysisResult.md).variableTypes | `currentResult.variableTypes()` |
| [MyBatisAnalyzer](MyBatisAnalyzer.md).analyze | `analyze(source, empty)` |
| [MyBatisAnalyzer](MyBatisAnalyzer.md).mapperStatementRelations | `mapperStatementRelations(classes, statements)` |
| [MyBatisAnalyzer](MyBatisAnalyzer.md).parseStatements | `parseStatements(source)` |
| [ProjectSource](ProjectSource.md).rootDirectory | `source.rootDirectory()` |
| [ProjectSource](ProjectSource.md).rootDirectory | `source.rootDirectory()` |
| [ClassDoc](ClassDoc.md).annotations | `classDoc.annotations()` |
| [ClassDoc](ClassDoc.md).roleSummary | `classDoc.roleSummary()` |
| [ClassDoc](ClassDoc.md).roleSummary | `classDoc.roleSummary()` |
| [ClassDoc](ClassDoc.md).withRoleSummary | `classDoc.withRoleSummary(MAPPER_ROLE)` |
| [ClassDoc](ClassDoc.md).className | `classDoc.className()` |
| [ClassDoc](ClassDoc.md).className | `classDoc.className()` |
| [ClassDoc](ClassDoc.md).className | `classDoc.className()` |
| [ClassDoc](ClassDoc.md).methods | `classDoc.methods()` |
| [ClassDoc](ClassDoc.md).packageName | `classDoc.packageName()` |
| [ClassDoc](ClassDoc.md).packageName | `classDoc.packageName()` |
| [SqlStatementDoc](SqlStatementDoc.md).ownerName | `statement.ownerName()` |
| [SqlStatementDoc](SqlStatementDoc.md).sourcePath | `statement.sourcePath()` |
| [SqlStatementDoc](SqlStatementDoc.md).statementId | `statement.statementId()` |
| [SqlStatementDoc](SqlStatementDoc.md).statementId | `statement.statementId()` |
| [SqlStatementDoc](SqlStatementDoc.md).statementType | `statement.statementType()` |
| [SqlStatementDoc](SqlStatementDoc.md).tableNames | `statement.tableNames()` |
| [MyBatisAnalyzer](MyBatisAnalyzer.md).isMainResource | `isMainResource(source.relativePath(path))` |
| [ProjectSource](ProjectSource.md).relativePath | `source.relativePath(path)` |
| [ProjectSource](ProjectSource.md).resourceFiles | `source.resourceFiles()` |
| [MyBatisAnalyzer](MyBatisAnalyzer.md).mapperXmlFiles | `mapperXmlFiles(source)` |
| [MyBatisMapperXmlParser](MyBatisMapperXmlParser.md).parse | `parser.parse(xmlFile, source.relativePath(xmlFile))` |
| [ProjectSource](ProjectSource.md).relativePath | `source.relativePath(xmlFile)` |
| [MyBatisAnalyzer](MyBatisAnalyzer.md).mapperXmlFiles | `mapperXmlFiles(source)` |
| [MyBatisMapperXmlParser](MyBatisMapperXmlParser.md).parse | `parser.parse(path, source.relativePath(path))` |
| [ProjectSource](ProjectSource.md).javaFiles | `source.javaFiles()` |
| [ProjectSource](ProjectSource.md).relativePath | `source.relativePath(path)` |

### Incoming Calls

| Source | Expression |
| --- | --- |
| [MyBatisAnalyzer](MyBatisAnalyzer.md).analyze | `analyze(source, empty)` |
| [MyBatisAnalyzer](MyBatisAnalyzer.md).analyze | `mapperStatementRelations(classes, statements)` |
| [MyBatisAnalyzer](MyBatisAnalyzer.md).analyze | `parseStatements(source)` |
| [MyBatisAnalyzer](MyBatisAnalyzer.md).mapperXmlFiles | `isMainResource(source.relativePath(path))` |
| [MyBatisAnalyzer](MyBatisAnalyzer.md).parseStatements | `mapperXmlFiles(source)` |
| [MyBatisAnalyzer](MyBatisAnalyzer.md).supports | `mapperXmlFiles(source)` |
| [MyBatisAnalyzerTest](MyBatisAnalyzerTest.md).addsSqlTableUsageAndMapperRoleToCurrentResult | `analyzer.analyze(source, current)` |
| [MyBatisAnalyzerTest](MyBatisAnalyzerTest.md).addsSqlTableUsageAndMapperRoleToCurrentResult | `analyzer.supports(source)` |

## Method Calls

### Project Calls

| Source Method | Scope | Resolved Target | Called Method | Expression |
| --- | --- | --- | --- | --- |
| analyze |  | MyBatisAnalyzer | analyze | `analyze(source, empty)` |
| analyze | currentResult | AnalysisResult | classes | `currentResult.classes()` |
| analyze | currentResult | AnalysisResult | configs | `currentResult.configs()` |
| analyze | currentResult | AnalysisResult | endpoints | `currentResult.endpoints()` |
| analyze | currentResult | AnalysisResult | methodCallRelations | `currentResult.methodCallRelations()` |
| analyze | currentResult | AnalysisResult | methodCalls | `currentResult.methodCalls()` |
| analyze | currentResult | AnalysisResult | overview | `currentResult.overview()` |
| analyze | currentResult | AnalysisResult | relations | `currentResult.relations()` |
| analyze | currentResult | AnalysisResult | variableTypes | `currentResult.variableTypes()` |
| analyze |  | MyBatisAnalyzer | mapperStatementRelations | `mapperStatementRelations(classes, statements)` |
| analyze |  | MyBatisAnalyzer | parseStatements | `parseStatements(source)` |
| analyze | source | ProjectSource | rootDirectory | `source.rootDirectory()` |
| analyze | source | ProjectSource | rootDirectory | `source.rootDirectory()` |
| applyMapperRole | classDoc | ClassDoc | annotations | `classDoc.annotations()` |
| applyMapperRole | classDoc | ClassDoc | roleSummary | `classDoc.roleSummary()` |
| applyMapperRole | classDoc | ClassDoc | roleSummary | `classDoc.roleSummary()` |
| applyMapperRole | classDoc | ClassDoc | withRoleSummary | `classDoc.withRoleSummary(MAPPER_ROLE)` |
| mapperStatementRelations | classDoc | ClassDoc | className | `classDoc.className()` |
| mapperStatementRelations | classDoc | ClassDoc | className | `classDoc.className()` |
| mapperStatementRelations | classDoc | ClassDoc | className | `classDoc.className()` |
| mapperStatementRelations | classDoc | ClassDoc | methods | `classDoc.methods()` |
| mapperStatementRelations | classDoc | ClassDoc | packageName | `classDoc.packageName()` |
| mapperStatementRelations | classDoc | ClassDoc | packageName | `classDoc.packageName()` |
| mapperStatementRelations | statement | SqlStatementDoc | ownerName | `statement.ownerName()` |
| mapperStatementRelations | statement | SqlStatementDoc | sourcePath | `statement.sourcePath()` |
| mapperStatementRelations | statement | SqlStatementDoc | statementId | `statement.statementId()` |
| mapperStatementRelations | statement | SqlStatementDoc | statementId | `statement.statementId()` |
| mapperStatementRelations | statement | SqlStatementDoc | statementType | `statement.statementType()` |
| mapperStatementRelations | statement | SqlStatementDoc | tableNames | `statement.tableNames()` |
| mapperXmlFiles |  | MyBatisAnalyzer | isMainResource | `isMainResource(source.relativePath(path))` |
| mapperXmlFiles | source | ProjectSource | relativePath | `source.relativePath(path)` |
| mapperXmlFiles | source | ProjectSource | resourceFiles | `source.resourceFiles()` |
| parseStatements |  | MyBatisAnalyzer | mapperXmlFiles | `mapperXmlFiles(source)` |
| parseStatements | parser | MyBatisMapperXmlParser | parse | `parser.parse(xmlFile, source.relativePath(xmlFile))` |
| parseStatements | source | ProjectSource | relativePath | `source.relativePath(xmlFile)` |
| supports |  | MyBatisAnalyzer | mapperXmlFiles | `mapperXmlFiles(source)` |
| supports | parser | MyBatisMapperXmlParser | parse | `parser.parse(path, source.relativePath(path))` |
| supports | source | ProjectSource | javaFiles | `source.javaFiles()` |
| supports | source | ProjectSource | relativePath | `source.relativePath(path)` |

### Library / Utility Calls

Library / Utility calls are omitted from this page. Count: 84.

## Related Classes

### Outgoing References

| Target | Relation | Member |
| --- | --- | --- |
| [AnalysisResult](AnalysisResult.md) | METHOD_PARAMETER | currentResult |
| [AnalysisResult](AnalysisResult.md) | METHOD_RETURN_TYPE | analyze |
| [ClassDoc](ClassDoc.md) | METHOD_PARAMETER | classDoc |
| [ClassDoc](ClassDoc.md) | METHOD_PARAMETER | classes |
| [ClassDoc](ClassDoc.md) | METHOD_RETURN_TYPE | applyMapperRole |
| [MapperStatementRelationDoc](MapperStatementRelationDoc.md) | METHOD_RETURN_TYPE | mapperStatementRelations |
| [MyBatisMapperXmlParser](MyBatisMapperXmlParser.md) | FIELD | parser |
| [ProjectSource](ProjectSource.md) | METHOD_PARAMETER | source |
| [SqlStatementDoc](SqlStatementDoc.md) | METHOD_PARAMETER | statements |
| [SqlStatementDoc](SqlStatementDoc.md) | METHOD_RETURN_TYPE | parseStatements |

### Incoming References

| Source | Relation | Member |
| --- | --- | --- |
| - | - | - |
