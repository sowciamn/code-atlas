# JavaAnalyzerTest

## Summary

* Package: `io.github.codeatlas.plugin.java`
* Declaration: `CLASS`
* Type: `UNKNOWN`
* Source: `code-atlas-plugin-java/src/test/java/io/github/codeatlas/plugin/java/JavaAnalyzerTest.java`

## Role

コードから機械的に判定できる役割情報はありません。

## Annotations

None

## Methods

| Method | Return Type | Parameters | Annotations |
| --- | --- | --- | --- |
| extractsClassPackageMethodsAnnotationsAndFields | `void` |  | Test |
| extractsRelationFromFieldType | `void` |  | Test |
| extractsRelationFromConstructorParameter | `void` |  | Test |
| extractsRelationFromMethodParameter | `void` |  | Test |
| extractsRelationFromGenericMethodReturnTypeAndIgnoresExternalTypes | `void` |  | Test |
| analyze | `AnalysisResult` |  |  |
| write | `void` | String fileName, String content |  |

## Fields

| Name | Type | Annotations |
| --- | --- | --- |
| tempDir | `Path` | TempDir |

## Related Classes

### Outgoing References

| Target | Relation | Member |
| --- | --- | --- |
| [AnalysisResult](AnalysisResult.md) | METHOD_RETURN_TYPE | analyze |

### Incoming References

| Source | Relation | Member |
| --- | --- | --- |
| - | - | - |
