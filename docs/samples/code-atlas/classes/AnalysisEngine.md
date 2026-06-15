# AnalysisEngine

## Summary

* Package: `io.github.codeatlas.core`
* Declaration: `CLASS`
* Type: `UNKNOWN`
* Source: `code-atlas-core/src/main/java/io/github/codeatlas/core/AnalysisEngine.java`

## Role

コードから機械的に判定できる役割情報はありません。

## Annotations

None

## Methods

| Method | Return Type | Parameters | Annotations |
| --- | --- | --- | --- |
| analyze | `AnalysisResult` | ProjectSource source |  |
| emptyResult | `AnalysisResult` | ProjectSource source |  |

## Fields

| Name | Type | Annotations |
| --- | --- | --- |
| plugins | `List<CodeAnalyzerPlugin>` |  |

## Related Classes

### Outgoing References

| Target | Relation | Member |
| --- | --- | --- |
| [AnalysisResult](AnalysisResult.md) | METHOD_RETURN_TYPE | analyze |
| [AnalysisResult](AnalysisResult.md) | METHOD_RETURN_TYPE | emptyResult |
| [CodeAnalyzerPlugin](CodeAnalyzerPlugin.md) | CONSTRUCTOR_PARAMETER | plugins |
| [CodeAnalyzerPlugin](CodeAnalyzerPlugin.md) | FIELD | plugins |
| [ProjectSource](ProjectSource.md) | METHOD_PARAMETER | source |

### Incoming References

| Source | Relation | Member |
| --- | --- | --- |
| - | - | - |
