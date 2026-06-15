# MarkdownRenderer

## Summary

* Package: `io.github.codeatlas.renderer.markdown`
* Declaration: `CLASS`
* Type: `UNKNOWN`
* Source: `code-atlas-renderer-markdown/src/main/java/io/github/codeatlas/renderer/markdown/MarkdownRenderer.java`

## Role

このクラスは `DocumentationRenderer` を実装しているため、ドキュメント出力レンダラーです。

## Annotations

None

## Methods

| Method | Return Type | Parameters | Annotations |
| --- | --- | --- | --- |
| render | `void` | AnalysisResult result, Path outputDirectory | Override |
| index | `String` | ProjectOverview overview |  |
| displaySourceRoot | `String` | Path sourceRoot |  |
| architecture | `String` | AnalysisResult result |  |
| appendMethodCallOverview | `void` | StringBuilder markdown, AnalysisResult result |  |
| api | `String` | AnalysisResult result |  |
| classPage | `String` | ClassDoc classDoc, AnalysisResult result |  |
| appendMethodCallRelations | `void` | StringBuilder markdown, String className, AnalysisResult result |  |
| appendMethodCalls | `void` | StringBuilder markdown, String className, List<MethodCallDoc> methodCalls |  |
| appendRelatedClasses | `void` | StringBuilder markdown, String className, List<ClassRelationDoc> relations, Set<String> classNames |  |
| matchingMyBatisStatements | `List<SqlStatementDoc>` | ClassDoc classDoc, List<SqlStatementDoc> statements |  |
| appendMyBatisStatements | `void` | StringBuilder markdown, List<SqlStatementDoc> statements |  |
| appendRelatedTables | `void` | StringBuilder markdown, List<SqlStatementDoc> statements |  |
| appendMapperStatementRelations | `void` | StringBuilder markdown, String className, List<MapperStatementRelationDoc> relations |  |
| sortedRelations | `List<ClassRelationDoc>` | List<ClassRelationDoc> relations |  |
| sortedMethodCallRelations | `List<MethodCallRelationDoc>` | List<MethodCallRelationDoc> relations |  |
| impactMap | `String` | AnalysisResult result |  |
| impactRows | `List<ImpactRow>` | AnalysisResult result |  |
| componentType | `ComponentType` | String className, List<ClassDoc> classes |  |
| isMapper | `boolean` | String className, AnalysisResult result |  |
| methodName | `String` | String className, String methodName |  |
| configurations | `String` | List<ConfigDoc> configs |  |
| sql | `String` | List<SqlStatementDoc> statements |  |
| tables | `String` | List<TableUsageDoc> usages |  |
| mybatis | `String` | List<SqlStatementDoc> statements |  |
| appendCodeList | `void` | StringBuilder markdown, List<String> values |  |
| parameters | `String` | MethodDoc method |  |
| title | `String` | ComponentType type |  |
| cell | `String` | String value |  |
| classNames | `Set<String>` | List<ClassDoc> classes |  |
| classLink | `String` | String className, String prefix, Set<String> classNames |  |
| write | `void` | Path path, String content |  |

## Fields

| Name | Type | Annotations |
| --- | --- | --- |
| RELATION_ORDER | `Comparator<ClassRelationDoc>` |  |

## Method Call Relations

### Outgoing Calls

