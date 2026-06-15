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

## Method Calls

| Source Method | Scope | Called Method | Expression |
| --- | --- | --- | --- |
| addRelations | type | findAll | `type.findAll(ClassOrInterfaceType.class)` |
| addRelations | type.findAll(ClassOrInterfaceType.class) | stream | `type.findAll(ClassOrInterfaceType.class).stream()` |
| addRelations | type.findAll(ClassOrInterfaceType.class).stream() | map | `type.findAll(ClassOrInterfaceType.class).stream().map(ClassOrInterfaceType::getNameAsString)` |
| addRelations | type.findAll(ClassOrInterfaceType.class).stream().map(ClassOrInterfaceType::getNameAsString) | filter | `type.findAll(ClassOrInterfaceType.class).stream().map(ClassOrInterfaceType::getNameAsString).filter(projectClassNames::contains)` |
| addRelations | type.findAll(ClassOrInterfaceType.class).stream().map(ClassOrInterfaceType::getNameAsString).filter(projectClassNames::contains) | map | `type.findAll(ClassOrInterfaceType.class).stream().map(ClassOrInterfaceType::getNameAsString).filter(projectClassNames::contains).map(targetClassName -> new ClassRelationDoc(sourceClassName, targetClassName, relationType, sourceMemberName))` |
| addRelations | type.findAll(ClassOrInterfaceType.class).stream().map(ClassOrInterfaceType::getNameAsString).filter(projectClassNames::contains).map(targetClassName -> new ClassRelationDoc(sourceClassName, targetClassName, relationType, sourceMemberName)) | forEach | `type.findAll(ClassOrInterfaceType.class).stream().map(ClassOrInterfaceType::getNameAsString).filter(projectClassNames::contains).map(targetClassName -> new ClassRelationDoc(sourceClassName, targetClassName, relationType, sourceMemberName)).forEach(relations::add)` |
| analyze | List | of | `List.of()` |
| analyze | List | of | `List.of()` |
| analyze | List | of | `List.of()` |
| analyze |  | analyzeClasses | `analyzeClasses(source)` |
| analyze |  | analyzeMethodCalls | `analyzeMethodCalls(source)` |
| analyze |  | analyzeRelations | `analyzeRelations(source, classes)` |
| analyze | classes | size | `classes.size()` |
| analyze | path | getFileName | `path.getFileName()` |
| analyze | path.getFileName() | toString | `path.getFileName().toString()` |
| analyze | source | configFiles | `source.configFiles()` |
| analyze | source.configFiles() | stream | `source.configFiles().stream()` |
| analyze | source.configFiles().stream() | map | `source.configFiles().stream().map(path -> new ConfigDoc(source.relativePath(path), path.getFileName().toString()))` |
| analyze | source.configFiles().stream().map(path -> new ConfigDoc(source.relativePath(path), path.getFileName().toString())) | toList | `source.configFiles().stream().map(path -> new ConfigDoc(source.relativePath(path), path.getFileName().toString())).toList()` |
| analyze | source | relativePath | `source.relativePath(path)` |
| analyze | source | rootDirectory | `source.rootDirectory()` |
| analyze | source | rootDirectory | `source.rootDirectory()` |
| analyze | source.rootDirectory() | getFileName | `source.rootDirectory().getFileName()` |
| analyze | source.rootDirectory().getFileName() | toString | `source.rootDirectory().getFileName().toString()` |
| analyzeClasses | List | copyOf | `List.copyOf(classes)` |
| analyzeClasses | System.err | printf | `System.err.printf("Failed to analyze %s: %s%n", javaFile, exception.getMessage())` |
| analyzeClasses | classes | add | `classes.add(toClassDoc(unit, type, source.relativePath(javaFile)))` |
| analyzeClasses | exception | getMessage | `exception.getMessage()` |
| analyzeClasses |  | parse | `parse(javaFile)` |
| analyzeClasses | source | javaFiles | `source.javaFiles()` |
| analyzeClasses | source | relativePath | `source.relativePath(javaFile)` |
| analyzeClasses |  | toClassDoc | `toClassDoc(unit, type, source.relativePath(javaFile))` |
| analyzeClasses | unit | getTypes | `unit.getTypes()` |
| analyzeMethodCalls | Comparator | comparing | `Comparator.comparing(MethodCallDoc::sourceClassName)` |
| analyzeMethodCalls | Comparator.comparing(MethodCallDoc::sourceClassName) | thenComparing | `Comparator.comparing(MethodCallDoc::sourceClassName).thenComparing(MethodCallDoc::sourceMethodName)` |
| analyzeMethodCalls | Comparator.comparing(MethodCallDoc::sourceClassName).thenComparing(MethodCallDoc::sourceMethodName) | thenComparing | `Comparator.comparing(MethodCallDoc::sourceClassName).thenComparing(MethodCallDoc::sourceMethodName).thenComparing(call -> call.sourcePath().toString())` |
| analyzeMethodCalls | Comparator.comparing(MethodCallDoc::sourceClassName).thenComparing(MethodCallDoc::sourceMethodName).thenComparing(call -> call.sourcePath().toString()) | thenComparing | `Comparator.comparing(MethodCallDoc::sourceClassName).thenComparing(MethodCallDoc::sourceMethodName).thenComparing(call -> call.sourcePath().toString()).thenComparing(MethodCallDoc::expression)` |
| analyzeMethodCalls | System.err | printf | `System.err.printf("Failed to analyze method calls in %s: %s%n", javaFile, exception.getMessage())` |
| analyzeMethodCalls | call | getNameAsString | `call.getNameAsString()` |
| analyzeMethodCalls | call | getScope | `call.getScope()` |
| analyzeMethodCalls | call.getScope() | map | `call.getScope().map(Object::toString)` |
| analyzeMethodCalls | call.getScope().map(Object::toString) | orElse | `call.getScope().map(Object::toString).orElse("")` |
| analyzeMethodCalls | call | sourcePath | `call.sourcePath()` |
| analyzeMethodCalls | call.sourcePath() | toString | `call.sourcePath().toString()` |
| analyzeMethodCalls | call | toString | `call.toString()` |
| analyzeMethodCalls | exception | getMessage | `exception.getMessage()` |
| analyzeMethodCalls | method | findAll | `method.findAll(MethodCallExpr.class)` |
| analyzeMethodCalls | method.findAll(MethodCallExpr.class) | stream | `method.findAll(MethodCallExpr.class).stream()` |
| analyzeMethodCalls | method.findAll(MethodCallExpr.class).stream() | map | `method.findAll(MethodCallExpr.class).stream().map(call -> new MethodCallDoc(type.getNameAsString(), method.getNameAsString(), call.getScope().map(Object::toString).orElse(""), call.getNameAsString(), call.toString(), sourcePath))` |
| analyzeMethodCalls | method.findAll(MethodCallExpr.class).stream().map(call -> new MethodCallDoc(type.getNameAsString(), method.getNameAsString(), call.getScope().map(Object::toString).orElse(""), call.getNameAsString(), call.toString(), sourcePath)) | forEach | `method.findAll(MethodCallExpr.class).stream().map(call -> new MethodCallDoc(type.getNameAsString(), method.getNameAsString(), call.getScope().map(Object::toString).orElse(""), call.getNameAsString(), call.toString(), sourcePath)).forEach(methodCalls::add)` |
| analyzeMethodCalls | method | getNameAsString | `method.getNameAsString()` |
| analyzeMethodCalls | methodCalls | stream | `methodCalls.stream()` |
| analyzeMethodCalls | methodCalls.stream() | sorted | `methodCalls.stream().sorted(Comparator.comparing(MethodCallDoc::sourceClassName).thenComparing(MethodCallDoc::sourceMethodName).thenComparing(call -> call.sourcePath().toString()).thenComparing(MethodCallDoc::expression))` |
| analyzeMethodCalls | methodCalls.stream().sorted(Comparator.comparing(MethodCallDoc::sourceClassName).thenComparing(MethodCallDoc::sourceMethodName).thenComparing(call -> call.sourcePath().toString()).thenComparing(MethodCallDoc::expression)) | toList | `methodCalls.stream().sorted(Comparator.comparing(MethodCallDoc::sourceClassName).thenComparing(MethodCallDoc::sourceMethodName).thenComparing(call -> call.sourcePath().toString()).thenComparing(MethodCallDoc::expression)).toList()` |
| analyzeMethodCalls |  | parse | `parse(javaFile)` |
| analyzeMethodCalls | source | javaFiles | `source.javaFiles()` |
| analyzeMethodCalls | source | relativePath | `source.relativePath(javaFile)` |
| analyzeMethodCalls | type | getMethods | `type.getMethods()` |
| analyzeMethodCalls | type | getNameAsString | `type.getNameAsString()` |
| analyzeMethodCalls | unit | getTypes | `unit.getTypes()` |
| analyzeRelations | Comparator | comparing | `Comparator.comparing(ClassRelationDoc::sourceClassName)` |
| analyzeRelations | Comparator.comparing(ClassRelationDoc::sourceClassName) | thenComparing | `Comparator.comparing(ClassRelationDoc::sourceClassName).thenComparing(ClassRelationDoc::targetClassName)` |
| analyzeRelations | Comparator.comparing(ClassRelationDoc::sourceClassName).thenComparing(ClassRelationDoc::targetClassName) | thenComparing | `Comparator.comparing(ClassRelationDoc::sourceClassName).thenComparing(ClassRelationDoc::targetClassName).thenComparing(relation -> relation.relationType().name())` |
| analyzeRelations | Comparator.comparing(ClassRelationDoc::sourceClassName).thenComparing(ClassRelationDoc::targetClassName).thenComparing(relation -> relation.relationType().name()) | thenComparing | `Comparator.comparing(ClassRelationDoc::sourceClassName).thenComparing(ClassRelationDoc::targetClassName).thenComparing(relation -> relation.relationType().name()).thenComparing(ClassRelationDoc::sourceMemberName)` |
| analyzeRelations | System.err | printf | `System.err.printf("Failed to analyze relations in %s: %s%n", javaFile, exception.getMessage())` |
| analyzeRelations | classDoc | className | `classDoc.className()` |
| analyzeRelations | classes | forEach | `classes.forEach(classDoc -> projectClassNames.add(classDoc.className()))` |
| analyzeRelations | exception | getMessage | `exception.getMessage()` |
| analyzeRelations |  | extractRelations | `extractRelations(type, projectClassNames, relations)` |
| analyzeRelations |  | parse | `parse(javaFile)` |
| analyzeRelations | projectClassNames | add | `projectClassNames.add(classDoc.className())` |
| analyzeRelations | relation | relationType | `relation.relationType()` |
| analyzeRelations | relation.relationType() | name | `relation.relationType().name()` |
| analyzeRelations | relations | stream | `relations.stream()` |
| analyzeRelations | relations.stream() | sorted | `relations.stream().sorted(Comparator.comparing(ClassRelationDoc::sourceClassName).thenComparing(ClassRelationDoc::targetClassName).thenComparing(relation -> relation.relationType().name()).thenComparing(ClassRelationDoc::sourceMemberName))` |
| analyzeRelations | relations.stream().sorted(Comparator.comparing(ClassRelationDoc::sourceClassName).thenComparing(ClassRelationDoc::targetClassName).thenComparing(relation -> relation.relationType().name()).thenComparing(ClassRelationDoc::sourceMemberName)) | toList | `relations.stream().sorted(Comparator.comparing(ClassRelationDoc::sourceClassName).thenComparing(ClassRelationDoc::targetClassName).thenComparing(relation -> relation.relationType().name()).thenComparing(ClassRelationDoc::sourceMemberName)).toList()` |
| analyzeRelations | source | javaFiles | `source.javaFiles()` |
| analyzeRelations | unit | getTypes | `unit.getTypes()` |
| annotationNames | List | copyOf | `List.copyOf(names)` |
| annotationNames | annotation | getName | `annotation.getName()` |
| annotationNames | annotation.getName() | getIdentifier | `annotation.getName().getIdentifier()` |
| annotationNames | annotations | forEach | `annotations.forEach(annotation -> names.add(annotation.getName().getIdentifier()))` |
| annotationNames | names | add | `names.add(annotation.getName().getIdentifier())` |
| declarationKind | declaration | isInterface | `declaration.isInterface()` |
| extractRelations |  | addRelations | `addRelations(relations, projectClassNames, sourceClassName, method.getType(), RelationType.METHOD_RETURN_TYPE, method.getNameAsString())` |
| extractRelations |  | addRelations | `addRelations(relations, projectClassNames, sourceClassName, parameter.getType(), RelationType.CONSTRUCTOR_PARAMETER, parameter.getNameAsString())` |
| extractRelations |  | addRelations | `addRelations(relations, projectClassNames, sourceClassName, parameter.getType(), RelationType.METHOD_PARAMETER, parameter.getNameAsString())` |
| extractRelations |  | addRelations | `addRelations(relations, projectClassNames, sourceClassName, variable.getType(), RelationType.FIELD, variable.getNameAsString())` |
| extractRelations | constructor | getParameters | `constructor.getParameters()` |
| extractRelations | constructor.getParameters() | forEach | `constructor.getParameters().forEach(parameter -> addRelations(relations, projectClassNames, sourceClassName, parameter.getType(), RelationType.CONSTRUCTOR_PARAMETER, parameter.getNameAsString()))` |
| extractRelations | field | getVariables | `field.getVariables()` |
| extractRelations | field.getVariables() | forEach | `field.getVariables().forEach(variable -> addRelations(relations, projectClassNames, sourceClassName, variable.getType(), RelationType.FIELD, variable.getNameAsString()))` |
| extractRelations | method | getNameAsString | `method.getNameAsString()` |
| extractRelations | method | getParameters | `method.getParameters()` |
| extractRelations | method.getParameters() | forEach | `method.getParameters().forEach(parameter -> addRelations(relations, projectClassNames, sourceClassName, parameter.getType(), RelationType.METHOD_PARAMETER, parameter.getNameAsString()))` |
| extractRelations | method | getType | `method.getType()` |
| extractRelations | parameter | getNameAsString | `parameter.getNameAsString()` |
| extractRelations | parameter | getNameAsString | `parameter.getNameAsString()` |
| extractRelations | parameter | getType | `parameter.getType()` |
| extractRelations | parameter | getType | `parameter.getType()` |
| extractRelations | type | getConstructors | `type.getConstructors()` |
| extractRelations | type | getFields | `type.getFields()` |
| extractRelations | type | getMethods | `type.getMethods()` |
| extractRelations | type | getNameAsString | `type.getNameAsString()` |
| extractRelations | variable | getNameAsString | `variable.getNameAsString()` |
| extractRelations | variable | getType | `variable.getType()` |
| parse | parser | parse | `parser.parse(javaFile)` |
| parse | result | getProblems | `result.getProblems()` |
| parse | result.getProblems() | toString | `result.getProblems().toString()` |
| parse | result | getResult | `result.getResult()` |
| parse | result | getResult | `result.getResult()` |
| parse | result.getResult() | isEmpty | `result.getResult().isEmpty()` |
| parse | result.getResult() | orElseThrow | `result.getResult().orElseThrow()` |
| parse | result | isSuccessful | `result.isSuccessful()` |
| supports | source | javaFiles | `source.javaFiles()` |
| supports | source.javaFiles() | isEmpty | `source.javaFiles().isEmpty()` |
| toClassDoc |  | annotationNames | `annotationNames(field.getAnnotations())` |
| toClassDoc |  | annotationNames | `annotationNames(type.getAnnotations())` |
| toClassDoc | declaration | getNameAsString | `declaration.getNameAsString()` |
| toClassDoc |  | declarationKind | `declarationKind(type)` |
| toClassDoc | field | getAnnotations | `field.getAnnotations()` |
| toClassDoc | field | getVariables | `field.getVariables()` |
| toClassDoc | field.getVariables() | stream | `field.getVariables().stream()` |
| toClassDoc | field.getVariables().stream() | map | `field.getVariables().stream().map(variable -> new FieldDoc(variable.getTypeAsString(), variable.getNameAsString(), annotationNames(field.getAnnotations())))` |
| toClassDoc | new RoleResolver() | resolve | `new RoleResolver().resolve(type)` |
| toClassDoc | type | getAnnotations | `type.getAnnotations()` |
| toClassDoc | type | getFields | `type.getFields()` |
| toClassDoc | type.getFields() | stream | `type.getFields().stream()` |
| toClassDoc | type.getFields().stream() | flatMap | `type.getFields().stream().flatMap(field -> field.getVariables().stream().map(variable -> new FieldDoc(variable.getTypeAsString(), variable.getNameAsString(), annotationNames(field.getAnnotations()))))` |
| toClassDoc | type.getFields().stream().flatMap(field -> field.getVariables().stream().map(variable -> new FieldDoc(variable.getTypeAsString(), variable.getNameAsString(), annotationNames(field.getAnnotations())))) | toList | `type.getFields().stream().flatMap(field -> field.getVariables().stream().map(variable -> new FieldDoc(variable.getTypeAsString(), variable.getNameAsString(), annotationNames(field.getAnnotations())))).toList()` |
| toClassDoc | type | getMethods | `type.getMethods()` |
| toClassDoc | type.getMethods() | stream | `type.getMethods().stream()` |
| toClassDoc | type.getMethods().stream() | map | `type.getMethods().stream().map(this::toMethodDoc)` |
| toClassDoc | type.getMethods().stream().map(this::toMethodDoc) | toList | `type.getMethods().stream().map(this::toMethodDoc).toList()` |
| toClassDoc | type | getNameAsString | `type.getNameAsString()` |
| toClassDoc | unit | getPackageDeclaration | `unit.getPackageDeclaration()` |
| toClassDoc | unit.getPackageDeclaration() | map | `unit.getPackageDeclaration().map(declaration -> declaration.getNameAsString())` |
| toClassDoc | unit.getPackageDeclaration().map(declaration -> declaration.getNameAsString()) | orElse | `unit.getPackageDeclaration().map(declaration -> declaration.getNameAsString()).orElse("")` |
| toClassDoc | variable | getNameAsString | `variable.getNameAsString()` |
| toClassDoc | variable | getTypeAsString | `variable.getTypeAsString()` |
| toMethodDoc |  | annotationNames | `annotationNames(method.getAnnotations())` |
| toMethodDoc | method | getAnnotations | `method.getAnnotations()` |
| toMethodDoc | method | getNameAsString | `method.getNameAsString()` |
| toMethodDoc | method | getParameters | `method.getParameters()` |
| toMethodDoc | method.getParameters() | stream | `method.getParameters().stream()` |
| toMethodDoc | method.getParameters().stream() | map | `method.getParameters().stream().map(parameter -> new ParameterDoc(parameter.getTypeAsString(), parameter.getNameAsString()))` |
| toMethodDoc | method.getParameters().stream().map(parameter -> new ParameterDoc(parameter.getTypeAsString(), parameter.getNameAsString())) | toList | `method.getParameters().stream().map(parameter -> new ParameterDoc(parameter.getTypeAsString(), parameter.getNameAsString())).toList()` |
| toMethodDoc | method | getTypeAsString | `method.getTypeAsString()` |
| toMethodDoc | parameter | getNameAsString | `parameter.getNameAsString()` |
| toMethodDoc | parameter | getTypeAsString | `parameter.getTypeAsString()` |

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
| [MethodDoc](MethodDoc.md) | METHOD_RETURN_TYPE | toMethodDoc |
| [ProjectSource](ProjectSource.md) | METHOD_PARAMETER | source |
| [RelationType](RelationType.md) | METHOD_PARAMETER | relationType |

### Incoming References

| Source | Relation | Member |
| --- | --- | --- |
| [SpringBootAnalyzer](SpringBootAnalyzer.md) | FIELD | javaAnalyzer |
