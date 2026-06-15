package io.github.codeatlas.core.model;

import java.nio.file.Path;
import java.util.List;

/**
 * Javaソース内のトップレベル型から抽出した情報を表す。
 *
 * @param packageName パッケージ名。無名パッケージの場合は空文字
 * @param className 型名
 * @param declarationKind 宣言種別（CLASS、INTERFACE、ENUMなど）
 * @param sourcePath プロジェクトルートからのソースファイル相対パス
 * @param componentType フレームワーク上のコンポーネント種別
 * @param annotations 型に付与されたアノテーション名
 * @param methods 型で宣言されたメソッド
 * @param fields 型で宣言されたフィールド
 * @param roleSummary ソースから機械的に判定した型の役割説明
 */
public record ClassDoc(
        String packageName,
        String className,
        String declarationKind,
        Path sourcePath,
        ComponentType componentType,
        List<String> annotations,
        List<MethodDoc> methods,
        List<FieldDoc> fields,
        String roleSummary
) {
    public ClassDoc {
        annotations = List.copyOf(annotations);
        methods = List.copyOf(methods);
        fields = List.copyOf(fields);
    }

    /**
     * 解析済み情報を維持したままコンポーネント種別だけを変更したコピーを返す。
     *
     * @param type 新しいコンポーネント種別
     * @return コンポーネント種別を変更した型情報
     */
    public ClassDoc withComponentType(ComponentType type) {
        return new ClassDoc(
                packageName, className, declarationKind, sourcePath, type, annotations, methods, fields, roleSummary);
    }

    /**
     * 解析済み情報を維持したまま役割説明だけを変更したコピーを返す。
     *
     * @param summary 新しい役割説明
     * @return 役割説明を変更した型情報
     */
    public ClassDoc withRoleSummary(String summary) {
        return new ClassDoc(
                packageName, className, declarationKind, sourcePath, componentType,
                annotations, methods, fields, summary);
    }
}
