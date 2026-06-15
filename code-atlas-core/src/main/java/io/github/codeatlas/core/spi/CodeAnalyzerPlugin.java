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

    /**
     * 先行プラグインの解析結果へ、このプラグイン固有の情報を追加する。
     *
     * <p>既存の単独解析プラグインは{@link #analyze(ProjectSource)}の結果を返す。
     * 他プラグインの結果を利用して情報を付加する場合にオーバーライドする。</p>
     *
     * @param source 収集済みのプロジェクトソース情報
     * @param currentResult 先行プラグインまでの解析結果
     * @return このプラグインの解析を反映した結果
     */
    default AnalysisResult analyze(ProjectSource source, AnalysisResult currentResult) {
        return analyze(source);
    }
}
