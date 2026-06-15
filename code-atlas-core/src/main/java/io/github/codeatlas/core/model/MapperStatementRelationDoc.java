package io.github.codeatlas.core.model;

import java.nio.file.Path;
import java.util.List;

/**
 * MyBatis Mapper interfaceのメソッドとMapper XMLのstatementの対応を表す。
 *
 * @param mapperClassName Mapperクラスの単純名
 * @param mapperMethodName Mapperメソッド名
 * @param statementId Mapper XMLのstatement ID
 * @param statementType SQL statement種別
 * @param tableNames SQLから抽出した利用テーブル名
 * @param sourcePath Mapper XMLの解析ルートからの相対パス
 */
public record MapperStatementRelationDoc(
        String mapperClassName,
        String mapperMethodName,
        String statementId,
        SqlStatementType statementType,
        List<String> tableNames,
        Path sourcePath
) {
    public MapperStatementRelationDoc {
        tableNames = List.copyOf(tableNames);
    }
}
