package io.github.codeatlas.core;

import io.github.codeatlas.core.model.AnalysisResult;
import io.github.codeatlas.core.model.ProjectOverview;
import io.github.codeatlas.core.model.ProjectSource;
import io.github.codeatlas.core.spi.CodeAnalyzerPlugin;

import java.util.List;

/**
 * 登録された解析プラグインのうち対象プロジェクトに適合するものを合成して解析する。
 */
public final class AnalysisEngine {
    private final List<CodeAnalyzerPlugin> plugins;

    /**
     * 解析に利用するプラグインを適用順に登録する。
     *
     * @param plugins 解析プラグインの一覧。先に登録されたプラグインから適用される
     */
    public AnalysisEngine(List<CodeAnalyzerPlugin> plugins) {
        this.plugins = List.copyOf(plugins);
    }

    /**
     * 対象プロジェクトをサポートするすべてのプラグインで順次解析する。
     *
     * @param source 収集済みのプロジェクトソース情報
     * @return プロジェクトの解析結果
     * @throws IllegalArgumentException 対象をサポートするプラグインが存在しない場合
     */
    public AnalysisResult analyze(ProjectSource source) {
        AnalysisResult result = emptyResult(source);
        boolean supported = false;
        for (CodeAnalyzerPlugin plugin : plugins) {
            if (plugin.supports(source)) {
                result = plugin.analyze(source, result);
                supported = true;
            }
        }
        if (!supported) {
            throw new IllegalArgumentException(
                    "No analyzer plugin supports source: " + source.rootDirectory());
        }
        return result;
    }

    private AnalysisResult emptyResult(ProjectSource source) {
        ProjectOverview overview = new ProjectOverview(
                source.rootDirectory().getFileName().toString(),
                source.rootDirectory(),
                0, 0, 0, 0, 0, 0);
        return new AnalysisResult(
                overview, List.of(), List.of(), List.of(), List.of(), List.of(), List.of());
    }
}
