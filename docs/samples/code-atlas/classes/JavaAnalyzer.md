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
| analyzeMethodCalls | `List<MethodCallDoc>` | ProjectSource source |  |
| analyzeVariableTypes | `List<VariableTypeDoc>` | ProjectSource source |  |
| analyzeMethodCalls | `List<MethodCallDoc>` | ProjectSource source, List<ClassDoc> classes, List<VariableTypeDoc> variableTypes |  |
| toMethodCallDoc | `MethodCallDoc` | String className, String methodName, MethodCallExpr call, Path sourcePath, List<VariableTypeDoc> variableTypes, Set<String> projectClassNames, Set<String> ownMethodNames |  |
| resolveTargetClassName | `String` | String className, String methodName, String scopeName, boolean unscoped, String calledMethodName, List<VariableTypeDoc> variableTypes, Set<String> projectClassNames, Set<String> ownMethodNames |  |
| isMethodVariable | `boolean` | VariableScope scope |  |
| scopeVariableName | `java.util.Optional<String>` | Expression scope |  |
| projectTypeName | `String` | String typeName, Set<String> projectClassNames |  |
| variableType | `VariableTypeDoc` | String className, String methodName, VariableDeclarator variable, VariableScope scope, Path sourcePath |  |
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
| LIBRARY_OR_UTILITY_METHODS | `Set<String>` |  |
| parser | `JavaParser` |  |

## Method Call Relations

### Outgoing Calls

| Target | Expression |
| --- | --- |
| [JavaAnalyzer](JavaAnalyzer.md).analyzeClasses | `analyzeClasses(source)` |
| [JavaAnalyzer](JavaAnalyzer.md).analyzeMethodCalls | `analyzeMethodCalls(source, classes, variableTypes)` |
| [JavaAnalyzer](JavaAnalyzer.md).analyzeRelations | `analyzeRelations(source, classes)` |
| [JavaAnalyzer](JavaAnalyzer.md).analyzeVariableTypes | `analyzeVariableTypes(source)` |
| [ProjectSource](ProjectSource.md).configFiles | `source.configFiles()` |
| [ProjectSource](ProjectSource.md).relativePath | `source.relativePath(path)` |
| [ProjectSource](ProjectSource.md).rootDirectory | `source.rootDirectory()` |
| [ProjectSource](ProjectSource.md).rootDirectory | `source.rootDirectory()` |
| [JavaAnalyzer](JavaAnalyzer.md).parse | `parse(javaFile)` |
| [JavaAnalyzer](JavaAnalyzer.md).toClassDoc | `toClassDoc(unit, type, source.relativePath(javaFile))` |
| [ProjectSource](ProjectSource.md).javaFiles | `source.javaFiles()` |
| [ProjectSource](ProjectSource.md).relativePath | `source.relativePath(javaFile)` |
| [JavaAnalyzer](JavaAnalyzer.md).analyzeClasses | `analyzeClasses(source)` |
| [JavaAnalyzer](JavaAnalyzer.md).analyzeMethodCalls | `analyzeMethodCalls(source, classes, analyzeVariableTypes(source))` |
| [JavaAnalyzer](JavaAnalyzer.md).analyzeVariableTypes | `analyzeVariableTypes(source)` |
| [JavaAnalyzer](JavaAnalyzer.md).parse | `parse(javaFile)` |
| [JavaAnalyzer](JavaAnalyzer.md).toMethodCallDoc | `toMethodCallDoc(className, method.getNameAsString(), call, sourcePath, variableTypes, projectClassNames, ownMethodNames)` |
| [ProjectSource](ProjectSource.md).javaFiles | `source.javaFiles()` |
| [ProjectSource](ProjectSource.md).relativePath | `source.relativePath(javaFile)` |
| [JavaAnalyzer](JavaAnalyzer.md).extractRelations | `extractRelations(type, projectClassNames, relations)` |
| [JavaAnalyzer](JavaAnalyzer.md).parse | `parse(javaFile)` |
| [ProjectSource](ProjectSource.md).javaFiles | `source.javaFiles()` |
| [JavaAnalyzer](JavaAnalyzer.md).parse | `parse(javaFile)` |
| [JavaAnalyzer](JavaAnalyzer.md).variableType | `variableType(className, "", variable, VariableScope.FIELD, sourcePath)` |
| [JavaAnalyzer](JavaAnalyzer.md).variableType | `variableType(className, method.getNameAsString(), variable, VariableScope.LOCAL_VARIABLE, sourcePath)` |
| [ProjectSource](ProjectSource.md).javaFiles | `source.javaFiles()` |
| [ProjectSource](ProjectSource.md).relativePath | `source.relativePath(javaFile)` |
| [JavaAnalyzer](JavaAnalyzer.md).addRelations | `addRelations(relations, projectClassNames, sourceClassName, method.getType(), RelationType.METHOD_RETURN_TYPE, method.getNameAsString())` |
| [JavaAnalyzer](JavaAnalyzer.md).addRelations | `addRelations(relations, projectClassNames, sourceClassName, parameter.getType(), RelationType.CONSTRUCTOR_PARAMETER, parameter.getNameAsString())` |
| [JavaAnalyzer](JavaAnalyzer.md).addRelations | `addRelations(relations, projectClassNames, sourceClassName, parameter.getType(), RelationType.METHOD_PARAMETER, parameter.getNameAsString())` |
| [JavaAnalyzer](JavaAnalyzer.md).addRelations | `addRelations(relations, projectClassNames, sourceClassName, variable.getType(), RelationType.FIELD, variable.getNameAsString())` |
| [JavaAnalyzer](JavaAnalyzer.md).isMethodVariable | `isMethodVariable(scope)` |
| [JavaAnalyzer](JavaAnalyzer.md).projectTypeName | `projectTypeName(variable.typeName(), projectClassNames)` |
| [VariableTypeDoc](VariableTypeDoc.md).className | `variable.className()` |
| [VariableTypeDoc](VariableTypeDoc.md).methodName | `variable.methodName()` |
| [VariableTypeDoc](VariableTypeDoc.md).typeName | `variable.typeName()` |
| [VariableTypeDoc](VariableTypeDoc.md).variableName | `variable.variableName()` |
| [VariableTypeDoc](VariableTypeDoc.md).variableScope | `variable.variableScope()` |
| [ProjectSource](ProjectSource.md).javaFiles | `source.javaFiles()` |
| [JavaAnalyzer](JavaAnalyzer.md).annotationNames | `annotationNames(field.getAnnotations())` |
| [JavaAnalyzer](JavaAnalyzer.md).annotationNames | `annotationNames(type.getAnnotations())` |
| [JavaAnalyzer](JavaAnalyzer.md).declarationKind | `declarationKind(type)` |
| [JavaAnalyzer](JavaAnalyzer.md).resolveTargetClassName | `resolveTargetClassName(className, methodName, lookupName, call.getScope().isEmpty(), call.getNameAsString(), variableTypes, projectClassNames, ownMethodNames)` |
| [JavaAnalyzer](JavaAnalyzer.md).annotationNames | `annotationNames(method.getAnnotations())` |

