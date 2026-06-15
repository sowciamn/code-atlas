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

## Method Call Relations

### Outgoing Calls

| Target | Expression |
| --- | --- |
| [AnalysisResult](AnalysisResult.md).classes | `currentResult.classes()` |
| [JavaAnalyzer](JavaAnalyzer.md).analyze | `javaAnalyzer.analyze(source)` |
| [JavaAnalyzer](JavaAnalyzer.md).analyze | `javaAnalyzer.analyze(source)` |
| [SpringBootAnalyzer](SpringBootAnalyzer.md).enrich | `enrich(source, base)` |
| [SpringBootAnalyzer](SpringBootAnalyzer.md).enrich | `enrich(source, javaAnalyzer.analyze(source))` |
| [ClassDoc](ClassDoc.md).annotations | `classDoc.annotations()` |
| [ClassDoc](ClassDoc.md).className | `classDoc.className()` |
| [ClassDoc](ClassDoc.md).className | `classDoc.className()` |
| [SpringBootAnalyzer](SpringBootAnalyzer.md).combinePaths | `combinePaths(classPath, methodPath)` |
| [AnalysisResult](AnalysisResult.md).classes | `base.classes()` |
| [AnalysisResult](AnalysisResult.md).configs | `base.configs()` |
| [AnalysisResult](AnalysisResult.md).mapperStatementRelations | `base.mapperStatementRelations()` |
| [AnalysisResult](AnalysisResult.md).methodCallRelations | `base.methodCallRelations()` |
| [AnalysisResult](AnalysisResult.md).methodCalls | `base.methodCalls()` |
| [AnalysisResult](AnalysisResult.md).relations | `base.relations()` |
| [AnalysisResult](AnalysisResult.md).sqlStatements | `base.sqlStatements()` |
| [AnalysisResult](AnalysisResult.md).tableUsages | `base.tableUsages()` |
| [AnalysisResult](AnalysisResult.md).variableTypes | `base.variableTypes()` |
| [ProjectSource](ProjectSource.md).rootDirectory | `source.rootDirectory()` |
| [ProjectSource](ProjectSource.md).rootDirectory | `source.rootDirectory()` |
| [SpringBootAnalyzer](SpringBootAnalyzer.md).componentType | `componentType(classDoc)` |
| [SpringBootAnalyzer](SpringBootAnalyzer.md).count | `count(classes, ComponentType.CONTROLLER)` |
| [SpringBootAnalyzer](SpringBootAnalyzer.md).count | `count(classes, ComponentType.ENTITY)` |
| [SpringBootAnalyzer](SpringBootAnalyzer.md).count | `count(classes, ComponentType.REPOSITORY)` |
| [SpringBootAnalyzer](SpringBootAnalyzer.md).count | `count(classes, ComponentType.SERVICE)` |
| [SpringBootAnalyzer](SpringBootAnalyzer.md).extractEndpoints | `extractEndpoints(source)` |
| [SpringBootAnalyzer](SpringBootAnalyzer.md).roleSummary | `roleSummary(classDoc)` |
| [JavaAnalyzer](JavaAnalyzer.md).parse | `javaAnalyzer.parse(javaFile)` |
| [ProjectSource](ProjectSource.md).javaFiles | `source.javaFiles()` |
| [ProjectSource](ProjectSource.md).relativePath | `source.relativePath(javaFile)` |
| [SpringBootAnalyzer](SpringBootAnalyzer.md).findAnnotation | `findAnnotation(type.getAnnotations(), "RequestMapping")` |
| [SpringBootAnalyzer](SpringBootAnalyzer.md).isController | `isController(type)` |
| [SpringBootAnalyzer](SpringBootAnalyzer.md).mappingPath | `mappingPath(findAnnotation(type.getAnnotations(), "RequestMapping"))` |
| [SpringBootAnalyzer](SpringBootAnalyzer.md).toEndpoints | `toEndpoints(type.getNameAsString(), method, classPath, source.relativePath(javaFile).toString())` |
| [SpringBootAnalyzer](SpringBootAnalyzer.md).firstString | `firstString(pair.getValue())` |
| [SpringBootAnalyzer](SpringBootAnalyzer.md).firstString | `firstString(single.getMemberValue())` |
| [SpringBootAnalyzer](SpringBootAnalyzer.md).expressions | `expressions(pair.getValue())` |
| [ClassDoc](ClassDoc.md).annotations | `classDoc.annotations()` |
| [ClassDoc](ClassDoc.md).roleSummary | `classDoc.roleSummary()` |
| [ProjectSource](ProjectSource.md).javaFiles | `source.javaFiles()` |
| [ProjectSource](ProjectSource.md).pomXml | `source.pomXml()` |
| [SpringBootAnalyzer](SpringBootAnalyzer.md).endpoint | `endpoint(className, method, httpMethod, classPath, mappingPath(Optional.of(annotation)), sourcePath)` |
| [SpringBootAnalyzer](SpringBootAnalyzer.md).endpoint | `endpoint(className, method, requestMethod, classPath, mappingPath(Optional.of(annotation)), sourcePath)` |
| [SpringBootAnalyzer](SpringBootAnalyzer.md).mappingPath | `mappingPath(Optional.of(annotation))` |
| [SpringBootAnalyzer](SpringBootAnalyzer.md).mappingPath | `mappingPath(Optional.of(annotation))` |
| [SpringBootAnalyzer](SpringBootAnalyzer.md).requestMethods | `requestMethods(annotation)` |

