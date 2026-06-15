# AnalysisResult

## Summary

* Package: `io.github.codeatlas.core.model`
* Declaration: `TYPE`
* Type: `UNKNOWN`
* Source: `code-atlas-core/src/main/java/io/github/codeatlas/core/model/AnalysisResult.java`

## Role

コードから機械的に判定できる役割情報はありません。

## Annotations

None

## Methods

| Method | Return Type | Parameters | Annotations |
| --- | --- | --- | --- |
| - | - | - | - |

## Fields

| Name | Type | Annotations |
| --- | --- | --- |
| - | - | - |

## Method Call Relations

### Outgoing Calls

| Target | Expression |
| --- | --- |
| - | - |

### Incoming Calls

| Source | Expression |
| --- | --- |
| [AnalysisEngineTest](AnalysisEngineTest.md).appliesAllSupportedPluginsInRegistrationOrder | `result.configs()` |
| [JavaAnalyzerTest](JavaAnalyzerTest.md).classifiesUtilityCallsAndKeepsOnlyResolvedProjectCallsAsProject | `result.methodCallRelations()` |
| [JavaAnalyzerTest](JavaAnalyzerTest.md).classifiesUtilityCallsAndKeepsOnlyResolvedProjectCallsAsProject | `result.methodCalls()` |
| [JavaAnalyzerTest](JavaAnalyzerTest.md).classifiesUtilityCallsAndKeepsOnlyResolvedProjectCallsAsProject | `result.methodCalls()` |
| [JavaAnalyzerTest](JavaAnalyzerTest.md).classifiesUtilityCallsAndKeepsOnlyResolvedProjectCallsAsProject | `result.methodCalls()` |
| [JavaAnalyzerTest](JavaAnalyzerTest.md).extractsRelationFromConstructorParameter | `result.relations()` |
| [JavaAnalyzerTest](JavaAnalyzerTest.md).extractsRelationFromFieldType | `result.relations()` |
| [JavaAnalyzerTest](JavaAnalyzerTest.md).extractsRelationFromGenericMethodReturnTypeAndIgnoresExternalTypes | `result.relations()` |
| [JavaAnalyzerTest](JavaAnalyzerTest.md).extractsRelationFromMethodParameter | `result.relations()` |
| [JavaAnalyzerTest](JavaAnalyzerTest.md).extractsScopedUnscopedThisAndMultipleMethodCalls | `result.methodCalls()` |
| [JavaAnalyzerTest](JavaAnalyzerTest.md).extractsScopedUnscopedThisAndMultipleMethodCalls | `result.methodCalls()` |
| [JavaAnalyzerTest](JavaAnalyzerTest.md).extractsVariableTypesAndResolvesScopesByPriority | `result.methodCalls()` |
| [JavaAnalyzerTest](JavaAnalyzerTest.md).extractsVariableTypesAndResolvesScopesByPriority | `result.variableTypes()` |
| [MarkdownRenderer](MarkdownRenderer.md).api | `result.classes()` |
| [MarkdownRenderer](MarkdownRenderer.md).api | `result.endpoints()` |
| [MarkdownRenderer](MarkdownRenderer.md).appendMethodCallOverview | `result.classes()` |
| [MarkdownRenderer](MarkdownRenderer.md).appendMethodCallOverview | `result.methodCallRelations()` |
| [MarkdownRenderer](MarkdownRenderer.md).appendMethodCallRelations | `result.classes()` |
| [MarkdownRenderer](MarkdownRenderer.md).appendMethodCallRelations | `result.methodCallRelations()` |
| [MarkdownRenderer](MarkdownRenderer.md).appendMethodCallRelations | `result.methodCallRelations()` |
| [MarkdownRenderer](MarkdownRenderer.md).architecture | `result.classes()` |
| [MarkdownRenderer](MarkdownRenderer.md).architecture | `result.classes()` |
| [MarkdownRenderer](MarkdownRenderer.md).architecture | `result.relations()` |
| [MarkdownRenderer](MarkdownRenderer.md).classPage | `result.classes()` |
| [MarkdownRenderer](MarkdownRenderer.md).classPage | `result.mapperStatementRelations()` |
| [MarkdownRenderer](MarkdownRenderer.md).classPage | `result.methodCalls()` |
| [MarkdownRenderer](MarkdownRenderer.md).classPage | `result.relations()` |
| [MarkdownRenderer](MarkdownRenderer.md).classPage | `result.sqlStatements()` |
| [MarkdownRenderer](MarkdownRenderer.md).impactRows | `result.classes()` |
| [MarkdownRenderer](MarkdownRenderer.md).impactRows | `result.endpoints()` |
| [MarkdownRenderer](MarkdownRenderer.md).impactRows | `result.mapperStatementRelations()` |
| [MarkdownRenderer](MarkdownRenderer.md).impactRows | `result.methodCallRelations()` |
| [MarkdownRenderer](MarkdownRenderer.md).impactRows | `result.methodCallRelations()` |
| [MarkdownRenderer](MarkdownRenderer.md).isMapper | `result.classes()` |
| [MarkdownRenderer](MarkdownRenderer.md).isMapper | `result.mapperStatementRelations()` |
| [MarkdownRenderer](MarkdownRenderer.md).render | `result.classes()` |
| [MarkdownRenderer](MarkdownRenderer.md).render | `result.configs()` |
| [MarkdownRenderer](MarkdownRenderer.md).render | `result.overview()` |
| [MarkdownRenderer](MarkdownRenderer.md).render | `result.sqlStatements()` |
| [MarkdownRenderer](MarkdownRenderer.md).render | `result.sqlStatements()` |
| [MarkdownRenderer](MarkdownRenderer.md).render | `result.tableUsages()` |
| [MyBatisAnalyzer](MyBatisAnalyzer.md).analyze | `currentResult.classes()` |
| [MyBatisAnalyzer](MyBatisAnalyzer.md).analyze | `currentResult.configs()` |
| [MyBatisAnalyzer](MyBatisAnalyzer.md).analyze | `currentResult.endpoints()` |
| [MyBatisAnalyzer](MyBatisAnalyzer.md).analyze | `currentResult.methodCallRelations()` |
| [MyBatisAnalyzer](MyBatisAnalyzer.md).analyze | `currentResult.methodCalls()` |
| [MyBatisAnalyzer](MyBatisAnalyzer.md).analyze | `currentResult.overview()` |
| [MyBatisAnalyzer](MyBatisAnalyzer.md).analyze | `currentResult.relations()` |
| [MyBatisAnalyzer](MyBatisAnalyzer.md).analyze | `currentResult.variableTypes()` |
| [MyBatisAnalyzerTest](MyBatisAnalyzerTest.md).addsSqlTableUsageAndMapperRoleToCurrentResult | `result.classes()` |
| [MyBatisAnalyzerTest](MyBatisAnalyzerTest.md).addsSqlTableUsageAndMapperRoleToCurrentResult | `result.mapperStatementRelations()` |
| [MyBatisAnalyzerTest](MyBatisAnalyzerTest.md).addsSqlTableUsageAndMapperRoleToCurrentResult | `result.sqlStatements()` |
| [MyBatisAnalyzerTest](MyBatisAnalyzerTest.md).addsSqlTableUsageAndMapperRoleToCurrentResult | `result.tableUsages()` |
| [MyBatisAnalyzerTest](MyBatisAnalyzerTest.md).doesNotRelateStatementWhenMapperMethodNameDoesNotMatch | `result.mapperStatementRelations()` |
| [SpringBootAnalyzer](SpringBootAnalyzer.md).analyze | `currentResult.classes()` |
| [SpringBootAnalyzer](SpringBootAnalyzer.md).enrich | `base.classes()` |
| [SpringBootAnalyzer](SpringBootAnalyzer.md).enrich | `base.configs()` |
| [SpringBootAnalyzer](SpringBootAnalyzer.md).enrich | `base.mapperStatementRelations()` |
| [SpringBootAnalyzer](SpringBootAnalyzer.md).enrich | `base.methodCallRelations()` |
| [SpringBootAnalyzer](SpringBootAnalyzer.md).enrich | `base.methodCalls()` |
| [SpringBootAnalyzer](SpringBootAnalyzer.md).enrich | `base.relations()` |
| [SpringBootAnalyzer](SpringBootAnalyzer.md).enrich | `base.sqlStatements()` |
| [SpringBootAnalyzer](SpringBootAnalyzer.md).enrich | `base.tableUsages()` |
| [SpringBootAnalyzer](SpringBootAnalyzer.md).enrich | `base.variableTypes()` |
| [SpringBootAnalyzerTest](SpringBootAnalyzerTest.md).classifiesComponentsAndExtractsCombinedEndpointPaths | `result.classes()` |
| [SpringBootAnalyzerTest](SpringBootAnalyzerTest.md).classifiesComponentsAndExtractsCombinedEndpointPaths | `result.classes()` |
| [SpringBootAnalyzerTest](SpringBootAnalyzerTest.md).classifiesComponentsAndExtractsCombinedEndpointPaths | `result.classes()` |
| [SpringBootAnalyzerTest](SpringBootAnalyzerTest.md).classifiesComponentsAndExtractsCombinedEndpointPaths | `result.classes()` |
| [SpringBootAnalyzerTest](SpringBootAnalyzerTest.md).classifiesComponentsAndExtractsCombinedEndpointPaths | `result.classes()` |
| [SpringBootAnalyzerTest](SpringBootAnalyzerTest.md).classifiesComponentsAndExtractsCombinedEndpointPaths | `result.endpoints()` |
| [SpringBootAnalyzerTest](SpringBootAnalyzerTest.md).classifiesComponentsAndExtractsCombinedEndpointPaths | `result.relations()` |

