package io.github.codeatlas.core.model;

import java.util.List;

/**
 * Java型に宣言されたメソッドの情報を表す。
 *
 * @param methodName メソッド名
 * @param returnType JavaParserが取得した戻り値型
 * @param parameters 仮引数の一覧
 * @param annotations メソッドに付与されたアノテーション名
 */
public record MethodDoc(
        String methodName,
        String returnType,
        List<ParameterDoc> parameters,
        List<String> annotations
) {
    public MethodDoc {
        parameters = List.copyOf(parameters);
        annotations = List.copyOf(annotations);
    }
}
