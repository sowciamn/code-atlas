package io.github.codeatlas.core.model;

/**
 * メソッドの仮引数を表す。
 *
 * @param type JavaParserが取得した型表現
 * @param name 仮引数名
 */
public record ParameterDoc(String type, String name) {
}
