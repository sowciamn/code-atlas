# MyBatisMapperXmlParser

## Summary

* Package: `io.github.codeatlas.plugin.mybatis`
* Declaration: `CLASS`
* Type: `UNKNOWN`
* Source: `code-atlas-plugin-mybatis/src/main/java/io/github/codeatlas/plugin/mybatis/MyBatisMapperXmlParser.java`

## Role

コードから機械的に判定できる役割情報はありません。

## Annotations

None

## Methods

| Method | Return Type | Parameters | Annotations |
| --- | --- | --- | --- |
| parse | `Optional<MyBatisMapperDoc>` | Path xmlPath, Path sourcePath |  |
| documentBuilder | `DocumentBuilder` |  |  |
| statements | `List<SqlStatementDoc>` | Element mapper, String namespace, Path sourcePath |  |
| statementType | `SqlStatementType` | String elementName |  |
| normalizeSql | `String` | String sql |  |
| tableNames | `List<String>` | String sql |  |

## Fields

| Name | Type | Annotations |
| --- | --- | --- |
| TABLE_REFERENCE | `Pattern` |  |

## Method Call Relations

### Outgoing Calls

| Target | Expression |
| --- | --- |
| [MyBatisMapperXmlParser](MyBatisMapperXmlParser.md).documentBuilder | `documentBuilder()` |
| [MyBatisMapperXmlParser](MyBatisMapperXmlParser.md).statements | `statements(root, namespace, sourcePath)` |
| [MyBatisMapperXmlParser](MyBatisMapperXmlParser.md).normalizeSql | `normalizeSql(element.getTextContent())` |
| [MyBatisMapperXmlParser](MyBatisMapperXmlParser.md).statementType | `statementType(element.getTagName())` |
| [MyBatisMapperXmlParser](MyBatisMapperXmlParser.md).tableNames | `tableNames(sql)` |

### Incoming Calls

| Source | Expression |
| --- | --- |
| [MyBatisAnalyzer](MyBatisAnalyzer.md).parseStatements | `parser.parse(xmlFile, source.relativePath(xmlFile))` |
| [MyBatisAnalyzer](MyBatisAnalyzer.md).supports | `parser.parse(path, source.relativePath(path))` |
| [MyBatisMapperXmlParser](MyBatisMapperXmlParser.md).parse | `documentBuilder()` |
| [MyBatisMapperXmlParser](MyBatisMapperXmlParser.md).parse | `statements(root, namespace, sourcePath)` |
| [MyBatisMapperXmlParser](MyBatisMapperXmlParser.md).statements | `normalizeSql(element.getTextContent())` |
| [MyBatisMapperXmlParser](MyBatisMapperXmlParser.md).statements | `statementType(element.getTagName())` |
| [MyBatisMapperXmlParser](MyBatisMapperXmlParser.md).statements | `tableNames(sql)` |

## Method Calls

### Project Calls

| Source Method | Scope | Resolved Target | Called Method | Expression |
| --- | --- | --- | --- | --- |
| parse |  | MyBatisMapperXmlParser | documentBuilder | `documentBuilder()` |
| parse |  | MyBatisMapperXmlParser | statements | `statements(root, namespace, sourcePath)` |
| statements |  | MyBatisMapperXmlParser | normalizeSql | `normalizeSql(element.getTextContent())` |
| statements |  | MyBatisMapperXmlParser | statementType | `statementType(element.getTagName())` |
| statements |  | MyBatisMapperXmlParser | tableNames | `tableNames(sql)` |

### Library / Utility Calls

Library / Utility calls are omitted from this page. Count: 42.

## Related Classes

### Outgoing References

| Target | Relation | Member |
| --- | --- | --- |
| [MyBatisMapperDoc](MyBatisMapperDoc.md) | METHOD_RETURN_TYPE | parse |
| [SqlStatementDoc](SqlStatementDoc.md) | METHOD_RETURN_TYPE | statements |
| [SqlStatementType](SqlStatementType.md) | METHOD_RETURN_TYPE | statementType |

### Incoming References

| Source | Relation | Member |
| --- | --- | --- |
| [MyBatisAnalyzer](MyBatisAnalyzer.md) | FIELD | parser |
