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
| [MyBatisAnalyzer](MyBatisAnalyzer.md) | METHOD_RETURN_TYPE | applyMapperRole |
| [SpringBootAnalyzer](SpringBootAnalyzer.md) | METHOD_PARAMETER | classDoc |
| [SpringBootAnalyzer](SpringBootAnalyzer.md) | METHOD_PARAMETER | classes |
