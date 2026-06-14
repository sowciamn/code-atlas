package io.github.codeatlas.core.model;

import java.nio.file.Path;

/**
 * 検出したアプリケーション設定ファイルを表す。
 *
 * @param sourcePath プロジェクトルートからの相対パス
 * @param fileName ファイル名
 */
public record ConfigDoc(Path sourcePath, String fileName) {
}
