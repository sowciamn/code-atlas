package io.github.codeatlas.core.model;

import java.nio.file.Path;

/**
 * Javaソースに明示された変数名と型名の対応を表す。
 *
 * @param className 変数を宣言するクラス名
 * @param methodName メソッド名。フィールドは空文字、コンストラクタは&lt;constructor&gt;
 * @param variableName 変数名
 * @param typeName JavaParserが取得した型名
 * @param variableScope 変数のスコープ種別
 * @param sourcePath Javaソースの解析ルートからの相対パス
 */
public record VariableTypeDoc(
        String className,
        String methodName,
        String variableName,
        String typeName,
        VariableScope variableScope,
        Path sourcePath
) {
}
