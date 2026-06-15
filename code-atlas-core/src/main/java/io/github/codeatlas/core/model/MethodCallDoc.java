package io.github.codeatlas.core.model;

import java.nio.file.Path;

/**
 * Javaメソッド内に記述されたメソッド呼び出し式を表す。
 *
 * <p>型解決は行わず、構文木から機械的に取得できる呼び出し元と式の情報だけを保持する。</p>
 *
 * @param sourceClassName 呼び出し元クラス名
 * @param sourceMethodName 呼び出し元メソッド名
 * @param scopeName 呼び出し式のscope。scopeがない場合は空文字
 * @param calledMethodName 呼び出されるメソッド名
 * @param expression メソッド呼び出し式全体
 * @param sourcePath 呼び出し元Javaソースの解析ルートからの相対パス
 */
public record MethodCallDoc(
        String sourceClassName,
        String sourceMethodName,
        String scopeName,
        String calledMethodName,
        String expression,
        Path sourcePath
) {
}
