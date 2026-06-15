# AnalysisEngineTest

## Summary

* Package: `io.github.codeatlas.core`
* Declaration: `CLASS`
* Type: `UNKNOWN`
* Source: `code-atlas-core/src/test/java/io/github/codeatlas/core/AnalysisEngineTest.java`

## Role

コードから機械的に判定できる役割情報はありません。

## Annotations

None

## Methods

| Method | Return Type | Parameters | Annotations |
| --- | --- | --- | --- |
| appliesAllSupportedPluginsInRegistrationOrder | `void` |  | Test |
| plugin | `CodeAnalyzerPlugin` | String id, List<String> applied, String configName |  |

## Fields

| Name | Type | Annotations |
| --- | --- | --- |
| tempDir | `Path` | TempDir |

## Method Call Relations

### Outgoing Calls

| Target | Expression |
| --- | --- |
| [AnalysisEngineTest](AnalysisEngineTest.md).plugin | `plugin("first", applied, "first.yml")` |
| [AnalysisEngineTest](AnalysisEngineTest.md).plugin | `plugin("second", applied, "second.yml")` |
| [AnalysisResult](AnalysisResult.md).configs | `result.configs()` |

### Incoming Calls

| Source | Expression |
| --- | --- |
| [AnalysisEngineTest](AnalysisEngineTest.md).appliesAllSupportedPluginsInRegistrationOrder | `plugin("first", applied, "first.yml")` |
| [AnalysisEngineTest](AnalysisEngineTest.md).appliesAllSupportedPluginsInRegistrationOrder | `plugin("second", applied, "second.yml")` |

## Method Calls

### Project Calls

| Source Method | Scope | Resolved Target | Called Method | Expression |
| --- | --- | --- | --- | --- |
| appliesAllSupportedPluginsInRegistrationOrder |  | AnalysisEngineTest | plugin | `plugin("first", applied, "first.yml")` |
| appliesAllSupportedPluginsInRegistrationOrder |  | AnalysisEngineTest | plugin | `plugin("second", applied, "second.yml")` |
| appliesAllSupportedPluginsInRegistrationOrder | result | AnalysisResult | configs | `result.configs()` |

### Library / Utility Calls

Library / Utility calls are omitted from this page. Count: 27.

## Related Classes

### Outgoing References

| Target | Relation | Member |
| --- | --- | --- |
| [CodeAnalyzerPlugin](CodeAnalyzerPlugin.md) | METHOD_RETURN_TYPE | plugin |

### Incoming References

| Source | Relation | Member |
| --- | --- | --- |
| - | - | - |
