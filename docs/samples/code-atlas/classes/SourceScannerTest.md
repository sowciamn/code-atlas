# SourceScannerTest

## Summary

* Package: `io.github.codeatlas.core.scan`
* Declaration: `CLASS`
* Type: `UNKNOWN`
* Source: `code-atlas-core/src/test/java/io/github/codeatlas/core/scan/SourceScannerTest.java`

## Role

コードから機械的に判定できる役割情報はありません。

## Annotations

None

## Methods

| Method | Return Type | Parameters | Annotations |
| --- | --- | --- | --- |
| collectsSourcesAndExcludesGeneratedAndDocumentationDirectories | `void` |  | Test |
| excludesAdditionalDirectoryNamesAndRelativePaths | `void` |  | Test |
| excludesMultipleAdditionalDirectoryNames | `void` |  | Test |
| create | `Path` | String relativePath |  |

## Fields

| Name | Type | Annotations |
| --- | --- | --- |
| tempDir | `Path` | TempDir |

## Method Call Relations

### Outgoing Calls

| Target | Expression |
| --- | --- |
| [ProjectSource](ProjectSource.md).configFiles | `source.configFiles()` |
| [ProjectSource](ProjectSource.md).javaFiles | `source.javaFiles()` |
| [ProjectSource](ProjectSource.md).javaFiles | `source.javaFiles()` |
| [ProjectSource](ProjectSource.md).resourceFiles | `source.resourceFiles()` |
| [SourceScannerTest](SourceScannerTest.md).create | `create(".git/internal/Hidden.java")` |
| [SourceScannerTest](SourceScannerTest.md).create | `create("docs/generated/Documented.java")` |
| [SourceScannerTest](SourceScannerTest.md).create | `create("src/main/java/example/App.java")` |
| [SourceScannerTest](SourceScannerTest.md).create | `create("src/main/resources/application.yml")` |
| [SourceScannerTest](SourceScannerTest.md).create | `create("src/main/resources/mapper/AppMapper.xml")` |
| [SourceScannerTest](SourceScannerTest.md).create | `create("target/generated/Generated.java")` |
| [ProjectSource](ProjectSource.md).javaFiles | `source.javaFiles()` |
| [SourceScannerTest](SourceScannerTest.md).create | `create("examples/demo/src/main/java/example/Demo.java")` |
| [SourceScannerTest](SourceScannerTest.md).create | `create("fixtures/generated/src/main/java/example/Generated.java")` |
| [SourceScannerTest](SourceScannerTest.md).create | `create("fixtures/kept/src/main/java/example/Kept.java")` |
| [SourceScannerTest](SourceScannerTest.md).create | `create("src/main/java/example/App.java")` |
| [ProjectSource](ProjectSource.md).javaFiles | `source.javaFiles()` |
| [SourceScannerTest](SourceScannerTest.md).create | `create("examples/Demo.java")` |
| [SourceScannerTest](SourceScannerTest.md).create | `create("samples/Sample.java")` |
| [SourceScannerTest](SourceScannerTest.md).create | `create("src/main/java/example/App.java")` |

### Incoming Calls

| Source | Expression |
| --- | --- |
| [SourceScannerTest](SourceScannerTest.md).collectsSourcesAndExcludesGeneratedAndDocumentationDirectories | `create(".git/internal/Hidden.java")` |
| [SourceScannerTest](SourceScannerTest.md).collectsSourcesAndExcludesGeneratedAndDocumentationDirectories | `create("docs/generated/Documented.java")` |
| [SourceScannerTest](SourceScannerTest.md).collectsSourcesAndExcludesGeneratedAndDocumentationDirectories | `create("src/main/java/example/App.java")` |
| [SourceScannerTest](SourceScannerTest.md).collectsSourcesAndExcludesGeneratedAndDocumentationDirectories | `create("src/main/resources/application.yml")` |
| [SourceScannerTest](SourceScannerTest.md).collectsSourcesAndExcludesGeneratedAndDocumentationDirectories | `create("src/main/resources/mapper/AppMapper.xml")` |
| [SourceScannerTest](SourceScannerTest.md).collectsSourcesAndExcludesGeneratedAndDocumentationDirectories | `create("target/generated/Generated.java")` |
| [SourceScannerTest](SourceScannerTest.md).excludesAdditionalDirectoryNamesAndRelativePaths | `create("examples/demo/src/main/java/example/Demo.java")` |
| [SourceScannerTest](SourceScannerTest.md).excludesAdditionalDirectoryNamesAndRelativePaths | `create("fixtures/generated/src/main/java/example/Generated.java")` |
| [SourceScannerTest](SourceScannerTest.md).excludesAdditionalDirectoryNamesAndRelativePaths | `create("fixtures/kept/src/main/java/example/Kept.java")` |
| [SourceScannerTest](SourceScannerTest.md).excludesAdditionalDirectoryNamesAndRelativePaths | `create("src/main/java/example/App.java")` |
| [SourceScannerTest](SourceScannerTest.md).excludesMultipleAdditionalDirectoryNames | `create("examples/Demo.java")` |
| [SourceScannerTest](SourceScannerTest.md).excludesMultipleAdditionalDirectoryNames | `create("samples/Sample.java")` |
| [SourceScannerTest](SourceScannerTest.md).excludesMultipleAdditionalDirectoryNames | `create("src/main/java/example/App.java")` |

