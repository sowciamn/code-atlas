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
| analyze | `AnalysisResult` |  |  |
| write | `void` | String fileName, String content |  |

## Fields

| Name | Type | Annotations |
| --- | --- | --- |
| tempDir | `Path` | TempDir |

## Method Calls

| Source Method | Scope | Called Method | Expression |
| --- | --- | --- | --- |
| analyze | new JavaAnalyzer() | analyze | `new JavaAnalyzer().analyze(new SourceScanner().scan(tempDir))` |
| analyze | new SourceScanner() | scan | `new SourceScanner().scan(tempDir)` |
| extractsClassPackageMethodsAnnotationsAndFields | Files | createDirectories | `Files.createDirectories(sourceFile.getParent())` |
| extractsClassPackageMethodsAnnotationsAndFields | Files | writeString | `Files.writeString(sourceFile, """     package example;          @Deprecated     public class GreetingService {         private final String prefix = "Hello";              @Override         public String toString() {             return prefix;         }     }     """)` |
| extractsClassPackageMethodsAnnotationsAndFields |  | assertThat | `assertThat(field.name())` |
| extractsClassPackageMethodsAnnotationsAndFields | assertThat(field.name()) | isEqualTo | `assertThat(field.name()).isEqualTo("prefix")` |
| extractsClassPackageMethodsAnnotationsAndFields |  | assertThat | `assertThat(field.type())` |
| extractsClassPackageMethodsAnnotationsAndFields | assertThat(field.type()) | isEqualTo | `assertThat(field.type()).isEqualTo("String")` |
| extractsClassPackageMethodsAnnotationsAndFields |  | assertThat | `assertThat(method.annotations())` |
| extractsClassPackageMethodsAnnotationsAndFields | assertThat(method.annotations()) | containsExactly | `assertThat(method.annotations()).containsExactly("Override")` |
| extractsClassPackageMethodsAnnotationsAndFields |  | assertThat | `assertThat(method.methodName())` |
| extractsClassPackageMethodsAnnotationsAndFields | assertThat(method.methodName()) | isEqualTo | `assertThat(method.methodName()).isEqualTo("toString")` |
| extractsClassPackageMethodsAnnotationsAndFields |  | assertThat | `assertThat(method.returnType())` |
| extractsClassPackageMethodsAnnotationsAndFields | assertThat(method.returnType()) | isEqualTo | `assertThat(method.returnType()).isEqualTo("String")` |
| extractsClassPackageMethodsAnnotationsAndFields |  | assertThat | `assertThat(result.annotations())` |
| extractsClassPackageMethodsAnnotationsAndFields | assertThat(result.annotations()) | containsExactly | `assertThat(result.annotations()).containsExactly("Deprecated")` |
| extractsClassPackageMethodsAnnotationsAndFields |  | assertThat | `assertThat(result.className())` |
| extractsClassPackageMethodsAnnotationsAndFields | assertThat(result.className()) | isEqualTo | `assertThat(result.className()).isEqualTo("GreetingService")` |
| extractsClassPackageMethodsAnnotationsAndFields |  | assertThat | `assertThat(result.fields())` |
| extractsClassPackageMethodsAnnotationsAndFields | assertThat(result.fields()) | singleElement | `assertThat(result.fields()).singleElement()` |
| extractsClassPackageMethodsAnnotationsAndFields | assertThat(result.fields()).singleElement() | satisfies | `assertThat(result.fields()).singleElement().satisfies(field -> {     assertThat(field.type()).isEqualTo("String");     assertThat(field.name()).isEqualTo("prefix"); })` |
| extractsClassPackageMethodsAnnotationsAndFields |  | assertThat | `assertThat(result.methods())` |
| extractsClassPackageMethodsAnnotationsAndFields | assertThat(result.methods()) | singleElement | `assertThat(result.methods()).singleElement()` |
| extractsClassPackageMethodsAnnotationsAndFields | assertThat(result.methods()).singleElement() | satisfies | `assertThat(result.methods()).singleElement().satisfies(method -> {     assertThat(method.methodName()).isEqualTo("toString");     assertThat(method.returnType()).isEqualTo("String");     assertThat(method.annotations()).containsExactly("Override"); })` |
| extractsClassPackageMethodsAnnotationsAndFields |  | assertThat | `assertThat(result.packageName())` |
| extractsClassPackageMethodsAnnotationsAndFields | assertThat(result.packageName()) | isEqualTo | `assertThat(result.packageName()).isEqualTo("example")` |
| extractsClassPackageMethodsAnnotationsAndFields | field | name | `field.name()` |
| extractsClassPackageMethodsAnnotationsAndFields | field | type | `field.type()` |
| extractsClassPackageMethodsAnnotationsAndFields | method | annotations | `method.annotations()` |
| extractsClassPackageMethodsAnnotationsAndFields | method | methodName | `method.methodName()` |
| extractsClassPackageMethodsAnnotationsAndFields | method | returnType | `method.returnType()` |
| extractsClassPackageMethodsAnnotationsAndFields | new JavaAnalyzer() | analyzeClasses | `new JavaAnalyzer().analyzeClasses(new SourceScanner().scan(tempDir))` |
| extractsClassPackageMethodsAnnotationsAndFields | new JavaAnalyzer().analyzeClasses(new SourceScanner().scan(tempDir)) | getFirst | `new JavaAnalyzer().analyzeClasses(new SourceScanner().scan(tempDir)).getFirst()` |
| extractsClassPackageMethodsAnnotationsAndFields | new SourceScanner() | scan | `new SourceScanner().scan(tempDir)` |
| extractsClassPackageMethodsAnnotationsAndFields | result | annotations | `result.annotations()` |
| extractsClassPackageMethodsAnnotationsAndFields | result | className | `result.className()` |
| extractsClassPackageMethodsAnnotationsAndFields | result | fields | `result.fields()` |
| extractsClassPackageMethodsAnnotationsAndFields | result | methods | `result.methods()` |
| extractsClassPackageMethodsAnnotationsAndFields | result | packageName | `result.packageName()` |
| extractsClassPackageMethodsAnnotationsAndFields | sourceFile | getParent | `sourceFile.getParent()` |
| extractsClassPackageMethodsAnnotationsAndFields | tempDir | resolve | `tempDir.resolve("src/main/java/example/GreetingService.java")` |
| extractsRelationFromConstructorParameter |  | analyze | `analyze()` |
| extractsRelationFromConstructorParameter |  | assertThat | `assertThat(result.relations())` |
| extractsRelationFromConstructorParameter | assertThat(result.relations()) | extracting | `assertThat(result.relations()).extracting(relation -> relation.relationType(), relation -> relation.sourceMemberName())` |
| extractsRelationFromConstructorParameter | assertThat(result.relations()).extracting(relation -> relation.relationType(), relation -> relation.sourceMemberName()) | containsExactly | `assertThat(result.relations()).extracting(relation -> relation.relationType(), relation -> relation.sourceMemberName()).containsExactly(tuple(RelationType.CONSTRUCTOR_PARAMETER, "targetService"))` |
| extractsRelationFromConstructorParameter | relation | relationType | `relation.relationType()` |
| extractsRelationFromConstructorParameter | relation | sourceMemberName | `relation.sourceMemberName()` |
| extractsRelationFromConstructorParameter | result | relations | `result.relations()` |
| extractsRelationFromConstructorParameter |  | tuple | `tuple(RelationType.CONSTRUCTOR_PARAMETER, "targetService")` |
| extractsRelationFromConstructorParameter |  | write | `write("SourceController.java", """     class SourceController {         SourceController(TargetService targetService) {}     }     """)` |
| extractsRelationFromConstructorParameter |  | write | `write("TargetService.java", "class TargetService {}")` |
| extractsRelationFromFieldType |  | analyze | `analyze()` |
| extractsRelationFromFieldType |  | assertThat | `assertThat(result.relations())` |
| extractsRelationFromFieldType | assertThat(result.relations()) | extracting | `assertThat(result.relations()).extracting(relation -> relation.sourceClassName(), relation -> relation.targetClassName(), relation -> relation.relationType(), relation -> relation.sourceMemberName())` |
| extractsRelationFromFieldType | assertThat(result.relations()).extracting(relation -> relation.sourceClassName(), relation -> relation.targetClassName(), relation -> relation.relationType(), relation -> relation.sourceMemberName()) | containsExactly | `assertThat(result.relations()).extracting(relation -> relation.sourceClassName(), relation -> relation.targetClassName(), relation -> relation.relationType(), relation -> relation.sourceMemberName()).containsExactly(tuple("SourceController", "TargetService", RelationType.FIELD, "targetService"))` |
| extractsRelationFromFieldType | relation | relationType | `relation.relationType()` |
| extractsRelationFromFieldType | relation | sourceClassName | `relation.sourceClassName()` |
| extractsRelationFromFieldType | relation | sourceMemberName | `relation.sourceMemberName()` |
| extractsRelationFromFieldType | relation | targetClassName | `relation.targetClassName()` |
| extractsRelationFromFieldType | result | relations | `result.relations()` |
| extractsRelationFromFieldType |  | tuple | `tuple("SourceController", "TargetService", RelationType.FIELD, "targetService")` |
| extractsRelationFromFieldType |  | write | `write("SourceController.java", """     class SourceController {         private TargetService targetService;     }     """)` |
| extractsRelationFromFieldType |  | write | `write("TargetService.java", "class TargetService {}")` |
| extractsRelationFromGenericMethodReturnTypeAndIgnoresExternalTypes |  | analyze | `analyze()` |
| extractsRelationFromGenericMethodReturnTypeAndIgnoresExternalTypes |  | assertThat | `assertThat(result.relations())` |
| extractsRelationFromGenericMethodReturnTypeAndIgnoresExternalTypes | assertThat(result.relations()) | extracting | `assertThat(result.relations()).extracting(relation -> relation.targetClassName(), relation -> relation.relationType(), relation -> relation.sourceMemberName())` |
| extractsRelationFromGenericMethodReturnTypeAndIgnoresExternalTypes | assertThat(result.relations()).extracting(relation -> relation.targetClassName(), relation -> relation.relationType(), relation -> relation.sourceMemberName()) | containsExactly | `assertThat(result.relations()).extracting(relation -> relation.targetClassName(), relation -> relation.relationType(), relation -> relation.sourceMemberName()).containsExactly(tuple("TargetDto", RelationType.METHOD_RETURN_TYPE, "findAll"))` |
| extractsRelationFromGenericMethodReturnTypeAndIgnoresExternalTypes | relation | relationType | `relation.relationType()` |
| extractsRelationFromGenericMethodReturnTypeAndIgnoresExternalTypes | relation | sourceMemberName | `relation.sourceMemberName()` |
| extractsRelationFromGenericMethodReturnTypeAndIgnoresExternalTypes | relation | targetClassName | `relation.targetClassName()` |
| extractsRelationFromGenericMethodReturnTypeAndIgnoresExternalTypes | result | relations | `result.relations()` |
| extractsRelationFromGenericMethodReturnTypeAndIgnoresExternalTypes |  | tuple | `tuple("TargetDto", RelationType.METHOD_RETURN_TYPE, "findAll")` |
| extractsRelationFromGenericMethodReturnTypeAndIgnoresExternalTypes |  | write | `write("SourceService.java", """     import java.util.List;     class SourceService {         List<TargetDto> findAll() { return List.of(); }     }     """)` |
| extractsRelationFromGenericMethodReturnTypeAndIgnoresExternalTypes |  | write | `write("TargetDto.java", "class TargetDto {}")` |
| extractsRelationFromMethodParameter |  | analyze | `analyze()` |
| extractsRelationFromMethodParameter |  | assertThat | `assertThat(result.relations())` |
| extractsRelationFromMethodParameter | assertThat(result.relations()) | extracting | `assertThat(result.relations()).extracting(relation -> relation.relationType(), relation -> relation.sourceMemberName())` |
| extractsRelationFromMethodParameter | assertThat(result.relations()).extracting(relation -> relation.relationType(), relation -> relation.sourceMemberName()) | containsExactly | `assertThat(result.relations()).extracting(relation -> relation.relationType(), relation -> relation.sourceMemberName()).containsExactly(tuple(RelationType.METHOD_PARAMETER, "request"))` |
| extractsRelationFromMethodParameter | relation | relationType | `relation.relationType()` |
| extractsRelationFromMethodParameter | relation | sourceMemberName | `relation.sourceMemberName()` |
| extractsRelationFromMethodParameter | result | relations | `result.relations()` |
| extractsRelationFromMethodParameter |  | tuple | `tuple(RelationType.METHOD_PARAMETER, "request")` |
| extractsRelationFromMethodParameter |  | write | `write("SourceService.java", """     class SourceService {         void save(TargetDto request) {}     }     """)` |
| extractsRelationFromMethodParameter |  | write | `write("TargetDto.java", "class TargetDto {}")` |
| extractsScopedUnscopedThisAndMultipleMethodCalls | Path | of | `Path.of("src/main/java/example/UserController.java")` |
| extractsScopedUnscopedThisAndMultipleMethodCalls |  | analyze | `analyze()` |
| extractsScopedUnscopedThisAndMultipleMethodCalls |  | assertThat | `assertThat(call.sourceClassName())` |
| extractsScopedUnscopedThisAndMultipleMethodCalls | assertThat(call.sourceClassName()) | isEqualTo | `assertThat(call.sourceClassName()).isEqualTo("UserController")` |
| extractsScopedUnscopedThisAndMultipleMethodCalls |  | assertThat | `assertThat(call.sourcePath())` |
| extractsScopedUnscopedThisAndMultipleMethodCalls | assertThat(call.sourcePath()) | isEqualTo | `assertThat(call.sourcePath()).isEqualTo(Path.of("src/main/java/example/UserController.java"))` |
| extractsScopedUnscopedThisAndMultipleMethodCalls |  | assertThat | `assertThat(result.methodCalls())` |
| extractsScopedUnscopedThisAndMultipleMethodCalls |  | assertThat | `assertThat(result.methodCalls())` |
| extractsScopedUnscopedThisAndMultipleMethodCalls | assertThat(result.methodCalls()) | allSatisfy | `assertThat(result.methodCalls()).allSatisfy(call -> {     assertThat(call.sourceClassName()).isEqualTo("UserController");     assertThat(call.sourcePath()).isEqualTo(Path.of("src/main/java/example/UserController.java")); })` |
| extractsScopedUnscopedThisAndMultipleMethodCalls | assertThat(result.methodCalls()) | extracting | `assertThat(result.methodCalls()).extracting(call -> call.sourceMethodName(), call -> call.scopeName(), call -> call.calledMethodName(), call -> call.expression())` |
| extractsScopedUnscopedThisAndMultipleMethodCalls | assertThat(result.methodCalls()).extracting(call -> call.sourceMethodName(), call -> call.scopeName(), call -> call.calledMethodName(), call -> call.expression()) | containsExactly | `assertThat(result.methodCalls()).extracting(call -> call.sourceMethodName(), call -> call.scopeName(), call -> call.calledMethodName(), call -> call.expression()).containsExactly(tuple("findAll", "", "helper", "helper()"), tuple("findAll", "userService", "findAll", "userService.findAll()"), tuple("findOne", "this", "helper", "this.helper()"))` |
| extractsScopedUnscopedThisAndMultipleMethodCalls | call | calledMethodName | `call.calledMethodName()` |
| extractsScopedUnscopedThisAndMultipleMethodCalls | call | expression | `call.expression()` |
| extractsScopedUnscopedThisAndMultipleMethodCalls | call | scopeName | `call.scopeName()` |
| extractsScopedUnscopedThisAndMultipleMethodCalls | call | sourceClassName | `call.sourceClassName()` |
| extractsScopedUnscopedThisAndMultipleMethodCalls | call | sourceMethodName | `call.sourceMethodName()` |
| extractsScopedUnscopedThisAndMultipleMethodCalls | call | sourcePath | `call.sourcePath()` |
| extractsScopedUnscopedThisAndMultipleMethodCalls | result | methodCalls | `result.methodCalls()` |
| extractsScopedUnscopedThisAndMultipleMethodCalls | result | methodCalls | `result.methodCalls()` |
| extractsScopedUnscopedThisAndMultipleMethodCalls |  | tuple | `tuple("findAll", "", "helper", "helper()")` |
| extractsScopedUnscopedThisAndMultipleMethodCalls |  | tuple | `tuple("findAll", "userService", "findAll", "userService.findAll()")` |
| extractsScopedUnscopedThisAndMultipleMethodCalls |  | tuple | `tuple("findOne", "this", "helper", "this.helper()")` |
| extractsScopedUnscopedThisAndMultipleMethodCalls |  | write | `write("UserController.java", """     class UserController {         void findAll() {             userService.findAll();             helper();         }              void findOne() {             this.helper();         }              void helper() {}     }     """)` |
| write | Files | createDirectories | `Files.createDirectories(sourceFile.getParent())` |
| write | Files | writeString | `Files.writeString(sourceFile, content)` |
| write | sourceFile | getParent | `sourceFile.getParent()` |
| write | tempDir | resolve | `tempDir.resolve("src/main/java/example")` |
| write | tempDir.resolve("src/main/java/example") | resolve | `tempDir.resolve("src/main/java/example").resolve(fileName)` |

## Related Classes

### Outgoing References

| Target | Relation | Member |
| --- | --- | --- |
| [AnalysisResult](AnalysisResult.md) | METHOD_RETURN_TYPE | analyze |

### Incoming References

| Source | Relation | Member |
| --- | --- | --- |
| - | - | - |