| Target | Expression |
| --- | --- |
| [AnalysisResult](AnalysisResult.md).classes | `result.classes()` |
| [AnalysisResult](AnalysisResult.md).endpoints | `result.endpoints()` |
| [MarkdownRenderer](MarkdownRenderer.md).cell | `cell(endpoint.httpMethod())` |
| [MarkdownRenderer](MarkdownRenderer.md).cell | `cell(endpoint.methodName())` |
| [MarkdownRenderer](MarkdownRenderer.md).cell | `cell(endpoint.path())` |
| [MarkdownRenderer](MarkdownRenderer.md).cell | `cell(endpoint.sourcePath())` |
| [MarkdownRenderer](MarkdownRenderer.md).classLink | `classLink(endpoint.className(), "classes/", classNames)` |
| [MarkdownRenderer](MarkdownRenderer.md).classNames | `classNames(result.classes())` |
| [MarkdownRenderer](MarkdownRenderer.md).cell | `cell(String.join(", ", relation.tableNames()))` |
| [MarkdownRenderer](MarkdownRenderer.md).cell | `cell(relation.mapperMethodName())` |
| [MarkdownRenderer](MarkdownRenderer.md).cell | `cell(relation.statementId())` |
| [AnalysisResult](AnalysisResult.md).classes | `result.classes()` |
| [AnalysisResult](AnalysisResult.md).methodCallRelations | `result.methodCallRelations()` |
| [MarkdownRenderer](MarkdownRenderer.md).cell | `cell(relation.expression())` |
| [MarkdownRenderer](MarkdownRenderer.md).cell | `cell(relation.sourceMethodName())` |
| [MarkdownRenderer](MarkdownRenderer.md).cell | `cell(relation.targetMethodName())` |
| [MarkdownRenderer](MarkdownRenderer.md).classLink | `classLink(relation.sourceClassName(), "classes/", classNames)` |
| [MarkdownRenderer](MarkdownRenderer.md).classLink | `classLink(relation.targetClassName(), "classes/", classNames)` |
| [MarkdownRenderer](MarkdownRenderer.md).classNames | `classNames(result.classes())` |
| [MarkdownRenderer](MarkdownRenderer.md).sortedMethodCallRelations | `sortedMethodCallRelations(result.methodCallRelations())` |
| [AnalysisResult](AnalysisResult.md).classes | `result.classes()` |
| [AnalysisResult](AnalysisResult.md).methodCallRelations | `result.methodCallRelations()` |
| [AnalysisResult](AnalysisResult.md).methodCallRelations | `result.methodCallRelations()` |
| [MarkdownRenderer](MarkdownRenderer.md).cell | `cell(relation.expression())` |
| [MarkdownRenderer](MarkdownRenderer.md).cell | `cell(relation.expression())` |
| [MarkdownRenderer](MarkdownRenderer.md).cell | `cell(relation.sourceMethodName())` |
| [MarkdownRenderer](MarkdownRenderer.md).cell | `cell(relation.targetMethodName())` |
| [MarkdownRenderer](MarkdownRenderer.md).classLink | `classLink(relation.sourceClassName(), "", classNames)` |
| [MarkdownRenderer](MarkdownRenderer.md).classLink | `classLink(relation.targetClassName(), "", classNames)` |
| [MarkdownRenderer](MarkdownRenderer.md).classNames | `classNames(result.classes())` |
| [MarkdownRenderer](MarkdownRenderer.md).sortedMethodCallRelations | `sortedMethodCallRelations(result.methodCallRelations().stream().filter(relation -> relation.sourceClassName().equals(className)).toList())` |
| [MarkdownRenderer](MarkdownRenderer.md).sortedMethodCallRelations | `sortedMethodCallRelations(result.methodCallRelations().stream().filter(relation -> relation.targetClassName().equals(className)).toList())` |
| [MarkdownRenderer](MarkdownRenderer.md).cell | `cell(call.calledMethodName())` |
| [MarkdownRenderer](MarkdownRenderer.md).cell | `cell(call.expression())` |
| [MarkdownRenderer](MarkdownRenderer.md).cell | `cell(call.resolvedTargetClassName())` |
| [MarkdownRenderer](MarkdownRenderer.md).cell | `cell(call.scopeName())` |
| [MarkdownRenderer](MarkdownRenderer.md).cell | `cell(call.sourceMethodName())` |
| [MarkdownRenderer](MarkdownRenderer.md).cell | `cell(String.join(", ", statement.tableNames()))` |
| [MarkdownRenderer](MarkdownRenderer.md).cell | `cell(statement.sourcePath().toString())` |
| [MarkdownRenderer](MarkdownRenderer.md).cell | `cell(statement.statementId())` |
| [MarkdownRenderer](MarkdownRenderer.md).cell | `cell(relation.sourceMemberName())` |
| [MarkdownRenderer](MarkdownRenderer.md).cell | `cell(relation.sourceMemberName())` |
| [MarkdownRenderer](MarkdownRenderer.md).classLink | `classLink(relation.sourceClassName(), "", classNames)` |
| [MarkdownRenderer](MarkdownRenderer.md).classLink | `classLink(relation.targetClassName(), "", classNames)` |
| [MarkdownRenderer](MarkdownRenderer.md).sortedRelations | `sortedRelations(relations.stream().filter(relation -> relation.sourceClassName().equals(className)).toList())` |
| [MarkdownRenderer](MarkdownRenderer.md).sortedRelations | `sortedRelations(relations.stream().filter(relation -> relation.targetClassName().equals(className)).toList())` |
| [MarkdownRenderer](MarkdownRenderer.md).cell | `cell(statement.statementId())` |
| [MarkdownRenderer](MarkdownRenderer.md).cell | `cell(tableName)` |
| [AnalysisResult](AnalysisResult.md).classes | `result.classes()` |
| [AnalysisResult](AnalysisResult.md).classes | `result.classes()` |
| [AnalysisResult](AnalysisResult.md).relations | `result.relations()` |
| [MarkdownRenderer](MarkdownRenderer.md).appendMethodCallOverview | `appendMethodCallOverview(markdown, result)` |
| [MarkdownRenderer](MarkdownRenderer.md).cell | `cell(relation.sourceMemberName())` |
| [MarkdownRenderer](MarkdownRenderer.md).classLink | `classLink(relation.sourceClassName(), "classes/", classNames)` |
| [MarkdownRenderer](MarkdownRenderer.md).classLink | `classLink(relation.targetClassName(), "classes/", classNames)` |
| [MarkdownRenderer](MarkdownRenderer.md).classNames | `classNames(result.classes())` |
| [MarkdownRenderer](MarkdownRenderer.md).sortedRelations | `sortedRelations(result.relations())` |
| [MarkdownRenderer](MarkdownRenderer.md).title | `title(type)` |
| [MarkdownRenderer](MarkdownRenderer.md).cell | `cell(className)` |
| [MarkdownRenderer](MarkdownRenderer.md).cell | `cell(className)` |
| [AnalysisResult](AnalysisResult.md).classes | `result.classes()` |
| [AnalysisResult](AnalysisResult.md).mapperStatementRelations | `result.mapperStatementRelations()` |
| [AnalysisResult](AnalysisResult.md).methodCalls | `result.methodCalls()` |
| [AnalysisResult](AnalysisResult.md).relations | `result.relations()` |
| [AnalysisResult](AnalysisResult.md).sqlStatements | `result.sqlStatements()` |
| [ClassDoc](ClassDoc.md).annotations | `classDoc.annotations()` |
| [ClassDoc](ClassDoc.md).className | `classDoc.className()` |
| [ClassDoc](ClassDoc.md).className | `classDoc.className()` |
| [ClassDoc](ClassDoc.md).className | `classDoc.className()` |
| [ClassDoc](ClassDoc.md).className | `classDoc.className()` |
| [ClassDoc](ClassDoc.md).className | `classDoc.className()` |
| [ClassDoc](ClassDoc.md).componentType | `classDoc.componentType()` |
| [ClassDoc](ClassDoc.md).declarationKind | `classDoc.declarationKind()` |
| [ClassDoc](ClassDoc.md).fields | `classDoc.fields()` |
| [ClassDoc](ClassDoc.md).fields | `classDoc.fields()` |
| [ClassDoc](ClassDoc.md).methods | `classDoc.methods()` |
| [ClassDoc](ClassDoc.md).methods | `classDoc.methods()` |
| [ClassDoc](ClassDoc.md).packageName | `classDoc.packageName()` |
| [ClassDoc](ClassDoc.md).roleSummary | `classDoc.roleSummary()` |
| [ClassDoc](ClassDoc.md).sourcePath | `classDoc.sourcePath()` |
| [MarkdownRenderer](MarkdownRenderer.md).appendCodeList | `appendCodeList(markdown, classDoc.annotations())` |
| [MarkdownRenderer](MarkdownRenderer.md).appendMapperStatementRelations | `appendMapperStatementRelations(markdown, classDoc.className(), result.mapperStatementRelations())` |
| [MarkdownRenderer](MarkdownRenderer.md).appendMethodCallRelations | `appendMethodCallRelations(markdown, classDoc.className(), result)` |
| [MarkdownRenderer](MarkdownRenderer.md).appendMethodCalls | `appendMethodCalls(markdown, classDoc.className(), result.methodCalls())` |
| [MarkdownRenderer](MarkdownRenderer.md).appendMyBatisStatements | `appendMyBatisStatements(markdown, mapperStatements)` |
| [MarkdownRenderer](MarkdownRenderer.md).appendRelatedClasses | `appendRelatedClasses(markdown, classDoc.className(), result.relations(), classNames(result.classes()))` |
| [MarkdownRenderer](MarkdownRenderer.md).appendRelatedTables | `appendRelatedTables(markdown, mapperStatements)` |
| [MarkdownRenderer](MarkdownRenderer.md).cell | `cell(String.join(", ", field.annotations()))` |
| [MarkdownRenderer](MarkdownRenderer.md).cell | `cell(String.join(", ", method.annotations()))` |
| [MarkdownRenderer](MarkdownRenderer.md).cell | `cell(field.name())` |
| [MarkdownRenderer](MarkdownRenderer.md).cell | `cell(field.type())` |
| [MarkdownRenderer](MarkdownRenderer.md).cell | `cell(method.methodName())` |
| [MarkdownRenderer](MarkdownRenderer.md).cell | `cell(method.returnType())` |
| [MarkdownRenderer](MarkdownRenderer.md).cell | `cell(parameters(method))` |
| [MarkdownRenderer](MarkdownRenderer.md).classNames | `classNames(result.classes())` |
| [MarkdownRenderer](MarkdownRenderer.md).matchingMyBatisStatements | `matchingMyBatisStatements(classDoc, result.sqlStatements())` |
| [MarkdownRenderer](MarkdownRenderer.md).parameters | `parameters(method)` |
| [MarkdownRenderer](MarkdownRenderer.md).cell | `cell(row.api())` |
| [MarkdownRenderer](MarkdownRenderer.md).cell | `cell(row.controller())` |
| [MarkdownRenderer](MarkdownRenderer.md).cell | `cell(row.mapper())` |
| [MarkdownRenderer](MarkdownRenderer.md).cell | `cell(row.service())` |
| [MarkdownRenderer](MarkdownRenderer.md).cell | `cell(row.statement())` |
| [MarkdownRenderer](MarkdownRenderer.md).cell | `cell(row.tables())` |
| [MarkdownRenderer](MarkdownRenderer.md).impactRows | `impactRows(result)` |
| [AnalysisResult](AnalysisResult.md).classes | `result.classes()` |
| [AnalysisResult](AnalysisResult.md).endpoints | `result.endpoints()` |
| [AnalysisResult](AnalysisResult.md).mapperStatementRelations | `result.mapperStatementRelations()` |
| [AnalysisResult](AnalysisResult.md).methodCallRelations | `result.methodCallRelations()` |
| [AnalysisResult](AnalysisResult.md).methodCallRelations | `result.methodCallRelations()` |
| [ApiEndpointDoc](ApiEndpointDoc.md).className | `endpoint.className()` |
| [ApiEndpointDoc](ApiEndpointDoc.md).className | `endpoint.className()` |
| [ApiEndpointDoc](ApiEndpointDoc.md).httpMethod | `endpoint.httpMethod()` |
| [ApiEndpointDoc](ApiEndpointDoc.md).methodName | `endpoint.methodName()` |
| [ApiEndpointDoc](ApiEndpointDoc.md).methodName | `endpoint.methodName()` |
| [ApiEndpointDoc](ApiEndpointDoc.md).path | `endpoint.path()` |
| [MarkdownRenderer](MarkdownRenderer.md).componentType | `componentType(relation.targetClassName(), result.classes())` |
| [MarkdownRenderer](MarkdownRenderer.md).isMapper | `isMapper(relation.targetClassName(), result)` |
| [MarkdownRenderer](MarkdownRenderer.md).methodName | `methodName(endpoint.className(), endpoint.methodName())` |
| [MarkdownRenderer](MarkdownRenderer.md).methodName | `methodName(mapperCall.targetClassName(), mapperCall.targetMethodName())` |
| [MarkdownRenderer](MarkdownRenderer.md).methodName | `methodName(serviceCall.targetClassName(), serviceCall.targetMethodName())` |
| [MethodCallRelationDoc](MethodCallRelationDoc.md).targetClassName | `mapperCall.targetClassName()` |
| [MethodCallRelationDoc](MethodCallRelationDoc.md).targetClassName | `mapperCall.targetClassName()` |
| [MethodCallRelationDoc](MethodCallRelationDoc.md).targetClassName | `serviceCall.targetClassName()` |
| [MethodCallRelationDoc](MethodCallRelationDoc.md).targetClassName | `serviceCall.targetClassName()` |
| [MethodCallRelationDoc](MethodCallRelationDoc.md).targetMethodName | `mapperCall.targetMethodName()` |
| [MethodCallRelationDoc](MethodCallRelationDoc.md).targetMethodName | `mapperCall.targetMethodName()` |
| [MethodCallRelationDoc](MethodCallRelationDoc.md).targetMethodName | `serviceCall.targetMethodName()` |
| [MethodCallRelationDoc](MethodCallRelationDoc.md).targetMethodName | `serviceCall.targetMethodName()` |
| [MarkdownRenderer](MarkdownRenderer.md).displaySourceRoot | `displaySourceRoot(overview.sourceRoot())` |
| [ProjectOverview](ProjectOverview.md).classCount | `overview.classCount()` |
| [ProjectOverview](ProjectOverview.md).controllerCount | `overview.controllerCount()` |
| [ProjectOverview](ProjectOverview.md).endpointCount | `overview.endpointCount()` |
| [ProjectOverview](ProjectOverview.md).entityCount | `overview.entityCount()` |
| [ProjectOverview](ProjectOverview.md).projectName | `overview.projectName()` |
| [ProjectOverview](ProjectOverview.md).repositoryCount | `overview.repositoryCount()` |
| [ProjectOverview](ProjectOverview.md).serviceCount | `overview.serviceCount()` |
| [ProjectOverview](ProjectOverview.md).sourceRoot | `overview.sourceRoot()` |
| [AnalysisResult](AnalysisResult.md).classes | `result.classes()` |
| [AnalysisResult](AnalysisResult.md).mapperStatementRelations | `result.mapperStatementRelations()` |
| [ClassDoc](ClassDoc.md).className | `classDoc.className()` |
| [ClassDoc](ClassDoc.md).className | `classDoc.className()` |
| [ClassDoc](ClassDoc.md).packageName | `classDoc.packageName()` |
| [ClassDoc](ClassDoc.md).packageName | `classDoc.packageName()` |
| [MarkdownRenderer](MarkdownRenderer.md).cell | `cell(first.ownerName())` |
| [MarkdownRenderer](MarkdownRenderer.md).cell | `cell(first.sourcePath().toString())` |
| [SqlStatementDoc](SqlStatementDoc.md).ownerName | `first.ownerName()` |
| [SqlStatementDoc](SqlStatementDoc.md).sourcePath | `first.sourcePath()` |
| [MethodDoc](MethodDoc.md).parameters | `method.parameters()` |
| [AnalysisResult](AnalysisResult.md).classes | `result.classes()` |
| [AnalysisResult](AnalysisResult.md).configs | `result.configs()` |
| [AnalysisResult](AnalysisResult.md).overview | `result.overview()` |
| [AnalysisResult](AnalysisResult.md).sqlStatements | `result.sqlStatements()` |
| [AnalysisResult](AnalysisResult.md).sqlStatements | `result.sqlStatements()` |
| [AnalysisResult](AnalysisResult.md).tableUsages | `result.tableUsages()` |
| [ClassDoc](ClassDoc.md).className | `classDoc.className()` |
| [MarkdownRenderer](MarkdownRenderer.md).api | `api(result)` |
| [MarkdownRenderer](MarkdownRenderer.md).architecture | `architecture(result)` |
| [MarkdownRenderer](MarkdownRenderer.md).classPage | `classPage(classDoc, result)` |
| [MarkdownRenderer](MarkdownRenderer.md).configurations | `configurations(result.configs())` |
| [MarkdownRenderer](MarkdownRenderer.md).impactMap | `impactMap(result)` |
| [MarkdownRenderer](MarkdownRenderer.md).index | `index(result.overview())` |
| [MarkdownRenderer](MarkdownRenderer.md).mybatis | `mybatis(result.sqlStatements())` |
| [MarkdownRenderer](MarkdownRenderer.md).sql | `sql(result.sqlStatements())` |
| [MarkdownRenderer](MarkdownRenderer.md).tables | `tables(result.tableUsages())` |
| [MarkdownRenderer](MarkdownRenderer.md).write | `write(classesDirectory.resolve(classDoc.className() + ".md"), classPage(classDoc, result))` |
| [MarkdownRenderer](MarkdownRenderer.md).write | `write(configsDirectory.resolve("application.md"), configurations(result.configs()))` |
| [MarkdownRenderer](MarkdownRenderer.md).write | `write(output.resolve("_config.yml"), "title: CodeAtlas\ntheme: minima\n")` |
| [MarkdownRenderer](MarkdownRenderer.md).write | `write(output.resolve("api.md"), api(result))` |
| [MarkdownRenderer](MarkdownRenderer.md).write | `write(output.resolve("architecture.md"), architecture(result))` |
| [MarkdownRenderer](MarkdownRenderer.md).write | `write(output.resolve("impact-map.md"), impactMap(result))` |
| [MarkdownRenderer](MarkdownRenderer.md).write | `write(output.resolve("index.md"), index(result.overview()))` |
| [MarkdownRenderer](MarkdownRenderer.md).write | `write(output.resolve("mybatis.md"), mybatis(result.sqlStatements()))` |
| [MarkdownRenderer](MarkdownRenderer.md).write | `write(output.resolve("sql.md"), sql(result.sqlStatements()))` |
| [MarkdownRenderer](MarkdownRenderer.md).write | `write(output.resolve("tables.md"), tables(result.tableUsages()))` |
| [MarkdownRenderer](MarkdownRenderer.md).cell | `cell(String.join(", ", statement.tableNames()))` |
| [MarkdownRenderer](MarkdownRenderer.md).cell | `cell(statement.ownerName())` |
| [MarkdownRenderer](MarkdownRenderer.md).cell | `cell(statement.sourcePath().toString())` |
| [MarkdownRenderer](MarkdownRenderer.md).cell | `cell(statement.sql())` |
| [MarkdownRenderer](MarkdownRenderer.md).cell | `cell(statement.statementId())` |
| [MarkdownRenderer](MarkdownRenderer.md).cell | `cell(usage.sourceName())` |
| [MarkdownRenderer](MarkdownRenderer.md).cell | `cell(usage.sourcePath().toString())` |
| [MarkdownRenderer](MarkdownRenderer.md).cell | `cell(usage.tableName())` |
| [MarkdownRenderer](MarkdownRenderer.md).cell | `cell(usage.usageType())` |
| [MarkdownRenderer](MarkdownRenderer.md).cell | `cell(usage.usedBy())` |
| [ComponentType](ComponentType.md).name | `type.name()` |