## Method Calls

### Project Calls

| Source Method | Scope | Resolved Target | Called Method | Expression |
| --- | --- | --- | --- | --- |
| collectsSourcesAndExcludesGeneratedAndDocumentationDirectories |  | SourceScannerTest | create | `create(".git/internal/Hidden.java")` |
| collectsSourcesAndExcludesGeneratedAndDocumentationDirectories |  | SourceScannerTest | create | `create("docs/generated/Documented.java")` |
| collectsSourcesAndExcludesGeneratedAndDocumentationDirectories |  | SourceScannerTest | create | `create("src/main/java/example/App.java")` |
| collectsSourcesAndExcludesGeneratedAndDocumentationDirectories |  | SourceScannerTest | create | `create("src/main/resources/application.yml")` |
| collectsSourcesAndExcludesGeneratedAndDocumentationDirectories |  | SourceScannerTest | create | `create("src/main/resources/mapper/AppMapper.xml")` |
| collectsSourcesAndExcludesGeneratedAndDocumentationDirectories |  | SourceScannerTest | create | `create("target/generated/Generated.java")` |
| collectsSourcesAndExcludesGeneratedAndDocumentationDirectories | source | ProjectSource | configFiles | `source.configFiles()` |
| collectsSourcesAndExcludesGeneratedAndDocumentationDirectories | source | ProjectSource | javaFiles | `source.javaFiles()` |
| collectsSourcesAndExcludesGeneratedAndDocumentationDirectories | source | ProjectSource | javaFiles | `source.javaFiles()` |
| collectsSourcesAndExcludesGeneratedAndDocumentationDirectories | source | ProjectSource | resourceFiles | `source.resourceFiles()` |
| excludesAdditionalDirectoryNamesAndRelativePaths |  | SourceScannerTest | create | `create("examples/demo/src/main/java/example/Demo.java")` |
| excludesAdditionalDirectoryNamesAndRelativePaths |  | SourceScannerTest | create | `create("fixtures/generated/src/main/java/example/Generated.java")` |
| excludesAdditionalDirectoryNamesAndRelativePaths |  | SourceScannerTest | create | `create("fixtures/kept/src/main/java/example/Kept.java")` |
| excludesAdditionalDirectoryNamesAndRelativePaths |  | SourceScannerTest | create | `create("src/main/java/example/App.java")` |
| excludesAdditionalDirectoryNamesAndRelativePaths | source | ProjectSource | javaFiles | `source.javaFiles()` |
| excludesMultipleAdditionalDirectoryNames |  | SourceScannerTest | create | `create("examples/Demo.java")` |
| excludesMultipleAdditionalDirectoryNames |  | SourceScannerTest | create | `create("samples/Sample.java")` |
| excludesMultipleAdditionalDirectoryNames |  | SourceScannerTest | create | `create("src/main/java/example/App.java")` |
| excludesMultipleAdditionalDirectoryNames | source | ProjectSource | javaFiles | `source.javaFiles()` |

### Library / Utility Calls

Library / Utility calls are omitted from this page. Count: 30.

## Related Classes

### Outgoing References

| Target | Relation | Member |
| --- | --- | --- |
| - | - | - |

### Incoming References

| Source | Relation | Member |
| --- | --- | --- |
| - | - | - |
