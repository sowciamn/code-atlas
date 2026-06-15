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