### Incoming Calls

| Source | Expression |
| --- | --- |
| [JavaAnalyzer](JavaAnalyzer.md).analyze | `analyzeClasses(source)` |
| [JavaAnalyzer](JavaAnalyzer.md).analyze | `analyzeMethodCalls(source, classes, variableTypes)` |
| [JavaAnalyzer](JavaAnalyzer.md).analyze | `analyzeRelations(source, classes)` |
| [JavaAnalyzer](JavaAnalyzer.md).analyze | `analyzeVariableTypes(source)` |
| [JavaAnalyzer](JavaAnalyzer.md).analyzeClasses | `parse(javaFile)` |
| [JavaAnalyzer](JavaAnalyzer.md).analyzeClasses | `toClassDoc(unit, type, source.relativePath(javaFile))` |
| [JavaAnalyzer](JavaAnalyzer.md).analyzeMethodCalls | `analyzeClasses(source)` |
| [JavaAnalyzer](JavaAnalyzer.md).analyzeMethodCalls | `analyzeMethodCalls(source, classes, analyzeVariableTypes(source))` |
| [JavaAnalyzer](JavaAnalyzer.md).analyzeMethodCalls | `analyzeVariableTypes(source)` |
| [JavaAnalyzer](JavaAnalyzer.md).analyzeMethodCalls | `parse(javaFile)` |
| [JavaAnalyzer](JavaAnalyzer.md).analyzeMethodCalls | `toMethodCallDoc(className, method.getNameAsString(), call, sourcePath, variableTypes, projectClassNames, ownMethodNames)` |
| [JavaAnalyzer](JavaAnalyzer.md).analyzeRelations | `extractRelations(type, projectClassNames, relations)` |
| [JavaAnalyzer](JavaAnalyzer.md).analyzeRelations | `parse(javaFile)` |
| [JavaAnalyzer](JavaAnalyzer.md).analyzeVariableTypes | `parse(javaFile)` |
| [JavaAnalyzer](JavaAnalyzer.md).analyzeVariableTypes | `variableType(className, "", variable, VariableScope.FIELD, sourcePath)` |
| [JavaAnalyzer](JavaAnalyzer.md).analyzeVariableTypes | `variableType(className, method.getNameAsString(), variable, VariableScope.LOCAL_VARIABLE, sourcePath)` |
| [JavaAnalyzer](JavaAnalyzer.md).extractRelations | `addRelations(relations, projectClassNames, sourceClassName, method.getType(), RelationType.METHOD_RETURN_TYPE, method.getNameAsString())` |
| [JavaAnalyzer](JavaAnalyzer.md).extractRelations | `addRelations(relations, projectClassNames, sourceClassName, parameter.getType(), RelationType.CONSTRUCTOR_PARAMETER, parameter.getNameAsString())` |
| [JavaAnalyzer](JavaAnalyzer.md).extractRelations | `addRelations(relations, projectClassNames, sourceClassName, parameter.getType(), RelationType.METHOD_PARAMETER, parameter.getNameAsString())` |
| [JavaAnalyzer](JavaAnalyzer.md).extractRelations | `addRelations(relations, projectClassNames, sourceClassName, variable.getType(), RelationType.FIELD, variable.getNameAsString())` |
| [JavaAnalyzer](JavaAnalyzer.md).resolveTargetClassName | `isMethodVariable(scope)` |
| [JavaAnalyzer](JavaAnalyzer.md).resolveTargetClassName | `projectTypeName(variable.typeName(), projectClassNames)` |
| [JavaAnalyzer](JavaAnalyzer.md).toClassDoc | `annotationNames(field.getAnnotations())` |
| [JavaAnalyzer](JavaAnalyzer.md).toClassDoc | `annotationNames(type.getAnnotations())` |
| [JavaAnalyzer](JavaAnalyzer.md).toClassDoc | `declarationKind(type)` |
| [JavaAnalyzer](JavaAnalyzer.md).toMethodCallDoc | `resolveTargetClassName(className, methodName, lookupName, call.getScope().isEmpty(), call.getNameAsString(), variableTypes, projectClassNames, ownMethodNames)` |
| [JavaAnalyzer](JavaAnalyzer.md).toMethodDoc | `annotationNames(method.getAnnotations())` |
| [SpringBootAnalyzer](SpringBootAnalyzer.md).analyze | `javaAnalyzer.analyze(source)` |
| [SpringBootAnalyzer](SpringBootAnalyzer.md).analyze | `javaAnalyzer.analyze(source)` |
| [SpringBootAnalyzer](SpringBootAnalyzer.md).extractEndpoints | `javaAnalyzer.parse(javaFile)` |

