package io.github.codeatlas.core.model;

import java.util.List;

/**
 * プロジェクト解析で得られた情報一式を表す。
 *
 * @param overview プロジェクト全体の集計情報
 * @param classes 検出した型の情報
 * @param endpoints 検出したAPIエンドポイント
 * @param configs 検出した設定ファイル
 * @param relations 検出した同一プロジェクト内のクラス間参照
 * @param sqlStatements 検出したSQL文
 * @param tableUsages 検出したテーブル利用箇所
 */
public record AnalysisResult(
        ProjectOverview overview,
        List<ClassDoc> classes,
        List<ApiEndpointDoc> endpoints,
        List<ConfigDoc> configs,
        List<ClassRelationDoc> relations,
        List<SqlStatementDoc> sqlStatements,
        List<TableUsageDoc> tableUsages
) {
    public AnalysisResult {
        classes = List.copyOf(classes);
        endpoints = List.copyOf(endpoints);
        configs = List.copyOf(configs);
        relations = List.copyOf(relations);
        sqlStatements = List.copyOf(sqlStatements);
        tableUsages = List.copyOf(tableUsages);
    }
}