### Incoming Calls

| Source | Expression |
| --- | --- |
| [MarkdownRenderer](MarkdownRenderer.md).api | `cell(endpoint.httpMethod())` |
| [MarkdownRenderer](MarkdownRenderer.md).api | `cell(endpoint.methodName())` |
| [MarkdownRenderer](MarkdownRenderer.md).api | `cell(endpoint.path())` |
| [MarkdownRenderer](MarkdownRenderer.md).api | `cell(endpoint.sourcePath())` |
| [MarkdownRenderer](MarkdownRenderer.md).api | `classLink(endpoint.className(), "classes/", classNames)` |
| [MarkdownRenderer](MarkdownRenderer.md).api | `classNames(result.classes())` |
| [MarkdownRenderer](MarkdownRenderer.md).appendMapperStatementRelations | `cell(String.join(", ", relation.tableNames()))` |
| [MarkdownRenderer](MarkdownRenderer.md).appendMapperStatementRelations | `cell(relation.mapperMethodName())` |
| [MarkdownRenderer](MarkdownRenderer.md).appendMapperStatementRelations | `cell(relation.statementId())` |
| [MarkdownRenderer](MarkdownRenderer.md).appendMethodCallOverview | `cell(relation.expression())` |
| [MarkdownRenderer](MarkdownRenderer.md).appendMethodCallOverview | `cell(relation.sourceMethodName())` |
| [MarkdownRenderer](MarkdownRenderer.md).appendMethodCallOverview | `cell(relation.targetMethodName())` |
| [MarkdownRenderer](MarkdownRenderer.md).appendMethodCallOverview | `classLink(relation.sourceClassName(), "classes/", classNames)` |
| [MarkdownRenderer](MarkdownRenderer.md).appendMethodCallOverview | `classLink(relation.targetClassName(), "classes/", classNames)` |
| [MarkdownRenderer](MarkdownRenderer.md).appendMethodCallOverview | `classNames(result.classes())` |
| [MarkdownRenderer](MarkdownRenderer.md).appendMethodCallOverview | `sortedMethodCallRelations(result.methodCallRelations())` |
| [MarkdownRenderer](MarkdownRenderer.md).appendMethodCallRelations | `cell(relation.expression())` |
| [MarkdownRenderer](MarkdownRenderer.md).appendMethodCallRelations | `cell(relation.expression())` |
| [MarkdownRenderer](MarkdownRenderer.md).appendMethodCallRelations | `cell(relation.sourceMethodName())` |
| [MarkdownRenderer](MarkdownRenderer.md).appendMethodCallRelations | `cell(relation.targetMethodName())` |
| [MarkdownRenderer](MarkdownRenderer.md).appendMethodCallRelations | `classLink(relation.sourceClassName(), "", classNames)` |
| [MarkdownRenderer](MarkdownRenderer.md).appendMethodCallRelations | `classLink(relation.targetClassName(), "", classNames)` |
| [MarkdownRenderer](MarkdownRenderer.md).appendMethodCallRelations | `classNames(result.classes())` |
| [MarkdownRenderer](MarkdownRenderer.md).appendMethodCallRelations | `sortedMethodCallRelations(result.methodCallRelations().stream().filter(relation -> relation.sourceClassName().equals(className)).toList())` |
| [MarkdownRenderer](MarkdownRenderer.md).appendMethodCallRelations | `sortedMethodCallRelations(result.methodCallRelations().stream().filter(relation -> relation.targetClassName().equals(className)).toList())` |
| [MarkdownRenderer](MarkdownRenderer.md).appendMethodCalls | `cell(call.calledMethodName())` |
| [MarkdownRenderer](MarkdownRenderer.md).appendMethodCalls | `cell(call.expression())` |
| [MarkdownRenderer](MarkdownRenderer.md).appendMethodCalls | `cell(call.resolvedTargetClassName())` |
| [MarkdownRenderer](MarkdownRenderer.md).appendMethodCalls | `cell(call.scopeName())` |
| [MarkdownRenderer](MarkdownRenderer.md).appendMethodCalls | `cell(call.sourceMethodName())` |
| [MarkdownRenderer](MarkdownRenderer.md).appendMyBatisStatements | `cell(String.join(", ", statement.tableNames()))` |
| [MarkdownRenderer](MarkdownRenderer.md).appendMyBatisStatements | `cell(statement.sourcePath().toString())` |
| [MarkdownRenderer](MarkdownRenderer.md).appendMyBatisStatements | `cell(statement.statementId())` |
| [MarkdownRenderer](MarkdownRenderer.md).appendRelatedClasses | `cell(relation.sourceMemberName())` |
| [MarkdownRenderer](MarkdownRenderer.md).appendRelatedClasses | `cell(relation.sourceMemberName())` |
| [MarkdownRenderer](MarkdownRenderer.md).appendRelatedClasses | `classLink(relation.sourceClassName(), "", classNames)` |
| [MarkdownRenderer](MarkdownRenderer.md).appendRelatedClasses | `classLink(relation.targetClassName(), "", classNames)` |
| [MarkdownRenderer](MarkdownRenderer.md).appendRelatedClasses | `sortedRelations(relations.stream().filter(relation -> relation.sourceClassName().equals(className)).toList())` |
| [MarkdownRenderer](MarkdownRenderer.md).appendRelatedClasses | `sortedRelations(relations.stream().filter(relation -> relation.targetClassName().equals(className)).toList())` |
| [MarkdownRenderer](MarkdownRenderer.md).appendRelatedTables | `cell(statement.statementId())` |
| [MarkdownRenderer](MarkdownRenderer.md).appendRelatedTables | `cell(tableName)` |
| [MarkdownRenderer](MarkdownRenderer.md).architecture | `appendMethodCallOverview(markdown, result)` |
| [MarkdownRenderer](MarkdownRenderer.md).architecture | `cell(relation.sourceMemberName())` |
| [MarkdownRenderer](MarkdownRenderer.md).architecture | `classLink(relation.sourceClassName(), "classes/", classNames)` |
| [MarkdownRenderer](MarkdownRenderer.md).architecture | `classLink(relation.targetClassName(), "classes/", classNames)` |
| [MarkdownRenderer](MarkdownRenderer.md).architecture | `classNames(result.classes())` |
| [MarkdownRenderer](MarkdownRenderer.md).architecture | `sortedRelations(result.relations())` |
| [MarkdownRenderer](MarkdownRenderer.md).architecture | `title(type)` |
| [MarkdownRenderer](MarkdownRenderer.md).classLink | `cell(className)` |
| [MarkdownRenderer](MarkdownRenderer.md).classLink | `cell(className)` |
| [MarkdownRenderer](MarkdownRenderer.md).classPage | `appendCodeList(markdown, classDoc.annotations())` |
| [MarkdownRenderer](MarkdownRenderer.md).classPage | `appendMapperStatementRelations(markdown, classDoc.className(), result.mapperStatementRelations())` |
| [MarkdownRenderer](MarkdownRenderer.md).classPage | `appendMethodCallRelations(markdown, classDoc.className(), result)` |
| [MarkdownRenderer](MarkdownRenderer.md).classPage | `appendMethodCalls(markdown, classDoc.className(), result.methodCalls())` |
| [MarkdownRenderer](MarkdownRenderer.md).classPage | `appendMyBatisStatements(markdown, mapperStatements)` |
| [MarkdownRenderer](MarkdownRenderer.md).classPage | `appendRelatedClasses(markdown, classDoc.className(), result.relations(), classNames(result.classes()))` |
| [MarkdownRenderer](MarkdownRenderer.md).classPage | `appendRelatedTables(markdown, mapperStatements)` |
| [MarkdownRenderer](MarkdownRenderer.md).classPage | `cell(String.join(", ", field.annotations()))` |
| [MarkdownRenderer](MarkdownRenderer.md).classPage | `cell(String.join(", ", method.annotations()))` |
| [MarkdownRenderer](MarkdownRenderer.md).classPage | `cell(field.name())` |
| [MarkdownRenderer](MarkdownRenderer.md).classPage | `cell(field.type())` |
| [MarkdownRenderer](MarkdownRenderer.md).classPage | `cell(method.methodName())` |
| [MarkdownRenderer](MarkdownRenderer.md).classPage | `cell(method.returnType())` |
| [MarkdownRenderer](MarkdownRenderer.md).classPage | `cell(parameters(method))` |
| [MarkdownRenderer](MarkdownRenderer.md).classPage | `classNames(result.classes())` |
| [MarkdownRenderer](MarkdownRenderer.md).classPage | `matchingMyBatisStatements(classDoc, result.sqlStatements())` |
| [MarkdownRenderer](MarkdownRenderer.md).classPage | `parameters(method)` |
| [MarkdownRenderer](MarkdownRenderer.md).impactMap | `cell(row.api())` |
| [MarkdownRenderer](MarkdownRenderer.md).impactMap | `cell(row.controller())` |
| [MarkdownRenderer](MarkdownRenderer.md).impactMap | `cell(row.mapper())` |
| [MarkdownRenderer](MarkdownRenderer.md).impactMap | `cell(row.service())` |
| [MarkdownRenderer](MarkdownRenderer.md).impactMap | `cell(row.statement())` |
| [MarkdownRenderer](MarkdownRenderer.md).impactMap | `cell(row.tables())` |
| [MarkdownRenderer](MarkdownRenderer.md).impactMap | `impactRows(result)` |
| [MarkdownRenderer](MarkdownRenderer.md).impactRows | `componentType(relation.targetClassName(), result.classes())` |
| [MarkdownRenderer](MarkdownRenderer.md).impactRows | `isMapper(relation.targetClassName(), result)` |
| [MarkdownRenderer](MarkdownRenderer.md).impactRows | `methodName(endpoint.className(), endpoint.methodName())` |
| [MarkdownRenderer](MarkdownRenderer.md).impactRows | `methodName(mapperCall.targetClassName(), mapperCall.targetMethodName())` |
| [MarkdownRenderer](MarkdownRenderer.md).impactRows | `methodName(serviceCall.targetClassName(), serviceCall.targetMethodName())` |
| [MarkdownRenderer](MarkdownRenderer.md).index | `displaySourceRoot(overview.sourceRoot())` |
| [MarkdownRenderer](MarkdownRenderer.md).mybatis | `cell(first.ownerName())` |
| [MarkdownRenderer](MarkdownRenderer.md).mybatis | `cell(first.sourcePath().toString())` |
| [MarkdownRenderer](MarkdownRenderer.md).render | `api(result)` |
| [MarkdownRenderer](MarkdownRenderer.md).render | `architecture(result)` |
| [MarkdownRenderer](MarkdownRenderer.md).render | `classPage(classDoc, result)` |
| [MarkdownRenderer](MarkdownRenderer.md).render | `configurations(result.configs())` |
| [MarkdownRenderer](MarkdownRenderer.md).render | `impactMap(result)` |
| [MarkdownRenderer](MarkdownRenderer.md).render | `index(result.overview())` |
| [MarkdownRenderer](MarkdownRenderer.md).render | `mybatis(result.sqlStatements())` |
| [MarkdownRenderer](MarkdownRenderer.md).render | `sql(result.sqlStatements())` |
| [MarkdownRenderer](MarkdownRenderer.md).render | `tables(result.tableUsages())` |
| [MarkdownRenderer](MarkdownRenderer.md).render | `write(classesDirectory.resolve(classDoc.className() + ".md"), classPage(classDoc, result))` |
| [MarkdownRenderer](MarkdownRenderer.md).render | `write(configsDirectory.resolve("application.md"), configurations(result.configs()))` |
| [MarkdownRenderer](MarkdownRenderer.md).render | `write(output.resolve("_config.yml"), "title: CodeAtlas\ntheme: minima\n")` |
| [MarkdownRenderer](MarkdownRenderer.md).render | `write(output.resolve("api.md"), api(result))` |
| [MarkdownRenderer](MarkdownRenderer.md).render | `write(output.resolve("architecture.md"), architecture(result))` |
| [MarkdownRenderer](MarkdownRenderer.md).render | `write(output.resolve("impact-map.md"), impactMap(result))` |
| [MarkdownRenderer](MarkdownRenderer.md).render | `write(output.resolve("index.md"), index(result.overview()))` |
| [MarkdownRenderer](MarkdownRenderer.md).render | `write(output.resolve("mybatis.md"), mybatis(result.sqlStatements()))` |
| [MarkdownRenderer](MarkdownRenderer.md).render | `write(output.resolve("sql.md"), sql(result.sqlStatements()))` |
| [MarkdownRenderer](MarkdownRenderer.md).render | `write(output.resolve("tables.md"), tables(result.tableUsages()))` |
| [MarkdownRenderer](MarkdownRenderer.md).sql | `cell(String.join(", ", statement.tableNames()))` |
| [MarkdownRenderer](MarkdownRenderer.md).sql | `cell(statement.ownerName())` |
| [MarkdownRenderer](MarkdownRenderer.md).sql | `cell(statement.sourcePath().toString())` |
| [MarkdownRenderer](MarkdownRenderer.md).sql | `cell(statement.sql())` |
| [MarkdownRenderer](MarkdownRenderer.md).sql | `cell(statement.statementId())` |
| [MarkdownRenderer](MarkdownRenderer.md).tables | `cell(usage.sourceName())` |
| [MarkdownRenderer](MarkdownRenderer.md).tables | `cell(usage.sourcePath().toString())` |
| [MarkdownRenderer](MarkdownRenderer.md).tables | `cell(usage.tableName())` |
| [MarkdownRenderer](MarkdownRenderer.md).tables | `cell(usage.usageType())` |
| [MarkdownRenderer](MarkdownRenderer.md).tables | `cell(usage.usedBy())` |

