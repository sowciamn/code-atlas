# RoleResolverTest

## Summary

* Package: `io.github.codeatlas.plugin.java`
* Declaration: `CLASS`
* Type: `UNKNOWN`
* Source: `code-atlas-plugin-java/src/test/java/io/github/codeatlas/plugin/java/RoleResolverTest.java`

## Role

コードから機械的に判定できる役割情報はありません。

## Annotations

None

## Methods

| Method | Return Type | Parameters | Annotations |
| --- | --- | --- | --- |
| resolvesAnalyzerPlugin | `void` |  | Test |
| resolvesDocumentationRenderer | `void` |  | Test |
| resolvesCliCommand | `void` |  | Test |
| resolvesDtoByClassName | `void` |  | Test |
| returnsDefaultMessageForUnknownRole | `void` |  | Test |
| resolve | `String` | String source |  |

## Fields

| Name | Type | Annotations |
| --- | --- | --- |
| resolver | `RoleResolver` |  |

## Method Calls

| Source Method | Scope | Called Method | Expression |
| --- | --- | --- | --- |
| resolve | new JavaParser() | parse | `new JavaParser().parse(source)` |
| resolve | new JavaParser().parse(source) | getResult | `new JavaParser().parse(source).getResult()` |
| resolve | new JavaParser().parse(source).getResult() | orElseThrow | `new JavaParser().parse(source).getResult().orElseThrow()` |
| resolve | new JavaParser().parse(source).getResult().orElseThrow() | getType | `new JavaParser().parse(source).getResult().orElseThrow().getType(0)` |
| resolve | resolver | resolve | `resolver.resolve(type)` |
| resolvesAnalyzerPlugin |  | assertThat | `assertThat(resolve("class JavaAnalyzer implements CodeAnalyzerPlugin {}"))` |
| resolvesAnalyzerPlugin | assertThat(resolve("class JavaAnalyzer implements CodeAnalyzerPlugin {}")) | contains | `assertThat(resolve("class JavaAnalyzer implements CodeAnalyzerPlugin {}")).contains("ソース解析プラグイン")` |
| resolvesAnalyzerPlugin |  | resolve | `resolve("class JavaAnalyzer implements CodeAnalyzerPlugin {}")` |
| resolvesCliCommand |  | assertThat | `assertThat(resolve("@Command class CodeAtlasCli {}"))` |
| resolvesCliCommand | assertThat(resolve("@Command class CodeAtlasCli {}")) | contains | `assertThat(resolve("@Command class CodeAtlasCli {}")).contains("CLIコマンド")` |
| resolvesCliCommand |  | resolve | `resolve("@Command class CodeAtlasCli {}")` |
| resolvesDocumentationRenderer |  | assertThat | `assertThat(resolve("class MarkdownRenderer implements DocumentationRenderer {}"))` |
| resolvesDocumentationRenderer | assertThat(resolve("class MarkdownRenderer implements DocumentationRenderer {}")) | contains | `assertThat(resolve("class MarkdownRenderer implements DocumentationRenderer {}")).contains("ドキュメント出力レンダラー")` |
| resolvesDocumentationRenderer |  | resolve | `resolve("class MarkdownRenderer implements DocumentationRenderer {}")` |
| resolvesDtoByClassName |  | assertThat | `assertThat(resolve("class UserDTO {}"))` |
| resolvesDtoByClassName | assertThat(resolve("class UserDTO {}")) | contains | `assertThat(resolve("class UserDTO {}")).contains("DTOです")` |
| resolvesDtoByClassName |  | resolve | `resolve("class UserDTO {}")` |
| returnsDefaultMessageForUnknownRole |  | assertThat | `assertThat(resolve("class Utility {}"))` |
| returnsDefaultMessageForUnknownRole | assertThat(resolve("class Utility {}")) | isEqualTo | `assertThat(resolve("class Utility {}")).isEqualTo(RoleResolver.UNKNOWN_ROLE)` |
| returnsDefaultMessageForUnknownRole |  | resolve | `resolve("class Utility {}")` |

## Related Classes

### Outgoing References

| Target | Relation | Member |
| --- | --- | --- |
| [RoleResolver](RoleResolver.md) | FIELD | resolver |

### Incoming References

| Source | Relation | Member |
| --- | --- | --- |
| - | - | - |
