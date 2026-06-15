package io.github.codeatlas.core.model;

import java.nio.file.Path;

/**
 * SQL文などから確認できるテーブル利用箇所を表す。
 *
 * @param tableName 利用されるテーブル名候補
 * @param usedBy テーブルを利用するMapperやクラスなどの名前
 * @param usageType SELECTなどの利用種別
 * @param sourceName SQL statement IDなどの利用箇所名
 * @param sourcePath プロジェクトルートからのソース相対パス
 */
public record TableUsageDoc(
        String tableName,
        String usedBy,
        String usageType,
        String sourceName,
        Path sourcePath
) {
}
