package io.github.codeatlas.core.model;

import java.util.List;

/**
 * Java型に宣言されたフィールドの情報を表す。
 *
 * @param type JavaParserが取得した型表現
 * @param name フィールド名
 * @param annotations フィールドに付与されたアノテーション名
 */
public record FieldDoc(String type, String name, List<String> annotations) {
    public FieldDoc {
        annotations = List.copyOf(annotations);
    }
}
