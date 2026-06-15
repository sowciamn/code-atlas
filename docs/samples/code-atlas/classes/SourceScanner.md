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
| isExcludedDirectory | `boolean` | Path relativeDirectory |  |
| normalizeExcludedPath | `Path` | String value |  |
| isResource | `boolean` | Path file, Path root |  |
| optionalFile | `Optional<Path>` | Path path |  |

## Fields

| Name | Type | Annotations |
| --- | --- | --- |
| DEFAULT_EXCLUDED_DIRECTORIES | `Set<String>` |  |
| CONFIG_FILE | `Pattern` |  |
| excludedPaths | `Set<Path>` |  |

## Method Call Relations

### Outgoing Calls

| Target | Expression |
| --- | --- |
| [SourceScanner](SourceScanner.md).isExcludedDirectory | `isExcludedDirectory(root.relativize(dir))` |
| [SourceScanner](SourceScanner.md).isResource | `isResource(file, root)` |
| [SourceScanner](SourceScanner.md).optionalFile | `optionalFile(root.resolve("build.gradle"))` |
| [SourceScanner](SourceScanner.md).optionalFile | `optionalFile(root.resolve("pom.xml"))` |

### Incoming Calls

| Source | Expression |
| --- | --- |
| [SourceScanner](SourceScanner.md).scan | `isExcludedDirectory(root.relativize(dir))` |
| [SourceScanner](SourceScanner.md).scan | `isResource(file, root)` |
| [SourceScanner](SourceScanner.md).scan | `optionalFile(root.resolve("build.gradle"))` |
| [SourceScanner](SourceScanner.md).scan | `optionalFile(root.resolve("pom.xml"))` |

## Method Calls

### Project Calls

| Source Method | Scope | Resolved Target | Called Method | Expression |
| --- | --- | --- | --- | --- |
| scan |  | SourceScanner | isExcludedDirectory | `isExcludedDirectory(root.relativize(dir))` |
| scan |  | SourceScanner | isResource | `isResource(file, root)` |
| scan |  | SourceScanner | optionalFile | `optionalFile(root.resolve("build.gradle"))` |
| scan |  | SourceScanner | optionalFile | `optionalFile(root.resolve("pom.xml"))` |

### Library / Utility Calls

Library / Utility calls are omitted from this page. Count: 46.

## Related Classes

### Outgoing References

| Target | Relation | Member |
| --- | --- | --- |
| [ProjectSource](ProjectSource.md) | METHOD_RETURN_TYPE | scan |

### Incoming References

| Source | Relation | Member |
| --- | --- | --- |
| - | - | - |
