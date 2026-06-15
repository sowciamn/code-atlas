package io.github.codeatlas.core.model;

import java.nio.file.Path;

/**
 * scopeの型を機械的に解決できたJavaメソッド呼び出し関係を表す。
 *
 * @param sourceClassName 呼び出し元クラス名
 * @param sourceMethodName 呼び出し元メソッド名
 * @param targetClassName 呼び出し先クラス名
 * @param targetMethodName 呼び出し先メソッド名
 * @param expression 呼び出し式全体
 * @param sourcePath 呼び出し元Javaソースの解析ルートからの相対パス
 */
public record MethodCallRelationDoc(
        String sourceClassName,
        String sourceMethodName,
        String targetClassName,
        String targetMethodName,
        String expression,
        Path sourcePath
) {
}
