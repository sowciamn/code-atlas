# CodeAtlasCliTest

## Summary

* Package: `io.github.codeatlas.cli`
* Declaration: `CLASS`
* Type: `UNKNOWN`
* Source: `code-atlas-cli/src/test/java/io/github/codeatlas/cli/CodeAtlasCliTest.java`

## Role

コードから機械的に判定できる役割情報はありません。

## Annotations

None

## Methods

| Method | Return Type | Parameters | Annotations |
| --- | --- | --- | --- |
| acceptsRepeatedExcludeOptions | `void` |  | Test |
| acceptsCommaSeparatedExcludeOptions | `void` |  | Test |
| createSourceTree | `Path` |  |  |
| assertGeneratedClasses | `void` | Path output |  |
| write | `void` | Path source, String relativePath, String content |  |

## Fields

| Name | Type | Annotations |
| --- | --- | --- |
| tempDir | `Path` | TempDir |

## Method Call Relations

### Outgoing Calls

| Target | Expression |
| --- | --- |
| [CodeAtlasCliTest](CodeAtlasCliTest.md).assertGeneratedClasses | `assertGeneratedClasses(output)` |
| [CodeAtlasCliTest](CodeAtlasCliTest.md).createSourceTree | `createSourceTree()` |
| [CodeAtlasCliTest](CodeAtlasCliTest.md).assertGeneratedClasses | `assertGeneratedClasses(output)` |
| [CodeAtlasCliTest](CodeAtlasCliTest.md).createSourceTree | `createSourceTree()` |
| [CodeAtlasCliTest](CodeAtlasCliTest.md).write | `write(source, "examples/Demo.java", "class Demo {}")` |
| [CodeAtlasCliTest](CodeAtlasCliTest.md).write | `write(source, "fixtures/Fixture.java", "class Fixture {}")` |
| [CodeAtlasCliTest](CodeAtlasCliTest.md).write | `write(source, "src/main/java/example/App.java", "package example; class App {}")` |

### Incoming Calls

| Source | Expression |
| --- | --- |
| [CodeAtlasCliTest](CodeAtlasCliTest.md).acceptsCommaSeparatedExcludeOptions | `assertGeneratedClasses(output)` |
| [CodeAtlasCliTest](CodeAtlasCliTest.md).acceptsCommaSeparatedExcludeOptions | `createSourceTree()` |
| [CodeAtlasCliTest](CodeAtlasCliTest.md).acceptsRepeatedExcludeOptions | `assertGeneratedClasses(output)` |
| [CodeAtlasCliTest](CodeAtlasCliTest.md).acceptsRepeatedExcludeOptions | `createSourceTree()` |
| [CodeAtlasCliTest](CodeAtlasCliTest.md).createSourceTree | `write(source, "examples/Demo.java", "class Demo {}")` |
| [CodeAtlasCliTest](CodeAtlasCliTest.md).createSourceTree | `write(source, "fixtures/Fixture.java", "class Fixture {}")` |
| [CodeAtlasCliTest](CodeAtlasCliTest.md).createSourceTree | `write(source, "src/main/java/example/App.java", "package example; class App {}")` |

## Method Calls

### Project Calls

| Source Method | Scope | Resolved Target | Called Method | Expression |
| --- | --- | --- | --- | --- |
| acceptsCommaSeparatedExcludeOptions |  | CodeAtlasCliTest | assertGeneratedClasses | `assertGeneratedClasses(output)` |
| acceptsCommaSeparatedExcludeOptions |  | CodeAtlasCliTest | createSourceTree | `createSourceTree()` |
| acceptsRepeatedExcludeOptions |  | CodeAtlasCliTest | assertGeneratedClasses | `assertGeneratedClasses(output)` |
| acceptsRepeatedExcludeOptions |  | CodeAtlasCliTest | createSourceTree | `createSourceTree()` |
| createSourceTree |  | CodeAtlasCliTest | write | `write(source, "examples/Demo.java", "class Demo {}")` |
| createSourceTree |  | CodeAtlasCliTest | write | `write(source, "fixtures/Fixture.java", "class Fixture {}")` |
| createSourceTree |  | CodeAtlasCliTest | write | `write(source, "src/main/java/example/App.java", "package example; class App {}")` |

### Library / Utility Calls

Library / Utility calls are omitted from this page. Count: 26.

## Related Classes

### Outgoing References

| Target | Relation | Member |
| --- | --- | --- |
| - | - | - |

### Incoming References

| Source | Relation | Member |
| --- | --- | --- |
| - | - | - |
