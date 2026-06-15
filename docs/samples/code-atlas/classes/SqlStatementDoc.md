# SqlStatementDoc

## Summary

* Package: `io.github.codeatlas.core.model`
* Declaration: `TYPE`
* Type: `UNKNOWN`
* Source: `code-atlas-core/src/main/java/io/github/codeatlas/core/model/SqlStatementDoc.java`

## Role

コードから機械的に判定できる役割情報はありません。

## Annotations

None

## Methods

| Method | Return Type | Parameters | Annotations |
| --- | --- | --- | --- |
| - | - | - | - |

## Fields

| Name | Type | Annotations |
| --- | --- | --- |
| - | - | - |

## Method Call Relations

### Outgoing Calls

| Target | Expression |
| --- | --- |
| - | - |

### Incoming Calls

| Source | Expression |
| --- | --- |
| [MarkdownRenderer](MarkdownRenderer.md).mybatis | `first.ownerName()` |
| [MarkdownRenderer](MarkdownRenderer.md).mybatis | `first.sourcePath()` |
| [MyBatisAnalyzer](MyBatisAnalyzer.md).mapperStatementRelations | `statement.ownerName()` |
| [MyBatisAnalyzer](MyBatisAnalyzer.md).mapperStatementRelations | `statement.sourcePath()` |
| [MyBatisAnalyzer](MyBatisAnalyzer.md).mapperStatementRelations | `statement.statementId()` |
| [MyBatisAnalyzer](MyBatisAnalyzer.md).mapperStatementRelations | `statement.statementId()` |
| [MyBatisAnalyzer](MyBatisAnalyzer.md).mapperStatementRelations | `statement.statementType()` |
| [MyBatisAnalyzer](MyBatisAnalyzer.md).mapperStatementRelations | `statement.tableNames()` |

## Method Calls

### Project Calls

| Source Method | Scope | Resolved Target | Called Method | Expression |
| --- | --- | --- | --- | --- |
| - | - | - | - | - |

### Library / Utility Calls

Library / Utility calls are omitted from this page. Count: 0.

## Related Classes

### Outgoing References

| Target | Relation | Member |
| --- | --- | --- |
| - | - | - |

### Incoming References

| Source | Relation | Member |
| --- | --- | --- |
| [MarkdownRenderer](MarkdownRenderer.md) | METHOD_PARAMETER | statements |
| [MarkdownRenderer](MarkdownRenderer.md) | METHOD_RETURN_TYPE | matchingMyBatisStatements |
| [MyBatisAnalyzer](MyBatisAnalyzer.md) | METHOD_PARAMETER | statements |
| [MyBatisAnalyzer](MyBatisAnalyzer.md) | METHOD_RETURN_TYPE | parseStatements |
| [MyBatisMapperXmlParser](MyBatisMapperXmlParser.md) | METHOD_RETURN_TYPE | statements |
