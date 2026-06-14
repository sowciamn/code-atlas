package io.github.codeatlas.core;

import io.github.codeatlas.core.model.AnalysisResult;
import io.github.codeatlas.core.model.ProjectSource;
import io.github.codeatlas.core.spi.CodeAnalyzerPlugin;

import java.util.List;

/**
 * 登録された解析プラグインから対象プロジェクトに適合するものを選択し、解析を実行する。
 */
public final class AnalysisEngine {
    private final List<CodeAnalyzerPlugin> plugins;

    /**
     * 解析に利用するプラグインを優先順に登録する。
     *
     * @param plugins 解析プラグインの一覧。先に登録されたプラグインが優先される
     */
    public AnalysisEngine(List<CodeAnalyzerPlugin> plugins) {
        this.plugins = List.copyOf(plugins);
    }

    /**
     * 対象プロジェクトをサポートする最初のプラグインで解析する。
     *
     * @param source 収集済みのプロジェクトソース情報
     * @return プロジェクトの解析結果
     * @throws IllegalArgumentException 対象をサポートするプラグインが存在しない場合
     */
    public AnalysisResult analyze(ProjectSource source) {
        return plugins.stream()
                .filter(plugin -> plugin.supports(source))
                .findFirst()
                .orElseThrow(() -> new IllegalArgumentException(
                        "No analyzer plugin supports source: " + source.rootDirectory()))
                .analyze(source);
    }
}
