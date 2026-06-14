package io.github.codeatlas.core.model;

import java.nio.file.Path;
import java.util.List;
import java.util.Optional;

/**
 * 解析対象ディレクトリから収集したソースファイル情報を表す。
 *
 * @param rootDirectory 解析対象のルートディレクトリ
 * @param javaFiles Javaソースファイル
 * @param resourceFiles resourcesディレクトリ配下のファイル
 * @param pomXml ルート直下のpom.xml
 * @param buildGradle ルート直下のbuild.gradle
 * @param configFiles application系設定ファイル
 */
public record ProjectSource(
        Path rootDirectory,
        List<Path> javaFiles,
        List<Path> resourceFiles,
        Optional<Path> pomXml,
        Optional<Path> buildGradle,
        List<Path> configFiles
) {
    public ProjectSource {
        rootDirectory = rootDirectory.toAbsolutePath().normalize();
        javaFiles = List.copyOf(javaFiles);
        resourceFiles = List.copyOf(resourceFiles);
        pomXml = pomXml.map(path -> path.toAbsolutePath().normalize());
        buildGradle = buildGradle.map(path -> path.toAbsolutePath().normalize());
        configFiles = List.copyOf(configFiles);
    }

    /**
     * 指定されたパスをプロジェクトルート基準の相対パスへ変換する。
     *
     * @param path プロジェクト配下のパス
     * @return プロジェクトルートからの相対パス
     */
    public Path relativePath(Path path) {
        return rootDirectory.relativize(path.toAbsolutePath().normalize());
    }
}