## Method Calls

### Project Calls

| Source Method | Scope | Resolved Target | Called Method | Expression |
| --- | --- | --- | --- | --- |
| api |  | MarkdownRenderer | cell | `cell(endpoint.httpMethod())` |
| api |  | MarkdownRenderer | cell | `cell(endpoint.methodName())` |
| api |  | MarkdownRenderer | cell | `cell(endpoint.path())` |
| api |  | MarkdownRenderer | cell | `cell(endpoint.sourcePath())` |
| api |  | MarkdownRenderer | classLink | `classLink(endpoint.className(), "classes/", classNames)` |
| api |  | MarkdownRenderer | classNames | `classNames(result.classes())` |
| api | result | AnalysisResult | classes | `result.classes()` |
| api | result | AnalysisResult | endpoints | `result.endpoints()` |
| appendMapperStatementRelations |  | MarkdownRenderer | cell | `cell(String.join(", ", relation.tableNames()))` |
| appendMapperStatementRelations |  | MarkdownRenderer | cell | `cell(relation.mapperMethodName())` |
| appendMapperStatementRelations |  | MarkdownRenderer | cell | `cell(relation.statementId())` |
| appendMethodCallOverview |  | MarkdownRenderer | cell | `cell(relation.expression())` |
| appendMethodCallOverview |  | MarkdownRenderer | cell | `cell(relation.sourceMethodName())` |
| appendMethodCallOverview |  | MarkdownRenderer | cell | `cell(relation.targetMethodName())` |
| appendMethodCallOverview |  | MarkdownRenderer | classLink | `classLink(relation.sourceClassName(), "classes/", classNames)` |
| appendMethodCallOverview |  | MarkdownRenderer | classLink | `classLink(relation.targetClassName(), "classes/", classNames)` |
| appendMethodCallOverview |  | MarkdownRenderer | classNames | `classNames(result.classes())` |
| appendMethodCallOverview | result | AnalysisResult | classes | `result.classes()` |
| appendMethodCallOverview | result | AnalysisResult | methodCallRelations | `result.methodCallRelations()` |
| appendMethodCallOverview |  | MarkdownRenderer | sortedMethodCallRelations | `sortedMethodCallRelations(result.methodCallRelations())` |
| appendMethodCallRelations |  | MarkdownRenderer | cell | `cell(relation.expression())` |
| appendMethodCallRelations |  | MarkdownRenderer | cell | `cell(relation.expression())` |
| appendMethodCallRelations |  | MarkdownRenderer | cell | `cell(relation.sourceMethodName())` |
| appendMethodCallRelations |  | MarkdownRenderer | cell | `cell(relation.targetMethodName())` |
| appendMethodCallRelations |  | MarkdownRenderer | classLink | `classLink(relation.sourceClassName(), "", classNames)` |
| appendMethodCallRelations |  | MarkdownRenderer | classLink | `classLink(relation.targetClassName(), "", classNames)` |
| appendMethodCallRelations |  | MarkdownRenderer | classNames | `classNames(result.classes())` |
| appendMethodCallRelations | result | AnalysisResult | classes | `result.classes()` |
| appendMethodCallRelations | result | AnalysisResult | methodCallRelations | `result.methodCallRelations()` |
| appendMethodCallRelations | result | AnalysisResult | methodCallRelations | `result.methodCallRelations()` |
| appendMethodCallRelations |  | MarkdownRenderer | sortedMethodCallRelations | `sortedMethodCallRelations(result.methodCallRelations().stream().filter(relation -> relation.sourceClassName().equals(className)).toList())` |
| appendMethodCallRelations |  | MarkdownRenderer | sortedMethodCallRelations | `sortedMethodCallRelations(result.methodCallRelations().stream().filter(relation -> relation.targetClassName().equals(className)).toList())` |
| appendMethodCalls |  | MarkdownRenderer | cell | `cell(call.calledMethodName())` |
| appendMethodCalls |  | MarkdownRenderer | cell | `cell(call.expression())` |
| appendMethodCalls |  | MarkdownRenderer | cell | `cell(call.resolvedTargetClassName())` |
| appendMethodCalls |  | MarkdownRenderer | cell | `cell(call.scopeName())` |
| appendMethodCalls |  | MarkdownRenderer | cell | `cell(call.sourceMethodName())` |
| appendMyBatisStatements |  | MarkdownRenderer | cell | `cell(String.join(", ", statement.tableNames()))` |
| appendMyBatisStatements |  | MarkdownRenderer | cell | `cell(statement.sourcePath().toString())` |
| appendMyBatisStatements |  | MarkdownRenderer | cell | `cell(statement.statementId())` |
| appendRelatedClasses |  | MarkdownRenderer | cell | `cell(relation.sourceMemberName())` |
| appendRelatedClasses |  | MarkdownRenderer | cell | `cell(relation.sourceMemberName())` |
| appendRelatedClasses |  | MarkdownRenderer | classLink | `classLink(relation.sourceClassName(), "", classNames)` |
| appendRelatedClasses |  | MarkdownRenderer | classLink | `classLink(relation.targetClassName(), "", classNames)` |
| appendRelatedClasses |  | MarkdownRenderer | sortedRelations | `sortedRelations(relations.stream().filter(relation -> relation.sourceClassName().equals(className)).toList())` |
| appendRelatedClasses |  | MarkdownRenderer | sortedRelations | `sortedRelations(relations.stream().filter(relation -> relation.targetClassName().equals(className)).toList())` |
| appendRelatedTables |  | MarkdownRenderer | cell | `cell(statement.statementId())` |
| appendRelatedTables |  | MarkdownRenderer | cell | `cell(tableName)` |
| architecture |  | MarkdownRenderer | appendMethodCallOverview | `appendMethodCallOverview(markdown, result)` |
| architecture |  | MarkdownRenderer | cell | `cell(relation.sourceMemberName())` |
| architecture |  | MarkdownRenderer | classLink | `classLink(relation.sourceClassName(), "classes/", classNames)` |
| architecture |  | MarkdownRenderer | classLink | `classLink(relation.targetClassName(), "classes/", classNames)` |
| architecture |  | MarkdownRenderer | classNames | `classNames(result.classes())` |
| architecture | result | AnalysisResult | classes | `result.classes()` |
| architecture | result | AnalysisResult | classes | `result.classes()` |
| architecture | result | AnalysisResult | relations | `result.relations()` |
| architecture |  | MarkdownRenderer | sortedRelations | `sortedRelations(result.relations())` |
| architecture |  | MarkdownRenderer | title | `title(type)` |
| classLink |  | MarkdownRenderer | cell | `cell(className)` |
| classLink |  | MarkdownRenderer | cell | `cell(className)` |
| classPage |  | MarkdownRenderer | appendCodeList | `appendCodeList(markdown, classDoc.annotations())` |
| classPage |  | MarkdownRenderer | appendMapperStatementRelations | `appendMapperStatementRelations(markdown, classDoc.className(), result.mapperStatementRelations())` |
| classPage |  | MarkdownRenderer | appendMethodCallRelations | `appendMethodCallRelations(markdown, classDoc.className(), result)` |
| classPage |  | MarkdownRenderer | appendMethodCalls | `appendMethodCalls(markdown, classDoc.className(), result.methodCalls())` |
| classPage |  | MarkdownRenderer | appendMyBatisStatements | `appendMyBatisStatements(markdown, mapperStatements)` |
| classPage |  | MarkdownRenderer | appendRelatedClasses | `appendRelatedClasses(markdown, classDoc.className(), result.relations(), classNames(result.classes()))` |
| classPage |  | MarkdownRenderer | appendRelatedTables | `appendRelatedTables(markdown, mapperStatements)` |
| classPage |  | MarkdownRenderer | cell | `cell(String.join(", ", field.annotations()))` |
| classPage |  | MarkdownRenderer | cell | `cell(String.join(", ", method.annotations()))` |
| classPage |  | MarkdownRenderer | cell | `cell(field.name())` |
| classPage |  | MarkdownRenderer | cell | `cell(field.type())` |
| classPage |  | MarkdownRenderer | cell | `cell(method.methodName())` |
| classPage |  | MarkdownRenderer | cell | `cell(method.returnType())` |
| classPage |  | MarkdownRenderer | cell | `cell(parameters(method))` |
| classPage | classDoc | ClassDoc | annotations | `classDoc.annotations()` |
| classPage | classDoc | ClassDoc | className | `classDoc.className()` |
| classPage | classDoc | ClassDoc | className | `classDoc.className()` |
| classPage | classDoc | ClassDoc | className | `classDoc.className()` |
| classPage | classDoc | ClassDoc | className | `classDoc.className()` |
| classPage | classDoc | ClassDoc | className | `classDoc.className()` |
| classPage | classDoc | ClassDoc | componentType | `classDoc.componentType()` |
| classPage | classDoc | ClassDoc | declarationKind | `classDoc.declarationKind()` |
| classPage | classDoc | ClassDoc | fields | `classDoc.fields()` |
| classPage | classDoc | ClassDoc | fields | `classDoc.fields()` |
| classPage | classDoc | ClassDoc | methods | `classDoc.methods()` |
| classPage | classDoc | ClassDoc | methods | `classDoc.methods()` |
| classPage | classDoc | ClassDoc | packageName | `classDoc.packageName()` |
| classPage | classDoc | ClassDoc | roleSummary | `classDoc.roleSummary()` |
| classPage | classDoc | ClassDoc | sourcePath | `classDoc.sourcePath()` |
| classPage |  | MarkdownRenderer | classNames | `classNames(result.classes())` |
| classPage |  | MarkdownRenderer | matchingMyBatisStatements | `matchingMyBatisStatements(classDoc, result.sqlStatements())` |
| classPage |  | MarkdownRenderer | parameters | `parameters(method)` |
| classPage | result | AnalysisResult | classes | `result.classes()` |
| classPage | result | AnalysisResult | mapperStatementRelations | `result.mapperStatementRelations()` |
| classPage | result | AnalysisResult | methodCalls | `result.methodCalls()` |
| classPage | result | AnalysisResult | relations | `result.relations()` |
| classPage | result | AnalysisResult | sqlStatements | `result.sqlStatements()` |
| impactMap |  | MarkdownRenderer | cell | `cell(row.api())` |
| impactMap |  | MarkdownRenderer | cell | `cell(row.controller())` |
| impactMap |  | MarkdownRenderer | cell | `cell(row.mapper())` |
| impactMap |  | MarkdownRenderer | cell | `cell(row.service())` |
| impactMap |  | MarkdownRenderer | cell | `cell(row.statement())` |
| impactMap |  | MarkdownRenderer | cell | `cell(row.tables())` |
| impactMap |  | MarkdownRenderer | impactRows | `impactRows(result)` |
| impactRows |  | MarkdownRenderer | componentType | `componentType(relation.targetClassName(), result.classes())` |
| impactRows | endpoint | ApiEndpointDoc | className | `endpoint.className()` |
| impactRows | endpoint | ApiEndpointDoc | className | `endpoint.className()` |
| impactRows | endpoint | ApiEndpointDoc | httpMethod | `endpoint.httpMethod()` |
| impactRows | endpoint | ApiEndpointDoc | methodName | `endpoint.methodName()` |
| impactRows | endpoint | ApiEndpointDoc | methodName | `endpoint.methodName()` |
| impactRows | endpoint | ApiEndpointDoc | path | `endpoint.path()` |
| impactRows |  | MarkdownRenderer | isMapper | `isMapper(relation.targetClassName(), result)` |
| impactRows | mapperCall | MethodCallRelationDoc | targetClassName | `mapperCall.targetClassName()` |
| impactRows | mapperCall | MethodCallRelationDoc | targetClassName | `mapperCall.targetClassName()` |
| impactRows | mapperCall | MethodCallRelationDoc | targetMethodName | `mapperCall.targetMethodName()` |
| impactRows | mapperCall | MethodCallRelationDoc | targetMethodName | `mapperCall.targetMethodName()` |
| impactRows |  | MarkdownRenderer | methodName | `methodName(endpoint.className(), endpoint.methodName())` |
| impactRows |  | MarkdownRenderer | methodName | `methodName(mapperCall.targetClassName(), mapperCall.targetMethodName())` |
| impactRows |  | MarkdownRenderer | methodName | `methodName(serviceCall.targetClassName(), serviceCall.targetMethodName())` |
| impactRows | result | AnalysisResult | classes | `result.classes()` |
| impactRows | result | AnalysisResult | endpoints | `result.endpoints()` |
| impactRows | result | AnalysisResult | mapperStatementRelations | `result.mapperStatementRelations()` |
| impactRows | result | AnalysisResult | methodCallRelations | `result.methodCallRelations()` |
| impactRows | result | AnalysisResult | methodCallRelations | `result.methodCallRelations()` |
| impactRows | serviceCall | MethodCallRelationDoc | targetClassName | `serviceCall.targetClassName()` |
| impactRows | serviceCall | MethodCallRelationDoc | targetClassName | `serviceCall.targetClassName()` |
| impactRows | serviceCall | MethodCallRelationDoc | targetMethodName | `serviceCall.targetMethodName()` |
| impactRows | serviceCall | MethodCallRelationDoc | targetMethodName | `serviceCall.targetMethodName()` |
| index |  | MarkdownRenderer | displaySourceRoot | `displaySourceRoot(overview.sourceRoot())` |
| index | overview | ProjectOverview | classCount | `overview.classCount()` |
| index | overview | ProjectOverview | controllerCount | `overview.controllerCount()` |
| index | overview | ProjectOverview | endpointCount | `overview.endpointCount()` |
| index | overview | ProjectOverview | entityCount | `overview.entityCount()` |
| index | overview | ProjectOverview | projectName | `overview.projectName()` |
| index | overview | ProjectOverview | repositoryCount | `overview.repositoryCount()` |
| index | overview | ProjectOverview | serviceCount | `overview.serviceCount()` |
| index | overview | ProjectOverview | sourceRoot | `overview.sourceRoot()` |
| isMapper | result | AnalysisResult | classes | `result.classes()` |
| isMapper | result | AnalysisResult | mapperStatementRelations | `result.mapperStatementRelations()` |
| matchingMyBatisStatements | classDoc | ClassDoc | className | `classDoc.className()` |
| matchingMyBatisStatements | classDoc | ClassDoc | className | `classDoc.className()` |
| matchingMyBatisStatements | classDoc | ClassDoc | packageName | `classDoc.packageName()` |
| matchingMyBatisStatements | classDoc | ClassDoc | packageName | `classDoc.packageName()` |
| mybatis |  | MarkdownRenderer | cell | `cell(first.ownerName())` |
| mybatis |  | MarkdownRenderer | cell | `cell(first.sourcePath().toString())` |
| mybatis | first | SqlStatementDoc | ownerName | `first.ownerName()` |
| mybatis | first | SqlStatementDoc | sourcePath | `first.sourcePath()` |
| parameters | method | MethodDoc | parameters | `method.parameters()` |
| render |  | MarkdownRenderer | api | `api(result)` |
| render |  | MarkdownRenderer | architecture | `architecture(result)` |
| render | classDoc | ClassDoc | className | `classDoc.className()` |
| render |  | MarkdownRenderer | classPage | `classPage(classDoc, result)` |
| render |  | MarkdownRenderer | configurations | `configurations(result.configs())` |
| render |  | MarkdownRenderer | impactMap | `impactMap(result)` |
| render |  | MarkdownRenderer | index | `index(result.overview())` |
| render |  | MarkdownRenderer | mybatis | `mybatis(result.sqlStatements())` |
| render | result | AnalysisResult | classes | `result.classes()` |
| render | result | AnalysisResult | configs | `result.configs()` |
| render | result | AnalysisResult | overview | `result.overview()` |
| render | result | AnalysisResult | sqlStatements | `result.sqlStatements()` |
| render | result | AnalysisResult | sqlStatements | `result.sqlStatements()` |
| render | result | AnalysisResult | tableUsages | `result.tableUsages()` |
| render |  | MarkdownRenderer | sql | `sql(result.sqlStatements())` |
| render |  | MarkdownRenderer | tables | `tables(result.tableUsages())` |
| render |  | MarkdownRenderer | write | `write(classesDirectory.resolve(classDoc.className() + ".md"), classPage(classDoc, result))` |
| render |  | MarkdownRenderer | write | `write(configsDirectory.resolve("application.md"), configurations(result.configs()))` |
| render |  | MarkdownRenderer | write | `write(output.resolve("_config.yml"), "title: CodeAtlas\ntheme: minima\n")` |
| render |  | MarkdownRenderer | write | `write(output.resolve("api.md"), api(result))` |
| render |  | MarkdownRenderer | write | `write(output.resolve("architecture.md"), architecture(result))` |
| render |  | MarkdownRenderer | write | `write(output.resolve("impact-map.md"), impactMap(result))` |
| render |  | MarkdownRenderer | write | `write(output.resolve("index.md"), index(result.overview()))` |
| render |  | MarkdownRenderer | write | `write(output.resolve("mybatis.md"), mybatis(result.sqlStatements()))` |
| render |  | MarkdownRenderer | write | `write(output.resolve("sql.md"), sql(result.sqlStatements()))` |
| render |  | MarkdownRenderer | write | `write(output.resolve("tables.md"), tables(result.tableUsages()))` |
| sql |  | MarkdownRenderer | cell | `cell(String.join(", ", statement.tableNames()))` |
| sql |  | MarkdownRenderer | cell | `cell(statement.ownerName())` |
| sql |  | MarkdownRenderer | cell | `cell(statement.sourcePath().toString())` |
| sql |  | MarkdownRenderer | cell | `cell(statement.sql())` |
| sql |  | MarkdownRenderer | cell | `cell(statement.statementId())` |
| tables |  | MarkdownRenderer | cell | `cell(usage.sourceName())` |
| tables |  | MarkdownRenderer | cell | `cell(usage.sourcePath().toString())` |
| tables |  | MarkdownRenderer | cell | `cell(usage.tableName())` |
| tables |  | MarkdownRenderer | cell | `cell(usage.usageType())` |
| tables |  | MarkdownRenderer | cell | `cell(usage.usedBy())` |
| title | type | ComponentType | name | `type.name()` |

