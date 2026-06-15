# ProjectSource

## Summary

* Package: `io.github.codeatlas.core.model`
* Declaration: `TYPE`
* Type: `UNKNOWN`
* Source: `code-atlas-core/src/main/java/io/github/codeatlas/core/model/ProjectSource.java`

## Role

コードから機械的に判定できる役割情報はありません。

## Annotations

None

## Methods

| Method | Return Type | Parameters | Annotations |
| --- | --- | --- | --- |
| relativePath | `Path` | Path path |  |

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
| [AnalysisEngine](AnalysisEngine.md).analyze | `source.rootDirectory()` |
| [AnalysisEngine](AnalysisEngine.md).emptyResult | `source.rootDirectory()` |
| [AnalysisEngine](AnalysisEngine.md).emptyResult | `source.rootDirectory()` |
| [JavaAnalyzer](JavaAnalyzer.md).analyze | `source.configFiles()` |
| [JavaAnalyzer](JavaAnalyzer.md).analyze | `source.relativePath(path)` |
| [JavaAnalyzer](JavaAnalyzer.md).analyze | `source.rootDirectory()` |
| [JavaAnalyzer](JavaAnalyzer.md).analyze | `source.rootDirectory()` |
| [JavaAnalyzer](JavaAnalyzer.md).analyzeClasses | `source.javaFiles()` |
| [JavaAnalyzer](JavaAnalyzer.md).analyzeClasses | `source.relativePath(javaFile)` |
| [JavaAnalyzer](JavaAnalyzer.md).analyzeMethodCalls | `source.javaFiles()` |
| [JavaAnalyzer](JavaAnalyzer.md).analyzeMethodCalls | `source.relativePath(javaFile)` |
| [JavaAnalyzer](JavaAnalyzer.md).analyzeRelations | `source.javaFiles()` |
| [JavaAnalyzer](JavaAnalyzer.md).analyzeVariableTypes | `source.javaFiles()` |
| [JavaAnalyzer](JavaAnalyzer.md).analyzeVariableTypes | `source.relativePath(javaFile)` |
| [JavaAnalyzer](JavaAnalyzer.md).supports | `source.javaFiles()` |
| [MyBatisAnalyzer](MyBatisAnalyzer.md).analyze | `source.rootDirectory()` |
| [MyBatisAnalyzer](MyBatisAnalyzer.md).analyze | `source.rootDirectory()` |
| [MyBatisAnalyzer](MyBatisAnalyzer.md).mapperXmlFiles | `source.relativePath(path)` |
| [MyBatisAnalyzer](MyBatisAnalyzer.md).mapperXmlFiles | `source.resourceFiles()` |
| [MyBatisAnalyzer](MyBatisAnalyzer.md).parseStatements | `source.relativePath(xmlFile)` |
| [MyBatisAnalyzer](MyBatisAnalyzer.md).supports | `source.javaFiles()` |
| [MyBatisAnalyzer](MyBatisAnalyzer.md).supports | `source.relativePath(path)` |
| [SourceScannerTest](SourceScannerTest.md).collectsSourcesAndExcludesGeneratedAndDocumentationDirectories | `source.configFiles()` |
| [SourceScannerTest](SourceScannerTest.md).collectsSourcesAndExcludesGeneratedAndDocumentationDirectories | `source.javaFiles()` |
| [SourceScannerTest](SourceScannerTest.md).collectsSourcesAndExcludesGeneratedAndDocumentationDirectories | `source.javaFiles()` |
| [SourceScannerTest](SourceScannerTest.md).collectsSourcesAndExcludesGeneratedAndDocumentationDirectories | `source.resourceFiles()` |
| [SourceScannerTest](SourceScannerTest.md).excludesAdditionalDirectoryNamesAndRelativePaths | `source.javaFiles()` |
| [SourceScannerTest](SourceScannerTest.md).excludesMultipleAdditionalDirectoryNames | `source.javaFiles()` |
| [SpringBootAnalyzer](SpringBootAnalyzer.md).enrich | `source.rootDirectory()` |
| [SpringBootAnalyzer](SpringBootAnalyzer.md).enrich | `source.rootDirectory()` |
| [SpringBootAnalyzer](SpringBootAnalyzer.md).extractEndpoints | `source.javaFiles()` |
| [SpringBootAnalyzer](SpringBootAnalyzer.md).extractEndpoints | `source.relativePath(javaFile)` |
| [SpringBootAnalyzer](SpringBootAnalyzer.md).supports | `source.javaFiles()` |
| [SpringBootAnalyzer](SpringBootAnalyzer.md).supports | `source.pomXml()` |

## Method Calls

### Project Calls

| Source Method | Scope | Resolved Target | Called Method | Expression |
| --- | --- | --- | --- | --- |
| - | - | - | - | - |

### Library / Utility Calls

Library / Utility calls are omitted from this page. Count: 3.

## Related Classes

### Outgoing References

| Target | Relation | Member |
| --- | --- | --- |
| - | - | - |

### Incoming References

| Source | Relation | Member |
| --- | --- | --- |
| [AnalysisEngine](AnalysisEngine.md) | METHOD_PARAMETER | source |
| [CodeAnalyzerPlugin](CodeAnalyzerPlugin.md) | METHOD_PARAMETER | source |
| [JavaAnalyzer](JavaAnalyzer.md) | METHOD_PARAMETER | source |
| [MyBatisAnalyzer](MyBatisAnalyzer.md) | METHOD_PARAMETER | source |
| [SourceScanner](SourceScanner.md) | METHOD_RETURN_TYPE | scan |
| [SpringBootAnalyzer](SpringBootAnalyzer.md) | METHOD_PARAMETER | source |
