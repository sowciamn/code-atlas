package io.github.codeatlas.plugin.java;

import io.github.codeatlas.core.model.AnalysisResult;
import io.github.codeatlas.core.model.ClassDoc;
import io.github.codeatlas.core.model.MethodCallCategory;
import io.github.codeatlas.core.model.RelationType;
import io.github.codeatlas.core.model.VariableScope;
import io.github.codeatlas.core.scan.SourceScanner;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.io.TempDir;

import java.nio.file.Files;
import java.nio.file.Path;

import static org.assertj.core.api.Assertions.assertThat;
import static org.assertj.core.api.Assertions.tuple;

class JavaAnalyzerTest {
    @TempDir
    Path tempDir;

    @Test
    void extractsClassPackageMethodsAnnotationsAndFields() throws Exception {
        Path sourceFile = tempDir.resolve("src/main/java/example/GreetingService.java");
        Files.createDirectories(sourceFile.getParent());
        Files.writeString(sourceFile, """
                package example;

                @Deprecated
                public class GreetingService {
                    private final String prefix = "Hello";

                    @Override
                    public String toString() {
                        return prefix;
                    }
                }
                """);

        ClassDoc result = new JavaAnalyzer()
                .analyzeClasses(new SourceScanner().scan(tempDir))
                .getFirst();

        assertThat(result.className()).isEqualTo("GreetingService");
        assertThat(result.packageName()).isEqualTo("example");
        assertThat(result.annotations()).containsExactly("Deprecated");
        assertThat(result.methods()).singleElement().satisfies(method -> {
            assertThat(method.methodName()).isEqualTo("toString");
            assertThat(method.returnType()).isEqualTo("String");
            assertThat(method.annotations()).containsExactly("Override");
        });
        assertThat(result.fields()).singleElement().satisfies(field -> {
            assertThat(field.type()).isEqualTo("String");
            assertThat(field.name()).isEqualTo("prefix");
        });
    }

    @Test
    void extractsRelationFromFieldType() throws Exception {
        write("TargetService.java", "class TargetService {}");
        write("SourceController.java", """
                class SourceController {
                    private TargetService targetService;
                }
                """);

        AnalysisResult result = analyze();

        assertThat(result.relations())
                .extracting(
                        relation -> relation.sourceClassName(),
                        relation -> relation.targetClassName(),
                        relation -> relation.relationType(),
                        relation -> relation.sourceMemberName())
                .containsExactly(tuple(
                        "SourceController", "TargetService", RelationType.FIELD, "targetService"));
    }

    @Test
    void extractsRelationFromConstructorParameter() throws Exception {
        write("TargetService.java", "class TargetService {}");
        write("SourceController.java", """
                class SourceController {
                    SourceController(TargetService targetService) {}
                }
                """);

        AnalysisResult result = analyze();

        assertThat(result.relations())
                .extracting(
                        relation -> relation.relationType(),
                        relation -> relation.sourceMemberName())
                .containsExactly(tuple(RelationType.CONSTRUCTOR_PARAMETER, "targetService"));
    }

    @Test
    void extractsRelationFromMethodParameter() throws Exception {
        write("TargetDto.java", "class TargetDto {}");
        write("SourceService.java", """
                class SourceService {
                    void save(TargetDto request) {}
                }
                """);

        AnalysisResult result = analyze();

        assertThat(result.relations())
                .extracting(
                        relation -> relation.relationType(),
                        relation -> relation.sourceMemberName())
                .containsExactly(tuple(RelationType.METHOD_PARAMETER, "request"));
    }

    @Test
    void extractsRelationFromGenericMethodReturnTypeAndIgnoresExternalTypes() throws Exception {
        write("TargetDto.java", "class TargetDto {}");
        write("SourceService.java", """
                import java.util.List;
                class SourceService {
                    List<TargetDto> findAll() { return List.of(); }
                }
                """);

        AnalysisResult result = analyze();

        assertThat(result.relations())
                .extracting(
                        relation -> relation.targetClassName(),
                        relation -> relation.relationType(),
                        relation -> relation.sourceMemberName())
                .containsExactly(tuple(
                        "TargetDto", RelationType.METHOD_RETURN_TYPE, "findAll"));
    }

