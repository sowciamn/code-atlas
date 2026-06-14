package io.github.codeatlas.core.model;

import java.nio.file.Path;

/**
 * 解析対象プロジェクトの概要とコンポーネント数を表す。
 *
 * @param projectName プロジェクト名
 * @param sourceRoot 解析対象のルートディレクトリ
 * @param classCount 検出した型の総数
 * @param endpointCount 検出したAPIエンドポイント数
 * @param controllerCount Controller数
 * @param serviceCount Service数
 * @param repositoryCount Repository数
 * @param entityCount Entity数
 */
public record ProjectOverview(
        String projectName,
        Path sourceRoot,
        int classCount,
        int endpointCount,
        int controllerCount,
        int serviceCount,
        int repositoryCount,
        int entityCount
) {
}
