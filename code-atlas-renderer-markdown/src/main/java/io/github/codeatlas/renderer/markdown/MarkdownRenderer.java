package io.github.codeatlas.renderer.markdown;

import io.github.codeatlas.core.model.AnalysisResult;
import io.github.codeatlas.core.model.ApiEndpointDoc;
import io.github.codeatlas.core.model.ClassDoc;
import io.github.codeatlas.core.model.ClassRelationDoc;
import io.github.codeatlas.core.model.ComponentType;
import io.github.codeatlas.core.model.ConfigDoc;
import io.github.codeatlas.core.model.MethodDoc;
import io.github.codeatlas.core.model.ProjectOverview;
import io.github.codeatlas.core.spi.DocumentationRenderer;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

/**
 * 解析結果をGitHub Pagesで公開可能なMarkdownファイル群へ変換する。
 *
 * <p>プロジェクト概要、アーキテクチャ、API一覧、型別ページ、設定ファイル一覧、
 * GitHub Pages設定を所定のディレクトリ構成で出力する。</p>
 */
public final class MarkdownRenderer implements DocumentationRenderer {
    private static final Comparator<ClassRelationDoc> RELATION_ORDER =
            Comparator.comparing(ClassRelationDoc::sourceClassName)
                    .thenComparing(ClassRelationDoc::targetClassName)
                    .thenComparing(relation -> relation.relationType().name())
                    .thenComparing(ClassRelationDoc::sourceMemberName);

    /**
     * Markdownファイル群を指定ディレクトリへ生成する。
     *
     * <p>出力先、classesディレクトリ、configsディレクトリが存在しない場合は作成する。
     * 同名ファイルが存在する場合は上書きする。</p>
     *
     * @param result 出力対象の解析結果
     * @param outputDirectory Markdownの出力先ディレクトリ
     * @throws IOException ディレクトリ作成またはファイル書き込みに失敗した場合
     */
    @Override
    public void render(AnalysisResult result, Path outputDirectory) throws IOException {
        Path output = outputDirectory.toAbsolutePath().normalize();
        Path classesDirectory = output.resolve("classes");
        Path configsDirectory = output.resolve("configs");
        Files.createDirectories(classesDirectory);
        Files.createDirectories(configsDirectory);

        write(output.resolve("index.md"), index(result.overview()));
        write(output.resolve("architecture.md"), architecture(result));
        write(output.resolve("api.md"), api(result.endpoints()));
        for (ClassDoc classDoc : result.classes()) {
            write(classesDirectory.resolve(classDoc.className() + ".md"),
                    classPage(classDoc, result.relations()));
        }
        write(configsDirectory.resolve("application.md"), configurations(result.configs()));
        write(output.resolve("_config.yml"), "title: CodeAtlas\ntheme: minima\n");
    }

    private String index(ProjectOverview overview) {
        return """
                # CodeAtlas

                ## Project Overview

                * Project: `%s`
                * Source: `%s`
                * Classes: %d
                * API Endpoints: %d
                * Controllers: %d
                * Services: %d
                * Repositories: %d
                * Entities: %d

                ## Documents

                * [Architecture](architecture.md)
                * [API](api.md)
                * [Classes](classes/)
                * [Configurations](configs/application.md)
                """.formatted(
                overview.projectName(),
                displaySourceRoot(overview.sourceRoot()),
                overview.classCount(),
                overview.endpointCount(),
                overview.controllerCount(),
                overview.serviceCount(),
                overview.repositoryCount(),
                overview.entityCount());
    }