    @Test
    void extractsScopedUnscopedThisAndMultipleMethodCalls() throws Exception {
        write("UserService.java", "class UserService { void findAll() {} }");
        write("UserController.java", """
                class UserController {
                    private UserService userService;

                    void findAll() {
                        userService.findAll();
                        helper();
                    }

                    void findOne() {
                        this.helper();
                    }

                    void helper() {}
                }
                """);

        AnalysisResult result = analyze();

        assertThat(result.methodCalls())
                .extracting(
                        call -> call.sourceMethodName(),
                        call -> call.scopeName(),
                        call -> call.resolvedTargetClassName(),
                        call -> call.calledMethodName(),
                        call -> call.expression())
                .containsExactly(
                        tuple("findAll", "", "UserController", "helper", "helper()"),
                        tuple("findAll", "userService", "UserService", "findAll",
                                "userService.findAll()"),
                        tuple("findOne", "this", "UserController", "helper", "this.helper()"));
        assertThat(result.methodCalls())
                .allSatisfy(call -> {
                    assertThat(call.sourceClassName()).isEqualTo("UserController");
                    assertThat(call.sourcePath()).isEqualTo(
                            Path.of("src/main/java/example/UserController.java"));
                });
    }

    @Test
    void extractsVariableTypesAndResolvesScopesByPriority() throws Exception {
        write("ProjectClient.java", "class ProjectClient { void call() {} }");
        write("ScopeExample.java", """
                class ScopeExample {
                    private ProjectClient fieldClient;

                    ScopeExample(ProjectClient fieldClient) {
                        this.fieldClient = fieldClient;
                    }

                    void execute(ProjectClient parameterClient) {
                        ProjectClient localClient = fieldClient;
                        localClient.call();
                        parameterClient.call();
                        fieldClient.call();
                        unknown.call();
                    }
                }
                """);

        AnalysisResult result = analyze();

        assertThat(result.variableTypes())
                .extracting(
                        variable -> variable.methodName(),
                        variable -> variable.variableName(),
                        variable -> variable.typeName(),
                        variable -> variable.variableScope())
                .contains(
                        tuple("", "fieldClient", "ProjectClient", VariableScope.FIELD),
                        tuple("<constructor>", "fieldClient", "ProjectClient",
                                VariableScope.CONSTRUCTOR_PARAMETER),
                        tuple("execute", "parameterClient", "ProjectClient",
                                VariableScope.METHOD_PARAMETER),
                        tuple("execute", "localClient", "ProjectClient",
                                VariableScope.LOCAL_VARIABLE));
        assertThat(result.methodCalls())
                .filteredOn(call -> call.sourceClassName().equals("ScopeExample"))
                .extracting(
                        call -> call.scopeName(),
                        call -> call.resolvedTargetClassName())
                .contains(
                        tuple("localClient", "ProjectClient"),
                        tuple("parameterClient", "ProjectClient"),
                        tuple("fieldClient", "ProjectClient"),
                        tuple("unknown", ""));
    }

    @Test
    void classifiesUtilityCallsAndKeepsOnlyResolvedProjectCallsAsProject() throws Exception {
        write("ProjectService.java", "class ProjectService { void execute() {} }");
        write("CallExample.java", """
                import java.util.List;
                class CallExample {
                    private ProjectService projectService;

                    void run(List<ProjectService> values) {
                        projectService.execute();
                        values.stream().map(String::trim).filter(String::isEmpty).toList();
                    }
                }
                """);

        AnalysisResult result = analyze();

        assertThat(result.methodCalls())
                .filteredOn(call -> call.category() == MethodCallCategory.PROJECT)
                .extracting(call -> call.expression())
                .containsExactly("projectService.execute()");
        assertThat(result.methodCalls())
                .filteredOn(call -> call.category() == MethodCallCategory.LIBRARY_OR_UTILITY)
                .extracting(call -> call.calledMethodName())
                .contains("stream", "map", "filter", "toList");
        assertThat(result.methodCalls())
                .filteredOn(call -> call.expression().equals("values.stream()"))
                .singleElement()
                .satisfies(call -> assertThat(call.resolvedTargetClassName()).isEmpty());
        assertThat(result.methodCallRelations())
                .extracting(
                        relation -> relation.sourceClassName(),
                        relation -> relation.targetClassName(),
                        relation -> relation.targetMethodName())
                .contains(tuple("CallExample", "ProjectService", "execute"));
    }

    private AnalysisResult analyze() throws Exception {
        return new JavaAnalyzer().analyze(new SourceScanner().scan(tempDir));
    }

    private void write(String fileName, String content) throws Exception {
        Path sourceFile = tempDir.resolve("src/main/java/example").resolve(fileName);
        Files.createDirectories(sourceFile.getParent());
        Files.writeString(sourceFile, content);
    }
}
