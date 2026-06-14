package io.github.codeatlas.core.spi;

import io.github.codeatlas.core.model.AnalysisResult;

import java.io.IOException;
import java.nio.file.Path;

/**
 * 解析結果を任意のドキュメント形式へ出力するレンダラー契約。
 */
public interface DocumentationRenderer {
    /**
     * 解析結果を指定ディレクトリへ出力する。
     *
     * @param result 出力対象の解析結果
     * @param outputDirectory 出力先ディレクトリ
     * @throws IOException ディレクトリ作成またはファイル書き込みに失敗した場合
     */
    void render(AnalysisResult result, Path outputDirectory) throws IOException;
}