    /**
     * 解析元を実行ディレクトリ名から始まる公開用パスへ変換する。
     *
     * <p>解析元が実行ディレクトリ配下にない場合は、基準を安全に決定できないため
     * 正規化した絶対パスをそのまま返す。</p>
     *
     * @param sourceRoot 解析対象のルートディレクトリ
     * @return Markdownに表示する解析元パス
     */
    private String displaySourceRoot(Path sourceRoot) {
        Path workingDirectory = Path.of("").toAbsolutePath().normalize();
        Path normalizedSourceRoot = sourceRoot.toAbsolutePath().normalize();
        if (!normalizedSourceRoot.startsWith(workingDirectory)) {
            return normalizedSourceRoot.toString();
        }

        Path relativeSourceRoot = workingDirectory.relativize(normalizedSourceRoot);
        String projectDirectory = workingDirectory.getFileName().toString();
        if (relativeSourceRoot.toString().isEmpty()) {
            return "/" + projectDirectory;
        }
        return "/" + projectDirectory + "/" + relativeSourceRoot;
    }

    private String architecture(AnalysisResult result) {
        StringBuilder markdown = new StringBuilder("# Architecture\n\n");
        for (ComponentType type : ComponentType.values()) {
            markdown.append("## ").append(title(type)).append("\n\n");
            List<ClassDoc> matching = result.classes().stream()
                    .filter(classDoc -> classDoc.componentType() == type)
                    .sorted(Comparator.comparing(ClassDoc::className))
                    .toList();
            if (matching.isEmpty()) {
                markdown.append("None\n\n");
            } else {
                matching.forEach(classDoc -> markdown
                        .append("* [")
                        .append(classDoc.className())
                        .append("](classes/")
                        .append(classDoc.className())
                        .append(".md)\n"));
                markdown.append('\n');
            }
        }
        markdown.append("## Dependency Overview\n\n")
                .append("| Source | Target | Relation | Member |\n")
                .append("| --- | --- | --- | --- |\n");
        List<ClassRelationDoc> relations = sortedRelations(result.relations());
        if (relations.isEmpty()) {
            markdown.append("| - | - | - | - |\n");
        } else {
            relations.forEach(relation -> markdown
                    .append("| ").append(cell(relation.sourceClassName()))
                    .append(" | ").append(cell(relation.targetClassName()))
                    .append(" | ").append(relation.relationType())
                    .append(" | ").append(cell(relation.sourceMemberName()))
                    .append(" |\n"));
        }
        return markdown.toString();
    }

    private String api(List<ApiEndpointDoc> endpoints) {
        StringBuilder markdown = new StringBuilder("""
                # API Endpoints

                | HTTP Method | Path | Controller | Method | Source |
                | --- | --- | --- | --- | --- |
                """);
        if (endpoints.isEmpty()) {
            markdown.append("| - | - | - | - | - |\n");
        } else {
            endpoints.forEach(endpoint -> markdown
                    .append("| ").append(cell(endpoint.httpMethod()))
                    .append(" | `").append(cell(endpoint.path())).append('`')
                    .append(" | ").append(cell(endpoint.className()))
                    .append(" | ").append(cell(endpoint.methodName()))
                    .append(" | `").append(cell(endpoint.sourcePath())).append("` |\n"));
        }
        return markdown.toString();
    }

    private String classPage(ClassDoc classDoc, List<ClassRelationDoc> relations) {
        StringBuilder markdown = new StringBuilder()
                .append("# ").append(classDoc.className()).append("\n\n")
                .append("## Summary\n\n")
                .append("* Package: `").append(classDoc.packageName()).append("`\n")
                .append("* Declaration: `").append(classDoc.declarationKind()).append("`\n")
                .append("* Type: `").append(classDoc.componentType()).append("`\n")
                .append("* Source: `").append(classDoc.sourcePath()).append("`\n\n")
                .append("## Annotations\n\n");
        appendCodeList(markdown, classDoc.annotations());
        markdown.append("\n## Methods\n\n")
                .append("| Method | Return Type | Parameters | Annotations |\n")
                .append("| --- | --- | --- | --- |\n");
        if (classDoc.methods().isEmpty()) {
            markdown.append("| - | - | - | - |\n");
        } else {
            classDoc.methods().forEach(method -> markdown
                    .append("| ").append(cell(method.methodName()))
                    .append(" | `").append(cell(method.returnType())).append('`')
                    .append(" | ").append(cell(parameters(method)))
                    .append(" | ").append(cell(String.join(", ", method.annotations())))
                    .append(" |\n"));
        }

        markdown.append("\n## Fields\n\n")
                .append("| Name | Type | Annotations |\n")
                .append("| --- | --- | --- |\n");
        if (classDoc.fields().isEmpty()) {
            markdown.append("| - | - | - |\n");
        } else {
            classDoc.fields().forEach(field -> markdown
                    .append("| ").append(cell(field.name()))
                    .append(" | `").append(cell(field.type())).append('`')
                    .append(" | ").append(cell(String.join(", ", field.annotations())))
                    .append(" |\n"));
        }
        appendRelatedClasses(markdown, classDoc.className(), relations);
        return markdown.toString();
    }

