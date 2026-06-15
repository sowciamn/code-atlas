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
 * @param variableTypes Javaソースに明示された変数名と型名の対応
 * @param methodCalls 検出したJavaメソッド呼び出し
 * @param methodCallRelations 解決できたJavaメソッド呼び出し関係
 * @param sqlStatements 検出したSQL文
 * @param tableUsages 検出したテーブル利用箇所
 * @param mapperStatementRelations MapperメソッドとMyBatis statementの関係
 */
public record AnalysisResult(
        ProjectOverview overview,
        List<ClassDoc> classes,
        List<ApiEndpointDoc> endpoints,
        List<ConfigDoc> configs,
        List<ClassRelationDoc> relations,
        List<VariableTypeDoc> variableTypes,
        List<MethodCallDoc> methodCalls,
        List<MethodCallRelationDoc> methodCallRelations,
        List<SqlStatementDoc> sqlStatements,
        List<TableUsageDoc> tableUsages,
        List<MapperStatementRelationDoc> mapperStatementRelations
) {
    public AnalysisResult {
        classes = List.copyOf(classes);
        endpoints = List.copyOf(endpoints);
        configs = List.copyOf(configs);
        relations = List.copyOf(relations);
        variableTypes = List.copyOf(variableTypes);
        methodCalls = List.copyOf(methodCalls);
        methodCallRelations = List.copyOf(methodCallRelations);
        sqlStatements = List.copyOf(sqlStatements);
        tableUsages = List.copyOf(tableUsages);
        mapperStatementRelations = List.copyOf(mapperStatementRelations);
    }
}