### Incoming Calls

| Source | Expression |
| --- | --- |
| [SpringBootAnalyzer](SpringBootAnalyzer.md).analyze | `enrich(source, base)` |
| [SpringBootAnalyzer](SpringBootAnalyzer.md).analyze | `enrich(source, javaAnalyzer.analyze(source))` |
| [SpringBootAnalyzer](SpringBootAnalyzer.md).endpoint | `combinePaths(classPath, methodPath)` |
| [SpringBootAnalyzer](SpringBootAnalyzer.md).enrich | `componentType(classDoc)` |
| [SpringBootAnalyzer](SpringBootAnalyzer.md).enrich | `count(classes, ComponentType.CONTROLLER)` |
| [SpringBootAnalyzer](SpringBootAnalyzer.md).enrich | `count(classes, ComponentType.ENTITY)` |
| [SpringBootAnalyzer](SpringBootAnalyzer.md).enrich | `count(classes, ComponentType.REPOSITORY)` |
| [SpringBootAnalyzer](SpringBootAnalyzer.md).enrich | `count(classes, ComponentType.SERVICE)` |
| [SpringBootAnalyzer](SpringBootAnalyzer.md).enrich | `extractEndpoints(source)` |
| [SpringBootAnalyzer](SpringBootAnalyzer.md).enrich | `roleSummary(classDoc)` |
| [SpringBootAnalyzer](SpringBootAnalyzer.md).extractEndpoints | `findAnnotation(type.getAnnotations(), "RequestMapping")` |
| [SpringBootAnalyzer](SpringBootAnalyzer.md).extractEndpoints | `isController(type)` |
| [SpringBootAnalyzer](SpringBootAnalyzer.md).extractEndpoints | `mappingPath(findAnnotation(type.getAnnotations(), "RequestMapping"))` |
| [SpringBootAnalyzer](SpringBootAnalyzer.md).extractEndpoints | `toEndpoints(type.getNameAsString(), method, classPath, source.relativePath(javaFile).toString())` |
| [SpringBootAnalyzer](SpringBootAnalyzer.md).mappingPath | `firstString(pair.getValue())` |
| [SpringBootAnalyzer](SpringBootAnalyzer.md).mappingPath | `firstString(single.getMemberValue())` |
| [SpringBootAnalyzer](SpringBootAnalyzer.md).requestMethods | `expressions(pair.getValue())` |
| [SpringBootAnalyzer](SpringBootAnalyzer.md).toEndpoints | `endpoint(className, method, httpMethod, classPath, mappingPath(Optional.of(annotation)), sourcePath)` |
| [SpringBootAnalyzer](SpringBootAnalyzer.md).toEndpoints | `endpoint(className, method, requestMethod, classPath, mappingPath(Optional.of(annotation)), sourcePath)` |
| [SpringBootAnalyzer](SpringBootAnalyzer.md).toEndpoints | `mappingPath(Optional.of(annotation))` |
| [SpringBootAnalyzer](SpringBootAnalyzer.md).toEndpoints | `mappingPath(Optional.of(annotation))` |
| [SpringBootAnalyzer](SpringBootAnalyzer.md).toEndpoints | `requestMethods(annotation)` |

## Method Calls

### Project Calls

