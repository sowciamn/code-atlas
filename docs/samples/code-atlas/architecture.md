# Architecture

## Application

None

## Controller

None

## Service

None

## Repository

None

## Entity

None

## Configuration

None

## Component

None

## DTO

None

## Unknown

* [AnalysisEngine](classes/AnalysisEngine.md)
* [AnalysisEngineTest](classes/AnalysisEngineTest.md)
* [AnalysisResult](classes/AnalysisResult.md)
* [ApiEndpointDoc](classes/ApiEndpointDoc.md)
* [ClassDoc](classes/ClassDoc.md)
* [ClassRelationDoc](classes/ClassRelationDoc.md)
* [CodeAnalyzerPlugin](classes/CodeAnalyzerPlugin.md)
* [CodeAtlasCli](classes/CodeAtlasCli.md)
* [CodeAtlasCliTest](classes/CodeAtlasCliTest.md)
* [ComponentType](classes/ComponentType.md)
* [ConfigDoc](classes/ConfigDoc.md)
* [DocumentationRenderer](classes/DocumentationRenderer.md)
* [FieldDoc](classes/FieldDoc.md)
* [JavaAnalyzer](classes/JavaAnalyzer.md)
* [JavaAnalyzerTest](classes/JavaAnalyzerTest.md)
* [MapperStatementRelationDoc](classes/MapperStatementRelationDoc.md)
* [MarkdownRenderer](classes/MarkdownRenderer.md)
* [MarkdownRendererTest](classes/MarkdownRendererTest.md)
* [MethodCallCategory](classes/MethodCallCategory.md)
* [MethodCallDoc](classes/MethodCallDoc.md)
* [MethodCallRelationDoc](classes/MethodCallRelationDoc.md)
* [MethodDoc](classes/MethodDoc.md)
* [MyBatisAnalyzer](classes/MyBatisAnalyzer.md)
* [MyBatisAnalyzerTest](classes/MyBatisAnalyzerTest.md)
* [MyBatisMapperDoc](classes/MyBatisMapperDoc.md)
* [MyBatisMapperXmlParser](classes/MyBatisMapperXmlParser.md)
* [MyBatisMapperXmlParserTest](classes/MyBatisMapperXmlParserTest.md)
* [ParameterDoc](classes/ParameterDoc.md)
* [ProjectOverview](classes/ProjectOverview.md)
* [ProjectSource](classes/ProjectSource.md)
* [RelationType](classes/RelationType.md)
* [RoleResolver](classes/RoleResolver.md)
* [RoleResolverTest](classes/RoleResolverTest.md)
* [SourceScanner](classes/SourceScanner.md)
* [SourceScannerTest](classes/SourceScannerTest.md)
* [SpringBootAnalyzer](classes/SpringBootAnalyzer.md)
* [SpringBootAnalyzerTest](classes/SpringBootAnalyzerTest.md)
* [SqlStatementDoc](classes/SqlStatementDoc.md)
* [SqlStatementType](classes/SqlStatementType.md)
* [TableUsageDoc](classes/TableUsageDoc.md)
* [VariableScope](classes/VariableScope.md)
* [VariableTypeDoc](classes/VariableTypeDoc.md)

## Dependency Overview

| Source | Target | Relation | Member |
| --- | --- | --- | --- |
| [AnalysisEngine](classes/AnalysisEngine.md) | [AnalysisResult](classes/AnalysisResult.md) | METHOD_RETURN_TYPE | analyze |
| [AnalysisEngine](classes/AnalysisEngine.md) | [AnalysisResult](classes/AnalysisResult.md) | METHOD_RETURN_TYPE | emptyResult |
| [AnalysisEngine](classes/AnalysisEngine.md) | [CodeAnalyzerPlugin](classes/CodeAnalyzerPlugin.md) | CONSTRUCTOR_PARAMETER | plugins |
| [AnalysisEngine](classes/AnalysisEngine.md) | [CodeAnalyzerPlugin](classes/CodeAnalyzerPlugin.md) | FIELD | plugins |
| [AnalysisEngine](classes/AnalysisEngine.md) | [ProjectSource](classes/ProjectSource.md) | METHOD_PARAMETER | source |
| [AnalysisEngineTest](classes/AnalysisEngineTest.md) | [CodeAnalyzerPlugin](classes/CodeAnalyzerPlugin.md) | METHOD_RETURN_TYPE | plugin |
| [ClassDoc](classes/ClassDoc.md) | [ClassDoc](classes/ClassDoc.md) | METHOD_RETURN_TYPE | withComponentType |
| [ClassDoc](classes/ClassDoc.md) | [ClassDoc](classes/ClassDoc.md) | METHOD_RETURN_TYPE | withRoleSummary |
| [ClassDoc](classes/ClassDoc.md) | [ComponentType](classes/ComponentType.md) | METHOD_PARAMETER | type |
| [CodeAnalyzerPlugin](classes/CodeAnalyzerPlugin.md) | [AnalysisResult](classes/AnalysisResult.md) | METHOD_PARAMETER | currentResult |
| [CodeAnalyzerPlugin](classes/CodeAnalyzerPlugin.md) | [AnalysisResult](classes/AnalysisResult.md) | METHOD_RETURN_TYPE | analyze |
| [CodeAnalyzerPlugin](classes/CodeAnalyzerPlugin.md) | [ProjectSource](classes/ProjectSource.md) | METHOD_PARAMETER | source |
| [DocumentationRenderer](classes/DocumentationRenderer.md) | [AnalysisResult](classes/AnalysisResult.md) | METHOD_PARAMETER | result |
| [JavaAnalyzer](classes/JavaAnalyzer.md) | [AnalysisResult](classes/AnalysisResult.md) | METHOD_RETURN_TYPE | analyze |
| [JavaAnalyzer](classes/JavaAnalyzer.md) | [ClassDoc](classes/ClassDoc.md) | METHOD_PARAMETER | classes |
| [JavaAnalyzer](classes/JavaAnalyzer.md) | [ClassDoc](classes/ClassDoc.md) | METHOD_RETURN_TYPE | analyzeClasses |
| [JavaAnalyzer](classes/JavaAnalyzer.md) | [ClassDoc](classes/ClassDoc.md) | METHOD_RETURN_TYPE | toClassDoc |
| [JavaAnalyzer](classes/JavaAnalyzer.md) | [ClassRelationDoc](classes/ClassRelationDoc.md) | METHOD_PARAMETER | relations |
| [JavaAnalyzer](classes/JavaAnalyzer.md) | [ClassRelationDoc](classes/ClassRelationDoc.md) | METHOD_RETURN_TYPE | analyzeRelations |
| [JavaAnalyzer](classes/JavaAnalyzer.md) | [MethodCallDoc](classes/MethodCallDoc.md) | METHOD_RETURN_TYPE | analyzeMethodCalls |
| [JavaAnalyzer](classes/JavaAnalyzer.md) | [MethodCallDoc](classes/MethodCallDoc.md) | METHOD_RETURN_TYPE | toMethodCallDoc |
| [JavaAnalyzer](classes/JavaAnalyzer.md) | [MethodDoc](classes/MethodDoc.md) | METHOD_RETURN_TYPE | toMethodDoc |
| [JavaAnalyzer](classes/JavaAnalyzer.md) | [ProjectSource](classes/ProjectSource.md) | METHOD_PARAMETER | source |
| [JavaAnalyzer](classes/JavaAnalyzer.md) | [RelationType](classes/RelationType.md) | METHOD_PARAMETER | relationType |
| [JavaAnalyzer](classes/JavaAnalyzer.md) | [VariableScope](classes/VariableScope.md) | METHOD_PARAMETER | scope |
| [JavaAnalyzer](classes/JavaAnalyzer.md) | [VariableTypeDoc](classes/VariableTypeDoc.md) | METHOD_PARAMETER | variableTypes |
| [JavaAnalyzer](classes/JavaAnalyzer.md) | [VariableTypeDoc](classes/VariableTypeDoc.md) | METHOD_RETURN_TYPE | analyzeVariableTypes |
| [JavaAnalyzer](classes/JavaAnalyzer.md) | [VariableTypeDoc](classes/VariableTypeDoc.md) | METHOD_RETURN_TYPE | variableType |
| [JavaAnalyzerTest](classes/JavaAnalyzerTest.md) | [AnalysisResult](classes/AnalysisResult.md) | METHOD_RETURN_TYPE | analyze |
| [MarkdownRenderer](classes/MarkdownRenderer.md) | [AnalysisResult](classes/AnalysisResult.md) | METHOD_PARAMETER | result |
| [MarkdownRenderer](classes/MarkdownRenderer.md) | [ClassDoc](classes/ClassDoc.md) | METHOD_PARAMETER | classDoc |
| [MarkdownRenderer](classes/MarkdownRenderer.md) | [ClassDoc](classes/ClassDoc.md) | METHOD_PARAMETER | classes |
| [MarkdownRenderer](classes/MarkdownRenderer.md) | [ClassRelationDoc](classes/ClassRelationDoc.md) | FIELD | RELATION_ORDER |
| [MarkdownRenderer](classes/MarkdownRenderer.md) | [ClassRelationDoc](classes/ClassRelationDoc.md) | METHOD_PARAMETER | relations |
| [MarkdownRenderer](classes/MarkdownRenderer.md) | [ClassRelationDoc](classes/ClassRelationDoc.md) | METHOD_RETURN_TYPE | sortedRelations |
| [MarkdownRenderer](classes/MarkdownRenderer.md) | [ComponentType](classes/ComponentType.md) | METHOD_PARAMETER | type |
| [MarkdownRenderer](classes/MarkdownRenderer.md) | [ComponentType](classes/ComponentType.md) | METHOD_RETURN_TYPE | componentType |
| [MarkdownRenderer](classes/MarkdownRenderer.md) | [ConfigDoc](classes/ConfigDoc.md) | METHOD_PARAMETER | configs |
| [MarkdownRenderer](classes/MarkdownRenderer.md) | [MapperStatementRelationDoc](classes/MapperStatementRelationDoc.md) | METHOD_PARAMETER | relations |
| [MarkdownRenderer](classes/MarkdownRenderer.md) | [MethodCallDoc](classes/MethodCallDoc.md) | METHOD_PARAMETER | methodCalls |
| [MarkdownRenderer](classes/MarkdownRenderer.md) | [MethodCallRelationDoc](classes/MethodCallRelationDoc.md) | METHOD_PARAMETER | relations |
| [MarkdownRenderer](classes/MarkdownRenderer.md) | [MethodCallRelationDoc](classes/MethodCallRelationDoc.md) | METHOD_RETURN_TYPE | sortedMethodCallRelations |
| [MarkdownRenderer](classes/MarkdownRenderer.md) | [MethodDoc](classes/MethodDoc.md) | METHOD_PARAMETER | method |
| [MarkdownRenderer](classes/MarkdownRenderer.md) | [ProjectOverview](classes/ProjectOverview.md) | METHOD_PARAMETER | overview |
| [MarkdownRenderer](classes/MarkdownRenderer.md) | [SqlStatementDoc](classes/SqlStatementDoc.md) | METHOD_PARAMETER | statements |
| [MarkdownRenderer](classes/MarkdownRenderer.md) | [SqlStatementDoc](classes/SqlStatementDoc.md) | METHOD_RETURN_TYPE | matchingMyBatisStatements |
| [MarkdownRenderer](classes/MarkdownRenderer.md) | [TableUsageDoc](classes/TableUsageDoc.md) | METHOD_PARAMETER | usages |
| [MyBatisAnalyzer](classes/MyBatisAnalyzer.md) | [AnalysisResult](classes/AnalysisResult.md) | METHOD_PARAMETER | currentResult |
| [MyBatisAnalyzer](classes/MyBatisAnalyzer.md) | [AnalysisResult](classes/AnalysisResult.md) | METHOD_RETURN_TYPE | analyze |
| [MyBatisAnalyzer](classes/MyBatisAnalyzer.md) | [ClassDoc](classes/ClassDoc.md) | METHOD_PARAMETER | classDoc |
| [MyBatisAnalyzer](classes/MyBatisAnalyzer.md) | [ClassDoc](classes/ClassDoc.md) | METHOD_PARAMETER | classes |
| [MyBatisAnalyzer](classes/MyBatisAnalyzer.md) | [ClassDoc](classes/ClassDoc.md) | METHOD_RETURN_TYPE | applyMapperRole |
| [MyBatisAnalyzer](classes/MyBatisAnalyzer.md) | [MapperStatementRelationDoc](classes/MapperStatementRelationDoc.md) | METHOD_RETURN_TYPE | mapperStatementRelations |
| [MyBatisAnalyzer](classes/MyBatisAnalyzer.md) | [MyBatisMapperXmlParser](classes/MyBatisMapperXmlParser.md) | FIELD | parser |
| [MyBatisAnalyzer](classes/MyBatisAnalyzer.md) | [ProjectSource](classes/ProjectSource.md) | METHOD_PARAMETER | source |
| [MyBatisAnalyzer](classes/MyBatisAnalyzer.md) | [SqlStatementDoc](classes/SqlStatementDoc.md) | METHOD_PARAMETER | statements |
| [MyBatisAnalyzer](classes/MyBatisAnalyzer.md) | [SqlStatementDoc](classes/SqlStatementDoc.md) | METHOD_RETURN_TYPE | parseStatements |
| [MyBatisMapperXmlParser](classes/MyBatisMapperXmlParser.md) | [MyBatisMapperDoc](classes/MyBatisMapperDoc.md) | METHOD_RETURN_TYPE | parse |
| [MyBatisMapperXmlParser](classes/MyBatisMapperXmlParser.md) | [SqlStatementDoc](classes/SqlStatementDoc.md) | METHOD_RETURN_TYPE | statements |
| [MyBatisMapperXmlParser](classes/MyBatisMapperXmlParser.md) | [SqlStatementType](classes/SqlStatementType.md) | METHOD_RETURN_TYPE | statementType |
| [RoleResolverTest](classes/RoleResolverTest.md) | [RoleResolver](classes/RoleResolver.md) | FIELD | resolver |
| [SourceScanner](classes/SourceScanner.md) | [ProjectSource](classes/ProjectSource.md) | METHOD_RETURN_TYPE | scan |
| [SpringBootAnalyzer](classes/SpringBootAnalyzer.md) | [AnalysisResult](classes/AnalysisResult.md) | METHOD_PARAMETER | base |
| [SpringBootAnalyzer](classes/SpringBootAnalyzer.md) | [AnalysisResult](classes/AnalysisResult.md) | METHOD_PARAMETER | currentResult |
| [SpringBootAnalyzer](classes/SpringBootAnalyzer.md) | [AnalysisResult](classes/AnalysisResult.md) | METHOD_RETURN_TYPE | analyze |
| [SpringBootAnalyzer](classes/SpringBootAnalyzer.md) | [AnalysisResult](classes/AnalysisResult.md) | METHOD_RETURN_TYPE | enrich |
| [SpringBootAnalyzer](classes/SpringBootAnalyzer.md) | [ApiEndpointDoc](classes/ApiEndpointDoc.md) | METHOD_RETURN_TYPE | endpoint |
| [SpringBootAnalyzer](classes/SpringBootAnalyzer.md) | [ApiEndpointDoc](classes/ApiEndpointDoc.md) | METHOD_RETURN_TYPE | extractEndpoints |
| [SpringBootAnalyzer](classes/SpringBootAnalyzer.md) | [ApiEndpointDoc](classes/ApiEndpointDoc.md) | METHOD_RETURN_TYPE | toEndpoints |
| [SpringBootAnalyzer](classes/SpringBootAnalyzer.md) | [ClassDoc](classes/ClassDoc.md) | METHOD_PARAMETER | classDoc |
| [SpringBootAnalyzer](classes/SpringBootAnalyzer.md) | [ClassDoc](classes/ClassDoc.md) | METHOD_PARAMETER | classes |
| [SpringBootAnalyzer](classes/SpringBootAnalyzer.md) | [ComponentType](classes/ComponentType.md) | FIELD | COMPONENT_ANNOTATIONS |
| [SpringBootAnalyzer](classes/SpringBootAnalyzer.md) | [ComponentType](classes/ComponentType.md) | METHOD_PARAMETER | type |
| [SpringBootAnalyzer](classes/SpringBootAnalyzer.md) | [ComponentType](classes/ComponentType.md) | METHOD_RETURN_TYPE | componentType |
| [SpringBootAnalyzer](classes/SpringBootAnalyzer.md) | [JavaAnalyzer](classes/JavaAnalyzer.md) | FIELD | javaAnalyzer |
| [SpringBootAnalyzer](classes/SpringBootAnalyzer.md) | [ProjectSource](classes/ProjectSource.md) | METHOD_PARAMETER | source |

