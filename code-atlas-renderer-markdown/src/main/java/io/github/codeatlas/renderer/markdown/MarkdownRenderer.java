package io.github.codeatlas.renderer.markdown;

import io.github.codeatlas.core.model.AnalysisResult;
import io.github.codeatlas.core.model.ApiEndpointDoc;
import io.github.codeatlas.core.model.ClassDoc;
import io.github.codeatlas.core.model.ClassRelationDoc;
import io.github.codeatlas.core.model.ComponentType;
import io.github.codeatlas.core.model.ConfigDoc;
import io.github.codeatlas.core.model.MapperStatementRelationDoc;
import io.github.codeatlas.core.model.MethodCallCategory;
import io.github.codeatlas.core.model.MethodCallDoc;
import io.github.codeatlas.core.model.MethodCallRelationDoc;
import io.github.codeatlas.core.model.MethodDoc;
import io.github.codeatlas.core.model.ProjectOverview;
import io.github.codeatlas.core.model.SqlStatementDoc;
import io.github.codeatlas.core.model.TableUsageDoc;
import io.github.codeatlas.core.spi.DocumentationRenderer;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.util.Comparator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.Set;
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
        write(output.resolve("impact-map.md"), impactMap(result));
        write(output.resolve("api.md"), api(result));
        write(output.resolve("sql.md"), sql(result.sqlStatements()));
        write(output.resolve("tables.md"), tables(result.tableUsages()));
        write(output.resolve("mybatis.md"), mybatis(result.sqlStatements()));
        for (ClassDoc classDoc : result.classes()) {
            write(classesDirectory.resolve(classDoc.className() + ".md"),
                    classPage(classDoc, result));
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
                * [Impact Map](impact-map.md)
                * [API](api.md)
                * [SQL Statements](sql.md)
                * [Tables](tables.md)
                * [MyBatis Mappers](mybatis.md)
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
        Set<String> classNames = classNames(result.classes());
        if (relations.isEmpty()) {
            markdown.append("| - | - | - | - |\n");
        } else {
            relations.forEach(relation -> markdown
                    .append("| ").append(classLink(
                            relation.sourceClassName(), "classes/", classNames))
                    .append(" | ").append(classLink(
                            relation.targetClassName(), "classes/", classNames))
                    .append(" | ").append(relation.relationType())
                    .append(" | ").append(cell(relation.sourceMemberName()))
                    .append(" |\n"));
        }
        appendMethodCallOverview(markdown, result);
        return markdown.toString();
    }

    private void appendMethodCallOverview(StringBuilder markdown, AnalysisResult result) {
        Set<String> classNames = classNames(result.classes());
        List<MethodCallRelationDoc> relations = sortedMethodCallRelations(
                result.methodCallRelations());
        markdown.append("\n## Method Call Overview\n\n")
                .append("| Source | Target | Expression |\n")
                .append("| --- | --- | --- |\n");
        if (relations.isEmpty()) {
            markdown.append("| - | - | - |\n");
            return;
        }
        relations.forEach(relation -> markdown
                .append("| ").append(classLink(
                        relation.sourceClassName(), "classes/", classNames))
                .append('.').append(cell(relation.sourceMethodName()))
                .append(" | ").append(classLink(
                        relation.targetClassName(), "classes/", classNames))
                .append('.').append(cell(relation.targetMethodName()))
                .append(" | `").append(cell(relation.expression())).append("` |\n"));
    }

    private String api(AnalysisResult result) {
        List<ApiEndpointDoc> endpoints = result.endpoints();
        Set<String> classNames = classNames(result.classes());
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
                    .append(" | ").append(classLink(
                            endpoint.className(), "classes/", classNames))
                    .append(" | ").append(cell(endpoint.methodName()))
                    .append(" | `").append(cell(endpoint.sourcePath())).append("` |\n"));
        }
        return markdown.toString();
    }

    private String classPage(ClassDoc classDoc, AnalysisResult result) {
        StringBuilder markdown = new StringBuilder()
                .append("# ").append(classDoc.className()).append("\n\n")
                .append("## Summary\n\n")
                .append("* Package: `").append(classDoc.packageName()).append("`\n")
                .append("* Declaration: `").append(classDoc.declarationKind()).append("`\n")
                .append("* Type: `").append(classDoc.componentType()).append("`\n")
                .append("* Source: `").append(classDoc.sourcePath()).append("`\n\n")
                .append("## Role\n\n")
                .append(classDoc.roleSummary()).append("\n\n")
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
        appendMethodCallRelations(markdown, classDoc.className(), result);
        appendMethodCalls(markdown, classDoc.className(), result.methodCalls());
        appendRelatedClasses(
                markdown, classDoc.className(), result.relations(), classNames(result.classes()));
        List<SqlStatementDoc> mapperStatements =
                matchingMyBatisStatements(classDoc, result.sqlStatements());
        appendMyBatisStatements(markdown, mapperStatements);
        appendMapperStatementRelations(
                markdown, classDoc.className(), result.mapperStatementRelations());
        appendRelatedTables(markdown, mapperStatements);
        return markdown.toString();
    }

    private void appendMethodCallRelations(
            StringBuilder markdown,
            String className,
            AnalysisResult result
    ) {
        Set<String> classNames = classNames(result.classes());
        List<MethodCallRelationDoc> outgoing = sortedMethodCallRelations(
                result.methodCallRelations().stream()
                        .filter(relation -> relation.sourceClassName().equals(className))
                        .toList());
        List<MethodCallRelationDoc> incoming = sortedMethodCallRelations(
                result.methodCallRelations().stream()
                        .filter(relation -> relation.targetClassName().equals(className))
                        .toList());
        markdown.append("\n## Method Call Relations\n\n")
                .append("### Outgoing Calls\n\n")
                .append("| Target | Expression |\n")
                .append("| --- | --- |\n");
        if (outgoing.isEmpty()) {
            markdown.append("| - | - |\n");
        } else {
            outgoing.forEach(relation -> markdown
                    .append("| ").append(classLink(
                            relation.targetClassName(), "", classNames))
                    .append('.').append(cell(relation.targetMethodName()))
                    .append(" | `").append(cell(relation.expression())).append("` |\n"));
        }
        markdown.append("\n### Incoming Calls\n\n")
                .append("| Source | Expression |\n")
                .append("| --- | --- |\n");
        if (incoming.isEmpty()) {
            markdown.append("| - | - |\n");
        } else {
            incoming.forEach(relation -> markdown
                    .append("| ").append(classLink(
                            relation.sourceClassName(), "", classNames))
                    .append('.').append(cell(relation.sourceMethodName()))
                    .append(" | `").append(cell(relation.expression())).append("` |\n"));
        }
    }

    private void appendMethodCalls(
            StringBuilder markdown,
            String className,
            List<MethodCallDoc> methodCalls
    ) {
        List<MethodCallDoc> matching = methodCalls.stream()
                .filter(call -> call.sourceClassName().equals(className))
                .filter(call -> call.category() == MethodCallCategory.PROJECT)
                .sorted(Comparator.comparing(MethodCallDoc::sourceMethodName)
                        .thenComparing(MethodCallDoc::expression))
                .toList();
        markdown.append("\n## Method Calls\n\n")
                .append("### Project Calls\n\n")
                .append("| Source Method | Scope | Resolved Target | Called Method | Expression |\n")
                .append("| --- | --- | --- | --- | --- |\n");
        if (matching.isEmpty()) {
            markdown.append("| - | - | - | - | - |\n");
        } else {
            matching.forEach(call -> markdown
                    .append("| ").append(cell(call.sourceMethodName()))
                    .append(" | ").append(cell(call.scopeName()))
                    .append(" | ").append(cell(call.resolvedTargetClassName()))
                    .append(" | ").append(cell(call.calledMethodName()))
                    .append(" | `").append(cell(call.expression())).append("` |\n"));
        }
        long omittedCount = methodCalls.stream()
                .filter(call -> call.sourceClassName().equals(className))
                .filter(call -> call.category() == MethodCallCategory.LIBRARY_OR_UTILITY)
                .count();
        markdown.append("\n### Library / Utility Calls\n\n")
                .append("Library / Utility calls are omitted from this page. Count: ")
                .append(omittedCount)
                .append(".\n");
    }

    private void appendRelatedClasses(
            StringBuilder markdown,
            String className,
            List<ClassRelationDoc> relations,
            Set<String> classNames
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
                    .append("| ").append(classLink(relation.targetClassName(), "", classNames))
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
                    .append("| ").append(classLink(relation.sourceClassName(), "", classNames))
                    .append(" | ").append(relation.relationType())
                    .append(" | ").append(cell(relation.sourceMemberName()))
                    .append(" |\n"));
        }
    }

    private List<SqlStatementDoc> matchingMyBatisStatements(
            ClassDoc classDoc,
            List<SqlStatementDoc> statements
    ) {
        String qualifiedName = classDoc.packageName().isEmpty()
                ? classDoc.className()
                : classDoc.packageName() + "." + classDoc.className();
        return statements.stream()
                .filter(statement -> statement.ownerName().equals(qualifiedName))
                .sorted(Comparator.comparing(SqlStatementDoc::statementId))
                .toList();
    }

    private void appendMyBatisStatements(
            StringBuilder markdown,
            List<SqlStatementDoc> statements
    ) {
        if (statements.isEmpty()) {
            return;
        }

        markdown.append("\n## MyBatis Statements\n\n")
                .append("| Type | Statement ID | Tables | Source |\n")
                .append("| --- | --- | --- | --- |\n");
        statements.forEach(statement -> markdown
                .append("| ").append(statement.statementType())
                .append(" | ").append(cell(statement.statementId()))
                .append(" | ").append(cell(String.join(", ", statement.tableNames())))
                .append(" | `").append(cell(statement.sourcePath().toString())).append("` |\n"));
    }

    private void appendRelatedTables(
            StringBuilder markdown,
            List<SqlStatementDoc> statements
    ) {
        if (statements.isEmpty()) {
            return;
        }
        markdown.append("\n## Related Tables\n\n")
                .append("| Table | Statement | Usage |\n")
                .append("| --- | --- | --- |\n");
        List<String> rows = statements.stream()
                .flatMap(statement -> statement.tableNames().stream()
                        .map(tableName -> "| " + cell(tableName)
                                + " | " + cell(statement.statementId())
                                + " | " + statement.statementType() + " |"))
                .sorted()
                .toList();
        if (rows.isEmpty()) {
            markdown.append("| - | - | - |\n");
        } else {
            rows.forEach(row -> markdown.append(row).append('\n'));
        }
    }

    private void appendMapperStatementRelations(
            StringBuilder markdown,
            String className,
            List<MapperStatementRelationDoc> relations
    ) {
        List<MapperStatementRelationDoc> matching = relations.stream()
                .filter(relation -> relation.mapperClassName().equals(className))
                .sorted(Comparator.comparing(MapperStatementRelationDoc::mapperMethodName)
                        .thenComparing(MapperStatementRelationDoc::statementId))
                .toList();
        if (matching.isEmpty()) {
            return;
        }
        markdown.append("\n## Mapper Statement Relations\n\n")
                .append("| Mapper Method | Statement | Type | Tables |\n")
                .append("| --- | --- | --- | --- |\n");
        matching.forEach(relation -> markdown
                .append("| ").append(cell(relation.mapperMethodName()))
                .append(" | ").append(cell(relation.statementId()))
                .append(" | ").append(relation.statementType())
                .append(" | ").append(cell(String.join(", ", relation.tableNames())))
                .append(" |\n"));
    }

    private List<ClassRelationDoc> sortedRelations(List<ClassRelationDoc> relations) {
        return relations.stream().sorted(RELATION_ORDER).toList();
    }

    private List<MethodCallRelationDoc> sortedMethodCallRelations(
            List<MethodCallRelationDoc> relations
    ) {
        return relations.stream()
                .sorted(Comparator.comparing(MethodCallRelationDoc::sourceClassName)
                        .thenComparing(MethodCallRelationDoc::sourceMethodName)
                        .thenComparing(MethodCallRelationDoc::targetClassName)
                        .thenComparing(MethodCallRelationDoc::targetMethodName)
                        .thenComparing(MethodCallRelationDoc::expression))
                .toList();
    }

    private String impactMap(AnalysisResult result) {
        StringBuilder markdown = new StringBuilder("""
                # Impact Map

                ## API to Table

                | API | Controller | Service | Mapper | Statement | Tables |
                | --- | --- | --- | --- | --- | --- |
                """);
        List<ImpactRow> rows = impactRows(result);
        if (rows.isEmpty()) {
            markdown.append("| - | - | - | - | - | - |\n");
        } else {
            rows.forEach(row -> markdown
                    .append("| ").append(cell(row.api()))
                    .append(" | ").append(cell(row.controller()))
                    .append(" | ").append(cell(row.service()))
                    .append(" | ").append(cell(row.mapper()))
                    .append(" | ").append(cell(row.statement()))
                    .append(" | ").append(cell(row.tables()))
                    .append(" |\n"));
        }
        return markdown.toString();
    }

    private List<ImpactRow> impactRows(AnalysisResult result) {
        List<ImpactRow> rows = new java.util.ArrayList<>();
        List<ApiEndpointDoc> endpoints = result.endpoints().stream()
                .sorted(Comparator.comparing(ApiEndpointDoc::path)
                        .thenComparing(ApiEndpointDoc::httpMethod)
                        .thenComparing(ApiEndpointDoc::className)
                        .thenComparing(ApiEndpointDoc::methodName))
                .toList();
        for (ApiEndpointDoc endpoint : endpoints) {
            String api = endpoint.httpMethod() + " " + endpoint.path();
            String controller = methodName(endpoint.className(), endpoint.methodName());
            List<MethodCallRelationDoc> serviceCalls = result.methodCallRelations().stream()
                    .filter(relation -> relation.sourceClassName().equals(endpoint.className()))
                    .filter(relation -> relation.sourceMethodName().equals(endpoint.methodName()))
                    .filter(relation -> componentType(
                            relation.targetClassName(), result.classes()) == ComponentType.SERVICE)
                    .toList();
            if (serviceCalls.isEmpty()) {
                rows.add(new ImpactRow(api, controller, "-", "-", "-", "-"));
                continue;
            }
            for (MethodCallRelationDoc serviceCall : serviceCalls) {
                String service = methodName(
                        serviceCall.targetClassName(), serviceCall.targetMethodName());
                List<MethodCallRelationDoc> mapperCalls = result.methodCallRelations().stream()
                        .filter(relation -> relation.sourceClassName()
                                .equals(serviceCall.targetClassName()))
                        .filter(relation -> relation.sourceMethodName()
                                .equals(serviceCall.targetMethodName()))
                        .filter(relation -> isMapper(relation.targetClassName(), result))
                        .toList();
                if (mapperCalls.isEmpty()) {
                    rows.add(new ImpactRow(api, controller, service, "-", "-", "-"));
                    continue;
                }
                for (MethodCallRelationDoc mapperCall : mapperCalls) {
                    String mapper = methodName(
                            mapperCall.targetClassName(), mapperCall.targetMethodName());
                    List<MapperStatementRelationDoc> statementRelations =
                            result.mapperStatementRelations().stream()
                                    .filter(relation -> relation.mapperClassName()
                                            .equals(mapperCall.targetClassName()))
                                    .filter(relation -> relation.mapperMethodName()
                                            .equals(mapperCall.targetMethodName()))
                                    .toList();
                    if (statementRelations.isEmpty()) {
                        rows.add(new ImpactRow(api, controller, service, mapper, "-", "-"));
                        continue;
                    }
                    statementRelations.forEach(relation -> rows.add(new ImpactRow(
                            api,
                            controller,
                            service,
                            mapper,
                            relation.statementId(),
                            relation.tableNames().isEmpty()
                                    ? "-"
                                    : String.join(", ", relation.tableNames()))));
                }
            }
        }
        return rows;
    }

    private ComponentType componentType(String className, List<ClassDoc> classes) {
        return classes.stream()
                .filter(classDoc -> classDoc.className().equals(className))
                .map(ClassDoc::componentType)
                .findFirst()
                .orElse(ComponentType.UNKNOWN);
    }

    private boolean isMapper(String className, AnalysisResult result) {
        return className.endsWith("Mapper")
                || result.classes().stream()
                        .filter(classDoc -> classDoc.className().equals(className))
                        .anyMatch(classDoc -> classDoc.annotations().contains("Mapper"))
                || result.mapperStatementRelations().stream()
                        .anyMatch(relation -> relation.mapperClassName().equals(className));
    }

    private String methodName(String className, String methodName) {
        return className + "." + methodName;
    }

    private record ImpactRow(
            String api,
            String controller,
            String service,
            String mapper,
            String statement,
            String tables
    ) {
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

    private String sql(List<SqlStatementDoc> statements) {
        StringBuilder markdown = new StringBuilder("""
                # SQL Statements

                | Type | Owner | Statement ID | SQL | Tables | Source |
                | --- | --- | --- | --- | --- | --- |
                """);
        if (statements.isEmpty()) {
            markdown.append("| - | - | - | - | - | - |\n");
        } else {
            statements.stream()
                    .sorted(Comparator.comparing(SqlStatementDoc::ownerName)
                            .thenComparing(SqlStatementDoc::statementId))
                    .forEach(statement -> markdown
                            .append("| ").append(statement.statementType())
                            .append(" | ").append(cell(statement.ownerName()))
                            .append(" | ").append(cell(statement.statementId()))
                            .append(" | `").append(cell(statement.sql())).append('`')
                            .append(" | ").append(cell(String.join(", ", statement.tableNames())))
                            .append(" | `").append(cell(statement.sourcePath().toString()))
                            .append("` |\n"));
        }
        return markdown.toString();
    }

    private String tables(List<TableUsageDoc> usages) {
        StringBuilder markdown = new StringBuilder("""
                # Tables

                | Table | Used By | Usage Type | Statement | Source |
                | --- | --- | --- | --- | --- |
                """);
        if (usages.isEmpty()) {
            markdown.append("| - | - | - | - | - |\n");
        } else {
            usages.stream()
                    .sorted(Comparator.comparing(TableUsageDoc::tableName)
                            .thenComparing(TableUsageDoc::usedBy)
                            .thenComparing(TableUsageDoc::sourceName))
                    .forEach(usage -> markdown
                            .append("| ").append(cell(usage.tableName()))
                            .append(" | ").append(cell(usage.usedBy()))
                            .append(" | ").append(cell(usage.usageType()))
                            .append(" | ").append(cell(usage.sourceName()))
                            .append(" | `").append(cell(usage.sourcePath().toString()))
                            .append("` |\n"));
        }
        return markdown.toString();
    }

    private String mybatis(List<SqlStatementDoc> statements) {
        Map<String, List<SqlStatementDoc>> byMapper = statements.stream()
                .collect(Collectors.groupingBy(
                        statement -> statement.ownerName() + "\n" + statement.sourcePath(),
                        LinkedHashMap::new,
                        Collectors.toList()));
        StringBuilder markdown = new StringBuilder("""
                # MyBatis Mappers

                | Namespace | XML | Statements |
                | --- | --- | --- |
                """);
        if (byMapper.isEmpty()) {
            markdown.append("| - | - | - |\n");
        } else {
            byMapper.entrySet().stream()
                    .sorted(Map.Entry.comparingByKey())
                    .forEach(entry -> {
                        List<SqlStatementDoc> mapperStatements = entry.getValue();
                        SqlStatementDoc first = mapperStatements.getFirst();
                        markdown.append("| ").append(cell(first.ownerName()))
                                .append(" | `").append(cell(first.sourcePath().toString()))
                                .append("` | ").append(mapperStatements.size()).append(" |\n");
                    });
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

    private Set<String> classNames(List<ClassDoc> classes) {
        return classes.stream().map(ClassDoc::className).collect(Collectors.toSet());
    }

    private String classLink(String className, String prefix, Set<String> classNames) {
        if (!classNames.contains(className)) {
            return cell(className);
        }
        return "[" + cell(className) + "](" + prefix + className + ".md)";
    }

    private void write(Path path, String content) throws IOException {
        Files.writeString(path, content);
    }
}