### Library / Utility Calls

Library / Utility calls are omitted from this page. Count: 594.

## Related Classes

### Outgoing References

| Target | Relation | Member |
| --- | --- | --- |
| [AnalysisResult](AnalysisResult.md) | METHOD_PARAMETER | result |
| [ClassDoc](ClassDoc.md) | METHOD_PARAMETER | classDoc |
| [ClassDoc](ClassDoc.md) | METHOD_PARAMETER | classes |
| [ClassRelationDoc](ClassRelationDoc.md) | FIELD | RELATION_ORDER |
| [ClassRelationDoc](ClassRelationDoc.md) | METHOD_PARAMETER | relations |
| [ClassRelationDoc](ClassRelationDoc.md) | METHOD_RETURN_TYPE | sortedRelations |
| [ComponentType](ComponentType.md) | METHOD_PARAMETER | type |
| [ComponentType](ComponentType.md) | METHOD_RETURN_TYPE | componentType |
| [ConfigDoc](ConfigDoc.md) | METHOD_PARAMETER | configs |
| [MapperStatementRelationDoc](MapperStatementRelationDoc.md) | METHOD_PARAMETER | relations |
| [MethodCallDoc](MethodCallDoc.md) | METHOD_PARAMETER | methodCalls |
| [MethodCallRelationDoc](MethodCallRelationDoc.md) | METHOD_PARAMETER | relations |
| [MethodCallRelationDoc](MethodCallRelationDoc.md) | METHOD_RETURN_TYPE | sortedMethodCallRelations |
| [MethodDoc](MethodDoc.md) | METHOD_PARAMETER | method |
| [ProjectOverview](ProjectOverview.md) | METHOD_PARAMETER | overview |
| [SqlStatementDoc](SqlStatementDoc.md) | METHOD_PARAMETER | statements |
| [SqlStatementDoc](SqlStatementDoc.md) | METHOD_RETURN_TYPE | matchingMyBatisStatements |
| [TableUsageDoc](TableUsageDoc.md) | METHOD_PARAMETER | usages |

### Incoming References

| Source | Relation | Member |
| --- | --- | --- |
| - | - | - |
