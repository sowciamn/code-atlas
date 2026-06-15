# CodeAnalyzerPlugin

## Summary

* Package: `io.github.codeatlas.core.spi`
* Declaration: `INTERFACE`
* Type: `UNKNOWN`
* Source: `code-atlas-core/src/main/java/io/github/codeatlas/core/spi/CodeAnalyzerPlugin.java`

## Role

コードから機械的に判定できる役割情報はありません。

## Annotations

None

## Methods

| Method | Return Type | Parameters | Annotations |
| --- | --- | --- | --- |
| pluginId | `String` |  |  |
| supports | `boolean` | ProjectSource source |  |
| analyze | `AnalysisResult` | ProjectSource source |  |
| analyze | `AnalysisResult` | ProjectSource source, AnalysisResult currentResult |  |

## Fields

| Name | Type | Annotations |
| --- | --- | --- |
| - | - | - |

## Method Call Relations

### Outgoing Calls

| Target | Expression |
| --- | --- |
| [CodeAnalyzerPlugin](CodeAnalyzerPlugin.md).analyze | `analyze(source)` |

### Incoming Calls

| Source | Expression |
| --- | --- |
| [AnalysisEngine](AnalysisEngine.md).analyze | `plugin.analyze(source, result)` |
| [AnalysisEngine](AnalysisEngine.md).analyze | `plugin.supports(source)` |
| [CodeAnalyzerPlugin](CodeAnalyzerPlugin.md).analyze | `analyze(source)` |

## Method Calls

### Project Calls

| Source Method | Scope | Resolved Target | Called Method | Expression |
| --- | --- | --- | --- | --- |
| analyze |  | CodeAnalyzerPlugin | analyze | `analyze(source)` |

### Library / Utility Calls

Library / Utility calls are omitted from this page. Count: 0.

## Related Classes

### Outgoing References

| Target | Relation | Member |
| --- | --- | --- |
| [AnalysisResult](AnalysisResult.md) | METHOD_PARAMETER | currentResult |
| [AnalysisResult](AnalysisResult.md) | METHOD_RETURN_TYPE | analyze |
| [ProjectSource](ProjectSource.md) | METHOD_PARAMETER | source |

### Incoming References

| Source | Relation | Member |
| --- | --- | --- |
| [AnalysisEngine](AnalysisEngine.md) | CONSTRUCTOR_PARAMETER | plugins |
| [AnalysisEngine](AnalysisEngine.md) | FIELD | plugins |
| [AnalysisEngineTest](AnalysisEngineTest.md) | METHOD_RETURN_TYPE | plugin |
