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

## Method Calls

| Source Method | Scope | Called Method | Expression |
| --- | --- | --- | --- |
| analyze | currentResult | classes | `currentResult.classes()` |
| analyze | currentResult.classes() | isEmpty | `currentResult.classes().isEmpty()` |
| analyze |  | enrich | `enrich(source, base)` |
| analyze |  | enrich | `enrich(source, javaAnalyzer.analyze(source))` |
| analyze | javaAnalyzer | analyze | `javaAnalyzer.analyze(source)` |
| analyze | javaAnalyzer | analyze | `javaAnalyzer.analyze(source)` |
| combinePaths | ("/" + classPath + "/" + methodPath) | replaceAll | `("/" + classPath + "/" + methodPath).replaceAll("/+", "/")` |
| combinePaths | combined | endsWith | `combined.endsWith("/")` |
| combinePaths | combined | length | `combined.length()` |
| combinePaths | combined | length | `combined.length()` |
| combinePaths | combined | substring | `combined.substring(0, combined.length() - 1)` |
| componentType | COMPONENT_ANNOTATIONS | get | `COMPONENT_ANNOTATIONS.get(annotation)` |
| componentType | classDoc | annotations | `classDoc.annotations()` |
| componentType | classDoc | className | `classDoc.className()` |
| componentType | classDoc | className | `classDoc.className()` |
| componentType | classDoc.className() | endsWith | `classDoc.className().endsWith("DTO")` |
| componentType | classDoc.className() | endsWith | `classDoc.className().endsWith("Dto")` |
| containsSpringAnnotation | COMPONENT_ANNOTATIONS | keySet | `COMPONENT_ANNOTATIONS.keySet()` |
| containsSpringAnnotation | COMPONENT_ANNOTATIONS.keySet() | stream | `COMPONENT_ANNOTATIONS.keySet().stream()` |
| containsSpringAnnotation | COMPONENT_ANNOTATIONS.keySet().stream() | anyMatch | `COMPONENT_ANNOTATIONS.keySet().stream().anyMatch(annotation -> source.contains("@" + annotation))` |
| containsSpringAnnotation | Files | readString | `Files.readString(javaFile)` |
| containsSpringAnnotation | System.err | printf | `System.err.printf("Failed to inspect %s: %s%n", javaFile, exception.getMessage())` |
| containsSpringAnnotation | exception | getMessage | `exception.getMessage()` |
| containsSpringAnnotation | source | contains | `source.contains("@" + annotation)` |
| containsSpringBoot | Files | readString | `Files.readString(pomXml)` |
| containsSpringBoot | Files.readString(pomXml) | contains | `Files.readString(pomXml).contains("spring-boot")` |
| containsSpringBoot | System.err | printf | `System.err.printf("Failed to inspect %s: %s%n", pomXml, exception.getMessage())` |
| containsSpringBoot | exception | getMessage | `exception.getMessage()` |
| count | Math | toIntExact | `Math.toIntExact(classes.stream().filter(classDoc -> classDoc.componentType() == type).count())` |
| count | classDoc | componentType | `classDoc.componentType()` |
| count | classes | stream | `classes.stream()` |
| count | classes.stream() | filter | `classes.stream().filter(classDoc -> classDoc.componentType() == type)` |
| count | classes.stream().filter(classDoc -> classDoc.componentType() == type) | count | `classes.stream().filter(classDoc -> classDoc.componentType() == type).count()` |
| endpoint |  | combinePaths | `combinePaths(classPath, methodPath)` |
| endpoint | method | getNameAsString | `method.getNameAsString()` |
| enrich | Comparator | comparing | `Comparator.comparing(ClassDoc::className)` |
| enrich | base | classes | `base.classes()` |
| enrich | base.classes() | stream | `base.classes().stream()` |
| enrich | base.classes().stream() | map | `base.classes().stream().map(classDoc -> classDoc.withComponentType(componentType(classDoc)).withRoleSummary(roleSummary(classDoc)))` |
| enrich | base.classes().stream().map(classDoc -> classDoc.withComponentType(componentType(classDoc)).withRoleSummary(roleSummary(classDoc))) | sorted | `base.classes().stream().map(classDoc -> classDoc.withComponentType(componentType(classDoc)).withRoleSummary(roleSummary(classDoc))).sorted(Comparator.comparing(ClassDoc::className))` |
| enrich | base.classes().stream().map(classDoc -> classDoc.withComponentType(componentType(classDoc)).withRoleSummary(roleSummary(classDoc))).sorted(Comparator.comparing(ClassDoc::className)) | toList | `base.classes().stream().map(classDoc -> classDoc.withComponentType(componentType(classDoc)).withRoleSummary(roleSummary(classDoc))).sorted(Comparator.comparing(ClassDoc::className)).toList()` |
| enrich | base | configs | `base.configs()` |
| enrich | base | methodCalls | `base.methodCalls()` |
| enrich | base | relations | `base.relations()` |
| enrich | base | sqlStatements | `base.sqlStatements()` |
| enrich | base | tableUsages | `base.tableUsages()` |
| enrich | classDoc | withComponentType | `classDoc.withComponentType(componentType(classDoc))` |
| enrich | classDoc.withComponentType(componentType(classDoc)) | withRoleSummary | `classDoc.withComponentType(componentType(classDoc)).withRoleSummary(roleSummary(classDoc))` |
| enrich | classes | size | `classes.size()` |
| enrich |  | componentType | `componentType(classDoc)` |
| enrich |  | count | `count(classes, ComponentType.CONTROLLER)` |
| enrich |  | count | `count(classes, ComponentType.ENTITY)` |
| enrich |  | count | `count(classes, ComponentType.REPOSITORY)` |
| enrich |  | count | `count(classes, ComponentType.SERVICE)` |
| enrich | endpoints | size | `endpoints.size()` |
| enrich |  | extractEndpoints | `extractEndpoints(source)` |
| enrich |  | roleSummary | `roleSummary(classDoc)` |
| enrich | source | rootDirectory | `source.rootDirectory()` |
| enrich | source | rootDirectory | `source.rootDirectory()` |
| enrich | source.rootDirectory() | getFileName | `source.rootDirectory().getFileName()` |
| enrich | source.rootDirectory().getFileName() | toString | `source.rootDirectory().getFileName().toString()` |
| expressions | List | of | `List.of(expression)` |
| expressions | array | getValues | `array.getValues()` |
| extractEndpoints | Comparator | comparing | `Comparator.comparing(ApiEndpointDoc::path)` |
| extractEndpoints | Comparator.comparing(ApiEndpointDoc::path) | thenComparing | `Comparator.comparing(ApiEndpointDoc::path).thenComparing(ApiEndpointDoc::httpMethod)` |
| extractEndpoints | System.err | printf | `System.err.printf("Failed to extract endpoints from %s: %s%n", javaFile, exception.getMessage())` |
| extractEndpoints | endpoints | addAll | `endpoints.addAll(toEndpoints(type.getNameAsString(), method, classPath, source.relativePath(javaFile).toString()))` |
| extractEndpoints | endpoints | stream | `endpoints.stream()` |
| extractEndpoints | endpoints.stream() | sorted | `endpoints.stream().sorted(Comparator.comparing(ApiEndpointDoc::path).thenComparing(ApiEndpointDoc::httpMethod))` |
| extractEndpoints | endpoints.stream().sorted(Comparator.comparing(ApiEndpointDoc::path).thenComparing(ApiEndpointDoc::httpMethod)) | toList | `endpoints.stream().sorted(Comparator.comparing(ApiEndpointDoc::path).thenComparing(ApiEndpointDoc::httpMethod)).toList()` |
| extractEndpoints | exception | getMessage | `exception.getMessage()` |
| extractEndpoints |  | findAnnotation | `findAnnotation(type.getAnnotations(), "RequestMapping")` |
| extractEndpoints |  | isController | `isController(type)` |
| extractEndpoints | javaAnalyzer | parse | `javaAnalyzer.parse(javaFile)` |
| extractEndpoints |  | mappingPath | `mappingPath(findAnnotation(type.getAnnotations(), "RequestMapping"))` |
| extractEndpoints | source | javaFiles | `source.javaFiles()` |
| extractEndpoints | source | relativePath | `source.relativePath(javaFile)` |
| extractEndpoints | source.relativePath(javaFile) | toString | `source.relativePath(javaFile).toString()` |
| extractEndpoints |  | toEndpoints | `toEndpoints(type.getNameAsString(), method, classPath, source.relativePath(javaFile).toString())` |
| extractEndpoints | type | getAnnotations | `type.getAnnotations()` |
| extractEndpoints | type | getMethods | `type.getMethods()` |
| extractEndpoints | type | getNameAsString | `type.getNameAsString()` |
| extractEndpoints | unit | getTypes | `unit.getTypes()` |
| findAnnotation | Optional | empty | `Optional.empty()` |
| findAnnotation | Optional | of | `Optional.of(annotation)` |
| findAnnotation | annotation | getName | `annotation.getName()` |
| findAnnotation | annotation.getName() | getIdentifier | `annotation.getName().getIdentifier()` |
| findAnnotation | annotationName | equals | `annotationName.equals(annotation.getName().getIdentifier())` |
| firstString | Optional | empty | `Optional.empty()` |
| firstString | Optional | of | `Optional.of(stringLiteral.asString())` |
| firstString | array | getValues | `array.getValues()` |
| firstString | array.getValues() | stream | `array.getValues().stream()` |
| firstString | array.getValues().stream() | map | `array.getValues().stream().map(this::firstString)` |
| firstString | array.getValues().stream().map(this::firstString) | flatMap | `array.getValues().stream().map(this::firstString).flatMap(Optional::stream)` |
| firstString | array.getValues().stream().map(this::firstString).flatMap(Optional::stream) | findFirst | `array.getValues().stream().map(this::firstString).flatMap(Optional::stream).findFirst()` |
| firstString | stringLiteral | asString | `stringLiteral.asString()` |
| isController | "Controller" | equals | `"Controller".equals(name)` |
| isController | "RestController" | equals | `"RestController".equals(name)` |
| isController | annotation | getName | `annotation.getName()` |
| isController | annotation.getName() | getIdentifier | `annotation.getName().getIdentifier()` |
| isController | type | getAnnotations | `type.getAnnotations()` |
| isController | type.getAnnotations() | stream | `type.getAnnotations().stream()` |
| isController | type.getAnnotations().stream() | map | `type.getAnnotations().stream().map(annotation -> annotation.getName().getIdentifier())` |
| isController | type.getAnnotations().stream().map(annotation -> annotation.getName().getIdentifier()) | anyMatch | `type.getAnnotations().stream().map(annotation -> annotation.getName().getIdentifier()).anyMatch(name -> "RestController".equals(name) \|\| "Controller".equals(name))` |
| mappingPath | "path" | equals | `"path".equals(pair.getNameAsString())` |
| mappingPath | "value" | equals | `"value".equals(pair.getNameAsString())` |
| mappingPath | annotation | isEmpty | `annotation.isEmpty()` |
| mappingPath | annotation | orElseThrow | `annotation.orElseThrow()` |
| mappingPath |  | firstString | `firstString(pair.getValue())` |
| mappingPath |  | firstString | `firstString(single.getMemberValue())` |
| mappingPath | firstString(single.getMemberValue()) | orElse | `firstString(single.getMemberValue()).orElse("")` |
| mappingPath | normal | getPairs | `normal.getPairs()` |
| mappingPath | normal.getPairs() | stream | `normal.getPairs().stream()` |
| mappingPath | normal.getPairs().stream() | filter | `normal.getPairs().stream().filter(pair -> "value".equals(pair.getNameAsString()) \|\| "path".equals(pair.getNameAsString()))` |
| mappingPath | normal.getPairs().stream().filter(pair -> "value".equals(pair.getNameAsString()) \|\| "path".equals(pair.getNameAsString())) | map | `normal.getPairs().stream().filter(pair -> "value".equals(pair.getNameAsString()) \|\| "path".equals(pair.getNameAsString())).map(pair -> firstString(pair.getValue()))` |
| mappingPath | normal.getPairs().stream().filter(pair -> "value".equals(pair.getNameAsString()) \|\| "path".equals(pair.getNameAsString())).map(pair -> firstString(pair.getValue())) | flatMap | `normal.getPairs().stream().filter(pair -> "value".equals(pair.getNameAsString()) \|\| "path".equals(pair.getNameAsString())).map(pair -> firstString(pair.getValue())).flatMap(Optional::stream)` |
| mappingPath | normal.getPairs().stream().filter(pair -> "value".equals(pair.getNameAsString()) \|\| "path".equals(pair.getNameAsString())).map(pair -> firstString(pair.getValue())).flatMap(Optional::stream) | findFirst | `normal.getPairs().stream().filter(pair -> "value".equals(pair.getNameAsString()) \|\| "path".equals(pair.getNameAsString())).map(pair -> firstString(pair.getValue())).flatMap(Optional::stream).findFirst()` |
| mappingPath | normal.getPairs().stream().filter(pair -> "value".equals(pair.getNameAsString()) \|\| "path".equals(pair.getNameAsString())).map(pair -> firstString(pair.getValue())).flatMap(Optional::stream).findFirst() | orElse | `normal.getPairs().stream().filter(pair -> "value".equals(pair.getNameAsString()) \|\| "path".equals(pair.getNameAsString())).map(pair -> firstString(pair.getValue())).flatMap(Optional::stream).findFirst().orElse("")` |
| mappingPath | pair | getNameAsString | `pair.getNameAsString()` |
| mappingPath | pair | getNameAsString | `pair.getNameAsString()` |
| mappingPath | pair | getValue | `pair.getValue()` |
| mappingPath | single | getMemberValue | `single.getMemberValue()` |
| requestMethodName | Optional | of | `Optional.of(fieldAccess.getNameAsString())` |
| requestMethodName | Optional | of | `Optional.of(separator >= 0 ? text.substring(separator + 1) : text)` |
| requestMethodName | expression | toString | `expression.toString()` |
| requestMethodName | fieldAccess | getNameAsString | `fieldAccess.getNameAsString()` |
| requestMethodName | text | lastIndexOf | `text.lastIndexOf('.')` |
| requestMethodName | text | substring | `text.substring(separator + 1)` |
| requestMethods | "method" | equals | `"method".equals(pair.getNameAsString())` |
| requestMethods | List | of | `List.of()` |
| requestMethods |  | expressions | `expressions(pair.getValue())` |
| requestMethods | expressions(pair.getValue()) | stream | `expressions(pair.getValue()).stream()` |
| requestMethods | normal | getPairs | `normal.getPairs()` |
| requestMethods | normal.getPairs() | stream | `normal.getPairs().stream()` |
| requestMethods | normal.getPairs().stream() | filter | `normal.getPairs().stream().filter(pair -> "method".equals(pair.getNameAsString()))` |
| requestMethods | normal.getPairs().stream().filter(pair -> "method".equals(pair.getNameAsString())) | flatMap | `normal.getPairs().stream().filter(pair -> "method".equals(pair.getNameAsString())).flatMap(pair -> expressions(pair.getValue()).stream())` |
| requestMethods | normal.getPairs().stream().filter(pair -> "method".equals(pair.getNameAsString())).flatMap(pair -> expressions(pair.getValue()).stream()) | map | `normal.getPairs().stream().filter(pair -> "method".equals(pair.getNameAsString())).flatMap(pair -> expressions(pair.getValue()).stream()).map(this::requestMethodName)` |
| requestMethods | normal.getPairs().stream().filter(pair -> "method".equals(pair.getNameAsString())).flatMap(pair -> expressions(pair.getValue()).stream()).map(this::requestMethodName) | flatMap | `normal.getPairs().stream().filter(pair -> "method".equals(pair.getNameAsString())).flatMap(pair -> expressions(pair.getValue()).stream()).map(this::requestMethodName).flatMap(Optional::stream)` |
| requestMethods | normal.getPairs().stream().filter(pair -> "method".equals(pair.getNameAsString())).flatMap(pair -> expressions(pair.getValue()).stream()).map(this::requestMethodName).flatMap(Optional::stream) | toList | `normal.getPairs().stream().filter(pair -> "method".equals(pair.getNameAsString())).flatMap(pair -> expressions(pair.getValue()).stream()).map(this::requestMethodName).flatMap(Optional::stream).toList()` |
| requestMethods | pair | getNameAsString | `pair.getNameAsString()` |
| requestMethods | pair | getValue | `pair.getValue()` |
| roleSummary | RoleResolver.UNKNOWN_ROLE | equals | `RoleResolver.UNKNOWN_ROLE.equals(current)` |
| roleSummary | classDoc | annotations | `classDoc.annotations()` |
| roleSummary | classDoc | roleSummary | `classDoc.roleSummary()` |
| roleSummary | current | contains | `current.contains("DTOです。")` |
| supports | source | javaFiles | `source.javaFiles()` |
| supports | source.javaFiles() | stream | `source.javaFiles().stream()` |
| supports | source.javaFiles().stream() | anyMatch | `source.javaFiles().stream().anyMatch(this::containsSpringAnnotation)` |
| supports | source | pomXml | `source.pomXml()` |
| supports | source.pomXml() | map | `source.pomXml().map(this::containsSpringBoot)` |
| supports | source.pomXml().map(this::containsSpringBoot) | orElse | `source.pomXml().map(this::containsSpringBoot).orElse(false)` |
| toEndpoints | "RequestMapping" | equals | `"RequestMapping".equals(annotationName)` |
| toEndpoints | HTTP_METHOD_ANNOTATIONS | get | `HTTP_METHOD_ANNOTATIONS.get(annotationName)` |
| toEndpoints | List | of | `List.of("REQUEST")` |
| toEndpoints | Optional | of | `Optional.of(annotation)` |
| toEndpoints | Optional | of | `Optional.of(annotation)` |
| toEndpoints | annotation | getName | `annotation.getName()` |
| toEndpoints | annotation.getName() | getIdentifier | `annotation.getName().getIdentifier()` |
| toEndpoints |  | endpoint | `endpoint(className, method, httpMethod, classPath, mappingPath(Optional.of(annotation)), sourcePath)` |
| toEndpoints |  | endpoint | `endpoint(className, method, requestMethod, classPath, mappingPath(Optional.of(annotation)), sourcePath)` |
| toEndpoints | endpoints | add | `endpoints.add(endpoint(className, method, httpMethod, classPath, mappingPath(Optional.of(annotation)), sourcePath))` |
| toEndpoints | endpoints | add | `endpoints.add(endpoint(className, method, requestMethod, classPath, mappingPath(Optional.of(annotation)), sourcePath))` |
| toEndpoints |  | mappingPath | `mappingPath(Optional.of(annotation))` |
| toEndpoints |  | mappingPath | `mappingPath(Optional.of(annotation))` |
| toEndpoints | method | getAnnotations | `method.getAnnotations()` |
| toEndpoints | methods | isEmpty | `methods.isEmpty()` |
| toEndpoints |  | requestMethods | `requestMethods(annotation)` |

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
