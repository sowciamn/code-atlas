# SpringBootAnalyzerTest

## Summary

* Package: `io.github.codeatlas.plugin.springboot`
* Declaration: `CLASS`
* Type: `UNKNOWN`
* Source: `code-atlas-plugin-springboot/src/test/java/io/github/codeatlas/plugin/springboot/SpringBootAnalyzerTest.java`

## Role

コードから機械的に判定できる役割情報はありません。

## Annotations

None

## Methods

| Method | Return Type | Parameters | Annotations |
| --- | --- | --- | --- |
| classifiesComponentsAndExtractsCombinedEndpointPaths | `void` |  | Test |
| write | `void` | String relativePath, String content |  |

## Fields

| Name | Type | Annotations |
| --- | --- | --- |
| tempDir | `Path` | TempDir |

## Method Calls

| Source Method | Scope | Called Method | Expression |
| --- | --- | --- | --- |
| classifiesComponentsAndExtractsCombinedEndpointPaths |  | assertThat | `assertThat(doc.className())` |
| classifiesComponentsAndExtractsCombinedEndpointPaths | assertThat(doc.className()) | isEqualTo | `assertThat(doc.className()).isEqualTo("UserController")` |
| classifiesComponentsAndExtractsCombinedEndpointPaths |  | assertThat | `assertThat(doc.componentType())` |
| classifiesComponentsAndExtractsCombinedEndpointPaths | assertThat(doc.componentType()) | isEqualTo | `assertThat(doc.componentType()).isEqualTo(ComponentType.CONTROLLER)` |
| classifiesComponentsAndExtractsCombinedEndpointPaths |  | assertThat | `assertThat(relation.sourceClassName())` |
| classifiesComponentsAndExtractsCombinedEndpointPaths | assertThat(relation.sourceClassName()) | isEqualTo | `assertThat(relation.sourceClassName()).isEqualTo("UserController")` |
| classifiesComponentsAndExtractsCombinedEndpointPaths |  | assertThat | `assertThat(relation.sourceMemberName())` |
| classifiesComponentsAndExtractsCombinedEndpointPaths | assertThat(relation.sourceMemberName()) | isEqualTo | `assertThat(relation.sourceMemberName()).isEqualTo("userService")` |
| classifiesComponentsAndExtractsCombinedEndpointPaths |  | assertThat | `assertThat(relation.targetClassName())` |
| classifiesComponentsAndExtractsCombinedEndpointPaths | assertThat(relation.targetClassName()) | isEqualTo | `assertThat(relation.targetClassName()).isEqualTo("UserService")` |
| classifiesComponentsAndExtractsCombinedEndpointPaths |  | assertThat | `assertThat(result.classes())` |
| classifiesComponentsAndExtractsCombinedEndpointPaths |  | assertThat | `assertThat(result.classes())` |
| classifiesComponentsAndExtractsCombinedEndpointPaths |  | assertThat | `assertThat(result.classes())` |
| classifiesComponentsAndExtractsCombinedEndpointPaths |  | assertThat | `assertThat(result.classes())` |
| classifiesComponentsAndExtractsCombinedEndpointPaths |  | assertThat | `assertThat(result.classes())` |
| classifiesComponentsAndExtractsCombinedEndpointPaths | assertThat(result.classes()) | anySatisfy | `assertThat(result.classes()).anySatisfy(doc -> {     assertThat(doc.className()).isEqualTo("UserController");     assertThat(doc.componentType()).isEqualTo(ComponentType.CONTROLLER); })` |
| classifiesComponentsAndExtractsCombinedEndpointPaths | assertThat(result.classes()) | filteredOn | `assertThat(result.classes()).filteredOn(doc -> doc.className().equals("User"))` |
| classifiesComponentsAndExtractsCombinedEndpointPaths | assertThat(result.classes()).filteredOn(doc -> doc.className().equals("User")) | extracting | `assertThat(result.classes()).filteredOn(doc -> doc.className().equals("User")).extracting(doc -> doc.componentType())` |
| classifiesComponentsAndExtractsCombinedEndpointPaths | assertThat(result.classes()).filteredOn(doc -> doc.className().equals("User")).extracting(doc -> doc.componentType()) | containsExactly | `assertThat(result.classes()).filteredOn(doc -> doc.className().equals("User")).extracting(doc -> doc.componentType()).containsExactly(ComponentType.ENTITY)` |
| classifiesComponentsAndExtractsCombinedEndpointPaths | assertThat(result.classes()) | filteredOn | `assertThat(result.classes()).filteredOn(doc -> doc.className().equals("UserRepository"))` |
| classifiesComponentsAndExtractsCombinedEndpointPaths | assertThat(result.classes()).filteredOn(doc -> doc.className().equals("UserRepository")) | extracting | `assertThat(result.classes()).filteredOn(doc -> doc.className().equals("UserRepository")).extracting(doc -> doc.componentType())` |
| classifiesComponentsAndExtractsCombinedEndpointPaths | assertThat(result.classes()).filteredOn(doc -> doc.className().equals("UserRepository")).extracting(doc -> doc.componentType()) | containsExactly | `assertThat(result.classes()).filteredOn(doc -> doc.className().equals("UserRepository")).extracting(doc -> doc.componentType()).containsExactly(ComponentType.REPOSITORY)` |
| classifiesComponentsAndExtractsCombinedEndpointPaths | assertThat(result.classes()) | filteredOn | `assertThat(result.classes()).filteredOn(doc -> doc.className().equals("UserService"))` |
| classifiesComponentsAndExtractsCombinedEndpointPaths | assertThat(result.classes()) | filteredOn | `assertThat(result.classes()).filteredOn(doc -> doc.className().equals("UserService"))` |
| classifiesComponentsAndExtractsCombinedEndpointPaths | assertThat(result.classes()).filteredOn(doc -> doc.className().equals("UserService")) | extracting | `assertThat(result.classes()).filteredOn(doc -> doc.className().equals("UserService")).extracting(doc -> doc.componentType())` |
| classifiesComponentsAndExtractsCombinedEndpointPaths | assertThat(result.classes()).filteredOn(doc -> doc.className().equals("UserService")).extracting(doc -> doc.componentType()) | containsExactly | `assertThat(result.classes()).filteredOn(doc -> doc.className().equals("UserService")).extracting(doc -> doc.componentType()).containsExactly(ComponentType.SERVICE)` |
| classifiesComponentsAndExtractsCombinedEndpointPaths | assertThat(result.classes()).filteredOn(doc -> doc.className().equals("UserService")) | extracting | `assertThat(result.classes()).filteredOn(doc -> doc.className().equals("UserService")).extracting(doc -> doc.roleSummary())` |
| classifiesComponentsAndExtractsCombinedEndpointPaths | assertThat(result.classes()).filteredOn(doc -> doc.className().equals("UserService")).extracting(doc -> doc.roleSummary()) | singleElement | `assertThat(result.classes()).filteredOn(doc -> doc.className().equals("UserService")).extracting(doc -> doc.roleSummary()).singleElement()` |
| classifiesComponentsAndExtractsCombinedEndpointPaths | assertThat(result.classes()).filteredOn(doc -> doc.className().equals("UserService")).extracting(doc -> doc.roleSummary()).singleElement() | asString | `assertThat(result.classes()).filteredOn(doc -> doc.className().equals("UserService")).extracting(doc -> doc.roleSummary()).singleElement().asString()` |
| classifiesComponentsAndExtractsCombinedEndpointPaths | assertThat(result.classes()).filteredOn(doc -> doc.className().equals("UserService")).extracting(doc -> doc.roleSummary()).singleElement().asString() | contains | `assertThat(result.classes()).filteredOn(doc -> doc.className().equals("UserService")).extracting(doc -> doc.roleSummary()).singleElement().asString().contains("業務ロジックコンポーネント")` |
| classifiesComponentsAndExtractsCombinedEndpointPaths |  | assertThat | `assertThat(result.endpoints())` |
| classifiesComponentsAndExtractsCombinedEndpointPaths | assertThat(result.endpoints()) | extracting | `assertThat(result.endpoints()).extracting(endpoint -> endpoint.httpMethod() + " " + endpoint.path())` |
| classifiesComponentsAndExtractsCombinedEndpointPaths | assertThat(result.endpoints()).extracting(endpoint -> endpoint.httpMethod() + " " + endpoint.path()) | containsExactly | `assertThat(result.endpoints()).extracting(endpoint -> endpoint.httpMethod() + " " + endpoint.path()).containsExactly("GET /api/users/search", "GET /api/users/{id}")` |
| classifiesComponentsAndExtractsCombinedEndpointPaths |  | assertThat | `assertThat(result.relations())` |
| classifiesComponentsAndExtractsCombinedEndpointPaths | assertThat(result.relations()) | anySatisfy | `assertThat(result.relations()).anySatisfy(relation -> {     assertThat(relation.sourceClassName()).isEqualTo("UserController");     assertThat(relation.targetClassName()).isEqualTo("UserService");     assertThat(relation.sourceMemberName()).isEqualTo("userService"); })` |
| classifiesComponentsAndExtractsCombinedEndpointPaths | doc | className | `doc.className()` |
| classifiesComponentsAndExtractsCombinedEndpointPaths | doc | className | `doc.className()` |
| classifiesComponentsAndExtractsCombinedEndpointPaths | doc | className | `doc.className()` |
| classifiesComponentsAndExtractsCombinedEndpointPaths | doc | className | `doc.className()` |
| classifiesComponentsAndExtractsCombinedEndpointPaths | doc | className | `doc.className()` |
| classifiesComponentsAndExtractsCombinedEndpointPaths | doc.className() | equals | `doc.className().equals("User")` |
| classifiesComponentsAndExtractsCombinedEndpointPaths | doc.className() | equals | `doc.className().equals("UserRepository")` |
| classifiesComponentsAndExtractsCombinedEndpointPaths | doc.className() | equals | `doc.className().equals("UserService")` |
| classifiesComponentsAndExtractsCombinedEndpointPaths | doc.className() | equals | `doc.className().equals("UserService")` |
| classifiesComponentsAndExtractsCombinedEndpointPaths | doc | componentType | `doc.componentType()` |
| classifiesComponentsAndExtractsCombinedEndpointPaths | doc | componentType | `doc.componentType()` |
| classifiesComponentsAndExtractsCombinedEndpointPaths | doc | componentType | `doc.componentType()` |
| classifiesComponentsAndExtractsCombinedEndpointPaths | doc | componentType | `doc.componentType()` |
| classifiesComponentsAndExtractsCombinedEndpointPaths | doc | roleSummary | `doc.roleSummary()` |
| classifiesComponentsAndExtractsCombinedEndpointPaths | endpoint | httpMethod | `endpoint.httpMethod()` |
| classifiesComponentsAndExtractsCombinedEndpointPaths | endpoint | path | `endpoint.path()` |
| classifiesComponentsAndExtractsCombinedEndpointPaths | new SourceScanner() | scan | `new SourceScanner().scan(tempDir)` |
| classifiesComponentsAndExtractsCombinedEndpointPaths | new SpringBootAnalyzer() | analyze | `new SpringBootAnalyzer().analyze(new SourceScanner().scan(tempDir))` |
| classifiesComponentsAndExtractsCombinedEndpointPaths | relation | sourceClassName | `relation.sourceClassName()` |
| classifiesComponentsAndExtractsCombinedEndpointPaths | relation | sourceMemberName | `relation.sourceMemberName()` |
| classifiesComponentsAndExtractsCombinedEndpointPaths | relation | targetClassName | `relation.targetClassName()` |
| classifiesComponentsAndExtractsCombinedEndpointPaths | result | classes | `result.classes()` |
| classifiesComponentsAndExtractsCombinedEndpointPaths | result | classes | `result.classes()` |
| classifiesComponentsAndExtractsCombinedEndpointPaths | result | classes | `result.classes()` |
| classifiesComponentsAndExtractsCombinedEndpointPaths | result | classes | `result.classes()` |
| classifiesComponentsAndExtractsCombinedEndpointPaths | result | classes | `result.classes()` |
| classifiesComponentsAndExtractsCombinedEndpointPaths | result | endpoints | `result.endpoints()` |
| classifiesComponentsAndExtractsCombinedEndpointPaths | result | relations | `result.relations()` |
| classifiesComponentsAndExtractsCombinedEndpointPaths |  | write | `write("src/main/java/example/User.java", """     package example;     @Entity class User {}     """)` |
| classifiesComponentsAndExtractsCombinedEndpointPaths |  | write | `write("src/main/java/example/UserController.java", """     package example;     import org.springframework.web.bind.annotation.*;     @RestController     @RequestMapping("/api/users")     class UserController {         private UserService userService;              @GetMapping("/{id}")         String findById(Long id) { return ""; }              @RequestMapping(path = "/search", method = RequestMethod.GET)         String search() { return ""; }     }     """)` |
| classifiesComponentsAndExtractsCombinedEndpointPaths |  | write | `write("src/main/java/example/UserRepository.java", """     package example;     @Repository interface UserRepository {}     """)` |
| classifiesComponentsAndExtractsCombinedEndpointPaths |  | write | `write("src/main/java/example/UserService.java", """     package example;     @Service class UserService {}     """)` |
| write | Files | createDirectories | `Files.createDirectories(path.getParent())` |
| write | Files | writeString | `Files.writeString(path, content)` |
| write | path | getParent | `path.getParent()` |
| write | tempDir | resolve | `tempDir.resolve(relativePath)` |

## Related Classes

### Outgoing References

| Target | Relation | Member |
| --- | --- | --- |
| - | - | - |

### Incoming References

| Source | Relation | Member |
| --- | --- | --- |
| - | - | - |
