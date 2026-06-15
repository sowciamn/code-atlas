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

## Fields

| Name | Type | Annotations |
| --- | --- | --- |
| MAPPER_ROLE | `String` |  |
| parser | `MyBatisMapperXmlParser` |  |

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
