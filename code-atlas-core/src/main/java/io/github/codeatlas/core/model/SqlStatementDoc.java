package io.github.codeatlas.core.model;

import java.nio.file.Path;
import java.util.List;

/**
 * ソースや設定ファイルから抽出したSQL文を表す。
 *
 * @param ownerName SQL文を所有するMapperやクラスなどの名前
 * @param statementId 所有者内でSQL文を識別する名前
 * @param statementType SQL操作種別
 * @param sql 正規化したSQL本文
 * @param sourcePath プロジェクトルートからのソース相対パス
 * @param tableNames SQL文から機械的に抽出したテーブル名候補
 */
public record SqlStatementDoc(
        String ownerName,
        String statementId,
        SqlStatementType statementType,
        String sql,
        Path sourcePath,
        List<String> tableNames
) {
    public SqlStatementDoc {
        tableNames = List.copyOf(tableNames);
    }
}
