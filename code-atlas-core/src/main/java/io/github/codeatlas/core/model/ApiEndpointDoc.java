package io.github.codeatlas.core.model;

/**
 * Controllerメソッドから抽出したAPIエンドポイントを表す。
 *
 * @param className Controllerのクラス名
 * @param methodName エンドポイントを定義するメソッド名
 * @param httpMethod HTTPメソッド
 * @param path クラスレベルとメソッドレベルを結合したパス
 * @param sourcePath プロジェクトルートからのソースファイル相対パス
 */
public record ApiEndpointDoc(
        String className,
        String methodName,
        String httpMethod,
        String path,
        String sourcePath
) {
}