## Method Calls

### Project Calls

| Source Method | Scope | Resolved Target | Called Method | Expression |
| --- | --- | --- | --- | --- |
| analyze |  | JavaAnalyzer | analyzeClasses | `analyzeClasses(source)` |
| analyze |  | JavaAnalyzer | analyzeMethodCalls | `analyzeMethodCalls(source, classes, variableTypes)` |
| analyze |  | JavaAnalyzer | analyzeRelations | `analyzeRelations(source, classes)` |
| analyze |  | JavaAnalyzer | analyzeVariableTypes | `analyzeVariableTypes(source)` |
| analyze | source | ProjectSource | configFiles | `source.configFiles()` |
| analyze | source | ProjectSource | relativePath | `source.relativePath(path)` |
| analyze | source | ProjectSource | rootDirectory | `source.rootDirectory()` |
| analyze | source | ProjectSource | rootDirectory | `source.rootDirectory()` |
| analyzeClasses |  | JavaAnalyzer | parse | `parse(javaFile)` |
| analyzeClasses | source | ProjectSource | javaFiles | `source.javaFiles()` |
| analyzeClasses | source | ProjectSource | relativePath | `source.relativePath(javaFile)` |
| analyzeClasses |  | JavaAnalyzer | toClassDoc | `toClassDoc(unit, type, source.relativePath(javaFile))` |
| analyzeMethodCalls |  | JavaAnalyzer | analyzeClasses | `analyzeClasses(source)` |
| analyzeMethodCalls |  | JavaAnalyzer | analyzeMethodCalls | `analyzeMethodCalls(source, classes, analyzeVariableTypes(source))` |
| analyzeMethodCalls |  | JavaAnalyzer | analyzeVariableTypes | `analyzeVariableTypes(source)` |
| analyzeMethodCalls |  | JavaAnalyzer | parse | `parse(javaFile)` |
| analyzeMethodCalls | source | ProjectSource | javaFiles | `source.javaFiles()` |
| analyzeMethodCalls | source | ProjectSource | relativePath | `source.relativePath(javaFile)` |
| analyzeMethodCalls |  | JavaAnalyzer | toMethodCallDoc | `toMethodCallDoc(className, method.getNameAsString(), call, sourcePath, variableTypes, projectClassNames, ownMethodNames)` |
| analyzeRelations |  | JavaAnalyzer | extractRelations | `extractRelations(type, projectClassNames, relations)` |
| analyzeRelations |  | JavaAnalyzer | parse | `parse(javaFile)` |
| analyzeRelations | source | ProjectSource | javaFiles | `source.javaFiles()` |
| analyzeVariableTypes |  | JavaAnalyzer | parse | `parse(javaFile)` |
| analyzeVariableTypes | source | ProjectSource | javaFiles | `source.javaFiles()` |
| analyzeVariableTypes | source | ProjectSource | relativePath | `source.relativePath(javaFile)` |
| analyzeVariableTypes |  | JavaAnalyzer | variableType | `variableType(className, "", variable, VariableScope.FIELD, sourcePath)` |
| analyzeVariableTypes |  | JavaAnalyzer | variableType | `variableType(className, method.getNameAsString(), variable, VariableScope.LOCAL_VARIABLE, sourcePath)` |
| extractRelations |  | JavaAnalyzer | addRelations | `addRelations(relations, projectClassNames, sourceClassName, method.getType(), RelationType.METHOD_RETURN_TYPE, method.getNameAsString())` |
| extractRelations |  | JavaAnalyzer | addRelations | `addRelations(relations, projectClassNames, sourceClassName, parameter.getType(), RelationType.CONSTRUCTOR_PARAMETER, parameter.getNameAsString())` |
| extractRelations |  | JavaAnalyzer | addRelations | `addRelations(relations, projectClassNames, sourceClassName, parameter.getType(), RelationType.METHOD_PARAMETER, parameter.getNameAsString())` |
| extractRelations |  | JavaAnalyzer | addRelations | `addRelations(relations, projectClassNames, sourceClassName, variable.getType(), RelationType.FIELD, variable.getNameAsString())` |
| resolveTargetClassName |  | JavaAnalyzer | isMethodVariable | `isMethodVariable(scope)` |
| resolveTargetClassName |  | JavaAnalyzer | projectTypeName | `projectTypeName(variable.typeName(), projectClassNames)` |
| resolveTargetClassName | variable | VariableTypeDoc | className | `variable.className()` |
| resolveTargetClassName | variable | VariableTypeDoc | methodName | `variable.methodName()` |
| resolveTargetClassName | variable | VariableTypeDoc | typeName | `variable.typeName()` |
| resolveTargetClassName | variable | VariableTypeDoc | variableName | `variable.variableName()` |
| resolveTargetClassName | variable | VariableTypeDoc | variableScope | `variable.variableScope()` |
| supports | source | ProjectSource | javaFiles | `source.javaFiles()` |
| toClassDoc |  | JavaAnalyzer | annotationNames | `annotationNames(field.getAnnotations())` |
| toClassDoc |  | JavaAnalyzer | annotationNames | `annotationNames(type.getAnnotations())` |
| toClassDoc |  | JavaAnalyzer | declarationKind | `declarationKind(type)` |
| toMethodCallDoc |  | JavaAnalyzer | resolveTargetClassName | `resolveTargetClassName(className, methodName, lookupName, call.getScope().isEmpty(), call.getNameAsString(), variableTypes, projectClassNames, ownMethodNames)` |
| toMethodDoc |  | JavaAnalyzer | annotationNames | `annotationNames(method.getAnnotations())` |

### Library / Utility Calls

Library / Utility calls are omitted from this page. Count: 231.

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
| [MethodCallDoc](MethodCallDoc.md) | METHOD_RETURN_TYPE | analyzeMethodCalls |
| [MethodCallDoc](MethodCallDoc.md) | METHOD_RETURN_TYPE | toMethodCallDoc |
| [MethodDoc](MethodDoc.md) | METHOD_RETURN_TYPE | toMethodDoc |
| [ProjectSource](ProjectSource.md) | METHOD_PARAMETER | source |
| [RelationType](RelationType.md) | METHOD_PARAMETER | relationType |
| [VariableScope](VariableScope.md) | METHOD_PARAMETER | scope |
| [VariableTypeDoc](VariableTypeDoc.md) | METHOD_PARAMETER | variableTypes |
| [VariableTypeDoc](VariableTypeDoc.md) | METHOD_RETURN_TYPE | analyzeVariableTypes |
| [VariableTypeDoc](VariableTypeDoc.md) | METHOD_RETURN_TYPE | variableType |

### Incoming References

| Source | Relation | Member |
| --- | --- | --- |
| [SpringBootAnalyzer](SpringBootAnalyzer.md) | FIELD | javaAnalyzer |
