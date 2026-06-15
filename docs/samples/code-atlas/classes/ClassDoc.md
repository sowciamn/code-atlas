# ClassDoc

## Summary

* Package: `io.github.codeatlas.core.model`
* Declaration: `TYPE`
* Type: `UNKNOWN`
* Source: `code-atlas-core/src/main/java/io/github/codeatlas/core/model/ClassDoc.java`

## Role

コードから機械的に判定できる役割情報はありません。

## Annotations

None

## Methods

| Method | Return Type | Parameters | Annotations |
| --- | --- | --- | --- |
| withComponentType | `ClassDoc` | ComponentType type |  |
| withRoleSummary | `ClassDoc` | String summary |  |

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
| [JavaAnalyzerTest](JavaAnalyzerTest.md).extractsClassPackageMethodsAnnotationsAndFields | `result.annotations()` |
| [JavaAnalyzerTest](JavaAnalyzerTest.md).extractsClassPackageMethodsAnnotationsAndFields | `result.className()` |
| [JavaAnalyzerTest](JavaAnalyzerTest.md).extractsClassPackageMethodsAnnotationsAndFields | `result.fields()` |
| [JavaAnalyzerTest](JavaAnalyzerTest.md).extractsClassPackageMethodsAnnotationsAndFields | `result.methods()` |
| [JavaAnalyzerTest](JavaAnalyzerTest.md).extractsClassPackageMethodsAnnotationsAndFields | `result.packageName()` |
| [MarkdownRenderer](MarkdownRenderer.md).classPage | `classDoc.annotations()` |
| [MarkdownRenderer](MarkdownRenderer.md).classPage | `classDoc.className()` |
| [MarkdownRenderer](MarkdownRenderer.md).classPage | `classDoc.className()` |
| [MarkdownRenderer](MarkdownRenderer.md).classPage | `classDoc.className()` |
| [MarkdownRenderer](MarkdownRenderer.md).classPage | `classDoc.className()` |
| [MarkdownRenderer](MarkdownRenderer.md).classPage | `classDoc.className()` |
| [MarkdownRenderer](MarkdownRenderer.md).classPage | `classDoc.componentType()` |
| [MarkdownRenderer](MarkdownRenderer.md).classPage | `classDoc.declarationKind()` |
| [MarkdownRenderer](MarkdownRenderer.md).classPage | `classDoc.fields()` |
| [MarkdownRenderer](MarkdownRenderer.md).classPage | `classDoc.fields()` |
| [MarkdownRenderer](MarkdownRenderer.md).classPage | `classDoc.methods()` |
| [MarkdownRenderer](MarkdownRenderer.md).classPage | `classDoc.methods()` |
| [MarkdownRenderer](MarkdownRenderer.md).classPage | `classDoc.packageName()` |
| [MarkdownRenderer](MarkdownRenderer.md).classPage | `classDoc.roleSummary()` |
| [MarkdownRenderer](MarkdownRenderer.md).classPage | `classDoc.sourcePath()` |
| [MarkdownRenderer](MarkdownRenderer.md).matchingMyBatisStatements | `classDoc.className()` |
| [MarkdownRenderer](MarkdownRenderer.md).matchingMyBatisStatements | `classDoc.className()` |
| [MarkdownRenderer](MarkdownRenderer.md).matchingMyBatisStatements | `classDoc.packageName()` |
| [MarkdownRenderer](MarkdownRenderer.md).matchingMyBatisStatements | `classDoc.packageName()` |
| [MarkdownRenderer](MarkdownRenderer.md).render | `classDoc.className()` |
| [MyBatisAnalyzer](MyBatisAnalyzer.md).applyMapperRole | `classDoc.annotations()` |
| [MyBatisAnalyzer](MyBatisAnalyzer.md).applyMapperRole | `classDoc.roleSummary()` |
| [MyBatisAnalyzer](MyBatisAnalyzer.md).applyMapperRole | `classDoc.roleSummary()` |
| [MyBatisAnalyzer](MyBatisAnalyzer.md).applyMapperRole | `classDoc.withRoleSummary(MAPPER_ROLE)` |
| [MyBatisAnalyzer](MyBatisAnalyzer.md).mapperStatementRelations | `classDoc.className()` |
| [MyBatisAnalyzer](MyBatisAnalyzer.md).mapperStatementRelations | `classDoc.className()` |
| [MyBatisAnalyzer](MyBatisAnalyzer.md).mapperStatementRelations | `classDoc.className()` |
| [MyBatisAnalyzer](MyBatisAnalyzer.md).mapperStatementRelations | `classDoc.methods()` |
| [MyBatisAnalyzer](MyBatisAnalyzer.md).mapperStatementRelations | `classDoc.packageName()` |
| [MyBatisAnalyzer](MyBatisAnalyzer.md).mapperStatementRelations | `classDoc.packageName()` |
| [SpringBootAnalyzer](SpringBootAnalyzer.md).componentType | `classDoc.annotations()` |
| [SpringBootAnalyzer](SpringBootAnalyzer.md).componentType | `classDoc.className()` |
| [SpringBootAnalyzer](SpringBootAnalyzer.md).componentType | `classDoc.className()` |
| [SpringBootAnalyzer](SpringBootAnalyzer.md).roleSummary | `classDoc.annotations()` |
| [SpringBootAnalyzer](SpringBootAnalyzer.md).roleSummary | `classDoc.roleSummary()` |

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
| [ClassDoc](ClassDoc.md) | METHOD_RETURN_TYPE | withComponentType |
| [ClassDoc](ClassDoc.md) | METHOD_RETURN_TYPE | withRoleSummary |
| [ComponentType](ComponentType.md) | METHOD_PARAMETER | type |

### Incoming References

| Source | Relation | Member |
| --- | --- | --- |
| [ClassDoc](ClassDoc.md) | METHOD_RETURN_TYPE | withComponentType |
| [ClassDoc](ClassDoc.md) | METHOD_RETURN_TYPE | withRoleSummary |
| [JavaAnalyzer](JavaAnalyzer.md) | METHOD_PARAMETER | classes |
| [JavaAnalyzer](JavaAnalyzer.md) | METHOD_RETURN_TYPE | analyzeClasses |
| [JavaAnalyzer](JavaAnalyzer.md) | METHOD_RETURN_TYPE | toClassDoc |
| [MarkdownRenderer](MarkdownRenderer.md) | METHOD_PARAMETER | classDoc |
| [MarkdownRenderer](MarkdownRenderer.md) | METHOD_PARAMETER | classes |
| [MyBatisAnalyzer](MyBatisAnalyzer.md) | METHOD_PARAMETER | classDoc |
| [MyBatisAnalyzer](MyBatisAnalyzer.md) | METHOD_PARAMETER | classes |
| [MyBatisAnalyzer](MyBatisAnalyzer.md) | METHOD_RETURN_TYPE | applyMapperRole |
| [SpringBootAnalyzer](SpringBootAnalyzer.md) | METHOD_PARAMETER | classDoc |
| [SpringBootAnalyzer](SpringBootAnalyzer.md) | METHOD_PARAMETER | classes |
