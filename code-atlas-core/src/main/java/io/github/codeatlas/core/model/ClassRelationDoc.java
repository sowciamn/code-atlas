package io.github.codeatlas.core.model;

/**
 * 同一プロジェクト内のクラス間参照を表す。
 *
 * @param sourceClassName 参照元クラス名
 * @param targetClassName 参照先クラス名
 * @param relationType 参照を確認したメンバーの種別
 * @param sourceMemberName 参照元のフィールド名、引数名、またはメソッド名
 */
public record ClassRelationDoc(
        String sourceClassName,
        String targetClassName,
        RelationType relationType,
        String sourceMemberName
) {
}