    private void appendRelatedClasses(
            StringBuilder markdown,
            String className,
            List<ClassRelationDoc> relations
    ) {
        List<ClassRelationDoc> outgoing = sortedRelations(relations.stream()
                .filter(relation -> relation.sourceClassName().equals(className))
                .toList());
        List<ClassRelationDoc> incoming = sortedRelations(relations.stream()
                .filter(relation -> relation.targetClassName().equals(className))
                .toList());

        markdown.append("\n## Related Classes\n\n")
                .append("### Outgoing References\n\n")
                .append("| Target | Relation | Member |\n")
                .append("| --- | --- | --- |\n");
        if (outgoing.isEmpty()) {
            markdown.append("| - | - | - |\n");
        } else {
            outgoing.forEach(relation -> markdown
                    .append("| ").append(cell(relation.targetClassName()))
                    .append(" | ").append(relation.relationType())
                    .append(" | ").append(cell(relation.sourceMemberName()))
                    .append(" |\n"));
        }

        markdown.append("\n### Incoming References\n\n")
                .append("| Source | Relation | Member |\n")
                .append("| --- | --- | --- |\n");
        if (incoming.isEmpty()) {
            markdown.append("| - | - | - |\n");
        } else {
            incoming.forEach(relation -> markdown
                    .append("| ").append(cell(relation.sourceClassName()))
                    .append(" | ").append(relation.relationType())
                    .append(" | ").append(cell(relation.sourceMemberName()))
                    .append(" |\n"));
        }
    }

    private List<ClassRelationDoc> sortedRelations(List<ClassRelationDoc> relations) {
        return relations.stream().sorted(RELATION_ORDER).toList();
    }

    private String configurations(List<ConfigDoc> configs) {
        StringBuilder markdown = new StringBuilder("# Application Configurations\n\n## Files\n\n");
        if (configs.isEmpty()) {
            markdown.append("None\n");
        } else {
            configs.stream()
                    .sorted(Comparator.comparing(config -> config.sourcePath().toString()))
                    .forEach(config -> markdown.append("* `").append(config.sourcePath()).append("`\n"));
        }
        return markdown.toString();
    }

    private void appendCodeList(StringBuilder markdown, List<String> values) {
        if (values.isEmpty()) {
            markdown.append("None\n");
        } else {
            values.forEach(value -> markdown.append("* `").append(value).append("`\n"));
        }
    }

    private String parameters(MethodDoc method) {
        return method.parameters().stream()
                .map(parameter -> parameter.type() + " " + parameter.name())
                .collect(Collectors.joining(", "));
    }

    private String title(ComponentType type) {
        if (type == ComponentType.DTO) {
            return "DTO";
        }
        String lowercase = type.name().toLowerCase();
        return Character.toUpperCase(lowercase.charAt(0)) + lowercase.substring(1);
    }

    private String cell(String value) {
        return value.replace("|", "\\|").replace("\n", " ");
    }

    private void write(Path path, String content) throws IOException {
        Files.writeString(path, content);
    }
}
