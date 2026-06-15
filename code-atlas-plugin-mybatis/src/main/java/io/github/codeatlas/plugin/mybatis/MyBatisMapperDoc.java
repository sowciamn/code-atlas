package io.github.codeatlas.plugin.mybatis;

import io.github.codeatlas.core.model.SqlStatementDoc;

import java.nio.file.Path;
import java.util.List;

/**
 * MyBatis Mapper XMLから抽出したMapper情報を表す。
 *
 * @param namespace mapper要素のnamespace
 * @param interfaceName namespace末尾から取得したインターフェース名
 * @param xmlPath プロジェクトルートからのXML相対パス
 * @param statements Mapper内で検出したSQL文
 */
public record MyBatisMapperDoc(
        String namespace,
        String interfaceName,
        Path xmlPath,
        List<SqlStatementDoc> statements
) {
    public MyBatisMapperDoc {
        statements = List.copyOf(statements);
    }
}
