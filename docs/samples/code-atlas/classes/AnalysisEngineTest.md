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

## Method Calls

| Source Method | Scope | Called Method | Expression |
| --- | --- | --- | --- |
| appliesAllSupportedPluginsInRegistrationOrder | List | of | `List.of()` |
| appliesAllSupportedPluginsInRegistrationOrder | List | of | `List.of()` |
| appliesAllSupportedPluginsInRegistrationOrder | List | of | `List.of()` |
| appliesAllSupportedPluginsInRegistrationOrder | List | of | `List.of(first, second)` |
| appliesAllSupportedPluginsInRegistrationOrder | Optional | empty | `Optional.empty()` |
| appliesAllSupportedPluginsInRegistrationOrder | Optional | empty | `Optional.empty()` |
| appliesAllSupportedPluginsInRegistrationOrder |  | assertThat | `assertThat(applied)` |
| appliesAllSupportedPluginsInRegistrationOrder | assertThat(applied) | containsExactly | `assertThat(applied).containsExactly("first", "second")` |
| appliesAllSupportedPluginsInRegistrationOrder |  | assertThat | `assertThat(result.configs())` |
| appliesAllSupportedPluginsInRegistrationOrder | assertThat(result.configs()) | extracting | `assertThat(result.configs()).extracting(config -> config.fileName())` |
| appliesAllSupportedPluginsInRegistrationOrder | assertThat(result.configs()).extracting(config -> config.fileName()) | containsExactly | `assertThat(result.configs()).extracting(config -> config.fileName()).containsExactly("first.yml", "second.yml")` |
| appliesAllSupportedPluginsInRegistrationOrder | config | fileName | `config.fileName()` |
| appliesAllSupportedPluginsInRegistrationOrder | new AnalysisEngine(List.of(first, second)) | analyze | `new AnalysisEngine(List.of(first, second)).analyze(source)` |
| appliesAllSupportedPluginsInRegistrationOrder |  | plugin | `plugin("first", applied, "first.yml")` |
| appliesAllSupportedPluginsInRegistrationOrder |  | plugin | `plugin("second", applied, "second.yml")` |
| appliesAllSupportedPluginsInRegistrationOrder | result | configs | `result.configs()` |
| plugin | Path | of | `Path.of(configName)` |
| plugin | applied | add | `applied.add(id)` |
| plugin | configs | add | `configs.add(new ConfigDoc(Path.of(configName), configName))` |
| plugin | currentResult | classes | `currentResult.classes()` |
| plugin | currentResult | configs | `currentResult.configs()` |
| plugin | currentResult | endpoints | `currentResult.endpoints()` |
| plugin | currentResult | methodCalls | `currentResult.methodCalls()` |
| plugin | currentResult | overview | `currentResult.overview()` |
| plugin | currentResult | relations | `currentResult.relations()` |
| plugin | currentResult | sqlStatements | `currentResult.sqlStatements()` |
| plugin | currentResult | tableUsages | `currentResult.tableUsages()` |

## Related Classes

### Outgoing References

| Target | Relation | Member |
| --- | --- | --- |
| [CodeAnalyzerPlugin](CodeAnalyzerPlugin.md) | METHOD_RETURN_TYPE | plugin |

### Incoming References

| Source | Relation | Member |
| --- | --- | --- |
| - | - | - |
