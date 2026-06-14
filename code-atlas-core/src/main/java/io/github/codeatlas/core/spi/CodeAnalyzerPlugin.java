package io.github.codeatlas.core.spi;

import io.github.codeatlas.core.model.AnalysisResult;
import io.github.codeatlas.core.model.ProjectSource;

/**
 * 言語またはフレームワーク固有のソース解析を提供するプラグイン契約。
 */
public interface CodeAnalyzerPlugin {
    /**
     * プラグインを一意に識別するIDを返す。
     *
     * @return プラグインID
     */
    String pluginId();

    /**
     * このプラグインが対象プロジェクトを解析できるか判定する。
     *
     * @param source 収集済みのプロジェクトソース情報
     * @return 解析可能な場合はtrue
     */
    boolean supports(ProjectSource source);

    /**
     * 対象プロジェクトを解析する。
     *
     * @param source 収集済みのプロジェクトソース情報
     * @return 解析結果
     */
    AnalysisResult analyze(ProjectSource source);
}
