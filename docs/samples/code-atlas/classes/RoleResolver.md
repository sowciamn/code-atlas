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

## Method Calls

| Source Method | Scope | Called Method | Expression |
| --- | --- | --- | --- |
| hasAnnotation | annotation | getName | `annotation.getName()` |
| hasAnnotation | annotation.getName() | getIdentifier | `annotation.getName().getIdentifier()` |
| hasAnnotation | annotationName | equals | `annotationName.equals(annotation.getName().getIdentifier())` |
| hasAnnotation | type | getAnnotations | `type.getAnnotations()` |
| hasAnnotation | type.getAnnotations() | stream | `type.getAnnotations().stream()` |
| hasAnnotation | type.getAnnotations().stream() | anyMatch | `type.getAnnotations().stream().anyMatch(annotation -> annotationName.equals(annotation.getName().getIdentifier()))` |
| hasSuperType | Stream | concat | `Stream.concat(declaration.getImplementedTypes().stream(), declaration.getExtendedTypes().stream())` |
| hasSuperType | Stream.concat(declaration.getImplementedTypes().stream(), declaration.getExtendedTypes().stream()) | anyMatch | `Stream.concat(declaration.getImplementedTypes().stream(), declaration.getExtendedTypes().stream()).anyMatch(candidate -> typeName.equals(candidate.getNameAsString()))` |
| hasSuperType | candidate | getNameAsString | `candidate.getNameAsString()` |
| hasSuperType | declaration | getExtendedTypes | `declaration.getExtendedTypes()` |
| hasSuperType | declaration.getExtendedTypes() | stream | `declaration.getExtendedTypes().stream()` |
| hasSuperType | declaration | getImplementedTypes | `declaration.getImplementedTypes()` |
| hasSuperType | declaration.getImplementedTypes() | stream | `declaration.getImplementedTypes().stream()` |
| hasSuperType | typeName | equals | `typeName.equals(candidate.getNameAsString())` |
| resolve |  | hasAnnotation | `hasAnnotation(type, "Command")` |
| resolve |  | hasSuperType | `hasSuperType(type, "CodeAnalyzerPlugin")` |
| resolve |  | hasSuperType | `hasSuperType(type, "DocumentationRenderer")` |
| resolve | type | getNameAsString | `type.getNameAsString()` |
| resolve | type | getNameAsString | `type.getNameAsString()` |
| resolve | type.getNameAsString() | endsWith | `type.getNameAsString().endsWith("DTO")` |
| resolve | type.getNameAsString() | endsWith | `type.getNameAsString().endsWith("Dto")` |

## Related Classes

### Outgoing References

| Target | Relation | Member |
| --- | --- | --- |
| - | - | - |

### Incoming References

| Source | Relation | Member |
| --- | --- | --- |
| [RoleResolverTest](RoleResolverTest.md) | FIELD | resolver |
