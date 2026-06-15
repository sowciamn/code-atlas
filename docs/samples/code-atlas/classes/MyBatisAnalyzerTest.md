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
| doesNotRelateStatementWhenMapperMethodNameDoesNotMatch | `void` |  | Test |

## Fields

| Name | Type | Annotations |
| --- | --- | --- |
| tempDir | `Path` | TempDir |

## Method Call Relations

### Outgoing Calls

| Target | Expression |
| --- | --- |
| [AnalysisResult](AnalysisResult.md).classes | `result.classes()` |
| [AnalysisResult](AnalysisResult.md).mapperStatementRelations | `result.mapperStatementRelations()` |
| [AnalysisResult](AnalysisResult.md).sqlStatements | `result.sqlStatements()` |
| [AnalysisResult](AnalysisResult.md).tableUsages | `result.tableUsages()` |
| [MyBatisAnalyzer](MyBatisAnalyzer.md).analyze | `analyzer.analyze(source, current)` |
| [MyBatisAnalyzer](MyBatisAnalyzer.md).supports | `analyzer.supports(source)` |
| [AnalysisResult](AnalysisResult.md).mapperStatementRelations | `result.mapperStatementRelations()` |

### Incoming Calls

| Source | Expression |
| --- | --- |
| - | - |

## Method Calls

### Project Calls

| Source Method | Scope | Resolved Target | Called Method | Expression |
| --- | --- | --- | --- | --- |
| addsSqlTableUsageAndMapperRoleToCurrentResult | analyzer | MyBatisAnalyzer | analyze | `analyzer.analyze(source, current)` |
| addsSqlTableUsageAndMapperRoleToCurrentResult | analyzer | MyBatisAnalyzer | supports | `analyzer.supports(source)` |
| addsSqlTableUsageAndMapperRoleToCurrentResult | result | AnalysisResult | classes | `result.classes()` |
| addsSqlTableUsageAndMapperRoleToCurrentResult | result | AnalysisResult | mapperStatementRelations | `result.mapperStatementRelations()` |
| addsSqlTableUsageAndMapperRoleToCurrentResult | result | AnalysisResult | sqlStatements | `result.sqlStatements()` |
| addsSqlTableUsageAndMapperRoleToCurrentResult | result | AnalysisResult | tableUsages | `result.tableUsages()` |
| doesNotRelateStatementWhenMapperMethodNameDoesNotMatch | result | AnalysisResult | mapperStatementRelations | `result.mapperStatementRelations()` |

### Library / Utility Calls

Library / Utility calls are omitted from this page. Count: 92.

## Related Classes

### Outgoing References

| Target | Relation | Member |
| --- | --- | --- |
| - | - | - |

### Incoming References

| Source | Relation | Member |
| --- | --- | --- |
| - | - | - |
