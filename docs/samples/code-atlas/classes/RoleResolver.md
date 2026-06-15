# RoleResolver

## Summary

* Package: `io.github.codeatlas.plugin.java`
* Declaration: `CLASS`
* Type: `UNKNOWN`
* Source: `code-atlas-plugin-java/src/main/java/io/github/codeatlas/plugin/java/RoleResolver.java`

## Role

コードから機械的に判定できる役割情報はありません。

## Annotations

None

## Methods

| Method | Return Type | Parameters | Annotations |
| --- | --- | --- | --- |
| resolve | `String` | TypeDeclaration<?> type |  |
| hasSuperType | `boolean` | TypeDeclaration<?> type, String typeName |  |
| hasAnnotation | `boolean` | TypeDeclaration<?> type, String annotationName |  |

## Fields

| Name | Type | Annotations |
| --- | --- | --- |
| UNKNOWN_ROLE | `String` |  |

## Method Call Relations

### Outgoing Calls

| Target | Expression |
| --- | --- |
| [RoleResolver](RoleResolver.md).hasAnnotation | `hasAnnotation(type, "Command")` |
| [RoleResolver](RoleResolver.md).hasSuperType | `hasSuperType(type, "CodeAnalyzerPlugin")` |
| [RoleResolver](RoleResolver.md).hasSuperType | `hasSuperType(type, "DocumentationRenderer")` |

### Incoming Calls

| Source | Expression |
| --- | --- |
| [RoleResolver](RoleResolver.md).resolve | `hasAnnotation(type, "Command")` |
| [RoleResolver](RoleResolver.md).resolve | `hasSuperType(type, "CodeAnalyzerPlugin")` |
| [RoleResolver](RoleResolver.md).resolve | `hasSuperType(type, "DocumentationRenderer")` |
| [RoleResolverTest](RoleResolverTest.md).resolve | `resolver.resolve(type)` |

## Method Calls

### Project Calls

| Source Method | Scope | Resolved Target | Called Method | Expression |
| --- | --- | --- | --- | --- |
| resolve |  | RoleResolver | hasAnnotation | `hasAnnotation(type, "Command")` |
| resolve |  | RoleResolver | hasSuperType | `hasSuperType(type, "CodeAnalyzerPlugin")` |
| resolve |  | RoleResolver | hasSuperType | `hasSuperType(type, "DocumentationRenderer")` |

### Library / Utility Calls

Library / Utility calls are omitted from this page. Count: 18.

## Related Classes

### Outgoing References

| Target | Relation | Member |
| --- | --- | --- |
| - | - | - |

### Incoming References

| Source | Relation | Member |
| --- | --- | --- |
| [RoleResolverTest](RoleResolverTest.md) | FIELD | resolver |
