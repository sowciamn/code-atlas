package io.github.codeatlas.core.model;

import java.nio.file.Path;

/**
 * Javaメソッド内に記述されたメソッド呼び出し式を表す。
 *
 * <p>完全な型解決は行わず、同一クラス内の変数宣言とメソッド宣言から
 * 機械的に確認できる範囲だけ呼び出し先を保持する。</p>
 *
 * @param sourceClassName 呼び出し元クラス名
 * @param sourceMethodName 呼び出し元メソッド名
 * @param scopeName 呼び出し式のscope。scopeがない場合は空文字
 * @param resolvedTargetClassName scopeから解決した同一プロジェクト内クラス名。未解決時は空文字
 * @param calledMethodName 呼び出されるメソッド名
 * @param expression メソッド呼び出し式全体
 * @param category 呼び出しの分類
 * @param sourcePath 呼び出し元Javaソースの解析ルートからの相対パス
 */
public record MethodCallDoc(
        String sourceClassName,
        String sourceMethodName,
        String scopeName,
        String resolvedTargetClassName,
        String calledMethodName,
        String expression,
        MethodCallCategory category,
        Path sourcePath
) {
}
