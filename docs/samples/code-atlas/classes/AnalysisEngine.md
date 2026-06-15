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

## Method Call Relations

### Outgoing Calls

| Target | Expression |
| --- | --- |
| [AnalysisEngine](AnalysisEngine.md).emptyResult | `emptyResult(source)` |
| [CodeAnalyzerPlugin](CodeAnalyzerPlugin.md).analyze | `plugin.analyze(source, result)` |
| [CodeAnalyzerPlugin](CodeAnalyzerPlugin.md).supports | `plugin.supports(source)` |
| [ProjectSource](ProjectSource.md).rootDirectory | `source.rootDirectory()` |
| [ProjectSource](ProjectSource.md).rootDirectory | `source.rootDirectory()` |
| [ProjectSource](ProjectSource.md).rootDirectory | `source.rootDirectory()` |

### Incoming Calls

| Source | Expression |
| --- | --- |
| [AnalysisEngine](AnalysisEngine.md).analyze | `emptyResult(source)` |

## Method Calls

### Project Calls

| Source Method | Scope | Resolved Target | Called Method | Expression |
| --- | --- | --- | --- | --- |
| analyze |  | AnalysisEngine | emptyResult | `emptyResult(source)` |
| analyze | plugin | CodeAnalyzerPlugin | analyze | `plugin.analyze(source, result)` |
| analyze | plugin | CodeAnalyzerPlugin | supports | `plugin.supports(source)` |
| analyze | source | ProjectSource | rootDirectory | `source.rootDirectory()` |
| emptyResult | source | ProjectSource | rootDirectory | `source.rootDirectory()` |
| emptyResult | source | ProjectSource | rootDirectory | `source.rootDirectory()` |

### Library / Utility Calls

Library / Utility calls are omitted from this page. Count: 12.

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
