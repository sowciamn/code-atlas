package io.github.codeatlas.core.model;

/**
 * Java型のメンバーから確認できるクラス間参照の種別を表す。
 */
public enum RelationType {
    FIELD,
    CONSTRUCTOR_PARAMETER,
    METHOD_PARAMETER,
    METHOD_RETURN_TYPE
}