## Method Call Overview

| Source | Target | Expression |
| --- | --- | --- |
| [AnalysisEngine](classes/AnalysisEngine.md).analyze | [AnalysisEngine](classes/AnalysisEngine.md).emptyResult | `emptyResult(source)` |
| [AnalysisEngine](classes/AnalysisEngine.md).analyze | [CodeAnalyzerPlugin](classes/CodeAnalyzerPlugin.md).analyze | `plugin.analyze(source, result)` |
| [AnalysisEngine](classes/AnalysisEngine.md).analyze | [CodeAnalyzerPlugin](classes/CodeAnalyzerPlugin.md).supports | `plugin.supports(source)` |
| [AnalysisEngine](classes/AnalysisEngine.md).analyze | [ProjectSource](classes/ProjectSource.md).rootDirectory | `source.rootDirectory()` |
| [AnalysisEngine](classes/AnalysisEngine.md).emptyResult | [ProjectSource](classes/ProjectSource.md).rootDirectory | `source.rootDirectory()` |
| [AnalysisEngine](classes/AnalysisEngine.md).emptyResult | [ProjectSource](classes/ProjectSource.md).rootDirectory | `source.rootDirectory()` |
| [AnalysisEngineTest](classes/AnalysisEngineTest.md).appliesAllSupportedPluginsInRegistrationOrder | [AnalysisEngineTest](classes/AnalysisEngineTest.md).plugin | `plugin("first", applied, "first.yml")` |
| [AnalysisEngineTest](classes/AnalysisEngineTest.md).appliesAllSupportedPluginsInRegistrationOrder | [AnalysisEngineTest](classes/AnalysisEngineTest.md).plugin | `plugin("second", applied, "second.yml")` |
| [AnalysisEngineTest](classes/AnalysisEngineTest.md).appliesAllSupportedPluginsInRegistrationOrder | [AnalysisResult](classes/AnalysisResult.md).configs | `result.configs()` |
| [CodeAnalyzerPlugin](classes/CodeAnalyzerPlugin.md).analyze | [CodeAnalyzerPlugin](classes/CodeAnalyzerPlugin.md).analyze | `analyze(source)` |
| [CodeAtlasCliTest](classes/CodeAtlasCliTest.md).acceptsCommaSeparatedExcludeOptions | [CodeAtlasCliTest](classes/CodeAtlasCliTest.md).assertGeneratedClasses | `assertGeneratedClasses(output)` |
| [CodeAtlasCliTest](classes/CodeAtlasCliTest.md).acceptsCommaSeparatedExcludeOptions | [CodeAtlasCliTest](classes/CodeAtlasCliTest.md).createSourceTree | `createSourceTree()` |
| [CodeAtlasCliTest](classes/CodeAtlasCliTest.md).acceptsRepeatedExcludeOptions | [CodeAtlasCliTest](classes/CodeAtlasCliTest.md).assertGeneratedClasses | `assertGeneratedClasses(output)` |
| [CodeAtlasCliTest](classes/CodeAtlasCliTest.md).acceptsRepeatedExcludeOptions | [CodeAtlasCliTest](classes/CodeAtlasCliTest.md).createSourceTree | `createSourceTree()` |
| [CodeAtlasCliTest](classes/CodeAtlasCliTest.md).createSourceTree | [CodeAtlasCliTest](classes/CodeAtlasCliTest.md).write | `write(source, "examples/Demo.java", "class Demo {}")` |
| [CodeAtlasCliTest](classes/CodeAtlasCliTest.md).createSourceTree | [CodeAtlasCliTest](classes/CodeAtlasCliTest.md).write | `write(source, "fixtures/Fixture.java", "class Fixture {}")` |
| [CodeAtlasCliTest](classes/CodeAtlasCliTest.md).createSourceTree | [CodeAtlasCliTest](classes/CodeAtlasCliTest.md).write | `write(source, "src/main/java/example/App.java", "package example; class App {}")` |
| [JavaAnalyzer](classes/JavaAnalyzer.md).analyze | [JavaAnalyzer](classes/JavaAnalyzer.md).analyzeClasses | `analyzeClasses(source)` |
| [JavaAnalyzer](classes/JavaAnalyzer.md).analyze | [JavaAnalyzer](classes/JavaAnalyzer.md).analyzeMethodCalls | `analyzeMethodCalls(source, classes, variableTypes)` |
| [JavaAnalyzer](classes/JavaAnalyzer.md).analyze | [JavaAnalyzer](classes/JavaAnalyzer.md).analyzeRelations | `analyzeRelations(source, classes)` |
| [JavaAnalyzer](classes/JavaAnalyzer.md).analyze | [JavaAnalyzer](classes/JavaAnalyzer.md).analyzeVariableTypes | `analyzeVariableTypes(source)` |
| [JavaAnalyzer](classes/JavaAnalyzer.md).analyze | [ProjectSource](classes/ProjectSource.md).configFiles | `source.configFiles()` |
| [JavaAnalyzer](classes/JavaAnalyzer.md).analyze | [ProjectSource](classes/ProjectSource.md).relativePath | `source.relativePath(path)` |
| [JavaAnalyzer](classes/JavaAnalyzer.md).analyze | [ProjectSource](classes/ProjectSource.md).rootDirectory | `source.rootDirectory()` |
| [JavaAnalyzer](classes/JavaAnalyzer.md).analyze | [ProjectSource](classes/ProjectSource.md).rootDirectory | `source.rootDirectory()` |
| [JavaAnalyzer](classes/JavaAnalyzer.md).analyzeClasses | [JavaAnalyzer](classes/JavaAnalyzer.md).parse | `parse(javaFile)` |
| [JavaAnalyzer](classes/JavaAnalyzer.md).analyzeClasses | [JavaAnalyzer](classes/JavaAnalyzer.md).toClassDoc | `toClassDoc(unit, type, source.relativePath(javaFile))` |
| [JavaAnalyzer](classes/JavaAnalyzer.md).analyzeClasses | [ProjectSource](classes/ProjectSource.md).javaFiles | `source.javaFiles()` |
| [JavaAnalyzer](classes/JavaAnalyzer.md).analyzeClasses | [ProjectSource](classes/ProjectSource.md).relativePath | `source.relativePath(javaFile)` |
| [JavaAnalyzer](classes/JavaAnalyzer.md).analyzeMethodCalls | [JavaAnalyzer](classes/JavaAnalyzer.md).analyzeClasses | `analyzeClasses(source)` |
| [JavaAnalyzer](classes/JavaAnalyzer.md).analyzeMethodCalls | [JavaAnalyzer](classes/JavaAnalyzer.md).analyzeMethodCalls | `analyzeMethodCalls(source, classes, analyzeVariableTypes(source))` |
| [JavaAnalyzer](classes/JavaAnalyzer.md).analyzeMethodCalls | [JavaAnalyzer](classes/JavaAnalyzer.md).analyzeVariableTypes | `analyzeVariableTypes(source)` |
| [JavaAnalyzer](classes/JavaAnalyzer.md).analyzeMethodCalls | [JavaAnalyzer](classes/JavaAnalyzer.md).parse | `parse(javaFile)` |
| [JavaAnalyzer](classes/JavaAnalyzer.md).analyzeMethodCalls | [JavaAnalyzer](classes/JavaAnalyzer.md).toMethodCallDoc | `toMethodCallDoc(className, method.getNameAsString(), call, sourcePath, variableTypes, projectClassNames, ownMethodNames)` |
| [JavaAnalyzer](classes/JavaAnalyzer.md).analyzeMethodCalls | [ProjectSource](classes/ProjectSource.md).javaFiles | `source.javaFiles()` |
| [JavaAnalyzer](classes/JavaAnalyzer.md).analyzeMethodCalls | [ProjectSource](classes/ProjectSource.md).relativePath | `source.relativePath(javaFile)` |
| [JavaAnalyzer](classes/JavaAnalyzer.md).analyzeRelations | [JavaAnalyzer](classes/JavaAnalyzer.md).extractRelations | `extractRelations(type, projectClassNames, relations)` |
| [JavaAnalyzer](classes/JavaAnalyzer.md).analyzeRelations | [JavaAnalyzer](classes/JavaAnalyzer.md).parse | `parse(javaFile)` |
| [JavaAnalyzer](classes/JavaAnalyzer.md).analyzeRelations | [ProjectSource](classes/ProjectSource.md).javaFiles | `source.javaFiles()` |
| [JavaAnalyzer](classes/JavaAnalyzer.md).analyzeVariableTypes | [JavaAnalyzer](classes/JavaAnalyzer.md).parse | `parse(javaFile)` |
| [JavaAnalyzer](classes/JavaAnalyzer.md).analyzeVariableTypes | [JavaAnalyzer](classes/JavaAnalyzer.md).variableType | `variableType(className, "", variable, VariableScope.FIELD, sourcePath)` |
| [JavaAnalyzer](classes/JavaAnalyzer.md).analyzeVariableTypes | [JavaAnalyzer](classes/JavaAnalyzer.md).variableType | `variableType(className, method.getNameAsString(), variable, VariableScope.LOCAL_VARIABLE, sourcePath)` |
| [JavaAnalyzer](classes/JavaAnalyzer.md).analyzeVariableTypes | [ProjectSource](classes/ProjectSource.md).javaFiles | `source.javaFiles()` |
| [JavaAnalyzer](classes/JavaAnalyzer.md).analyzeVariableTypes | [ProjectSource](classes/ProjectSource.md).relativePath | `source.relativePath(javaFile)` |
| [JavaAnalyzer](classes/JavaAnalyzer.md).extractRelations | [JavaAnalyzer](classes/JavaAnalyzer.md).addRelations | `addRelations(relations, projectClassNames, sourceClassName, method.getType(), RelationType.METHOD_RETURN_TYPE, method.getNameAsString())` |
| [JavaAnalyzer](classes/JavaAnalyzer.md).extractRelations | [JavaAnalyzer](classes/JavaAnalyzer.md).addRelations | `addRelations(relations, projectClassNames, sourceClassName, parameter.getType(), RelationType.CONSTRUCTOR_PARAMETER, parameter.getNameAsString())` |
| [JavaAnalyzer](classes/JavaAnalyzer.md).extractRelations | [JavaAnalyzer](classes/JavaAnalyzer.md).addRelations | `addRelations(relations, projectClassNames, sourceClassName, parameter.getType(), RelationType.METHOD_PARAMETER, parameter.getNameAsString())` |
| [JavaAnalyzer](classes/JavaAnalyzer.md).extractRelations | [JavaAnalyzer](classes/JavaAnalyzer.md).addRelations | `addRelations(relations, projectClassNames, sourceClassName, variable.getType(), RelationType.FIELD, variable.getNameAsString())` |
| [JavaAnalyzer](classes/JavaAnalyzer.md).resolveTargetClassName | [JavaAnalyzer](classes/JavaAnalyzer.md).isMethodVariable | `isMethodVariable(scope)` |
| [JavaAnalyzer](classes/JavaAnalyzer.md).resolveTargetClassName | [JavaAnalyzer](classes/JavaAnalyzer.md).projectTypeName | `projectTypeName(variable.typeName(), projectClassNames)` |
| [JavaAnalyzer](classes/JavaAnalyzer.md).resolveTargetClassName | [VariableTypeDoc](classes/VariableTypeDoc.md).className | `variable.className()` |
| [JavaAnalyzer](classes/JavaAnalyzer.md).resolveTargetClassName | [VariableTypeDoc](classes/VariableTypeDoc.md).methodName | `variable.methodName()` |
| [JavaAnalyzer](classes/JavaAnalyzer.md).resolveTargetClassName | [VariableTypeDoc](classes/VariableTypeDoc.md).typeName | `variable.typeName()` |
| [JavaAnalyzer](classes/JavaAnalyzer.md).resolveTargetClassName | [VariableTypeDoc](classes/VariableTypeDoc.md).variableName | `variable.variableName()` |
| [JavaAnalyzer](classes/JavaAnalyzer.md).resolveTargetClassName | [VariableTypeDoc](classes/VariableTypeDoc.md).variableScope | `variable.variableScope()` |
| [JavaAnalyzer](classes/JavaAnalyzer.md).supports | [ProjectSource](classes/ProjectSource.md).javaFiles | `source.javaFiles()` |
| [JavaAnalyzer](classes/JavaAnalyzer.md).toClassDoc | [JavaAnalyzer](classes/JavaAnalyzer.md).annotationNames | `annotationNames(field.getAnnotations())` |
| [JavaAnalyzer](classes/JavaAnalyzer.md).toClassDoc | [JavaAnalyzer](classes/JavaAnalyzer.md).annotationNames | `annotationNames(type.getAnnotations())` |
| [JavaAnalyzer](classes/JavaAnalyzer.md).toClassDoc | [JavaAnalyzer](classes/JavaAnalyzer.md).declarationKind | `declarationKind(type)` |
| [JavaAnalyzer](classes/JavaAnalyzer.md).toMethodCallDoc | [JavaAnalyzer](classes/JavaAnalyzer.md).resolveTargetClassName | `resolveTargetClassName(className, methodName, lookupName, call.getScope().isEmpty(), call.getNameAsString(), variableTypes, projectClassNames, ownMethodNames)` |
| [JavaAnalyzer](classes/JavaAnalyzer.md).toMethodDoc | [JavaAnalyzer](classes/JavaAnalyzer.md).annotationNames | `annotationNames(method.getAnnotations())` |
| [JavaAnalyzerTest](classes/JavaAnalyzerTest.md).classifiesUtilityCallsAndKeepsOnlyResolvedProjectCallsAsProject | [AnalysisResult](classes/AnalysisResult.md).methodCallRelations | `result.methodCallRelations()` |
| [JavaAnalyzerTest](classes/JavaAnalyzerTest.md).classifiesUtilityCallsAndKeepsOnlyResolvedProjectCallsAsProject | [AnalysisResult](classes/AnalysisResult.md).methodCalls | `result.methodCalls()` |
| [JavaAnalyzerTest](classes/JavaAnalyzerTest.md).classifiesUtilityCallsAndKeepsOnlyResolvedProjectCallsAsProject | [AnalysisResult](classes/AnalysisResult.md).methodCalls | `result.methodCalls()` |
| [JavaAnalyzerTest](classes/JavaAnalyzerTest.md).classifiesUtilityCallsAndKeepsOnlyResolvedProjectCallsAsProject | [AnalysisResult](classes/AnalysisResult.md).methodCalls | `result.methodCalls()` |
| [JavaAnalyzerTest](classes/JavaAnalyzerTest.md).classifiesUtilityCallsAndKeepsOnlyResolvedProjectCallsAsProject | [JavaAnalyzerTest](classes/JavaAnalyzerTest.md).analyze | `analyze()` |
| [JavaAnalyzerTest](classes/JavaAnalyzerTest.md).classifiesUtilityCallsAndKeepsOnlyResolvedProjectCallsAsProject | [JavaAnalyzerTest](classes/JavaAnalyzerTest.md).write | `write("CallExample.java", """     import java.util.List;     class CallExample {         private ProjectService projectService;              void run(List<ProjectService> values) {             projectService.execute();             values.stream().map(String::trim).filter(String::isEmpty).toList();         }     }     """)` |
| [JavaAnalyzerTest](classes/JavaAnalyzerTest.md).classifiesUtilityCallsAndKeepsOnlyResolvedProjectCallsAsProject | [JavaAnalyzerTest](classes/JavaAnalyzerTest.md).write | `write("ProjectService.java", "class ProjectService { void execute() {} }")` |
| [JavaAnalyzerTest](classes/JavaAnalyzerTest.md).extractsClassPackageMethodsAnnotationsAndFields | [ClassDoc](classes/ClassDoc.md).annotations | `result.annotations()` |
| [JavaAnalyzerTest](classes/JavaAnalyzerTest.md).extractsClassPackageMethodsAnnotationsAndFields | [ClassDoc](classes/ClassDoc.md).className | `result.className()` |
| [JavaAnalyzerTest](classes/JavaAnalyzerTest.md).extractsClassPackageMethodsAnnotationsAndFields | [ClassDoc](classes/ClassDoc.md).fields | `result.fields()` |
| [JavaAnalyzerTest](classes/JavaAnalyzerTest.md).extractsClassPackageMethodsAnnotationsAndFields | [ClassDoc](classes/ClassDoc.md).methods | `result.methods()` |
| [JavaAnalyzerTest](classes/JavaAnalyzerTest.md).extractsClassPackageMethodsAnnotationsAndFields | [ClassDoc](classes/ClassDoc.md).packageName | `result.packageName()` |
| [JavaAnalyzerTest](classes/JavaAnalyzerTest.md).extractsRelationFromConstructorParameter | [AnalysisResult](classes/AnalysisResult.md).relations | `result.relations()` |
| [JavaAnalyzerTest](classes/JavaAnalyzerTest.md).extractsRelationFromConstructorParameter | [JavaAnalyzerTest](classes/JavaAnalyzerTest.md).analyze | `analyze()` |
| [JavaAnalyzerTest](classes/JavaAnalyzerTest.md).extractsRelationFromConstructorParameter | [JavaAnalyzerTest](classes/JavaAnalyzerTest.md).write | `write("SourceController.java", """     class SourceController {         SourceController(TargetService targetService) {}     }     """)` |
| [JavaAnalyzerTest](classes/JavaAnalyzerTest.md).extractsRelationFromConstructorParameter | [JavaAnalyzerTest](classes/JavaAnalyzerTest.md).write | `write("TargetService.java", "class TargetService {}")` |
| [JavaAnalyzerTest](classes/JavaAnalyzerTest.md).extractsRelationFromFieldType | [AnalysisResult](classes/AnalysisResult.md).relations | `result.relations()` |
| [JavaAnalyzerTest](classes/JavaAnalyzerTest.md).extractsRelationFromFieldType | [JavaAnalyzerTest](classes/JavaAnalyzerTest.md).analyze | `analyze()` |
| [JavaAnalyzerTest](classes/JavaAnalyzerTest.md).extractsRelationFromFieldType | [JavaAnalyzerTest](classes/JavaAnalyzerTest.md).write | `write("SourceController.java", """     class SourceController {         private TargetService targetService;     }     """)` |
| [JavaAnalyzerTest](classes/JavaAnalyzerTest.md).extractsRelationFromFieldType | [JavaAnalyzerTest](classes/JavaAnalyzerTest.md).write | `write("TargetService.java", "class TargetService {}")` |
| [JavaAnalyzerTest](classes/JavaAnalyzerTest.md).extractsRelationFromGenericMethodReturnTypeAndIgnoresExternalTypes | [AnalysisResult](classes/AnalysisResult.md).relations | `result.relations()` |
| [JavaAnalyzerTest](classes/JavaAnalyzerTest.md).extractsRelationFromGenericMethodReturnTypeAndIgnoresExternalTypes | [JavaAnalyzerTest](classes/JavaAnalyzerTest.md).analyze | `analyze()` |
| [JavaAnalyzerTest](classes/JavaAnalyzerTest.md).extractsRelationFromGenericMethodReturnTypeAndIgnoresExternalTypes | [JavaAnalyzerTest](classes/JavaAnalyzerTest.md).write | `write("SourceService.java", """     import java.util.List;     class SourceService {         List<TargetDto> findAll() { return List.of(); }     }     """)` |
| [JavaAnalyzerTest](classes/JavaAnalyzerTest.md).extractsRelationFromGenericMethodReturnTypeAndIgnoresExternalTypes | [JavaAnalyzerTest](classes/JavaAnalyzerTest.md).write | `write("TargetDto.java", "class TargetDto {}")` |
| [JavaAnalyzerTest](classes/JavaAnalyzerTest.md).extractsRelationFromMethodParameter | [AnalysisResult](classes/AnalysisResult.md).relations | `result.relations()` |
| [JavaAnalyzerTest](classes/JavaAnalyzerTest.md).extractsRelationFromMethodParameter | [JavaAnalyzerTest](classes/JavaAnalyzerTest.md).analyze | `analyze()` |
| [JavaAnalyzerTest](classes/JavaAnalyzerTest.md).extractsRelationFromMethodParameter | [JavaAnalyzerTest](classes/JavaAnalyzerTest.md).write | `write("SourceService.java", """     class SourceService {         void save(TargetDto request) {}     }     """)` |
| [JavaAnalyzerTest](classes/JavaAnalyzerTest.md).extractsRelationFromMethodParameter | [JavaAnalyzerTest](classes/JavaAnalyzerTest.md).write | `write("TargetDto.java", "class TargetDto {}")` |
| [JavaAnalyzerTest](classes/JavaAnalyzerTest.md).extractsScopedUnscopedThisAndMultipleMethodCalls | [AnalysisResult](classes/AnalysisResult.md).methodCalls | `result.methodCalls()` |
| [JavaAnalyzerTest](classes/JavaAnalyzerTest.md).extractsScopedUnscopedThisAndMultipleMethodCalls | [AnalysisResult](classes/AnalysisResult.md).methodCalls | `result.methodCalls()` |
| [JavaAnalyzerTest](classes/JavaAnalyzerTest.md).extractsScopedUnscopedThisAndMultipleMethodCalls | [JavaAnalyzerTest](classes/JavaAnalyzerTest.md).analyze | `analyze()` |
| [JavaAnalyzerTest](classes/JavaAnalyzerTest.md).extractsScopedUnscopedThisAndMultipleMethodCalls | [JavaAnalyzerTest](classes/JavaAnalyzerTest.md).write | `write("UserController.java", """     class UserController {         private UserService userService;              void findAll() {             userService.findAll();             helper();         }              void findOne() {             this.helper();         }              void helper() {}     }     """)` |
| [JavaAnalyzerTest](classes/JavaAnalyzerTest.md).extractsScopedUnscopedThisAndMultipleMethodCalls | [JavaAnalyzerTest](classes/JavaAnalyzerTest.md).write | `write("UserService.java", "class UserService { void findAll() {} }")` |
| [JavaAnalyzerTest](classes/JavaAnalyzerTest.md).extractsVariableTypesAndResolvesScopesByPriority | [AnalysisResult](classes/AnalysisResult.md).methodCalls | `result.methodCalls()` |
| [JavaAnalyzerTest](classes/JavaAnalyzerTest.md).extractsVariableTypesAndResolvesScopesByPriority | [AnalysisResult](classes/AnalysisResult.md).variableTypes | `result.variableTypes()` |
| [JavaAnalyzerTest](classes/JavaAnalyzerTest.md).extractsVariableTypesAndResolvesScopesByPriority | [JavaAnalyzerTest](classes/JavaAnalyzerTest.md).analyze | `analyze()` |
| [JavaAnalyzerTest](classes/JavaAnalyzerTest.md).extractsVariableTypesAndResolvesScopesByPriority | [JavaAnalyzerTest](classes/JavaAnalyzerTest.md).write | `write("ProjectClient.java", "class ProjectClient { void call() {} }")` |
| [JavaAnalyzerTest](classes/JavaAnalyzerTest.md).extractsVariableTypesAndResolvesScopesByPriority | [JavaAnalyzerTest](classes/JavaAnalyzerTest.md).write | `write("ScopeExample.java", """     class ScopeExample {         private ProjectClient fieldClient;              ScopeExample(ProjectClient fieldClient) {             this.fieldClient = fieldClient;         }              void execute(ProjectClient parameterClient) {             ProjectClient localClient = fieldClient;             localClient.call();             parameterClient.call();             fieldClient.call();             unknown.call();         }     }     """)` |
| [MarkdownRenderer](classes/MarkdownRenderer.md).api | [AnalysisResult](classes/AnalysisResult.md).classes | `result.classes()` |
| [MarkdownRenderer](classes/MarkdownRenderer.md).api | [AnalysisResult](classes/AnalysisResult.md).endpoints | `result.endpoints()` |
| [MarkdownRenderer](classes/MarkdownRenderer.md).api | [MarkdownRenderer](classes/MarkdownRenderer.md).cell | `cell(endpoint.httpMethod())` |
| [MarkdownRenderer](classes/MarkdownRenderer.md).api | [MarkdownRenderer](classes/MarkdownRenderer.md).cell | `cell(endpoint.methodName())` |
| [MarkdownRenderer](classes/MarkdownRenderer.md).api | [MarkdownRenderer](classes/MarkdownRenderer.md).cell | `cell(endpoint.path())` |
| [MarkdownRenderer](classes/MarkdownRenderer.md).api | [MarkdownRenderer](classes/MarkdownRenderer.md).cell | `cell(endpoint.sourcePath())` |
| [MarkdownRenderer](classes/MarkdownRenderer.md).api | [MarkdownRenderer](classes/MarkdownRenderer.md).classLink | `classLink(endpoint.className(), "classes/", classNames)` |
| [MarkdownRenderer](classes/MarkdownRenderer.md).api | [MarkdownRenderer](classes/MarkdownRenderer.md).classNames | `classNames(result.classes())` |
| [MarkdownRenderer](classes/MarkdownRenderer.md).appendMapperStatementRelations | [MarkdownRenderer](classes/MarkdownRenderer.md).cell | `cell(String.join(", ", relation.tableNames()))` |
| [MarkdownRenderer](classes/MarkdownRenderer.md).appendMapperStatementRelations | [MarkdownRenderer](classes/MarkdownRenderer.md).cell | `cell(relation.mapperMethodName())` |
| [MarkdownRenderer](classes/MarkdownRenderer.md).appendMapperStatementRelations | [MarkdownRenderer](classes/MarkdownRenderer.md).cell | `cell(relation.statementId())` |
| [MarkdownRenderer](classes/MarkdownRenderer.md).appendMethodCallOverview | [AnalysisResult](classes/AnalysisResult.md).classes | `result.classes()` |
| [MarkdownRenderer](classes/MarkdownRenderer.md).appendMethodCallOverview | [AnalysisResult](classes/AnalysisResult.md).methodCallRelations | `result.methodCallRelations()` |
| [MarkdownRenderer](classes/MarkdownRenderer.md).appendMethodCallOverview | [MarkdownRenderer](classes/MarkdownRenderer.md).cell | `cell(relation.expression())` |
| [MarkdownRenderer](classes/MarkdownRenderer.md).appendMethodCallOverview | [MarkdownRenderer](classes/MarkdownRenderer.md).cell | `cell(relation.sourceMethodName())` |
| [MarkdownRenderer](classes/MarkdownRenderer.md).appendMethodCallOverview | [MarkdownRenderer](classes/MarkdownRenderer.md).cell | `cell(relation.targetMethodName())` |
| [MarkdownRenderer](classes/MarkdownRenderer.md).appendMethodCallOverview | [MarkdownRenderer](classes/MarkdownRenderer.md).classLink | `classLink(relation.sourceClassName(), "classes/", classNames)` |
| [MarkdownRenderer](classes/MarkdownRenderer.md).appendMethodCallOverview | [MarkdownRenderer](classes/MarkdownRenderer.md).classLink | `classLink(relation.targetClassName(), "classes/", classNames)` |
| [MarkdownRenderer](classes/MarkdownRenderer.md).appendMethodCallOverview | [MarkdownRenderer](classes/MarkdownRenderer.md).classNames | `classNames(result.classes())` |
| [MarkdownRenderer](classes/MarkdownRenderer.md).appendMethodCallOverview | [MarkdownRenderer](classes/MarkdownRenderer.md).sortedMethodCallRelations | `sortedMethodCallRelations(result.methodCallRelations())` |
| [MarkdownRenderer](classes/MarkdownRenderer.md).appendMethodCallRelations | [AnalysisResult](classes/AnalysisResult.md).classes | `result.classes()` |
| [MarkdownRenderer](classes/MarkdownRenderer.md).appendMethodCallRelations | [AnalysisResult](classes/AnalysisResult.md).methodCallRelations | `result.methodCallRelations()` |
| [MarkdownRenderer](classes/MarkdownRenderer.md).appendMethodCallRelations | [AnalysisResult](classes/AnalysisResult.md).methodCallRelations | `result.methodCallRelations()` |
| [MarkdownRenderer](classes/MarkdownRenderer.md).appendMethodCallRelations | [MarkdownRenderer](classes/MarkdownRenderer.md).cell | `cell(relation.expression())` |
| [MarkdownRenderer](classes/MarkdownRenderer.md).appendMethodCallRelations | [MarkdownRenderer](classes/MarkdownRenderer.md).cell | `cell(relation.expression())` |
| [MarkdownRenderer](classes/MarkdownRenderer.md).appendMethodCallRelations | [MarkdownRenderer](classes/MarkdownRenderer.md).cell | `cell(relation.sourceMethodName())` |
| [MarkdownRenderer](classes/MarkdownRenderer.md).appendMethodCallRelations | [MarkdownRenderer](classes/MarkdownRenderer.md).cell | `cell(relation.targetMethodName())` |
| [MarkdownRenderer](classes/MarkdownRenderer.md).appendMethodCallRelations | [MarkdownRenderer](classes/MarkdownRenderer.md).classLink | `classLink(relation.sourceClassName(), "", classNames)` |
| [MarkdownRenderer](classes/MarkdownRenderer.md).appendMethodCallRelations | [MarkdownRenderer](classes/MarkdownRenderer.md).classLink | `classLink(relation.targetClassName(), "", classNames)` |
| [MarkdownRenderer](classes/MarkdownRenderer.md).appendMethodCallRelations | [MarkdownRenderer](classes/MarkdownRenderer.md).classNames | `classNames(result.classes())` |
| [MarkdownRenderer](classes/MarkdownRenderer.md).appendMethodCallRelations | [MarkdownRenderer](classes/MarkdownRenderer.md).sortedMethodCallRelations | `sortedMethodCallRelations(result.methodCallRelations().stream().filter(relation -> relation.sourceClassName().equals(className)).toList())` |
| [MarkdownRenderer](classes/MarkdownRenderer.md).appendMethodCallRelations | [MarkdownRenderer](classes/MarkdownRenderer.md).sortedMethodCallRelations | `sortedMethodCallRelations(result.methodCallRelations().stream().filter(relation -> relation.targetClassName().equals(className)).toList())` |
| [MarkdownRenderer](classes/MarkdownRenderer.md).appendMethodCalls | [MarkdownRenderer](classes/MarkdownRenderer.md).cell | `cell(call.calledMethodName())` |
| [MarkdownRenderer](classes/MarkdownRenderer.md).appendMethodCalls | [MarkdownRenderer](classes/MarkdownRenderer.md).cell | `cell(call.expression())` |
| [MarkdownRenderer](classes/MarkdownRenderer.md).appendMethodCalls | [MarkdownRenderer](classes/MarkdownRenderer.md).cell | `cell(call.resolvedTargetClassName())` |
| [MarkdownRenderer](classes/MarkdownRenderer.md).appendMethodCalls | [MarkdownRenderer](classes/MarkdownRenderer.md).cell | `cell(call.scopeName())` |
| [MarkdownRenderer](classes/MarkdownRenderer.md).appendMethodCalls | [MarkdownRenderer](classes/MarkdownRenderer.md).cell | `cell(call.sourceMethodName())` |
| [MarkdownRenderer](classes/MarkdownRenderer.md).appendMyBatisStatements | [MarkdownRenderer](classes/MarkdownRenderer.md).cell | `cell(String.join(", ", statement.tableNames()))` |
| [MarkdownRenderer](classes/MarkdownRenderer.md).appendMyBatisStatements | [MarkdownRenderer](classes/MarkdownRenderer.md).cell | `cell(statement.sourcePath().toString())` |
| [MarkdownRenderer](classes/MarkdownRenderer.md).appendMyBatisStatements | [MarkdownRenderer](classes/MarkdownRenderer.md).cell | `cell(statement.statementId())` |
| [MarkdownRenderer](classes/MarkdownRenderer.md).appendRelatedClasses | [MarkdownRenderer](classes/MarkdownRenderer.md).cell | `cell(relation.sourceMemberName())` |
| [MarkdownRenderer](classes/MarkdownRenderer.md).appendRelatedClasses | [MarkdownRenderer](classes/MarkdownRenderer.md).cell | `cell(relation.sourceMemberName())` |
| [MarkdownRenderer](classes/MarkdownRenderer.md).appendRelatedClasses | [MarkdownRenderer](classes/MarkdownRenderer.md).classLink | `classLink(relation.sourceClassName(), "", classNames)` |
| [MarkdownRenderer](classes/MarkdownRenderer.md).appendRelatedClasses | [MarkdownRenderer](classes/MarkdownRenderer.md).classLink | `classLink(relation.targetClassName(), "", classNames)` |
| [MarkdownRenderer](classes/MarkdownRenderer.md).appendRelatedClasses | [MarkdownRenderer](classes/MarkdownRenderer.md).sortedRelations | `sortedRelations(relations.stream().filter(relation -> relation.sourceClassName().equals(className)).toList())` |
| [MarkdownRenderer](classes/MarkdownRenderer.md).appendRelatedClasses | [MarkdownRenderer](classes/MarkdownRenderer.md).sortedRelations | `sortedRelations(relations.stream().filter(relation -> relation.targetClassName().equals(className)).toList())` |
| [MarkdownRenderer](classes/MarkdownRenderer.md).appendRelatedTables | [MarkdownRenderer](classes/MarkdownRenderer.md).cell | `cell(statement.statementId())` |
| [MarkdownRenderer](classes/MarkdownRenderer.md).appendRelatedTables | [MarkdownRenderer](classes/MarkdownRenderer.md).cell | `cell(tableName)` |
| [MarkdownRenderer](classes/MarkdownRenderer.md).architecture | [AnalysisResult](classes/AnalysisResult.md).classes | `result.classes()` |
| [MarkdownRenderer](classes/MarkdownRenderer.md).architecture | [AnalysisResult](classes/AnalysisResult.md).classes | `result.classes()` |
| [MarkdownRenderer](classes/MarkdownRenderer.md).architecture | [AnalysisResult](classes/AnalysisResult.md).relations | `result.relations()` |
| [MarkdownRenderer](classes/MarkdownRenderer.md).architecture | [MarkdownRenderer](classes/MarkdownRenderer.md).appendMethodCallOverview | `appendMethodCallOverview(markdown, result)` |
| [MarkdownRenderer](classes/MarkdownRenderer.md).architecture | [MarkdownRenderer](classes/MarkdownRenderer.md).cell | `cell(relation.sourceMemberName())` |
| [MarkdownRenderer](classes/MarkdownRenderer.md).architecture | [MarkdownRenderer](classes/MarkdownRenderer.md).classLink | `classLink(relation.sourceClassName(), "classes/", classNames)` |
| [MarkdownRenderer](classes/MarkdownRenderer.md).architecture | [MarkdownRenderer](classes/MarkdownRenderer.md).classLink | `classLink(relation.targetClassName(), "classes/", classNames)` |
| [MarkdownRenderer](classes/MarkdownRenderer.md).architecture | [MarkdownRenderer](classes/MarkdownRenderer.md).classNames | `classNames(result.classes())` |
| [MarkdownRenderer](classes/MarkdownRenderer.md).architecture | [MarkdownRenderer](classes/MarkdownRenderer.md).sortedRelations | `sortedRelations(result.relations())` |
| [MarkdownRenderer](classes/MarkdownRenderer.md).architecture | [MarkdownRenderer](classes/MarkdownRenderer.md).title | `title(type)` |
| [MarkdownRenderer](classes/MarkdownRenderer.md).classLink | [MarkdownRenderer](classes/MarkdownRenderer.md).cell | `cell(className)` |
| [MarkdownRenderer](classes/MarkdownRenderer.md).classLink | [MarkdownRenderer](classes/MarkdownRenderer.md).cell | `cell(className)` |
| [MarkdownRenderer](classes/MarkdownRenderer.md).classPage | [AnalysisResult](classes/AnalysisResult.md).classes | `result.classes()` |
| [MarkdownRenderer](classes/MarkdownRenderer.md).classPage | [AnalysisResult](classes/AnalysisResult.md).mapperStatementRelations | `result.mapperStatementRelations()` |
| [MarkdownRenderer](classes/MarkdownRenderer.md).classPage | [AnalysisResult](classes/AnalysisResult.md).methodCalls | `result.methodCalls()` |
| [MarkdownRenderer](classes/MarkdownRenderer.md).classPage | [AnalysisResult](classes/AnalysisResult.md).relations | `result.relations()` |
| [MarkdownRenderer](classes/MarkdownRenderer.md).classPage | [AnalysisResult](classes/AnalysisResult.md).sqlStatements | `result.sqlStatements()` |
| [MarkdownRenderer](classes/MarkdownRenderer.md).classPage | [ClassDoc](classes/ClassDoc.md).annotations | `classDoc.annotations()` |
| [MarkdownRenderer](classes/MarkdownRenderer.md).classPage | [ClassDoc](classes/ClassDoc.md).className | `classDoc.className()` |
| [MarkdownRenderer](classes/MarkdownRenderer.md).classPage | [ClassDoc](classes/ClassDoc.md).className | `classDoc.className()` |
| [MarkdownRenderer](classes/MarkdownRenderer.md).classPage | [ClassDoc](classes/ClassDoc.md).className | `classDoc.className()` |
| [MarkdownRenderer](classes/MarkdownRenderer.md).classPage | [ClassDoc](classes/ClassDoc.md).className | `classDoc.className()` |
| [MarkdownRenderer](classes/MarkdownRenderer.md).classPage | [ClassDoc](classes/ClassDoc.md).className | `classDoc.className()` |
| [MarkdownRenderer](classes/MarkdownRenderer.md).classPage | [ClassDoc](classes/ClassDoc.md).componentType | `classDoc.componentType()` |
| [MarkdownRenderer](classes/MarkdownRenderer.md).classPage | [ClassDoc](classes/ClassDoc.md).declarationKind | `classDoc.declarationKind()` |
| [MarkdownRenderer](classes/MarkdownRenderer.md).classPage | [ClassDoc](classes/ClassDoc.md).fields | `classDoc.fields()` |
| [MarkdownRenderer](classes/MarkdownRenderer.md).classPage | [ClassDoc](classes/ClassDoc.md).fields | `classDoc.fields()` |
| [MarkdownRenderer](classes/MarkdownRenderer.md).classPage | [ClassDoc](classes/ClassDoc.md).methods | `classDoc.methods()` |
| [MarkdownRenderer](classes/MarkdownRenderer.md).classPage | [ClassDoc](classes/ClassDoc.md).methods | `classDoc.methods()` |
| [MarkdownRenderer](classes/MarkdownRenderer.md).classPage | [ClassDoc](classes/ClassDoc.md).packageName | `classDoc.packageName()` |
| [MarkdownRenderer](classes/MarkdownRenderer.md).classPage | [ClassDoc](classes/ClassDoc.md).roleSummary | `classDoc.roleSummary()` |
| [MarkdownRenderer](classes/MarkdownRenderer.md).classPage | [ClassDoc](classes/ClassDoc.md).sourcePath | `classDoc.sourcePath()` |
| [MarkdownRenderer](classes/MarkdownRenderer.md).classPage | [MarkdownRenderer](classes/MarkdownRenderer.md).appendCodeList | `appendCodeList(markdown, classDoc.annotations())` |
| [MarkdownRenderer](classes/MarkdownRenderer.md).classPage | [MarkdownRenderer](classes/MarkdownRenderer.md).appendMapperStatementRelations | `appendMapperStatementRelations(markdown, classDoc.className(), result.mapperStatementRelations())` |
| [MarkdownRenderer](classes/MarkdownRenderer.md).classPage | [MarkdownRenderer](classes/MarkdownRenderer.md).appendMethodCallRelations | `appendMethodCallRelations(markdown, classDoc.className(), result)` |
| [MarkdownRenderer](classes/MarkdownRenderer.md).classPage | [MarkdownRenderer](classes/MarkdownRenderer.md).appendMethodCalls | `appendMethodCalls(markdown, classDoc.className(), result.methodCalls())` |
| [MarkdownRenderer](classes/MarkdownRenderer.md).classPage | [MarkdownRenderer](classes/MarkdownRenderer.md).appendMyBatisStatements | `appendMyBatisStatements(markdown, mapperStatements)` |
| [MarkdownRenderer](classes/MarkdownRenderer.md).classPage | [MarkdownRenderer](classes/MarkdownRenderer.md).appendRelatedClasses | `appendRelatedClasses(markdown, classDoc.className(), result.relations(), classNames(result.classes()))` |
| [MarkdownRenderer](classes/MarkdownRenderer.md).classPage | [MarkdownRenderer](classes/MarkdownRenderer.md).appendRelatedTables | `appendRelatedTables(markdown, mapperStatements)` |
| [MarkdownRenderer](classes/MarkdownRenderer.md).classPage | [MarkdownRenderer](classes/MarkdownRenderer.md).cell | `cell(String.join(", ", field.annotations()))` |
| [MarkdownRenderer](classes/MarkdownRenderer.md).classPage | [MarkdownRenderer](classes/MarkdownRenderer.md).cell | `cell(String.join(", ", method.annotations()))` |
| [MarkdownRenderer](classes/MarkdownRenderer.md).classPage | [MarkdownRenderer](classes/MarkdownRenderer.md).cell | `cell(field.name())` |
| [MarkdownRenderer](classes/MarkdownRenderer.md).classPage | [MarkdownRenderer](classes/MarkdownRenderer.md).cell | `cell(field.type())` |
| [MarkdownRenderer](classes/MarkdownRenderer.md).classPage | [MarkdownRenderer](classes/MarkdownRenderer.md).cell | `cell(method.methodName())` |
| [MarkdownRenderer](classes/MarkdownRenderer.md).classPage | [MarkdownRenderer](classes/MarkdownRenderer.md).cell | `cell(method.returnType())` |
| [MarkdownRenderer](classes/MarkdownRenderer.md).classPage | [MarkdownRenderer](classes/MarkdownRenderer.md).cell | `cell(parameters(method))` |
| [MarkdownRenderer](classes/MarkdownRenderer.md).classPage | [MarkdownRenderer](classes/MarkdownRenderer.md).classNames | `classNames(result.classes())` |
| [MarkdownRenderer](classes/MarkdownRenderer.md).classPage | [MarkdownRenderer](classes/MarkdownRenderer.md).matchingMyBatisStatements | `matchingMyBatisStatements(classDoc, result.sqlStatements())` |
| [MarkdownRenderer](classes/MarkdownRenderer.md).classPage | [MarkdownRenderer](classes/MarkdownRenderer.md).parameters | `parameters(method)` |
| [MarkdownRenderer](classes/MarkdownRenderer.md).impactMap | [MarkdownRenderer](classes/MarkdownRenderer.md).cell | `cell(row.api())` |
| [MarkdownRenderer](classes/MarkdownRenderer.md).impactMap | [MarkdownRenderer](classes/MarkdownRenderer.md).cell | `cell(row.controller())` |
| [MarkdownRenderer](classes/MarkdownRenderer.md).impactMap | [MarkdownRenderer](classes/MarkdownRenderer.md).cell | `cell(row.mapper())` |
| [MarkdownRenderer](classes/MarkdownRenderer.md).impactMap | [MarkdownRenderer](classes/MarkdownRenderer.md).cell | `cell(row.service())` |
| [MarkdownRenderer](classes/MarkdownRenderer.md).impactMap | [MarkdownRenderer](classes/MarkdownRenderer.md).cell | `cell(row.statement())` |
| [MarkdownRenderer](classes/MarkdownRenderer.md).impactMap | [MarkdownRenderer](classes/MarkdownRenderer.md).cell | `cell(row.tables())` |
| [MarkdownRenderer](classes/MarkdownRenderer.md).impactMap | [MarkdownRenderer](classes/MarkdownRenderer.md).impactRows | `impactRows(result)` |
| [MarkdownRenderer](classes/MarkdownRenderer.md).impactRows | [AnalysisResult](classes/AnalysisResult.md).classes | `result.classes()` |
| [MarkdownRenderer](classes/MarkdownRenderer.md).impactRows | [AnalysisResult](classes/AnalysisResult.md).endpoints | `result.endpoints()` |
| [MarkdownRenderer](classes/MarkdownRenderer.md).impactRows | [AnalysisResult](classes/AnalysisResult.md).mapperStatementRelations | `result.mapperStatementRelations()` |
| [MarkdownRenderer](classes/MarkdownRenderer.md).impactRows | [AnalysisResult](classes/AnalysisResult.md).methodCallRelations | `result.methodCallRelations()` |
| [MarkdownRenderer](classes/MarkdownRenderer.md).impactRows | [AnalysisResult](classes/AnalysisResult.md).methodCallRelations | `result.methodCallRelations()` |
| [MarkdownRenderer](classes/MarkdownRenderer.md).impactRows | [ApiEndpointDoc](classes/ApiEndpointDoc.md).className | `endpoint.className()` |
| [MarkdownRenderer](classes/MarkdownRenderer.md).impactRows | [ApiEndpointDoc](classes/ApiEndpointDoc.md).className | `endpoint.className()` |
| [MarkdownRenderer](classes/MarkdownRenderer.md).impactRows | [ApiEndpointDoc](classes/ApiEndpointDoc.md).httpMethod | `endpoint.httpMethod()` |
| [MarkdownRenderer](classes/MarkdownRenderer.md).impactRows | [ApiEndpointDoc](classes/ApiEndpointDoc.md).methodName | `endpoint.methodName()` |
| [MarkdownRenderer](classes/MarkdownRenderer.md).impactRows | [ApiEndpointDoc](classes/ApiEndpointDoc.md).methodName | `endpoint.methodName()` |
| [MarkdownRenderer](classes/MarkdownRenderer.md).impactRows | [ApiEndpointDoc](classes/ApiEndpointDoc.md).path | `endpoint.path()` |
| [MarkdownRenderer](classes/MarkdownRenderer.md).impactRows | [MarkdownRenderer](classes/MarkdownRenderer.md).componentType | `componentType(relation.targetClassName(), result.classes())` |
| [MarkdownRenderer](classes/MarkdownRenderer.md).impactRows | [MarkdownRenderer](classes/MarkdownRenderer.md).isMapper | `isMapper(relation.targetClassName(), result)` |
| [MarkdownRenderer](classes/MarkdownRenderer.md).impactRows | [MarkdownRenderer](classes/MarkdownRenderer.md).methodName | `methodName(endpoint.className(), endpoint.methodName())` |
| [MarkdownRenderer](classes/MarkdownRenderer.md).impactRows | [MarkdownRenderer](classes/MarkdownRenderer.md).methodName | `methodName(mapperCall.targetClassName(), mapperCall.targetMethodName())` |
| [MarkdownRenderer](classes/MarkdownRenderer.md).impactRows | [MarkdownRenderer](classes/MarkdownRenderer.md).methodName | `methodName(serviceCall.targetClassName(), serviceCall.targetMethodName())` |
| [MarkdownRenderer](classes/MarkdownRenderer.md).impactRows | [MethodCallRelationDoc](classes/MethodCallRelationDoc.md).targetClassName | `mapperCall.targetClassName()` |
| [MarkdownRenderer](classes/MarkdownRenderer.md).impactRows | [MethodCallRelationDoc](classes/MethodCallRelationDoc.md).targetClassName | `mapperCall.targetClassName()` |
| [MarkdownRenderer](classes/MarkdownRenderer.md).impactRows | [MethodCallRelationDoc](classes/MethodCallRelationDoc.md).targetClassName | `serviceCall.targetClassName()` |
| [MarkdownRenderer](classes/MarkdownRenderer.md).impactRows | [MethodCallRelationDoc](classes/MethodCallRelationDoc.md).targetClassName | `serviceCall.targetClassName()` |
| [MarkdownRenderer](classes/MarkdownRenderer.md).impactRows | [MethodCallRelationDoc](classes/MethodCallRelationDoc.md).targetMethodName | `mapperCall.targetMethodName()` |
| [MarkdownRenderer](classes/MarkdownRenderer.md).impactRows | [MethodCallRelationDoc](classes/MethodCallRelationDoc.md).targetMethodName | `mapperCall.targetMethodName()` |
| [MarkdownRenderer](classes/MarkdownRenderer.md).impactRows | [MethodCallRelationDoc](classes/MethodCallRelationDoc.md).targetMethodName | `serviceCall.targetMethodName()` |
| [MarkdownRenderer](classes/MarkdownRenderer.md).impactRows | [MethodCallRelationDoc](classes/MethodCallRelationDoc.md).targetMethodName | `serviceCall.targetMethodName()` |
| [MarkdownRenderer](classes/MarkdownRenderer.md).index | [MarkdownRenderer](classes/MarkdownRenderer.md).displaySourceRoot | `displaySourceRoot(overview.sourceRoot())` |
| [MarkdownRenderer](classes/MarkdownRenderer.md).index | [ProjectOverview](classes/ProjectOverview.md).classCount | `overview.classCount()` |
| [MarkdownRenderer](classes/MarkdownRenderer.md).index | [ProjectOverview](classes/ProjectOverview.md).controllerCount | `overview.controllerCount()` |
| [MarkdownRenderer](classes/MarkdownRenderer.md).index | [ProjectOverview](classes/ProjectOverview.md).endpointCount | `overview.endpointCount()` |
| [MarkdownRenderer](classes/MarkdownRenderer.md).index | [ProjectOverview](classes/ProjectOverview.md).entityCount | `overview.entityCount()` |
| [MarkdownRenderer](classes/MarkdownRenderer.md).index | [ProjectOverview](classes/ProjectOverview.md).projectName | `overview.projectName()` |
| [MarkdownRenderer](classes/MarkdownRenderer.md).index | [ProjectOverview](classes/ProjectOverview.md).repositoryCount | `overview.repositoryCount()` |
| [MarkdownRenderer](classes/MarkdownRenderer.md).index | [ProjectOverview](classes/ProjectOverview.md).serviceCount | `overview.serviceCount()` |
| [MarkdownRenderer](classes/MarkdownRenderer.md).index | [ProjectOverview](classes/ProjectOverview.md).sourceRoot | `overview.sourceRoot()` |
| [MarkdownRenderer](classes/MarkdownRenderer.md).isMapper | [AnalysisResult](classes/AnalysisResult.md).classes | `result.classes()` |
| [MarkdownRenderer](classes/MarkdownRenderer.md).isMapper | [AnalysisResult](classes/AnalysisResult.md).mapperStatementRelations | `result.mapperStatementRelations()` |
| [MarkdownRenderer](classes/MarkdownRenderer.md).matchingMyBatisStatements | [ClassDoc](classes/ClassDoc.md).className | `classDoc.className()` |
| [MarkdownRenderer](classes/MarkdownRenderer.md).matchingMyBatisStatements | [ClassDoc](classes/ClassDoc.md).className | `classDoc.className()` |
| [MarkdownRenderer](classes/MarkdownRenderer.md).matchingMyBatisStatements | [ClassDoc](classes/ClassDoc.md).packageName | `classDoc.packageName()` |
| [MarkdownRenderer](classes/MarkdownRenderer.md).matchingMyBatisStatements | [ClassDoc](classes/ClassDoc.md).packageName | `classDoc.packageName()` |
| [MarkdownRenderer](classes/MarkdownRenderer.md).mybatis | [MarkdownRenderer](classes/MarkdownRenderer.md).cell | `cell(first.ownerName())` |
| [MarkdownRenderer](classes/MarkdownRenderer.md).mybatis | [MarkdownRenderer](classes/MarkdownRenderer.md).cell | `cell(first.sourcePath().toString())` |
| [MarkdownRenderer](classes/MarkdownRenderer.md).mybatis | [SqlStatementDoc](classes/SqlStatementDoc.md).ownerName | `first.ownerName()` |
| [MarkdownRenderer](classes/MarkdownRenderer.md).mybatis | [SqlStatementDoc](classes/SqlStatementDoc.md).sourcePath | `first.sourcePath()` |
| [MarkdownRenderer](classes/MarkdownRenderer.md).parameters | [MethodDoc](classes/MethodDoc.md).parameters | `method.parameters()` |
| [MarkdownRenderer](classes/MarkdownRenderer.md).render | [AnalysisResult](classes/AnalysisResult.md).classes | `result.classes()` |
| [MarkdownRenderer](classes/MarkdownRenderer.md).render | [AnalysisResult](classes/AnalysisResult.md).configs | `result.configs()` |
| [MarkdownRenderer](classes/MarkdownRenderer.md).render | [AnalysisResult](classes/AnalysisResult.md).overview | `result.overview()` |
| [MarkdownRenderer](classes/MarkdownRenderer.md).render | [AnalysisResult](classes/AnalysisResult.md).sqlStatements | `result.sqlStatements()` |
| [MarkdownRenderer](classes/MarkdownRenderer.md).render | [AnalysisResult](classes/AnalysisResult.md).sqlStatements | `result.sqlStatements()` |
| [MarkdownRenderer](classes/MarkdownRenderer.md).render | [AnalysisResult](classes/AnalysisResult.md).tableUsages | `result.tableUsages()` |
| [MarkdownRenderer](classes/MarkdownRenderer.md).render | [ClassDoc](classes/ClassDoc.md).className | `classDoc.className()` |
| [MarkdownRenderer](classes/MarkdownRenderer.md).render | [MarkdownRenderer](classes/MarkdownRenderer.md).api | `api(result)` |
| [MarkdownRenderer](classes/MarkdownRenderer.md).render | [MarkdownRenderer](classes/MarkdownRenderer.md).architecture | `architecture(result)` |
| [MarkdownRenderer](classes/MarkdownRenderer.md).render | [MarkdownRenderer](classes/MarkdownRenderer.md).classPage | `classPage(classDoc, result)` |
| [MarkdownRenderer](classes/MarkdownRenderer.md).render | [MarkdownRenderer](classes/MarkdownRenderer.md).configurations | `configurations(result.configs())` |
| [MarkdownRenderer](classes/MarkdownRenderer.md).render | [MarkdownRenderer](classes/MarkdownRenderer.md).impactMap | `impactMap(result)` |
| [MarkdownRenderer](classes/MarkdownRenderer.md).render | [MarkdownRenderer](classes/MarkdownRenderer.md).index | `index(result.overview())` |
| [MarkdownRenderer](classes/MarkdownRenderer.md).render | [MarkdownRenderer](classes/MarkdownRenderer.md).mybatis | `mybatis(result.sqlStatements())` |
| [MarkdownRenderer](classes/MarkdownRenderer.md).render | [MarkdownRenderer](classes/MarkdownRenderer.md).sql | `sql(result.sqlStatements())` |
| [MarkdownRenderer](classes/MarkdownRenderer.md).render | [MarkdownRenderer](classes/MarkdownRenderer.md).tables | `tables(result.tableUsages())` |
| [MarkdownRenderer](classes/MarkdownRenderer.md).render | [MarkdownRenderer](classes/MarkdownRenderer.md).write | `write(classesDirectory.resolve(classDoc.className() + ".md"), classPage(classDoc, result))` |
| [MarkdownRenderer](classes/MarkdownRenderer.md).render | [MarkdownRenderer](classes/MarkdownRenderer.md).write | `write(configsDirectory.resolve("application.md"), configurations(result.configs()))` |
| [MarkdownRenderer](classes/MarkdownRenderer.md).render | [MarkdownRenderer](classes/MarkdownRenderer.md).write | `write(output.resolve("_config.yml"), "title: CodeAtlas\ntheme: minima\n")` |
| [MarkdownRenderer](classes/MarkdownRenderer.md).render | [MarkdownRenderer](classes/MarkdownRenderer.md).write | `write(output.resolve("api.md"), api(result))` |
| [MarkdownRenderer](classes/MarkdownRenderer.md).render | [MarkdownRenderer](classes/MarkdownRenderer.md).write | `write(output.resolve("architecture.md"), architecture(result))` |
| [MarkdownRenderer](classes/MarkdownRenderer.md).render | [MarkdownRenderer](classes/MarkdownRenderer.md).write | `write(output.resolve("impact-map.md"), impactMap(result))` |
| [MarkdownRenderer](classes/MarkdownRenderer.md).render | [MarkdownRenderer](classes/MarkdownRenderer.md).write | `write(output.resolve("index.md"), index(result.overview()))` |
| [MarkdownRenderer](classes/MarkdownRenderer.md).render | [MarkdownRenderer](classes/MarkdownRenderer.md).write | `write(output.resolve("mybatis.md"), mybatis(result.sqlStatements()))` |
| [MarkdownRenderer](classes/MarkdownRenderer.md).render | [MarkdownRenderer](classes/MarkdownRenderer.md).write | `write(output.resolve("sql.md"), sql(result.sqlStatements()))` |
| [MarkdownRenderer](classes/MarkdownRenderer.md).render | [MarkdownRenderer](classes/MarkdownRenderer.md).write | `write(output.resolve("tables.md"), tables(result.tableUsages()))` |
| [MarkdownRenderer](classes/MarkdownRenderer.md).sql | [MarkdownRenderer](classes/MarkdownRenderer.md).cell | `cell(String.join(", ", statement.tableNames()))` |
| [MarkdownRenderer](classes/MarkdownRenderer.md).sql | [MarkdownRenderer](classes/MarkdownRenderer.md).cell | `cell(statement.ownerName())` |
| [MarkdownRenderer](classes/MarkdownRenderer.md).sql | [MarkdownRenderer](classes/MarkdownRenderer.md).cell | `cell(statement.sourcePath().toString())` |
| [MarkdownRenderer](classes/MarkdownRenderer.md).sql | [MarkdownRenderer](classes/MarkdownRenderer.md).cell | `cell(statement.sql())` |
| [MarkdownRenderer](classes/MarkdownRenderer.md).sql | [MarkdownRenderer](classes/MarkdownRenderer.md).cell | `cell(statement.statementId())` |
| [MarkdownRenderer](classes/MarkdownRenderer.md).tables | [MarkdownRenderer](classes/MarkdownRenderer.md).cell | `cell(usage.sourceName())` |
| [MarkdownRenderer](classes/MarkdownRenderer.md).tables | [MarkdownRenderer](classes/MarkdownRenderer.md).cell | `cell(usage.sourcePath().toString())` |
| [MarkdownRenderer](classes/MarkdownRenderer.md).tables | [MarkdownRenderer](classes/MarkdownRenderer.md).cell | `cell(usage.tableName())` |
| [MarkdownRenderer](classes/MarkdownRenderer.md).tables | [MarkdownRenderer](classes/MarkdownRenderer.md).cell | `cell(usage.usageType())` |
| [MarkdownRenderer](classes/MarkdownRenderer.md).tables | [MarkdownRenderer](classes/MarkdownRenderer.md).cell | `cell(usage.usedBy())` |
| [MarkdownRenderer](classes/MarkdownRenderer.md).title | [ComponentType](classes/ComponentType.md).name | `type.name()` |
| [MyBatisAnalyzer](classes/MyBatisAnalyzer.md).analyze | [AnalysisResult](classes/AnalysisResult.md).classes | `currentResult.classes()` |
| [MyBatisAnalyzer](classes/MyBatisAnalyzer.md).analyze | [AnalysisResult](classes/AnalysisResult.md).configs | `currentResult.configs()` |
| [MyBatisAnalyzer](classes/MyBatisAnalyzer.md).analyze | [AnalysisResult](classes/AnalysisResult.md).endpoints | `currentResult.endpoints()` |
| [MyBatisAnalyzer](classes/MyBatisAnalyzer.md).analyze | [AnalysisResult](classes/AnalysisResult.md).methodCallRelations | `currentResult.methodCallRelations()` |
| [MyBatisAnalyzer](classes/MyBatisAnalyzer.md).analyze | [AnalysisResult](classes/AnalysisResult.md).methodCalls | `currentResult.methodCalls()` |
| [MyBatisAnalyzer](classes/MyBatisAnalyzer.md).analyze | [AnalysisResult](classes/AnalysisResult.md).overview | `currentResult.overview()` |
| [MyBatisAnalyzer](classes/MyBatisAnalyzer.md).analyze | [AnalysisResult](classes/AnalysisResult.md).relations | `currentResult.relations()` |
| [MyBatisAnalyzer](classes/MyBatisAnalyzer.md).analyze | [AnalysisResult](classes/AnalysisResult.md).variableTypes | `currentResult.variableTypes()` |
| [MyBatisAnalyzer](classes/MyBatisAnalyzer.md).analyze | [MyBatisAnalyzer](classes/MyBatisAnalyzer.md).analyze | `analyze(source, empty)` |
| [MyBatisAnalyzer](classes/MyBatisAnalyzer.md).analyze | [MyBatisAnalyzer](classes/MyBatisAnalyzer.md).mapperStatementRelations | `mapperStatementRelations(classes, statements)` |
| [MyBatisAnalyzer](classes/MyBatisAnalyzer.md).analyze | [MyBatisAnalyzer](classes/MyBatisAnalyzer.md).parseStatements | `parseStatements(source)` |
| [MyBatisAnalyzer](classes/MyBatisAnalyzer.md).analyze | [ProjectSource](classes/ProjectSource.md).rootDirectory | `source.rootDirectory()` |
| [MyBatisAnalyzer](classes/MyBatisAnalyzer.md).analyze | [ProjectSource](classes/ProjectSource.md).rootDirectory | `source.rootDirectory()` |
| [MyBatisAnalyzer](classes/MyBatisAnalyzer.md).applyMapperRole | [ClassDoc](classes/ClassDoc.md).annotations | `classDoc.annotations()` |
| [MyBatisAnalyzer](classes/MyBatisAnalyzer.md).applyMapperRole | [ClassDoc](classes/ClassDoc.md).roleSummary | `classDoc.roleSummary()` |
| [MyBatisAnalyzer](classes/MyBatisAnalyzer.md).applyMapperRole | [ClassDoc](classes/ClassDoc.md).roleSummary | `classDoc.roleSummary()` |
| [MyBatisAnalyzer](classes/MyBatisAnalyzer.md).applyMapperRole | [ClassDoc](classes/ClassDoc.md).withRoleSummary | `classDoc.withRoleSummary(MAPPER_ROLE)` |
| [MyBatisAnalyzer](classes/MyBatisAnalyzer.md).mapperStatementRelations | [ClassDoc](classes/ClassDoc.md).className | `classDoc.className()` |
| [MyBatisAnalyzer](classes/MyBatisAnalyzer.md).mapperStatementRelations | [ClassDoc](classes/ClassDoc.md).className | `classDoc.className()` |
| [MyBatisAnalyzer](classes/MyBatisAnalyzer.md).mapperStatementRelations | [ClassDoc](classes/ClassDoc.md).className | `classDoc.className()` |
| [MyBatisAnalyzer](classes/MyBatisAnalyzer.md).mapperStatementRelations | [ClassDoc](classes/ClassDoc.md).methods | `classDoc.methods()` |
| [MyBatisAnalyzer](classes/MyBatisAnalyzer.md).mapperStatementRelations | [ClassDoc](classes/ClassDoc.md).packageName | `classDoc.packageName()` |
| [MyBatisAnalyzer](classes/MyBatisAnalyzer.md).mapperStatementRelations | [ClassDoc](classes/ClassDoc.md).packageName | `classDoc.packageName()` |
| [MyBatisAnalyzer](classes/MyBatisAnalyzer.md).mapperStatementRelations | [SqlStatementDoc](classes/SqlStatementDoc.md).ownerName | `statement.ownerName()` |
| [MyBatisAnalyzer](classes/MyBatisAnalyzer.md).mapperStatementRelations | [SqlStatementDoc](classes/SqlStatementDoc.md).sourcePath | `statement.sourcePath()` |
| [MyBatisAnalyzer](classes/MyBatisAnalyzer.md).mapperStatementRelations | [SqlStatementDoc](classes/SqlStatementDoc.md).statementId | `statement.statementId()` |
| [MyBatisAnalyzer](classes/MyBatisAnalyzer.md).mapperStatementRelations | [SqlStatementDoc](classes/SqlStatementDoc.md).statementId | `statement.statementId()` |
| [MyBatisAnalyzer](classes/MyBatisAnalyzer.md).mapperStatementRelations | [SqlStatementDoc](classes/SqlStatementDoc.md).statementType | `statement.statementType()` |
| [MyBatisAnalyzer](classes/MyBatisAnalyzer.md).mapperStatementRelations | [SqlStatementDoc](classes/SqlStatementDoc.md).tableNames | `statement.tableNames()` |
| [MyBatisAnalyzer](classes/MyBatisAnalyzer.md).mapperXmlFiles | [MyBatisAnalyzer](classes/MyBatisAnalyzer.md).isMainResource | `isMainResource(source.relativePath(path))` |
| [MyBatisAnalyzer](classes/MyBatisAnalyzer.md).mapperXmlFiles | [ProjectSource](classes/ProjectSource.md).relativePath | `source.relativePath(path)` |
| [MyBatisAnalyzer](classes/MyBatisAnalyzer.md).mapperXmlFiles | [ProjectSource](classes/ProjectSource.md).resourceFiles | `source.resourceFiles()` |
| [MyBatisAnalyzer](classes/MyBatisAnalyzer.md).parseStatements | [MyBatisAnalyzer](classes/MyBatisAnalyzer.md).mapperXmlFiles | `mapperXmlFiles(source)` |
| [MyBatisAnalyzer](classes/MyBatisAnalyzer.md).parseStatements | [MyBatisMapperXmlParser](classes/MyBatisMapperXmlParser.md).parse | `parser.parse(xmlFile, source.relativePath(xmlFile))` |
| [MyBatisAnalyzer](classes/MyBatisAnalyzer.md).parseStatements | [ProjectSource](classes/ProjectSource.md).relativePath | `source.relativePath(xmlFile)` |
| [MyBatisAnalyzer](classes/MyBatisAnalyzer.md).supports | [MyBatisAnalyzer](classes/MyBatisAnalyzer.md).mapperXmlFiles | `mapperXmlFiles(source)` |
| [MyBatisAnalyzer](classes/MyBatisAnalyzer.md).supports | [MyBatisMapperXmlParser](classes/MyBatisMapperXmlParser.md).parse | `parser.parse(path, source.relativePath(path))` |
| [MyBatisAnalyzer](classes/MyBatisAnalyzer.md).supports | [ProjectSource](classes/ProjectSource.md).javaFiles | `source.javaFiles()` |
| [MyBatisAnalyzer](classes/MyBatisAnalyzer.md).supports | [ProjectSource](classes/ProjectSource.md).relativePath | `source.relativePath(path)` |
| [MyBatisAnalyzerTest](classes/MyBatisAnalyzerTest.md).addsSqlTableUsageAndMapperRoleToCurrentResult | [AnalysisResult](classes/AnalysisResult.md).classes | `result.classes()` |
| [MyBatisAnalyzerTest](classes/MyBatisAnalyzerTest.md).addsSqlTableUsageAndMapperRoleToCurrentResult | [AnalysisResult](classes/AnalysisResult.md).mapperStatementRelations | `result.mapperStatementRelations()` |
| [MyBatisAnalyzerTest](classes/MyBatisAnalyzerTest.md).addsSqlTableUsageAndMapperRoleToCurrentResult | [AnalysisResult](classes/AnalysisResult.md).sqlStatements | `result.sqlStatements()` |
| [MyBatisAnalyzerTest](classes/MyBatisAnalyzerTest.md).addsSqlTableUsageAndMapperRoleToCurrentResult | [AnalysisResult](classes/AnalysisResult.md).tableUsages | `result.tableUsages()` |
| [MyBatisAnalyzerTest](classes/MyBatisAnalyzerTest.md).addsSqlTableUsageAndMapperRoleToCurrentResult | [MyBatisAnalyzer](classes/MyBatisAnalyzer.md).analyze | `analyzer.analyze(source, current)` |
| [MyBatisAnalyzerTest](classes/MyBatisAnalyzerTest.md).addsSqlTableUsageAndMapperRoleToCurrentResult | [MyBatisAnalyzer](classes/MyBatisAnalyzer.md).supports | `analyzer.supports(source)` |
| [MyBatisAnalyzerTest](classes/MyBatisAnalyzerTest.md).doesNotRelateStatementWhenMapperMethodNameDoesNotMatch | [AnalysisResult](classes/AnalysisResult.md).mapperStatementRelations | `result.mapperStatementRelations()` |
| [MyBatisMapperXmlParser](classes/MyBatisMapperXmlParser.md).parse | [MyBatisMapperXmlParser](classes/MyBatisMapperXmlParser.md).documentBuilder | `documentBuilder()` |
| [MyBatisMapperXmlParser](classes/MyBatisMapperXmlParser.md).parse | [MyBatisMapperXmlParser](classes/MyBatisMapperXmlParser.md).statements | `statements(root, namespace, sourcePath)` |
| [MyBatisMapperXmlParser](classes/MyBatisMapperXmlParser.md).statements | [MyBatisMapperXmlParser](classes/MyBatisMapperXmlParser.md).normalizeSql | `normalizeSql(element.getTextContent())` |
| [MyBatisMapperXmlParser](classes/MyBatisMapperXmlParser.md).statements | [MyBatisMapperXmlParser](classes/MyBatisMapperXmlParser.md).statementType | `statementType(element.getTagName())` |
| [MyBatisMapperXmlParser](classes/MyBatisMapperXmlParser.md).statements | [MyBatisMapperXmlParser](classes/MyBatisMapperXmlParser.md).tableNames | `tableNames(sql)` |
| [MyBatisMapperXmlParserTest](classes/MyBatisMapperXmlParserTest.md).extractsStatementsDynamicSqlAndTableNames | [MyBatisMapperDoc](classes/MyBatisMapperDoc.md).interfaceName | `mapper.interfaceName()` |
| [MyBatisMapperXmlParserTest](classes/MyBatisMapperXmlParserTest.md).extractsStatementsDynamicSqlAndTableNames | [MyBatisMapperDoc](classes/MyBatisMapperDoc.md).namespace | `mapper.namespace()` |
| [MyBatisMapperXmlParserTest](classes/MyBatisMapperXmlParserTest.md).extractsStatementsDynamicSqlAndTableNames | [MyBatisMapperDoc](classes/MyBatisMapperDoc.md).statements | `mapper.statements()` |
| [MyBatisMapperXmlParserTest](classes/MyBatisMapperXmlParserTest.md).extractsStatementsDynamicSqlAndTableNames | [MyBatisMapperDoc](classes/MyBatisMapperDoc.md).statements | `mapper.statements()` |
| [MyBatisMapperXmlParserTest](classes/MyBatisMapperXmlParserTest.md).extractsStatementsDynamicSqlAndTableNames | [MyBatisMapperDoc](classes/MyBatisMapperDoc.md).statements | `mapper.statements()` |
| [MyBatisMapperXmlParserTest](classes/MyBatisMapperXmlParserTest.md).extractsStatementsDynamicSqlAndTableNames | [MyBatisMapperDoc](classes/MyBatisMapperDoc.md).statements | `mapper.statements()` |
| [MyBatisMapperXmlParserTest](classes/MyBatisMapperXmlParserTest.md).extractsStatementsDynamicSqlAndTableNames | [MyBatisMapperDoc](classes/MyBatisMapperDoc.md).statements | `mapper.statements()` |
| [MyBatisMapperXmlParserTest](classes/MyBatisMapperXmlParserTest.md).extractsStatementsDynamicSqlAndTableNames | [MyBatisMapperDoc](classes/MyBatisMapperDoc.md).statements | `mapper.statements()` |
| [RoleResolver](classes/RoleResolver.md).resolve | [RoleResolver](classes/RoleResolver.md).hasAnnotation | `hasAnnotation(type, "Command")` |
| [RoleResolver](classes/RoleResolver.md).resolve | [RoleResolver](classes/RoleResolver.md).hasSuperType | `hasSuperType(type, "CodeAnalyzerPlugin")` |
| [RoleResolver](classes/RoleResolver.md).resolve | [RoleResolver](classes/RoleResolver.md).hasSuperType | `hasSuperType(type, "DocumentationRenderer")` |
| [RoleResolverTest](classes/RoleResolverTest.md).resolve | [RoleResolver](classes/RoleResolver.md).resolve | `resolver.resolve(type)` |
| [RoleResolverTest](classes/RoleResolverTest.md).resolvesAnalyzerPlugin | [RoleResolverTest](classes/RoleResolverTest.md).resolve | `resolve("class JavaAnalyzer implements CodeAnalyzerPlugin {}")` |
| [RoleResolverTest](classes/RoleResolverTest.md).resolvesCliCommand | [RoleResolverTest](classes/RoleResolverTest.md).resolve | `resolve("@Command class CodeAtlasCli {}")` |
| [RoleResolverTest](classes/RoleResolverTest.md).resolvesDocumentationRenderer | [RoleResolverTest](classes/RoleResolverTest.md).resolve | `resolve("class MarkdownRenderer implements DocumentationRenderer {}")` |
| [RoleResolverTest](classes/RoleResolverTest.md).resolvesDtoByClassName | [RoleResolverTest](classes/RoleResolverTest.md).resolve | `resolve("class UserDTO {}")` |
| [RoleResolverTest](classes/RoleResolverTest.md).returnsDefaultMessageForUnknownRole | [RoleResolverTest](classes/RoleResolverTest.md).resolve | `resolve("class Utility {}")` |
| [SourceScanner](classes/SourceScanner.md).scan | [SourceScanner](classes/SourceScanner.md).isExcludedDirectory | `isExcludedDirectory(root.relativize(dir))` |
| [SourceScanner](classes/SourceScanner.md).scan | [SourceScanner](classes/SourceScanner.md).isResource | `isResource(file, root)` |
| [SourceScanner](classes/SourceScanner.md).scan | [SourceScanner](classes/SourceScanner.md).optionalFile | `optionalFile(root.resolve("build.gradle"))` |
| [SourceScanner](classes/SourceScanner.md).scan | [SourceScanner](classes/SourceScanner.md).optionalFile | `optionalFile(root.resolve("pom.xml"))` |
| [SourceScannerTest](classes/SourceScannerTest.md).collectsSourcesAndExcludesGeneratedAndDocumentationDirectories | [ProjectSource](classes/ProjectSource.md).configFiles | `source.configFiles()` |
| [SourceScannerTest](classes/SourceScannerTest.md).collectsSourcesAndExcludesGeneratedAndDocumentationDirectories | [ProjectSource](classes/ProjectSource.md).javaFiles | `source.javaFiles()` |
| [SourceScannerTest](classes/SourceScannerTest.md).collectsSourcesAndExcludesGeneratedAndDocumentationDirectories | [ProjectSource](classes/ProjectSource.md).javaFiles | `source.javaFiles()` |
| [SourceScannerTest](classes/SourceScannerTest.md).collectsSourcesAndExcludesGeneratedAndDocumentationDirectories | [ProjectSource](classes/ProjectSource.md).resourceFiles | `source.resourceFiles()` |
| [SourceScannerTest](classes/SourceScannerTest.md).collectsSourcesAndExcludesGeneratedAndDocumentationDirectories | [SourceScannerTest](classes/SourceScannerTest.md).create | `create(".git/internal/Hidden.java")` |
| [SourceScannerTest](classes/SourceScannerTest.md).collectsSourcesAndExcludesGeneratedAndDocumentationDirectories | [SourceScannerTest](classes/SourceScannerTest.md).create | `create("docs/generated/Documented.java")` |
| [SourceScannerTest](classes/SourceScannerTest.md).collectsSourcesAndExcludesGeneratedAndDocumentationDirectories | [SourceScannerTest](classes/SourceScannerTest.md).create | `create("src/main/java/example/App.java")` |
| [SourceScannerTest](classes/SourceScannerTest.md).collectsSourcesAndExcludesGeneratedAndDocumentationDirectories | [SourceScannerTest](classes/SourceScannerTest.md).create | `create("src/main/resources/application.yml")` |
| [SourceScannerTest](classes/SourceScannerTest.md).collectsSourcesAndExcludesGeneratedAndDocumentationDirectories | [SourceScannerTest](classes/SourceScannerTest.md).create | `create("src/main/resources/mapper/AppMapper.xml")` |
| [SourceScannerTest](classes/SourceScannerTest.md).collectsSourcesAndExcludesGeneratedAndDocumentationDirectories | [SourceScannerTest](classes/SourceScannerTest.md).create | `create("target/generated/Generated.java")` |
| [SourceScannerTest](classes/SourceScannerTest.md).excludesAdditionalDirectoryNamesAndRelativePaths | [ProjectSource](classes/ProjectSource.md).javaFiles | `source.javaFiles()` |
| [SourceScannerTest](classes/SourceScannerTest.md).excludesAdditionalDirectoryNamesAndRelativePaths | [SourceScannerTest](classes/SourceScannerTest.md).create | `create("examples/demo/src/main/java/example/Demo.java")` |
| [SourceScannerTest](classes/SourceScannerTest.md).excludesAdditionalDirectoryNamesAndRelativePaths | [SourceScannerTest](classes/SourceScannerTest.md).create | `create("fixtures/generated/src/main/java/example/Generated.java")` |
| [SourceScannerTest](classes/SourceScannerTest.md).excludesAdditionalDirectoryNamesAndRelativePaths | [SourceScannerTest](classes/SourceScannerTest.md).create | `create("fixtures/kept/src/main/java/example/Kept.java")` |
| [SourceScannerTest](classes/SourceScannerTest.md).excludesAdditionalDirectoryNamesAndRelativePaths | [SourceScannerTest](classes/SourceScannerTest.md).create | `create("src/main/java/example/App.java")` |
| [SourceScannerTest](classes/SourceScannerTest.md).excludesMultipleAdditionalDirectoryNames | [ProjectSource](classes/ProjectSource.md).javaFiles | `source.javaFiles()` |
| [SourceScannerTest](classes/SourceScannerTest.md).excludesMultipleAdditionalDirectoryNames | [SourceScannerTest](classes/SourceScannerTest.md).create | `create("examples/Demo.java")` |
| [SourceScannerTest](classes/SourceScannerTest.md).excludesMultipleAdditionalDirectoryNames | [SourceScannerTest](classes/SourceScannerTest.md).create | `create("samples/Sample.java")` |
| [SourceScannerTest](classes/SourceScannerTest.md).excludesMultipleAdditionalDirectoryNames | [SourceScannerTest](classes/SourceScannerTest.md).create | `create("src/main/java/example/App.java")` |
| [SpringBootAnalyzer](classes/SpringBootAnalyzer.md).analyze | [AnalysisResult](classes/AnalysisResult.md).classes | `currentResult.classes()` |
| [SpringBootAnalyzer](classes/SpringBootAnalyzer.md).analyze | [JavaAnalyzer](classes/JavaAnalyzer.md).analyze | `javaAnalyzer.analyze(source)` |
| [SpringBootAnalyzer](classes/SpringBootAnalyzer.md).analyze | [JavaAnalyzer](classes/JavaAnalyzer.md).analyze | `javaAnalyzer.analyze(source)` |
| [SpringBootAnalyzer](classes/SpringBootAnalyzer.md).analyze | [SpringBootAnalyzer](classes/SpringBootAnalyzer.md).enrich | `enrich(source, base)` |
| [SpringBootAnalyzer](classes/SpringBootAnalyzer.md).analyze | [SpringBootAnalyzer](classes/SpringBootAnalyzer.md).enrich | `enrich(source, javaAnalyzer.analyze(source))` |
| [SpringBootAnalyzer](classes/SpringBootAnalyzer.md).componentType | [ClassDoc](classes/ClassDoc.md).annotations | `classDoc.annotations()` |
| [SpringBootAnalyzer](classes/SpringBootAnalyzer.md).componentType | [ClassDoc](classes/ClassDoc.md).className | `classDoc.className()` |
| [SpringBootAnalyzer](classes/SpringBootAnalyzer.md).componentType | [ClassDoc](classes/ClassDoc.md).className | `classDoc.className()` |
| [SpringBootAnalyzer](classes/SpringBootAnalyzer.md).endpoint | [SpringBootAnalyzer](classes/SpringBootAnalyzer.md).combinePaths | `combinePaths(classPath, methodPath)` |
| [SpringBootAnalyzer](classes/SpringBootAnalyzer.md).enrich | [AnalysisResult](classes/AnalysisResult.md).classes | `base.classes()` |
| [SpringBootAnalyzer](classes/SpringBootAnalyzer.md).enrich | [AnalysisResult](classes/AnalysisResult.md).configs | `base.configs()` |
| [SpringBootAnalyzer](classes/SpringBootAnalyzer.md).enrich | [AnalysisResult](classes/AnalysisResult.md).mapperStatementRelations | `base.mapperStatementRelations()` |
| [SpringBootAnalyzer](classes/SpringBootAnalyzer.md).enrich | [AnalysisResult](classes/AnalysisResult.md).methodCallRelations | `base.methodCallRelations()` |
| [SpringBootAnalyzer](classes/SpringBootAnalyzer.md).enrich | [AnalysisResult](classes/AnalysisResult.md).methodCalls | `base.methodCalls()` |
| [SpringBootAnalyzer](classes/SpringBootAnalyzer.md).enrich | [AnalysisResult](classes/AnalysisResult.md).relations | `base.relations()` |
| [SpringBootAnalyzer](classes/SpringBootAnalyzer.md).enrich | [AnalysisResult](classes/AnalysisResult.md).sqlStatements | `base.sqlStatements()` |
| [SpringBootAnalyzer](classes/SpringBootAnalyzer.md).enrich | [AnalysisResult](classes/AnalysisResult.md).tableUsages | `base.tableUsages()` |
| [SpringBootAnalyzer](classes/SpringBootAnalyzer.md).enrich | [AnalysisResult](classes/AnalysisResult.md).variableTypes | `base.variableTypes()` |
| [SpringBootAnalyzer](classes/SpringBootAnalyzer.md).enrich | [ProjectSource](classes/ProjectSource.md).rootDirectory | `source.rootDirectory()` |
| [SpringBootAnalyzer](classes/SpringBootAnalyzer.md).enrich | [ProjectSource](classes/ProjectSource.md).rootDirectory | `source.rootDirectory()` |
| [SpringBootAnalyzer](classes/SpringBootAnalyzer.md).enrich | [SpringBootAnalyzer](classes/SpringBootAnalyzer.md).componentType | `componentType(classDoc)` |
| [SpringBootAnalyzer](classes/SpringBootAnalyzer.md).enrich | [SpringBootAnalyzer](classes/SpringBootAnalyzer.md).count | `count(classes, ComponentType.CONTROLLER)` |
| [SpringBootAnalyzer](classes/SpringBootAnalyzer.md).enrich | [SpringBootAnalyzer](classes/SpringBootAnalyzer.md).count | `count(classes, ComponentType.ENTITY)` |
| [SpringBootAnalyzer](classes/SpringBootAnalyzer.md).enrich | [SpringBootAnalyzer](classes/SpringBootAnalyzer.md).count | `count(classes, ComponentType.REPOSITORY)` |
| [SpringBootAnalyzer](classes/SpringBootAnalyzer.md).enrich | [SpringBootAnalyzer](classes/SpringBootAnalyzer.md).count | `count(classes, ComponentType.SERVICE)` |
| [SpringBootAnalyzer](classes/SpringBootAnalyzer.md).enrich | [SpringBootAnalyzer](classes/SpringBootAnalyzer.md).extractEndpoints | `extractEndpoints(source)` |
| [SpringBootAnalyzer](classes/SpringBootAnalyzer.md).enrich | [SpringBootAnalyzer](classes/SpringBootAnalyzer.md).roleSummary | `roleSummary(classDoc)` |
| [SpringBootAnalyzer](classes/SpringBootAnalyzer.md).extractEndpoints | [JavaAnalyzer](classes/JavaAnalyzer.md).parse | `javaAnalyzer.parse(javaFile)` |
| [SpringBootAnalyzer](classes/SpringBootAnalyzer.md).extractEndpoints | [ProjectSource](classes/ProjectSource.md).javaFiles | `source.javaFiles()` |
| [SpringBootAnalyzer](classes/SpringBootAnalyzer.md).extractEndpoints | [ProjectSource](classes/ProjectSource.md).relativePath | `source.relativePath(javaFile)` |
| [SpringBootAnalyzer](classes/SpringBootAnalyzer.md).extractEndpoints | [SpringBootAnalyzer](classes/SpringBootAnalyzer.md).findAnnotation | `findAnnotation(type.getAnnotations(), "RequestMapping")` |
| [SpringBootAnalyzer](classes/SpringBootAnalyzer.md).extractEndpoints | [SpringBootAnalyzer](classes/SpringBootAnalyzer.md).isController | `isController(type)` |
| [SpringBootAnalyzer](classes/SpringBootAnalyzer.md).extractEndpoints | [SpringBootAnalyzer](classes/SpringBootAnalyzer.md).mappingPath | `mappingPath(findAnnotation(type.getAnnotations(), "RequestMapping"))` |
| [SpringBootAnalyzer](classes/SpringBootAnalyzer.md).extractEndpoints | [SpringBootAnalyzer](classes/SpringBootAnalyzer.md).toEndpoints | `toEndpoints(type.getNameAsString(), method, classPath, source.relativePath(javaFile).toString())` |
| [SpringBootAnalyzer](classes/SpringBootAnalyzer.md).mappingPath | [SpringBootAnalyzer](classes/SpringBootAnalyzer.md).firstString | `firstString(pair.getValue())` |
| [SpringBootAnalyzer](classes/SpringBootAnalyzer.md).mappingPath | [SpringBootAnalyzer](classes/SpringBootAnalyzer.md).firstString | `firstString(single.getMemberValue())` |
| [SpringBootAnalyzer](classes/SpringBootAnalyzer.md).requestMethods | [SpringBootAnalyzer](classes/SpringBootAnalyzer.md).expressions | `expressions(pair.getValue())` |
| [SpringBootAnalyzer](classes/SpringBootAnalyzer.md).roleSummary | [ClassDoc](classes/ClassDoc.md).annotations | `classDoc.annotations()` |
| [SpringBootAnalyzer](classes/SpringBootAnalyzer.md).roleSummary | [ClassDoc](classes/ClassDoc.md).roleSummary | `classDoc.roleSummary()` |
| [SpringBootAnalyzer](classes/SpringBootAnalyzer.md).supports | [ProjectSource](classes/ProjectSource.md).javaFiles | `source.javaFiles()` |
| [SpringBootAnalyzer](classes/SpringBootAnalyzer.md).supports | [ProjectSource](classes/ProjectSource.md).pomXml | `source.pomXml()` |
| [SpringBootAnalyzer](classes/SpringBootAnalyzer.md).toEndpoints | [SpringBootAnalyzer](classes/SpringBootAnalyzer.md).endpoint | `endpoint(className, method, httpMethod, classPath, mappingPath(Optional.of(annotation)), sourcePath)` |
| [SpringBootAnalyzer](classes/SpringBootAnalyzer.md).toEndpoints | [SpringBootAnalyzer](classes/SpringBootAnalyzer.md).endpoint | `endpoint(className, method, requestMethod, classPath, mappingPath(Optional.of(annotation)), sourcePath)` |
| [SpringBootAnalyzer](classes/SpringBootAnalyzer.md).toEndpoints | [SpringBootAnalyzer](classes/SpringBootAnalyzer.md).mappingPath | `mappingPath(Optional.of(annotation))` |
| [SpringBootAnalyzer](classes/SpringBootAnalyzer.md).toEndpoints | [SpringBootAnalyzer](classes/SpringBootAnalyzer.md).mappingPath | `mappingPath(Optional.of(annotation))` |
| [SpringBootAnalyzer](classes/SpringBootAnalyzer.md).toEndpoints | [SpringBootAnalyzer](classes/SpringBootAnalyzer.md).requestMethods | `requestMethods(annotation)` |
| [SpringBootAnalyzerTest](classes/SpringBootAnalyzerTest.md).classifiesComponentsAndExtractsCombinedEndpointPaths | [AnalysisResult](classes/AnalysisResult.md).classes | `result.classes()` |
| [SpringBootAnalyzerTest](classes/SpringBootAnalyzerTest.md).classifiesComponentsAndExtractsCombinedEndpointPaths | [AnalysisResult](classes/AnalysisResult.md).classes | `result.classes()` |
| [SpringBootAnalyzerTest](classes/SpringBootAnalyzerTest.md).classifiesComponentsAndExtractsCombinedEndpointPaths | [AnalysisResult](classes/AnalysisResult.md).classes | `result.classes()` |
| [SpringBootAnalyzerTest](classes/SpringBootAnalyzerTest.md).classifiesComponentsAndExtractsCombinedEndpointPaths | [AnalysisResult](classes/AnalysisResult.md).classes | `result.classes()` |
| [SpringBootAnalyzerTest](classes/SpringBootAnalyzerTest.md).classifiesComponentsAndExtractsCombinedEndpointPaths | [AnalysisResult](classes/AnalysisResult.md).classes | `result.classes()` |
| [SpringBootAnalyzerTest](classes/SpringBootAnalyzerTest.md).classifiesComponentsAndExtractsCombinedEndpointPaths | [AnalysisResult](classes/AnalysisResult.md).endpoints | `result.endpoints()` |
| [SpringBootAnalyzerTest](classes/SpringBootAnalyzerTest.md).classifiesComponentsAndExtractsCombinedEndpointPaths | [AnalysisResult](classes/AnalysisResult.md).relations | `result.relations()` |
| [SpringBootAnalyzerTest](classes/SpringBootAnalyzerTest.md).classifiesComponentsAndExtractsCombinedEndpointPaths | [SpringBootAnalyzerTest](classes/SpringBootAnalyzerTest.md).write | `write("src/main/java/example/User.java", """     package example;     @Entity class User {}     """)` |
| [SpringBootAnalyzerTest](classes/SpringBootAnalyzerTest.md).classifiesComponentsAndExtractsCombinedEndpointPaths | [SpringBootAnalyzerTest](classes/SpringBootAnalyzerTest.md).write | `write("src/main/java/example/UserController.java", """     package example;     import org.springframework.web.bind.annotation.*;     @RestController     @RequestMapping("/api/users")     class UserController {         private UserService userService;              @GetMapping("/{id}")         String findById(Long id) { return ""; }              @RequestMapping(path = "/search", method = RequestMethod.GET)         String search() { return ""; }     }     """)` |
| [SpringBootAnalyzerTest](classes/SpringBootAnalyzerTest.md).classifiesComponentsAndExtractsCombinedEndpointPaths | [SpringBootAnalyzerTest](classes/SpringBootAnalyzerTest.md).write | `write("src/main/java/example/UserRepository.java", """     package example;     @Repository interface UserRepository {}     """)` |
| [SpringBootAnalyzerTest](classes/SpringBootAnalyzerTest.md).classifiesComponentsAndExtractsCombinedEndpointPaths | [SpringBootAnalyzerTest](classes/SpringBootAnalyzerTest.md).write | `write("src/main/java/example/UserService.java", """     package example;     @Service class UserService {}     """)` |
