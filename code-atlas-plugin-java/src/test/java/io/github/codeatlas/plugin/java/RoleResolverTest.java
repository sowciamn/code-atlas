package io.github.codeatlas.plugin.java;

import com.github.javaparser.JavaParser;
import com.github.javaparser.ast.body.TypeDeclaration;
import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

class RoleResolverTest {
    private final RoleResolver resolver = new RoleResolver();

    @Test
    void resolvesAnalyzerPlugin() {
        assertThat(resolve("class JavaAnalyzer implements CodeAnalyzerPlugin {}"))
                .contains("ソース解析プラグイン");
    }

    @Test
    void resolvesDocumentationRenderer() {
        assertThat(resolve("class MarkdownRenderer implements DocumentationRenderer {}"))
                .contains("ドキュメント出力レンダラー");
    }

    @Test
    void resolvesCliCommand() {
        assertThat(resolve("@Command class CodeAtlasCli {}"))
                .contains("CLIコマンド");
    }

    @Test
    void resolvesDtoByClassName() {
        assertThat(resolve("class UserDTO {}")).contains("DTOです");
    }

    @Test
    void returnsDefaultMessageForUnknownRole() {
        assertThat(resolve("class Utility {}")).isEqualTo(RoleResolver.UNKNOWN_ROLE);
    }

    private String resolve(String source) {
        TypeDeclaration<?> type = new JavaParser().parse(source)
                .getResult()
                .orElseThrow()
                .getType(0);
        return resolver.resolve(type);
    }
}