## Method Calls

### Project Calls

| Source Method | Scope | Resolved Target | Called Method | Expression |
| --- | --- | --- | --- | --- |
| - | - | - | - | - |

### Library / Utility Calls

Library / Utility calls are omitted from this page. Count: 0.

## Related Classes

### Outgoing References

| Target | Relation | Member |
| --- | --- | --- |
| - | - | - |

### Incoming References

| Source | Relation | Member |
| --- | --- | --- |
| [AnalysisEngine](AnalysisEngine.md) | METHOD_RETURN_TYPE | analyze |
| [AnalysisEngine](AnalysisEngine.md) | METHOD_RETURN_TYPE | emptyResult |
| [CodeAnalyzerPlugin](CodeAnalyzerPlugin.md) | METHOD_PARAMETER | currentResult |
| [CodeAnalyzerPlugin](CodeAnalyzerPlugin.md) | METHOD_RETURN_TYPE | analyze |
| [DocumentationRenderer](DocumentationRenderer.md) | METHOD_PARAMETER | result |
| [JavaAnalyzer](JavaAnalyzer.md) | METHOD_RETURN_TYPE | analyze |
| [JavaAnalyzerTest](JavaAnalyzerTest.md) | METHOD_RETURN_TYPE | analyze |
| [MarkdownRenderer](MarkdownRenderer.md) | METHOD_PARAMETER | result |
| [MyBatisAnalyzer](MyBatisAnalyzer.md) | METHOD_PARAMETER | currentResult |
| [MyBatisAnalyzer](MyBatisAnalyzer.md) | METHOD_RETURN_TYPE | analyze |
| [SpringBootAnalyzer](SpringBootAnalyzer.md) | METHOD_PARAMETER | base |
| [SpringBootAnalyzer](SpringBootAnalyzer.md) | METHOD_PARAMETER | currentResult |
| [SpringBootAnalyzer](SpringBootAnalyzer.md) | METHOD_RETURN_TYPE | analyze |
| [SpringBootAnalyzer](SpringBootAnalyzer.md) | METHOD_RETURN_TYPE | enrich |
