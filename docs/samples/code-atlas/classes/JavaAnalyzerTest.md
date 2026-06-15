# JavaAnalyzerTest

## Summary

* Package: `io.github.codeatlas.plugin.java`
* Declaration: `CLASS`
* Type: `UNKNOWN`
* Source: `code-atlas-plugin-java/src/test/java/io/github/codeatlas/plugin/java/JavaAnalyzerTest.java`

## Role

コードから機械的に判定できる役割情報はありません。

## Annotations

None

## Methods

| Method | Return Type | Parameters | Annotations |
| --- | --- | --- | --- |
| extractsClassPackageMethodsAnnotationsAndFields | `void` |  | Test |
| extractsRelationFromFieldType | `void` |  | Test |
| extractsRelationFromConstructorParameter | `void` |  | Test |
| extractsRelationFromMethodParameter | `void` |  | Test |
| extractsRelationFromGenericMethodReturnTypeAndIgnoresExternalTypes | `void` |  | Test |
| extractsScopedUnscopedThisAndMultipleMethodCalls | `void` |  | Test |
| extractsVariableTypesAndResolvesScopesByPriority | `void` |  | Test |
| classifiesUtilityCallsAndKeepsOnlyResolvedProjectCallsAsProject | `void` |  | Test |
| analyze | `AnalysisResult` |  |  |
| write | `void` | String fileName, String content |  |

## Fields

| Name | Type | Annotations |
| --- | --- | --- |
| tempDir | `Path` | TempDir |

## Method Call Relations

### Outgoing Calls

| Target | Expression |
| --- | --- |
| [AnalysisResult](AnalysisResult.md).methodCallRelations | `result.methodCallRelations()` |
| [AnalysisResult](AnalysisResult.md).methodCalls | `result.methodCalls()` |
| [AnalysisResult](AnalysisResult.md).methodCalls | `result.methodCalls()` |
| [AnalysisResult](AnalysisResult.md).methodCalls | `result.methodCalls()` |
| [JavaAnalyzerTest](JavaAnalyzerTest.md).analyze | `analyze()` |
| [JavaAnalyzerTest](JavaAnalyzerTest.md).write | `write("CallExample.java", """     import java.util.List;     class CallExample {         private ProjectService projectService;              void run(List<ProjectService> values) {             projectService.execute();             values.stream().map(String::trim).filter(String::isEmpty).toList();         }     }     """)` |
| [JavaAnalyzerTest](JavaAnalyzerTest.md).write | `write("ProjectService.java", "class ProjectService { void execute() {} }")` |
| [ClassDoc](ClassDoc.md).annotations | `result.annotations()` |
| [ClassDoc](ClassDoc.md).className | `result.className()` |
| [ClassDoc](ClassDoc.md).fields | `result.fields()` |
| [ClassDoc](ClassDoc.md).methods | `result.methods()` |
| [ClassDoc](ClassDoc.md).packageName | `result.packageName()` |
| [AnalysisResult](AnalysisResult.md).relations | `result.relations()` |
| [JavaAnalyzerTest](JavaAnalyzerTest.md).analyze | `analyze()` |
| [JavaAnalyzerTest](JavaAnalyzerTest.md).write | `write("SourceController.java", """     class SourceController {         SourceController(TargetService targetService) {}     }     """)` |
| [JavaAnalyzerTest](JavaAnalyzerTest.md).write | `write("TargetService.java", "class TargetService {}")` |
| [AnalysisResult](AnalysisResult.md).relations | `result.relations()` |
| [JavaAnalyzerTest](JavaAnalyzerTest.md).analyze | `analyze()` |
| [JavaAnalyzerTest](JavaAnalyzerTest.md).write | `write("SourceController.java", """     class SourceController {         private TargetService targetService;     }     """)` |
| [JavaAnalyzerTest](JavaAnalyzerTest.md).write | `write("TargetService.java", "class TargetService {}")` |
| [AnalysisResult](AnalysisResult.md).relations | `result.relations()` |
| [JavaAnalyzerTest](JavaAnalyzerTest.md).analyze | `analyze()` |
| [JavaAnalyzerTest](JavaAnalyzerTest.md).write | `write("SourceService.java", """     import java.util.List;     class SourceService {         List<TargetDto> findAll() { return List.of(); }     }     """)` |
| [JavaAnalyzerTest](JavaAnalyzerTest.md).write | `write("TargetDto.java", "class TargetDto {}")` |
| [AnalysisResult](AnalysisResult.md).relations | `result.relations()` |
| [JavaAnalyzerTest](JavaAnalyzerTest.md).analyze | `analyze()` |
| [JavaAnalyzerTest](JavaAnalyzerTest.md).write | `write("SourceService.java", """     class SourceService {         void save(TargetDto request) {}     }     """)` |
| [JavaAnalyzerTest](JavaAnalyzerTest.md).write | `write("TargetDto.java", "class TargetDto {}")` |
| [AnalysisResult](AnalysisResult.md).methodCalls | `result.methodCalls()` |
| [AnalysisResult](AnalysisResult.md).methodCalls | `result.methodCalls()` |
| [JavaAnalyzerTest](JavaAnalyzerTest.md).analyze | `analyze()` |
| [JavaAnalyzerTest](JavaAnalyzerTest.md).write | `write("UserController.java", """     class UserController {         private UserService userService;              void findAll() {             userService.findAll();             helper();         }              void findOne() {             this.helper();         }              void helper() {}     }     """)` |
| [JavaAnalyzerTest](JavaAnalyzerTest.md).write | `write("UserService.java", "class UserService { void findAll() {} }")` |
| [AnalysisResult](AnalysisResult.md).methodCalls | `result.methodCalls()` |
| [AnalysisResult](AnalysisResult.md).variableTypes | `result.variableTypes()` |
| [JavaAnalyzerTest](JavaAnalyzerTest.md).analyze | `analyze()` |
| [JavaAnalyzerTest](JavaAnalyzerTest.md).write | `write("ProjectClient.java", "class ProjectClient { void call() {} }")` |
| [JavaAnalyzerTest](JavaAnalyzerTest.md).write | `write("ScopeExample.java", """     class ScopeExample {         private ProjectClient fieldClient;              ScopeExample(ProjectClient fieldClient) {             this.fieldClient = fieldClient;         }              void execute(ProjectClient parameterClient) {             ProjectClient localClient = fieldClient;             localClient.call();             parameterClient.call();             fieldClient.call();             unknown.call();         }     }     """)` |

