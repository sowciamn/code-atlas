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

## Method Call Relations

### Outgoing Calls

| Target | Expression |
| --- | --- |
| [AnalysisResult](AnalysisResult.md).classes | `result.classes()` |
| [AnalysisResult](AnalysisResult.md).classes | `result.classes()` |
| [AnalysisResult](AnalysisResult.md).classes | `result.classes()` |
| [AnalysisResult](AnalysisResult.md).classes | `result.classes()` |
| [AnalysisResult](AnalysisResult.md).classes | `result.classes()` |
| [AnalysisResult](AnalysisResult.md).endpoints | `result.endpoints()` |
| [AnalysisResult](AnalysisResult.md).relations | `result.relations()` |
| [SpringBootAnalyzerTest](SpringBootAnalyzerTest.md).write | `write("src/main/java/example/User.java", """     package example;     @Entity class User {}     """)` |
| [SpringBootAnalyzerTest](SpringBootAnalyzerTest.md).write | `write("src/main/java/example/UserController.java", """     package example;     import org.springframework.web.bind.annotation.*;     @RestController     @RequestMapping("/api/users")     class UserController {         private UserService userService;              @GetMapping("/{id}")         String findById(Long id) { return ""; }              @RequestMapping(path = "/search", method = RequestMethod.GET)         String search() { return ""; }     }     """)` |
| [SpringBootAnalyzerTest](SpringBootAnalyzerTest.md).write | `write("src/main/java/example/UserRepository.java", """     package example;     @Repository interface UserRepository {}     """)` |
| [SpringBootAnalyzerTest](SpringBootAnalyzerTest.md).write | `write("src/main/java/example/UserService.java", """     package example;     @Service class UserService {}     """)` |

### Incoming Calls

| Source | Expression |
| --- | --- |
| [SpringBootAnalyzerTest](SpringBootAnalyzerTest.md).classifiesComponentsAndExtractsCombinedEndpointPaths | `write("src/main/java/example/User.java", """     package example;     @Entity class User {}     """)` |
| [SpringBootAnalyzerTest](SpringBootAnalyzerTest.md).classifiesComponentsAndExtractsCombinedEndpointPaths | `write("src/main/java/example/UserController.java", """     package example;     import org.springframework.web.bind.annotation.*;     @RestController     @RequestMapping("/api/users")     class UserController {         private UserService userService;              @GetMapping("/{id}")         String findById(Long id) { return ""; }              @RequestMapping(path = "/search", method = RequestMethod.GET)         String search() { return ""; }     }     """)` |
| [SpringBootAnalyzerTest](SpringBootAnalyzerTest.md).classifiesComponentsAndExtractsCombinedEndpointPaths | `write("src/main/java/example/UserRepository.java", """     package example;     @Repository interface UserRepository {}     """)` |
| [SpringBootAnalyzerTest](SpringBootAnalyzerTest.md).classifiesComponentsAndExtractsCombinedEndpointPaths | `write("src/main/java/example/UserService.java", """     package example;     @Service class UserService {}     """)` |

## Method Calls

### Project Calls

| Source Method | Scope | Resolved Target | Called Method | Expression |
| --- | --- | --- | --- | --- |
| classifiesComponentsAndExtractsCombinedEndpointPaths | result | AnalysisResult | classes | `result.classes()` |
| classifiesComponentsAndExtractsCombinedEndpointPaths | result | AnalysisResult | classes | `result.classes()` |
| classifiesComponentsAndExtractsCombinedEndpointPaths | result | AnalysisResult | classes | `result.classes()` |
| classifiesComponentsAndExtractsCombinedEndpointPaths | result | AnalysisResult | classes | `result.classes()` |
| classifiesComponentsAndExtractsCombinedEndpointPaths | result | AnalysisResult | classes | `result.classes()` |
| classifiesComponentsAndExtractsCombinedEndpointPaths | result | AnalysisResult | endpoints | `result.endpoints()` |
| classifiesComponentsAndExtractsCombinedEndpointPaths | result | AnalysisResult | relations | `result.relations()` |
| classifiesComponentsAndExtractsCombinedEndpointPaths |  | SpringBootAnalyzerTest | write | `write("src/main/java/example/User.java", """     package example;     @Entity class User {}     """)` |
| classifiesComponentsAndExtractsCombinedEndpointPaths |  | SpringBootAnalyzerTest | write | `write("src/main/java/example/UserController.java", """     package example;     import org.springframework.web.bind.annotation.*;     @RestController     @RequestMapping("/api/users")     class UserController {         private UserService userService;              @GetMapping("/{id}")         String findById(Long id) { return ""; }              @RequestMapping(path = "/search", method = RequestMethod.GET)         String search() { return ""; }     }     """)` |
| classifiesComponentsAndExtractsCombinedEndpointPaths |  | SpringBootAnalyzerTest | write | `write("src/main/java/example/UserRepository.java", """     package example;     @Repository interface UserRepository {}     """)` |
| classifiesComponentsAndExtractsCombinedEndpointPaths |  | SpringBootAnalyzerTest | write | `write("src/main/java/example/UserService.java", """     package example;     @Service class UserService {}     """)` |

### Library / Utility Calls

Library / Utility calls are omitted from this page. Count: 60.

## Related Classes

### Outgoing References

| Target | Relation | Member |
| --- | --- | --- |
| - | - | - |

### Incoming References

| Source | Relation | Member |
| --- | --- | --- |
| - | - | - |
