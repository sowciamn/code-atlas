package io.github.codeatlas.core.model;

/**
 * Java変数宣言が属するスコープ種別。
 */
public enum VariableScope {
    FIELD,
    CONSTRUCTOR_PARAMETER,
    METHOD_PARAMETER,
    LOCAL_VARIABLE
}