### Incoming Calls

| Source | Expression |
| --- | --- |
| [JavaAnalyzerTest](JavaAnalyzerTest.md).classifiesUtilityCallsAndKeepsOnlyResolvedProjectCallsAsProject | `analyze()` |
| [JavaAnalyzerTest](JavaAnalyzerTest.md).classifiesUtilityCallsAndKeepsOnlyResolvedProjectCallsAsProject | `write("CallExample.java", """     import java.util.List;     class CallExample {         private ProjectService projectService;              void run(List<ProjectService> values) {             projectService.execute();             values.stream().map(String::trim).filter(String::isEmpty).toList();         }     }     """)` |
| [JavaAnalyzerTest](JavaAnalyzerTest.md).classifiesUtilityCallsAndKeepsOnlyResolvedProjectCallsAsProject | `write("ProjectService.java", "class ProjectService { void execute() {} }")` |
| [JavaAnalyzerTest](JavaAnalyzerTest.md).extractsRelationFromConstructorParameter | `analyze()` |
| [JavaAnalyzerTest](JavaAnalyzerTest.md).extractsRelationFromConstructorParameter | `write("SourceController.java", """     class SourceController {         SourceController(TargetService targetService) {}     }     """)` |
| [JavaAnalyzerTest](JavaAnalyzerTest.md).extractsRelationFromConstructorParameter | `write("TargetService.java", "class TargetService {}")` |
| [JavaAnalyzerTest](JavaAnalyzerTest.md).extractsRelationFromFieldType | `analyze()` |
| [JavaAnalyzerTest](JavaAnalyzerTest.md).extractsRelationFromFieldType | `write("SourceController.java", """     class SourceController {         private TargetService targetService;     }     """)` |
| [JavaAnalyzerTest](JavaAnalyzerTest.md).extractsRelationFromFieldType | `write("TargetService.java", "class TargetService {}")` |
| [JavaAnalyzerTest](JavaAnalyzerTest.md).extractsRelationFromGenericMethodReturnTypeAndIgnoresExternalTypes | `analyze()` |
| [JavaAnalyzerTest](JavaAnalyzerTest.md).extractsRelationFromGenericMethodReturnTypeAndIgnoresExternalTypes | `write("SourceService.java", """     import java.util.List;     class SourceService {         List<TargetDto> findAll() { return List.of(); }     }     """)` |
| [JavaAnalyzerTest](JavaAnalyzerTest.md).extractsRelationFromGenericMethodReturnTypeAndIgnoresExternalTypes | `write("TargetDto.java", "class TargetDto {}")` |
| [JavaAnalyzerTest](JavaAnalyzerTest.md).extractsRelationFromMethodParameter | `analyze()` |
| [JavaAnalyzerTest](JavaAnalyzerTest.md).extractsRelationFromMethodParameter | `write("SourceService.java", """     class SourceService {         void save(TargetDto request) {}     }     """)` |
| [JavaAnalyzerTest](JavaAnalyzerTest.md).extractsRelationFromMethodParameter | `write("TargetDto.java", "class TargetDto {}")` |
| [JavaAnalyzerTest](JavaAnalyzerTest.md).extractsScopedUnscopedThisAndMultipleMethodCalls | `analyze()` |
| [JavaAnalyzerTest](JavaAnalyzerTest.md).extractsScopedUnscopedThisAndMultipleMethodCalls | `write("UserController.java", """     class UserController {         private UserService userService;              void findAll() {             userService.findAll();             helper();         }              void findOne() {             this.helper();         }              void helper() {}     }     """)` |
| [JavaAnalyzerTest](JavaAnalyzerTest.md).extractsScopedUnscopedThisAndMultipleMethodCalls | `write("UserService.java", "class UserService { void findAll() {} }")` |
| [JavaAnalyzerTest](JavaAnalyzerTest.md).extractsVariableTypesAndResolvesScopesByPriority | `analyze()` |
| [JavaAnalyzerTest](JavaAnalyzerTest.md).extractsVariableTypesAndResolvesScopesByPriority | `write("ProjectClient.java", "class ProjectClient { void call() {} }")` |
| [JavaAnalyzerTest](JavaAnalyzerTest.md).extractsVariableTypesAndResolvesScopesByPriority | `write("ScopeExample.java", """     class ScopeExample {         private ProjectClient fieldClient;              ScopeExample(ProjectClient fieldClient) {             this.fieldClient = fieldClient;         }              void execute(ProjectClient parameterClient) {             ProjectClient localClient = fieldClient;             localClient.call();             parameterClient.call();             fieldClient.call();             unknown.call();         }     }     """)` |

