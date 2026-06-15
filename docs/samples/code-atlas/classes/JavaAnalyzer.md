# JavaAnalyzer

## Summary

* Package: `io.github.codeatlas.plugin.java`
* Declaration: `CLASS`
* Type: `UNKNOWN`
* Source: `code-atlas-plugin-java/src/main/java/io/github/codeatlas/plugin/java/JavaAnalyzer.java`

## Role

このクラスは `CodeAnalyzerPlugin` を実装しているため、ソース解析プラグインです。

## Annotations

None

## Methods

| Method | Return Type | Parameters | Annotations |
| --- | --- | --- | --- |
| pluginId | `String` |  | Override |
| supports | `boolean` | ProjectSource source | Override |
| analyze | `AnalysisResult` | ProjectSource source | Override |
| analyzeClasses | `List<ClassDoc>` | ProjectSource source |  |
| analyzeRelations | `List<ClassRelationDoc>` | ProjectSource source, List<ClassDoc> classes |  |
| parse | `CompilationUnit` | Path javaFile |  |
| toClassDoc | `ClassDoc` | CompilationUnit unit, TypeDeclaration<?> type, Path sourcePath |  |
| extractRelations | `void` | TypeDeclaration<?> type, Set<String> projectClassNames, Set<ClassRelationDoc> relations |  |
| addRelations | `void` | Set<ClassRelationDoc> relations, Set<String> projectClassNames, String sourceClassName, Type type, RelationType relationType, String sourceMemberName |  |
| toMethodDoc | `MethodDoc` | MethodDeclaration method |  |
| annotationNames | `List<String>` | Iterable<AnnotationExpr> annotations |  |
| declarationKind | `String` | TypeDeclaration<?> type |  |

## Fields

| Name | Type | Annotations |
| --- | --- | --- |
| parser | `JavaParser` |  |

## Related Classes

### Outgoing References

| Target | Relation | Member |
| --- | --- | --- |
| [AnalysisResult](AnalysisResult.md) | METHOD_RETURN_TYPE | analyze |
| [ClassDoc](ClassDoc.md) | METHOD_PARAMETER | classes |
| [ClassDoc](ClassDoc.md) | METHOD_RETURN_TYPE | analyzeClasses |
| [ClassDoc](ClassDoc.md) | METHOD_RETURN_TYPE | toClassDoc |
| [ClassRelationDoc](ClassRelationDoc.md) | METHOD_PARAMETER | relations |
| [ClassRelationDoc](ClassRelationDoc.md) | METHOD_RETURN_TYPE | analyzeRelations |
| [MethodDoc](MethodDoc.md) | METHOD_RETURN_TYPE | toMethodDoc |
| [ProjectSource](ProjectSource.md) | METHOD_PARAMETER | source |
| [RelationType](RelationType.md) | METHOD_PARAMETER | relationType |

### Incoming References

| Source | Relation | Member |
| --- | --- | --- |
| [SpringBootAnalyzer](SpringBootAnalyzer.md) | FIELD | javaAnalyzer |
