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

## Method Calls

| Source Method | Scope | Called Method | Expression |
| --- | --- | --- | --- |
| collectsSourcesAndExcludesGeneratedAndDocumentationDirectories |  | assertThat | `assertThat(source.configFiles())` |
| collectsSourcesAndExcludesGeneratedAndDocumentationDirectories | assertThat(source.configFiles()) | containsExactly | `assertThat(source.configFiles()).containsExactly(configFile)` |
| collectsSourcesAndExcludesGeneratedAndDocumentationDirectories |  | assertThat | `assertThat(source.javaFiles())` |
| collectsSourcesAndExcludesGeneratedAndDocumentationDirectories |  | assertThat | `assertThat(source.javaFiles())` |
| collectsSourcesAndExcludesGeneratedAndDocumentationDirectories | assertThat(source.javaFiles()) | containsExactly | `assertThat(source.javaFiles()).containsExactly(javaFile)` |
| collectsSourcesAndExcludesGeneratedAndDocumentationDirectories | assertThat(source.javaFiles()) | noneMatch | `assertThat(source.javaFiles()).noneMatch(path -> path.toString().contains("target"))` |
| collectsSourcesAndExcludesGeneratedAndDocumentationDirectories | assertThat(source.javaFiles()).noneMatch(path -> path.toString().contains("target")) | noneMatch | `assertThat(source.javaFiles()).noneMatch(path -> path.toString().contains("target")).noneMatch(path -> path.toString().contains(".git"))` |
| collectsSourcesAndExcludesGeneratedAndDocumentationDirectories | assertThat(source.javaFiles()).noneMatch(path -> path.toString().contains("target")).noneMatch(path -> path.toString().contains(".git")) | noneMatch | `assertThat(source.javaFiles()).noneMatch(path -> path.toString().contains("target")).noneMatch(path -> path.toString().contains(".git")).noneMatch(path -> path.toString().contains("docs"))` |
| collectsSourcesAndExcludesGeneratedAndDocumentationDirectories |  | assertThat | `assertThat(source.resourceFiles())` |
| collectsSourcesAndExcludesGeneratedAndDocumentationDirectories | assertThat(source.resourceFiles()) | containsExactly | `assertThat(source.resourceFiles()).containsExactly(configFile, mapperXml)` |
| collectsSourcesAndExcludesGeneratedAndDocumentationDirectories |  | create | `create(".git/internal/Hidden.java")` |
| collectsSourcesAndExcludesGeneratedAndDocumentationDirectories |  | create | `create("docs/generated/Documented.java")` |
| collectsSourcesAndExcludesGeneratedAndDocumentationDirectories |  | create | `create("src/main/java/example/App.java")` |
| collectsSourcesAndExcludesGeneratedAndDocumentationDirectories |  | create | `create("src/main/resources/application.yml")` |
| collectsSourcesAndExcludesGeneratedAndDocumentationDirectories |  | create | `create("src/main/resources/mapper/AppMapper.xml")` |
| collectsSourcesAndExcludesGeneratedAndDocumentationDirectories |  | create | `create("target/generated/Generated.java")` |
| collectsSourcesAndExcludesGeneratedAndDocumentationDirectories | new SourceScanner() | scan | `new SourceScanner().scan(tempDir)` |
| collectsSourcesAndExcludesGeneratedAndDocumentationDirectories | path | toString | `path.toString()` |
| collectsSourcesAndExcludesGeneratedAndDocumentationDirectories | path | toString | `path.toString()` |
| collectsSourcesAndExcludesGeneratedAndDocumentationDirectories | path | toString | `path.toString()` |
| collectsSourcesAndExcludesGeneratedAndDocumentationDirectories | path.toString() | contains | `path.toString().contains(".git")` |
| collectsSourcesAndExcludesGeneratedAndDocumentationDirectories | path.toString() | contains | `path.toString().contains("docs")` |
| collectsSourcesAndExcludesGeneratedAndDocumentationDirectories | path.toString() | contains | `path.toString().contains("target")` |
| collectsSourcesAndExcludesGeneratedAndDocumentationDirectories | source | configFiles | `source.configFiles()` |
| collectsSourcesAndExcludesGeneratedAndDocumentationDirectories | source | javaFiles | `source.javaFiles()` |
| collectsSourcesAndExcludesGeneratedAndDocumentationDirectories | source | javaFiles | `source.javaFiles()` |
| collectsSourcesAndExcludesGeneratedAndDocumentationDirectories | source | resourceFiles | `source.resourceFiles()` |
| create | Files | createDirectories | `Files.createDirectories(path.getParent())` |
| create | Files | writeString | `Files.writeString(path, "")` |
| create | path | getParent | `path.getParent()` |
| create | tempDir | resolve | `tempDir.resolve(relativePath)` |
| excludesAdditionalDirectoryNamesAndRelativePaths | Set | of | `Set.of("examples", "fixtures/generated")` |
| excludesAdditionalDirectoryNamesAndRelativePaths |  | assertThat | `assertThat(source.javaFiles())` |
| excludesAdditionalDirectoryNamesAndRelativePaths | assertThat(source.javaFiles()) | containsExactly | `assertThat(source.javaFiles()).containsExactly(tempDir.resolve("fixtures/kept/src/main/java/example/Kept.java"), included)` |
| excludesAdditionalDirectoryNamesAndRelativePaths |  | create | `create("examples/demo/src/main/java/example/Demo.java")` |
| excludesAdditionalDirectoryNamesAndRelativePaths |  | create | `create("fixtures/generated/src/main/java/example/Generated.java")` |
| excludesAdditionalDirectoryNamesAndRelativePaths |  | create | `create("fixtures/kept/src/main/java/example/Kept.java")` |
| excludesAdditionalDirectoryNamesAndRelativePaths |  | create | `create("src/main/java/example/App.java")` |
| excludesAdditionalDirectoryNamesAndRelativePaths | new SourceScanner(Set.of("examples", "fixtures/generated")) | scan | `new SourceScanner(Set.of("examples", "fixtures/generated")).scan(tempDir)` |
| excludesAdditionalDirectoryNamesAndRelativePaths | source | javaFiles | `source.javaFiles()` |
| excludesAdditionalDirectoryNamesAndRelativePaths | tempDir | resolve | `tempDir.resolve("fixtures/kept/src/main/java/example/Kept.java")` |
| excludesMultipleAdditionalDirectoryNames | Set | of | `Set.of("examples", "samples")` |
| excludesMultipleAdditionalDirectoryNames |  | assertThat | `assertThat(source.javaFiles())` |
| excludesMultipleAdditionalDirectoryNames | assertThat(source.javaFiles()) | containsExactly | `assertThat(source.javaFiles()).containsExactly(included)` |
| excludesMultipleAdditionalDirectoryNames |  | create | `create("examples/Demo.java")` |
| excludesMultipleAdditionalDirectoryNames |  | create | `create("samples/Sample.java")` |
| excludesMultipleAdditionalDirectoryNames |  | create | `create("src/main/java/example/App.java")` |
| excludesMultipleAdditionalDirectoryNames | new SourceScanner(Set.of("examples", "samples")) | scan | `new SourceScanner(Set.of("examples", "samples")).scan(tempDir)` |
| excludesMultipleAdditionalDirectoryNames | source | javaFiles | `source.javaFiles()` |

## Related Classes

### Outgoing References

| Target | Relation | Member |
| --- | --- | --- |
| - | - | - |

### Incoming References

| Source | Relation | Member |
| --- | --- | --- |
| - | - | - |