## Method Calls

### Project Calls

| Source Method | Scope | Resolved Target | Called Method | Expression |
| --- | --- | --- | --- | --- |
| classifiesUtilityCallsAndKeepsOnlyResolvedProjectCallsAsProject |  | JavaAnalyzerTest | analyze | `analyze()` |
| classifiesUtilityCallsAndKeepsOnlyResolvedProjectCallsAsProject | result | AnalysisResult | methodCallRelations | `result.methodCallRelations()` |
| classifiesUtilityCallsAndKeepsOnlyResolvedProjectCallsAsProject | result | AnalysisResult | methodCalls | `result.methodCalls()` |
| classifiesUtilityCallsAndKeepsOnlyResolvedProjectCallsAsProject | result | AnalysisResult | methodCalls | `result.methodCalls()` |
| classifiesUtilityCallsAndKeepsOnlyResolvedProjectCallsAsProject | result | AnalysisResult | methodCalls | `result.methodCalls()` |
| classifiesUtilityCallsAndKeepsOnlyResolvedProjectCallsAsProject |  | JavaAnalyzerTest | write | `write("CallExample.java", """     import java.util.List;     class CallExample {         private ProjectService projectService;              void run(List<ProjectService> values) {             projectService.execute();             values.stream().map(String::trim).filter(String::isEmpty).toList();         }     }     """)` |
| classifiesUtilityCallsAndKeepsOnlyResolvedProjectCallsAsProject |  | JavaAnalyzerTest | write | `write("ProjectService.java", "class ProjectService { void execute() {} }")` |
| extractsClassPackageMethodsAnnotationsAndFields | result | ClassDoc | annotations | `result.annotations()` |
| extractsClassPackageMethodsAnnotationsAndFields | result | ClassDoc | className | `result.className()` |
| extractsClassPackageMethodsAnnotationsAndFields | result | ClassDoc | fields | `result.fields()` |
| extractsClassPackageMethodsAnnotationsAndFields | result | ClassDoc | methods | `result.methods()` |
| extractsClassPackageMethodsAnnotationsAndFields | result | ClassDoc | packageName | `result.packageName()` |
| extractsRelationFromConstructorParameter |  | JavaAnalyzerTest | analyze | `analyze()` |
| extractsRelationFromConstructorParameter | result | AnalysisResult | relations | `result.relations()` |
| extractsRelationFromConstructorParameter |  | JavaAnalyzerTest | write | `write("SourceController.java", """     class SourceController {         SourceController(TargetService targetService) {}     }     """)` |
| extractsRelationFromConstructorParameter |  | JavaAnalyzerTest | write | `write("TargetService.java", "class TargetService {}")` |
| extractsRelationFromFieldType |  | JavaAnalyzerTest | analyze | `analyze()` |
| extractsRelationFromFieldType | result | AnalysisResult | relations | `result.relations()` |
| extractsRelationFromFieldType |  | JavaAnalyzerTest | write | `write("SourceController.java", """     class SourceController {         private TargetService targetService;     }     """)` |
| extractsRelationFromFieldType |  | JavaAnalyzerTest | write | `write("TargetService.java", "class TargetService {}")` |
| extractsRelationFromGenericMethodReturnTypeAndIgnoresExternalTypes |  | JavaAnalyzerTest | analyze | `analyze()` |
| extractsRelationFromGenericMethodReturnTypeAndIgnoresExternalTypes | result | AnalysisResult | relations | `result.relations()` |
| extractsRelationFromGenericMethodReturnTypeAndIgnoresExternalTypes |  | JavaAnalyzerTest | write | `write("SourceService.java", """     import java.util.List;     class SourceService {         List<TargetDto> findAll() { return List.of(); }     }     """)` |
| extractsRelationFromGenericMethodReturnTypeAndIgnoresExternalTypes |  | JavaAnalyzerTest | write | `write("TargetDto.java", "class TargetDto {}")` |
| extractsRelationFromMethodParameter |  | JavaAnalyzerTest | analyze | `analyze()` |
| extractsRelationFromMethodParameter | result | AnalysisResult | relations | `result.relations()` |
| extractsRelationFromMethodParameter |  | JavaAnalyzerTest | write | `write("SourceService.java", """     class SourceService {         void save(TargetDto request) {}     }     """)` |
| extractsRelationFromMethodParameter |  | JavaAnalyzerTest | write | `write("TargetDto.java", "class TargetDto {}")` |
| extractsScopedUnscopedThisAndMultipleMethodCalls |  | JavaAnalyzerTest | analyze | `analyze()` |
| extractsScopedUnscopedThisAndMultipleMethodCalls | result | AnalysisResult | methodCalls | `result.methodCalls()` |
| extractsScopedUnscopedThisAndMultipleMethodCalls | result | AnalysisResult | methodCalls | `result.methodCalls()` |
| extractsScopedUnscopedThisAndMultipleMethodCalls |  | JavaAnalyzerTest | write | `write("UserController.java", """     class UserController {         private UserService userService;              void findAll() {             userService.findAll();             helper();         }              void findOne() {             this.helper();         }              void helper() {}     }     """)` |
| extractsScopedUnscopedThisAndMultipleMethodCalls |  | JavaAnalyzerTest | write | `write("UserService.java", "class UserService { void findAll() {} }")` |
| extractsVariableTypesAndResolvesScopesByPriority |  | JavaAnalyzerTest | analyze | `analyze()` |
| extractsVariableTypesAndResolvesScopesByPriority | result | AnalysisResult | methodCalls | `result.methodCalls()` |
| extractsVariableTypesAndResolvesScopesByPriority | result | AnalysisResult | variableTypes | `result.variableTypes()` |
| extractsVariableTypesAndResolvesScopesByPriority |  | JavaAnalyzerTest | write | `write("ProjectClient.java", "class ProjectClient { void call() {} }")` |
| extractsVariableTypesAndResolvesScopesByPriority |  | JavaAnalyzerTest | write | `write("ScopeExample.java", """     class ScopeExample {         private ProjectClient fieldClient;              ScopeExample(ProjectClient fieldClient) {             this.fieldClient = fieldClient;         }              void execute(ProjectClient parameterClient) {             ProjectClient localClient = fieldClient;             localClient.call();             parameterClient.call();             fieldClient.call();             unknown.call();         }     }     """)` |

### Library / Utility Calls

Library / Utility calls are omitted from this page. Count: 139.

## Related Classes

### Outgoing References

| Target | Relation | Member |
| --- | --- | --- |
| [AnalysisResult](AnalysisResult.md) | METHOD_RETURN_TYPE | analyze |

### Incoming References

| Source | Relation | Member |
| --- | --- | --- |
| - | - | - |
