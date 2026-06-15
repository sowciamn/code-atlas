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

## Method Calls

| Source Method | Scope | Called Method | Expression |
| --- | --- | --- | --- |
| acceptsCommaSeparatedExcludeOptions |  | assertGeneratedClasses | `assertGeneratedClasses(output)` |
| acceptsCommaSeparatedExcludeOptions |  | assertThat | `assertThat(exitCode)` |
| acceptsCommaSeparatedExcludeOptions | assertThat(exitCode) | isZero | `assertThat(exitCode).isZero()` |
| acceptsCommaSeparatedExcludeOptions |  | createSourceTree | `createSourceTree()` |
| acceptsCommaSeparatedExcludeOptions | new CommandLine(new CodeAtlasCli()) | execute | `new CommandLine(new CodeAtlasCli()).execute("generate", "--source", source.toString(), "--output", output.toString(), "--exclude", "examples,fixtures")` |
| acceptsCommaSeparatedExcludeOptions | output | toString | `output.toString()` |
| acceptsCommaSeparatedExcludeOptions | source | toString | `source.toString()` |
| acceptsCommaSeparatedExcludeOptions | tempDir | resolve | `tempDir.resolve("output-comma")` |
| acceptsRepeatedExcludeOptions |  | assertGeneratedClasses | `assertGeneratedClasses(output)` |
| acceptsRepeatedExcludeOptions |  | assertThat | `assertThat(exitCode)` |
| acceptsRepeatedExcludeOptions | assertThat(exitCode) | isZero | `assertThat(exitCode).isZero()` |
| acceptsRepeatedExcludeOptions |  | createSourceTree | `createSourceTree()` |
| acceptsRepeatedExcludeOptions | new CommandLine(new CodeAtlasCli()) | execute | `new CommandLine(new CodeAtlasCli()).execute("generate", "--source", source.toString(), "--output", output.toString(), "--exclude", "examples", "--exclude", "fixtures")` |
| acceptsRepeatedExcludeOptions | output | toString | `output.toString()` |
| acceptsRepeatedExcludeOptions | source | toString | `source.toString()` |
| acceptsRepeatedExcludeOptions | tempDir | resolve | `tempDir.resolve("output-repeated")` |
| assertGeneratedClasses |  | assertThat | `assertThat(output.resolve("classes/App.md"))` |
| assertGeneratedClasses | assertThat(output.resolve("classes/App.md")) | exists | `assertThat(output.resolve("classes/App.md")).exists()` |
| assertGeneratedClasses |  | assertThat | `assertThat(output.resolve("classes/Demo.md"))` |
| assertGeneratedClasses | assertThat(output.resolve("classes/Demo.md")) | doesNotExist | `assertThat(output.resolve("classes/Demo.md")).doesNotExist()` |
| assertGeneratedClasses |  | assertThat | `assertThat(output.resolve("classes/Fixture.md"))` |
| assertGeneratedClasses | assertThat(output.resolve("classes/Fixture.md")) | doesNotExist | `assertThat(output.resolve("classes/Fixture.md")).doesNotExist()` |
| assertGeneratedClasses | output | resolve | `output.resolve("classes/App.md")` |
| assertGeneratedClasses | output | resolve | `output.resolve("classes/Demo.md")` |
| assertGeneratedClasses | output | resolve | `output.resolve("classes/Fixture.md")` |
| createSourceTree | tempDir | resolve | `tempDir.resolve("source")` |
| createSourceTree |  | write | `write(source, "examples/Demo.java", "class Demo {}")` |
| createSourceTree |  | write | `write(source, "fixtures/Fixture.java", "class Fixture {}")` |
| createSourceTree |  | write | `write(source, "src/main/java/example/App.java", "package example; class App {}")` |
| write | Files | createDirectories | `Files.createDirectories(file.getParent())` |
| write | Files | writeString | `Files.writeString(file, content)` |
| write | file | getParent | `file.getParent()` |
| write | source | resolve | `source.resolve(relativePath)` |

## Related Classes

### Outgoing References

| Target | Relation | Member |
| --- | --- | --- |
| - | - | - |

### Incoming References

| Source | Relation | Member |
| --- | --- | --- |
| - | - | - |
