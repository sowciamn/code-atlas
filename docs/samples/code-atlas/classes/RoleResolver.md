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

## Related Classes

### Outgoing References

| Target | Relation | Member |
| --- | --- | --- |
| - | - | - |

### Incoming References

| Source | Relation | Member |
| --- | --- | --- |
| [RoleResolverTest](RoleResolverTest.md) | FIELD | resolver |
