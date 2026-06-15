# SourceScanner

## Summary

* Package: `io.github.codeatlas.core.scan`
* Declaration: `CLASS`
* Type: `UNKNOWN`
* Source: `code-atlas-core/src/main/java/io/github/codeatlas/core/scan/SourceScanner.java`

## Role

コードから機械的に判定できる役割情報はありません。

## Annotations

None

## Methods

| Method | Return Type | Parameters | Annotations |
| --- | --- | --- | --- |
| scan | `ProjectSource` | Path rootDirectory |  |
| isResource | `boolean` | Path file, Path root |  |
| optionalFile | `Optional<Path>` | Path path |  |

## Fields

| Name | Type | Annotations |
| --- | --- | --- |
| EXCLUDED_DIRECTORIES | `Set<String>` |  |
| CONFIG_FILE | `Pattern` |  |

## Related Classes

### Outgoing References

| Target | Relation | Member |
| --- | --- | --- |
| [ProjectSource](ProjectSource.md) | METHOD_RETURN_TYPE | scan |

### Incoming References

| Source | Relation | Member |
| --- | --- | --- |
| - | - | - |
