package io.github.codeatlas.core.model;

/**
 * メソッド呼び出しをプロジェクト内呼び出しと標準APIなどの補助的呼び出しに分類する。
 */
public enum MethodCallCategory {
    PROJECT,
    LIBRARY_OR_UTILITY
}
