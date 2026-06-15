package io.github.codeatlas.plugin.java;

import com.github.javaparser.ast.body.ClassOrInterfaceDeclaration;
import com.github.javaparser.ast.body.TypeDeclaration;

import java.util.stream.Stream;

/**
 * Java型の宣言から機械的に確認できる役割説明を決定する。
 */
public final class RoleResolver {
    /**
     * 判定条件に一致しない型へ設定する説明。
     */
    public static final String UNKNOWN_ROLE =
            "コードから機械的に判定できる役割情報はありません。";

    /**
     * 実装・継承インターフェース、アノテーション、型名から役割を決定する。
     *
     * @param type JavaParserで解析したトップレベル型
     * @return 機械的に判定した日本語の役割説明
     */
    public String resolve(TypeDeclaration<?> type) {
        if (hasSuperType(type, "CodeAnalyzerPlugin")) {
            return "このクラスは `CodeAnalyzerPlugin` を実装しているため、ソース解析プラグインです。";
        }
        if (hasSuperType(type, "DocumentationRenderer")) {
            return "このクラスは `DocumentationRenderer` を実装しているため、ドキュメント出力レンダラーです。";
        }
        if (hasAnnotation(type, "Command")) {
            return "このクラスは `@Command` が付与されているため、CLIコマンドです。";
        }
        if (type.getNameAsString().endsWith("Dto") || type.getNameAsString().endsWith("DTO")) {
            return "このクラスはクラス名が `Dto` または `DTO` で終わるため、DTOです。";
        }
        return UNKNOWN_ROLE;
    }

    private boolean hasSuperType(TypeDeclaration<?> type, String typeName) {
        if (!(type instanceof ClassOrInterfaceDeclaration declaration)) {
            return false;
        }
        return Stream.concat(
                        declaration.getImplementedTypes().stream(),
                        declaration.getExtendedTypes().stream())
                .anyMatch(candidate -> typeName.equals(candidate.getNameAsString()));
    }

    private boolean hasAnnotation(TypeDeclaration<?> type, String annotationName) {
        return type.getAnnotations().stream()
                .anyMatch(annotation -> annotationName.equals(annotation.getName().getIdentifier()));
    }
}