| Source Method | Scope | Resolved Target | Called Method | Expression |
| --- | --- | --- | --- | --- |
| analyze | currentResult | AnalysisResult | classes | `currentResult.classes()` |
| analyze |  | SpringBootAnalyzer | enrich | `enrich(source, base)` |
| analyze |  | SpringBootAnalyzer | enrich | `enrich(source, javaAnalyzer.analyze(source))` |
| analyze | javaAnalyzer | JavaAnalyzer | analyze | `javaAnalyzer.analyze(source)` |
| analyze | javaAnalyzer | JavaAnalyzer | analyze | `javaAnalyzer.analyze(source)` |
| componentType | classDoc | ClassDoc | annotations | `classDoc.annotations()` |
| componentType | classDoc | ClassDoc | className | `classDoc.className()` |
| componentType | classDoc | ClassDoc | className | `classDoc.className()` |
| endpoint |  | SpringBootAnalyzer | combinePaths | `combinePaths(classPath, methodPath)` |
| enrich | base | AnalysisResult | classes | `base.classes()` |
| enrich | base | AnalysisResult | configs | `base.configs()` |
| enrich | base | AnalysisResult | mapperStatementRelations | `base.mapperStatementRelations()` |
| enrich | base | AnalysisResult | methodCallRelations | `base.methodCallRelations()` |
| enrich | base | AnalysisResult | methodCalls | `base.methodCalls()` |
| enrich | base | AnalysisResult | relations | `base.relations()` |
| enrich | base | AnalysisResult | sqlStatements | `base.sqlStatements()` |
| enrich | base | AnalysisResult | tableUsages | `base.tableUsages()` |
| enrich | base | AnalysisResult | variableTypes | `base.variableTypes()` |
| enrich |  | SpringBootAnalyzer | componentType | `componentType(classDoc)` |
| enrich |  | SpringBootAnalyzer | count | `count(classes, ComponentType.CONTROLLER)` |
| enrich |  | SpringBootAnalyzer | count | `count(classes, ComponentType.ENTITY)` |
| enrich |  | SpringBootAnalyzer | count | `count(classes, ComponentType.REPOSITORY)` |
| enrich |  | SpringBootAnalyzer | count | `count(classes, ComponentType.SERVICE)` |
| enrich |  | SpringBootAnalyzer | extractEndpoints | `extractEndpoints(source)` |
| enrich |  | SpringBootAnalyzer | roleSummary | `roleSummary(classDoc)` |
| enrich | source | ProjectSource | rootDirectory | `source.rootDirectory()` |
| enrich | source | ProjectSource | rootDirectory | `source.rootDirectory()` |
| extractEndpoints |  | SpringBootAnalyzer | findAnnotation | `findAnnotation(type.getAnnotations(), "RequestMapping")` |
| extractEndpoints |  | SpringBootAnalyzer | isController | `isController(type)` |
| extractEndpoints | javaAnalyzer | JavaAnalyzer | parse | `javaAnalyzer.parse(javaFile)` |
| extractEndpoints |  | SpringBootAnalyzer | mappingPath | `mappingPath(findAnnotation(type.getAnnotations(), "RequestMapping"))` |
| extractEndpoints | source | ProjectSource | javaFiles | `source.javaFiles()` |
| extractEndpoints | source | ProjectSource | relativePath | `source.relativePath(javaFile)` |
| extractEndpoints |  | SpringBootAnalyzer | toEndpoints | `toEndpoints(type.getNameAsString(), method, classPath, source.relativePath(javaFile).toString())` |
| mappingPath |  | SpringBootAnalyzer | firstString | `firstString(pair.getValue())` |
| mappingPath |  | SpringBootAnalyzer | firstString | `firstString(single.getMemberValue())` |
| requestMethods |  | SpringBootAnalyzer | expressions | `expressions(pair.getValue())` |
| roleSummary | classDoc | ClassDoc | annotations | `classDoc.annotations()` |
| roleSummary | classDoc | ClassDoc | roleSummary | `classDoc.roleSummary()` |
| supports | source | ProjectSource | javaFiles | `source.javaFiles()` |
| supports | source | ProjectSource | pomXml | `source.pomXml()` |
| toEndpoints |  | SpringBootAnalyzer | endpoint | `endpoint(className, method, httpMethod, classPath, mappingPath(Optional.of(annotation)), sourcePath)` |
| toEndpoints |  | SpringBootAnalyzer | endpoint | `endpoint(className, method, requestMethod, classPath, mappingPath(Optional.of(annotation)), sourcePath)` |
| toEndpoints |  | SpringBootAnalyzer | mappingPath | `mappingPath(Optional.of(annotation))` |
| toEndpoints |  | SpringBootAnalyzer | mappingPath | `mappingPath(Optional.of(annotation))` |
| toEndpoints |  | SpringBootAnalyzer | requestMethods | `requestMethods(annotation)` |

### Library / Utility Calls

Library / Utility calls are omitted from this page. Count: 124.

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
