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
| api | `String` | AnalysisResult result |  |
| classPage | `String` | ClassDoc classDoc, AnalysisResult result |  |
| appendRelatedClasses | `void` | StringBuilder markdown, String className, List<ClassRelationDoc> relations, Set<String> classNames |  |
| appendMyBatisStatements | `void` | StringBuilder markdown, ClassDoc classDoc, List<SqlStatementDoc> statements |  |
| sortedRelations | `List<ClassRelationDoc>` | List<ClassRelationDoc> relations |  |
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
| [ConfigDoc](ConfigDoc.md) | METHOD_PARAMETER | configs |
| [MethodDoc](MethodDoc.md) | METHOD_PARAMETER | method |
| [ProjectOverview](ProjectOverview.md) | METHOD_PARAMETER | overview |
| [SqlStatementDoc](SqlStatementDoc.md) | METHOD_PARAMETER | statements |
| [TableUsageDoc](TableUsageDoc.md) | METHOD_PARAMETER | usages |

### Incoming References

| Source | Relation | Member |
| --- | --- | --- |
| - | - | - |
