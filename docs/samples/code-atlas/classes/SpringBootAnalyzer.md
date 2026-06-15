# SpringBootAnalyzer

## Summary

* Package: `io.github.codeatlas.plugin.springboot`
* Declaration: `CLASS`
* Type: `UNKNOWN`
* Source: `code-atlas-plugin-springboot/src/main/java/io/github/codeatlas/plugin/springboot/SpringBootAnalyzer.java`

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
| analyze | `AnalysisResult` | ProjectSource source, AnalysisResult currentResult | Override |
| enrich | `AnalysisResult` | ProjectSource source, AnalysisResult base |  |
| roleSummary | `String` | ClassDoc classDoc |  |
| componentType | `ComponentType` | ClassDoc classDoc |  |
| extractEndpoints | `List<ApiEndpointDoc>` | ProjectSource source |  |
| toEndpoints | `List<ApiEndpointDoc>` | String className, MethodDeclaration method, String classPath, String sourcePath |  |
| endpoint | `ApiEndpointDoc` | String className, MethodDeclaration method, String httpMethod, String classPath, String methodPath, String sourcePath |  |
| findAnnotation | `Optional<AnnotationExpr>` | Iterable<AnnotationExpr> annotations, String annotationName |  |
| mappingPath | `String` | Optional<AnnotationExpr> annotation |  |
| firstString | `Optional<String>` | Expression expression |  |
| requestMethods | `List<String>` | AnnotationExpr annotation |  |
| expressions | `List<Expression>` | Expression expression |  |
| requestMethodName | `Optional<String>` | Expression expression |  |
| isController | `boolean` | TypeDeclaration<?> type |  |
| combinePaths | `String` | String classPath, String methodPath |  |
| count | `int` | List<ClassDoc> classes, ComponentType type |  |
| containsSpringBoot | `boolean` | Path pomXml |  |
| containsSpringAnnotation | `boolean` | Path javaFile |  |

## Fields

| Name | Type | Annotations |
| --- | --- | --- |
| COMPONENT_ANNOTATIONS | `Map<String,ComponentType>` |  |
| HTTP_METHOD_ANNOTATIONS | `Map<String,String>` |  |
| javaAnalyzer | `JavaAnalyzer` |  |

## Related Classes

### Outgoing References

| Target | Relation | Member |
| --- | --- | --- |
| [AnalysisResult](AnalysisResult.md) | METHOD_PARAMETER | base |
| [AnalysisResult](AnalysisResult.md) | METHOD_PARAMETER | currentResult |
| [AnalysisResult](AnalysisResult.md) | METHOD_RETURN_TYPE | analyze |
| [AnalysisResult](AnalysisResult.md) | METHOD_RETURN_TYPE | enrich |
| [ApiEndpointDoc](ApiEndpointDoc.md) | METHOD_RETURN_TYPE | endpoint |
| [ApiEndpointDoc](ApiEndpointDoc.md) | METHOD_RETURN_TYPE | extractEndpoints |
| [ApiEndpointDoc](ApiEndpointDoc.md) | METHOD_RETURN_TYPE | toEndpoints |
| [ClassDoc](ClassDoc.md) | METHOD_PARAMETER | classDoc |
| [ClassDoc](ClassDoc.md) | METHOD_PARAMETER | classes |
| [ComponentType](ComponentType.md) | FIELD | COMPONENT_ANNOTATIONS |
| [ComponentType](ComponentType.md) | METHOD_PARAMETER | type |
| [ComponentType](ComponentType.md) | METHOD_RETURN_TYPE | componentType |
| [JavaAnalyzer](JavaAnalyzer.md) | FIELD | javaAnalyzer |
| [ProjectSource](ProjectSource.md) | METHOD_PARAMETER | source |

### Incoming References

| Source | Relation | Member |
| --- | --- | --- |
| - | - | - |
