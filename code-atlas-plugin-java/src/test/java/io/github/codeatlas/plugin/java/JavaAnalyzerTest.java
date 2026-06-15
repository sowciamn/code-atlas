package io.github.codeatlas.plugin.java;

import io.github.codeatlas.core.model.AnalysisResult;
import io.github.codeatlas.core.model.ClassDoc;
import io.github.codeatlas.core.model.RelationType;
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
        write("UserController.java", """
                class UserController {
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
                        call -> call.calledMethodName(),
                        call -> call.expression())
                .containsExactly(
                        tuple("findAll", "", "helper", "helper()"),
                        tuple("findAll", "userService", "findAll", "userService.findAll()"),
                        tuple("findOne", "this", "helper", "this.helper()"));
        assertThat(result.methodCalls())
                .allSatisfy(call -> {
                    assertThat(call.sourceClassName()).isEqualTo("UserController");
                    assertThat(call.sourcePath()).isEqualTo(
                            Path.of("src/main/java/example/UserController.java"));
                });
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
