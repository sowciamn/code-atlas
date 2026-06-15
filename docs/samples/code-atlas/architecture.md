# Architecture

## Application

* [DemoApplication](classes/DemoApplication.md)

## Controller

* [UserController](classes/UserController.md)

## Service

* [UserService](classes/UserService.md)

## Repository

* [UserRepository](classes/UserRepository.md)

## Entity

* [User](classes/User.md)

## Configuration

None

## Component

None

## DTO

* [UserDto](classes/UserDto.md)

## Unknown

* [AnalysisEngine](classes/AnalysisEngine.md)
* [AnalysisEngineTest](classes/AnalysisEngineTest.md)
* [AnalysisResult](classes/AnalysisResult.md)
* [ApiEndpointDoc](classes/ApiEndpointDoc.md)
* [ClassDoc](classes/ClassDoc.md)
* [ClassRelationDoc](classes/ClassRelationDoc.md)
* [CodeAnalyzerPlugin](classes/CodeAnalyzerPlugin.md)
* [CodeAtlasCli](classes/CodeAtlasCli.md)
* [ComponentType](classes/ComponentType.md)
* [ConfigDoc](classes/ConfigDoc.md)
* [DocumentationRenderer](classes/DocumentationRenderer.md)
* [FieldDoc](classes/FieldDoc.md)
* [HouseholdAccountBookMapper](classes/HouseholdAccountBookMapper.md)
* [JavaAnalyzer](classes/JavaAnalyzer.md)
* [JavaAnalyzerTest](classes/JavaAnalyzerTest.md)
* [MarkdownRenderer](classes/MarkdownRenderer.md)
* [MarkdownRendererTest](classes/MarkdownRendererTest.md)
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
| [JavaAnalyzer](classes/JavaAnalyzer.md) | [MethodDoc](classes/MethodDoc.md) | METHOD_RETURN_TYPE | toMethodDoc |
| [JavaAnalyzer](classes/JavaAnalyzer.md) | [ProjectSource](classes/ProjectSource.md) | METHOD_PARAMETER | source |
| [JavaAnalyzer](classes/JavaAnalyzer.md) | [RelationType](classes/RelationType.md) | METHOD_PARAMETER | relationType |
| [JavaAnalyzerTest](classes/JavaAnalyzerTest.md) | [AnalysisResult](classes/AnalysisResult.md) | METHOD_RETURN_TYPE | analyze |
| [MarkdownRenderer](classes/MarkdownRenderer.md) | [AnalysisResult](classes/AnalysisResult.md) | METHOD_PARAMETER | result |
| [MarkdownRenderer](classes/MarkdownRenderer.md) | [ClassDoc](classes/ClassDoc.md) | METHOD_PARAMETER | classDoc |
| [MarkdownRenderer](classes/MarkdownRenderer.md) | [ClassDoc](classes/ClassDoc.md) | METHOD_PARAMETER | classes |
| [MarkdownRenderer](classes/MarkdownRenderer.md) | [ClassRelationDoc](classes/ClassRelationDoc.md) | FIELD | RELATION_ORDER |
| [MarkdownRenderer](classes/MarkdownRenderer.md) | [ClassRelationDoc](classes/ClassRelationDoc.md) | METHOD_PARAMETER | relations |
| [MarkdownRenderer](classes/MarkdownRenderer.md) | [ClassRelationDoc](classes/ClassRelationDoc.md) | METHOD_RETURN_TYPE | sortedRelations |
| [MarkdownRenderer](classes/MarkdownRenderer.md) | [ComponentType](classes/ComponentType.md) | METHOD_PARAMETER | type |
| [MarkdownRenderer](classes/MarkdownRenderer.md) | [ConfigDoc](classes/ConfigDoc.md) | METHOD_PARAMETER | configs |
| [MarkdownRenderer](classes/MarkdownRenderer.md) | [MethodDoc](classes/MethodDoc.md) | METHOD_PARAMETER | method |
| [MarkdownRenderer](classes/MarkdownRenderer.md) | [ProjectOverview](classes/ProjectOverview.md) | METHOD_PARAMETER | overview |
| [MarkdownRenderer](classes/MarkdownRenderer.md) | [SqlStatementDoc](classes/SqlStatementDoc.md) | METHOD_PARAMETER | statements |
| [MarkdownRenderer](classes/MarkdownRenderer.md) | [TableUsageDoc](classes/TableUsageDoc.md) | METHOD_PARAMETER | usages |
| [MyBatisAnalyzer](classes/MyBatisAnalyzer.md) | [AnalysisResult](classes/AnalysisResult.md) | METHOD_PARAMETER | currentResult |
| [MyBatisAnalyzer](classes/MyBatisAnalyzer.md) | [AnalysisResult](classes/AnalysisResult.md) | METHOD_RETURN_TYPE | analyze |
| [MyBatisAnalyzer](classes/MyBatisAnalyzer.md) | [ClassDoc](classes/ClassDoc.md) | METHOD_PARAMETER | classDoc |
| [MyBatisAnalyzer](classes/MyBatisAnalyzer.md) | [ClassDoc](classes/ClassDoc.md) | METHOD_RETURN_TYPE | applyMapperRole |
| [MyBatisAnalyzer](classes/MyBatisAnalyzer.md) | [MyBatisMapperXmlParser](classes/MyBatisMapperXmlParser.md) | FIELD | parser |
| [MyBatisAnalyzer](classes/MyBatisAnalyzer.md) | [ProjectSource](classes/ProjectSource.md) | METHOD_PARAMETER | source |
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
| [UserController](classes/UserController.md) | [UserDto](classes/UserDto.md) | METHOD_PARAMETER | request |
| [UserController](classes/UserController.md) | [UserDto](classes/UserDto.md) | METHOD_RETURN_TYPE | create |
| [UserController](classes/UserController.md) | [UserDto](classes/UserDto.md) | METHOD_RETURN_TYPE | findAll |
| [UserController](classes/UserController.md) | [UserDto](classes/UserDto.md) | METHOD_RETURN_TYPE | findById |
| [UserController](classes/UserController.md) | [UserService](classes/UserService.md) | CONSTRUCTOR_PARAMETER | userService |
| [UserController](classes/UserController.md) | [UserService](classes/UserService.md) | FIELD | userService |
| [UserService](classes/UserService.md) | [UserDto](classes/UserDto.md) | METHOD_PARAMETER | request |
| [UserService](classes/UserService.md) | [UserDto](classes/UserDto.md) | METHOD_RETURN_TYPE | create |
| [UserService](classes/UserService.md) | [UserDto](classes/UserDto.md) | METHOD_RETURN_TYPE | findAll |
| [UserService](classes/UserService.md) | [UserDto](classes/UserDto.md) | METHOD_RETURN_TYPE | findById |
