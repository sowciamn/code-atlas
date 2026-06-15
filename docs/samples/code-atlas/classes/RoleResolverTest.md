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

## Method Call Relations

### Outgoing Calls

| Target | Expression |
| --- | --- |
| [RoleResolver](RoleResolver.md).resolve | `resolver.resolve(type)` |
| [RoleResolverTest](RoleResolverTest.md).resolve | `resolve("class JavaAnalyzer implements CodeAnalyzerPlugin {}")` |
| [RoleResolverTest](RoleResolverTest.md).resolve | `resolve("@Command class CodeAtlasCli {}")` |
| [RoleResolverTest](RoleResolverTest.md).resolve | `resolve("class MarkdownRenderer implements DocumentationRenderer {}")` |
| [RoleResolverTest](RoleResolverTest.md).resolve | `resolve("class UserDTO {}")` |
| [RoleResolverTest](RoleResolverTest.md).resolve | `resolve("class Utility {}")` |

### Incoming Calls

| Source | Expression |
| --- | --- |
| [RoleResolverTest](RoleResolverTest.md).resolvesAnalyzerPlugin | `resolve("class JavaAnalyzer implements CodeAnalyzerPlugin {}")` |
| [RoleResolverTest](RoleResolverTest.md).resolvesCliCommand | `resolve("@Command class CodeAtlasCli {}")` |
| [RoleResolverTest](RoleResolverTest.md).resolvesDocumentationRenderer | `resolve("class MarkdownRenderer implements DocumentationRenderer {}")` |
| [RoleResolverTest](RoleResolverTest.md).resolvesDtoByClassName | `resolve("class UserDTO {}")` |
| [RoleResolverTest](RoleResolverTest.md).returnsDefaultMessageForUnknownRole | `resolve("class Utility {}")` |

## Method Calls

### Project Calls

| Source Method | Scope | Resolved Target | Called Method | Expression |
| --- | --- | --- | --- | --- |
| resolve | resolver | RoleResolver | resolve | `resolver.resolve(type)` |
| resolvesAnalyzerPlugin |  | RoleResolverTest | resolve | `resolve("class JavaAnalyzer implements CodeAnalyzerPlugin {}")` |
| resolvesCliCommand |  | RoleResolverTest | resolve | `resolve("@Command class CodeAtlasCli {}")` |
| resolvesDocumentationRenderer |  | RoleResolverTest | resolve | `resolve("class MarkdownRenderer implements DocumentationRenderer {}")` |
| resolvesDtoByClassName |  | RoleResolverTest | resolve | `resolve("class UserDTO {}")` |
| returnsDefaultMessageForUnknownRole |  | RoleResolverTest | resolve | `resolve("class Utility {}")` |

### Library / Utility Calls

Library / Utility calls are omitted from this page. Count: 14.

## Related Classes

### Outgoing References

| Target | Relation | Member |
| --- | --- | --- |
| [RoleResolver](RoleResolver.md) | FIELD | resolver |

### Incoming References

| Source | Relation | Member |
| --- | --- | --- |
| - | - | - |
