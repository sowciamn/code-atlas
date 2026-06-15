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
| appendMethodCalls | `void` | StringBuilder markdown, String className, List<MethodCallDoc> methodCalls |  |
| appendRelatedClasses | `void` | StringBuilder markdown, String className, List<ClassRelationDoc> relations, Set<String> classNames |  |
| matchingMyBatisStatements | `List<SqlStatementDoc>` | ClassDoc classDoc, List<SqlStatementDoc> statements |  |
| appendMyBatisStatements | `void` | StringBuilder markdown, List<SqlStatementDoc> statements |  |
| appendRelatedTables | `void` | StringBuilder markdown, List<SqlStatementDoc> statements |  |
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

## Method Calls

| Source Method | Scope | Called Method | Expression |
| --- | --- | --- | --- |
| api |  | cell | `cell(endpoint.httpMethod())` |
| api |  | cell | `cell(endpoint.methodName())` |
| api |  | cell | `cell(endpoint.path())` |
| api |  | cell | `cell(endpoint.sourcePath())` |
| api |  | classLink | `classLink(endpoint.className(), "classes/", classNames)` |
| api |  | classNames | `classNames(result.classes())` |
| api | endpoint | className | `endpoint.className()` |
| api | endpoint | httpMethod | `endpoint.httpMethod()` |
| api | endpoint | methodName | `endpoint.methodName()` |
| api | endpoint | path | `endpoint.path()` |
| api | endpoint | sourcePath | `endpoint.sourcePath()` |
| api | endpoints | forEach | `endpoints.forEach(endpoint -> markdown.append("\| ").append(cell(endpoint.httpMethod())).append(" \| `").append(cell(endpoint.path())).append('`').append(" \| ").append(classLink(endpoint.className(), "classes/", classNames)).append(" \| ").append(cell(endpoint.methodName())).append(" \| `").append(cell(endpoint.sourcePath())).append("` \|\n"))` |
| api | endpoints | isEmpty | `endpoints.isEmpty()` |
| api | markdown | append | `markdown.append("\| ")` |
| api | markdown.append("\| ") | append | `markdown.append("\| ").append(cell(endpoint.httpMethod()))` |
| api | markdown.append("\| ").append(cell(endpoint.httpMethod())) | append | `markdown.append("\| ").append(cell(endpoint.httpMethod())).append(" \| `")` |
| api | markdown.append("\| ").append(cell(endpoint.httpMethod())).append(" \| `") | append | `markdown.append("\| ").append(cell(endpoint.httpMethod())).append(" \| `").append(cell(endpoint.path()))` |
| api | markdown.append("\| ").append(cell(endpoint.httpMethod())).append(" \| `").append(cell(endpoint.path())) | append | `markdown.append("\| ").append(cell(endpoint.httpMethod())).append(" \| `").append(cell(endpoint.path())).append('`')` |
| api | markdown.append("\| ").append(cell(endpoint.httpMethod())).append(" \| `").append(cell(endpoint.path())).append('`') | append | `markdown.append("\| ").append(cell(endpoint.httpMethod())).append(" \| `").append(cell(endpoint.path())).append('`').append(" \| ")` |
| api | markdown.append("\| ").append(cell(endpoint.httpMethod())).append(" \| `").append(cell(endpoint.path())).append('`').append(" \| ") | append | `markdown.append("\| ").append(cell(endpoint.httpMethod())).append(" \| `").append(cell(endpoint.path())).append('`').append(" \| ").append(classLink(endpoint.className(), "classes/", classNames))` |
| api | markdown.append("\| ").append(cell(endpoint.httpMethod())).append(" \| `").append(cell(endpoint.path())).append('`').append(" \| ").append(classLink(endpoint.className(), "classes/", classNames)) | append | `markdown.append("\| ").append(cell(endpoint.httpMethod())).append(" \| `").append(cell(endpoint.path())).append('`').append(" \| ").append(classLink(endpoint.className(), "classes/", classNames)).append(" \| ")` |
| api | markdown.append("\| ").append(cell(endpoint.httpMethod())).append(" \| `").append(cell(endpoint.path())).append('`').append(" \| ").append(classLink(endpoint.className(), "classes/", classNames)).append(" \| ") | append | `markdown.append("\| ").append(cell(endpoint.httpMethod())).append(" \| `").append(cell(endpoint.path())).append('`').append(" \| ").append(classLink(endpoint.className(), "classes/", classNames)).append(" \| ").append(cell(endpoint.methodName()))` |
| api | markdown.append("\| ").append(cell(endpoint.httpMethod())).append(" \| `").append(cell(endpoint.path())).append('`').append(" \| ").append(classLink(endpoint.className(), "classes/", classNames)).append(" \| ").append(cell(endpoint.methodName())) | append | `markdown.append("\| ").append(cell(endpoint.httpMethod())).append(" \| `").append(cell(endpoint.path())).append('`').append(" \| ").append(classLink(endpoint.className(), "classes/", classNames)).append(" \| ").append(cell(endpoint.methodName())).append(" \| `")` |
| api | markdown.append("\| ").append(cell(endpoint.httpMethod())).append(" \| `").append(cell(endpoint.path())).append('`').append(" \| ").append(classLink(endpoint.className(), "classes/", classNames)).append(" \| ").append(cell(endpoint.methodName())).append(" \| `") | append | `markdown.append("\| ").append(cell(endpoint.httpMethod())).append(" \| `").append(cell(endpoint.path())).append('`').append(" \| ").append(classLink(endpoint.className(), "classes/", classNames)).append(" \| ").append(cell(endpoint.methodName())).append(" \| `").append(cell(endpoint.sourcePath()))` |
| api | markdown.append("\| ").append(cell(endpoint.httpMethod())).append(" \| `").append(cell(endpoint.path())).append('`').append(" \| ").append(classLink(endpoint.className(), "classes/", classNames)).append(" \| ").append(cell(endpoint.methodName())).append(" \| `").append(cell(endpoint.sourcePath())) | append | `markdown.append("\| ").append(cell(endpoint.httpMethod())).append(" \| `").append(cell(endpoint.path())).append('`').append(" \| ").append(classLink(endpoint.className(), "classes/", classNames)).append(" \| ").append(cell(endpoint.methodName())).append(" \| `").append(cell(endpoint.sourcePath())).append("` \|\n")` |
| api | markdown | append | `markdown.append("\| - \| - \| - \| - \| - \|\n")` |
| api | markdown | toString | `markdown.toString()` |
| api | result | classes | `result.classes()` |
| api | result | endpoints | `result.endpoints()` |
| appendCodeList | markdown | append | `markdown.append("* `")` |
| appendCodeList | markdown.append("* `") | append | `markdown.append("* `").append(value)` |
| appendCodeList | markdown.append("* `").append(value) | append | `markdown.append("* `").append(value).append("`\n")` |
| appendCodeList | markdown | append | `markdown.append("None\n")` |
| appendCodeList | values | forEach | `values.forEach(value -> markdown.append("* `").append(value).append("`\n"))` |
| appendCodeList | values | isEmpty | `values.isEmpty()` |
| appendMethodCalls | Comparator | comparing | `Comparator.comparing(MethodCallDoc::sourceMethodName)` |
| appendMethodCalls | Comparator.comparing(MethodCallDoc::sourceMethodName) | thenComparing | `Comparator.comparing(MethodCallDoc::sourceMethodName).thenComparing(MethodCallDoc::expression)` |
| appendMethodCalls | call | calledMethodName | `call.calledMethodName()` |
| appendMethodCalls | call | expression | `call.expression()` |
| appendMethodCalls | call | scopeName | `call.scopeName()` |
| appendMethodCalls | call | sourceClassName | `call.sourceClassName()` |
| appendMethodCalls | call.sourceClassName() | equals | `call.sourceClassName().equals(className)` |
| appendMethodCalls | call | sourceMethodName | `call.sourceMethodName()` |
| appendMethodCalls |  | cell | `cell(call.calledMethodName())` |
| appendMethodCalls |  | cell | `cell(call.expression())` |
| appendMethodCalls |  | cell | `cell(call.scopeName())` |
| appendMethodCalls |  | cell | `cell(call.sourceMethodName())` |
| appendMethodCalls | markdown | append | `markdown.append("\n## Method Calls\n\n")` |
| appendMethodCalls | markdown.append("\n## Method Calls\n\n") | append | `markdown.append("\n## Method Calls\n\n").append("\| Source Method \| Scope \| Called Method \| Expression \|\n")` |
| appendMethodCalls | markdown.append("\n## Method Calls\n\n").append("\| Source Method \| Scope \| Called Method \| Expression \|\n") | append | `markdown.append("\n## Method Calls\n\n").append("\| Source Method \| Scope \| Called Method \| Expression \|\n").append("\| --- \| --- \| --- \| --- \|\n")` |
| appendMethodCalls | markdown | append | `markdown.append("\| ")` |
| appendMethodCalls | markdown.append("\| ") | append | `markdown.append("\| ").append(cell(call.sourceMethodName()))` |
| appendMethodCalls | markdown.append("\| ").append(cell(call.sourceMethodName())) | append | `markdown.append("\| ").append(cell(call.sourceMethodName())).append(" \| ")` |
| appendMethodCalls | markdown.append("\| ").append(cell(call.sourceMethodName())).append(" \| ") | append | `markdown.append("\| ").append(cell(call.sourceMethodName())).append(" \| ").append(cell(call.scopeName()))` |
| appendMethodCalls | markdown.append("\| ").append(cell(call.sourceMethodName())).append(" \| ").append(cell(call.scopeName())) | append | `markdown.append("\| ").append(cell(call.sourceMethodName())).append(" \| ").append(cell(call.scopeName())).append(" \| ")` |
| appendMethodCalls | markdown.append("\| ").append(cell(call.sourceMethodName())).append(" \| ").append(cell(call.scopeName())).append(" \| ") | append | `markdown.append("\| ").append(cell(call.sourceMethodName())).append(" \| ").append(cell(call.scopeName())).append(" \| ").append(cell(call.calledMethodName()))` |
| appendMethodCalls | markdown.append("\| ").append(cell(call.sourceMethodName())).append(" \| ").append(cell(call.scopeName())).append(" \| ").append(cell(call.calledMethodName())) | append | `markdown.append("\| ").append(cell(call.sourceMethodName())).append(" \| ").append(cell(call.scopeName())).append(" \| ").append(cell(call.calledMethodName())).append(" \| `")` |
| appendMethodCalls | markdown.append("\| ").append(cell(call.sourceMethodName())).append(" \| ").append(cell(call.scopeName())).append(" \| ").append(cell(call.calledMethodName())).append(" \| `") | append | `markdown.append("\| ").append(cell(call.sourceMethodName())).append(" \| ").append(cell(call.scopeName())).append(" \| ").append(cell(call.calledMethodName())).append(" \| `").append(cell(call.expression()))` |
| appendMethodCalls | markdown.append("\| ").append(cell(call.sourceMethodName())).append(" \| ").append(cell(call.scopeName())).append(" \| ").append(cell(call.calledMethodName())).append(" \| `").append(cell(call.expression())) | append | `markdown.append("\| ").append(cell(call.sourceMethodName())).append(" \| ").append(cell(call.scopeName())).append(" \| ").append(cell(call.calledMethodName())).append(" \| `").append(cell(call.expression())).append("` \|\n")` |
| appendMethodCalls | markdown | append | `markdown.append("\| - \| - \| - \| - \|\n")` |
| appendMethodCalls | matching | forEach | `matching.forEach(call -> markdown.append("\| ").append(cell(call.sourceMethodName())).append(" \| ").append(cell(call.scopeName())).append(" \| ").append(cell(call.calledMethodName())).append(" \| `").append(cell(call.expression())).append("` \|\n"))` |
| appendMethodCalls | matching | isEmpty | `matching.isEmpty()` |
| appendMethodCalls | methodCalls | stream | `methodCalls.stream()` |
| appendMethodCalls | methodCalls.stream() | filter | `methodCalls.stream().filter(call -> call.sourceClassName().equals(className))` |
| appendMethodCalls | methodCalls.stream().filter(call -> call.sourceClassName().equals(className)) | sorted | `methodCalls.stream().filter(call -> call.sourceClassName().equals(className)).sorted(Comparator.comparing(MethodCallDoc::sourceMethodName).thenComparing(MethodCallDoc::expression))` |
| appendMethodCalls | methodCalls.stream().filter(call -> call.sourceClassName().equals(className)).sorted(Comparator.comparing(MethodCallDoc::sourceMethodName).thenComparing(MethodCallDoc::expression)) | toList | `methodCalls.stream().filter(call -> call.sourceClassName().equals(className)).sorted(Comparator.comparing(MethodCallDoc::sourceMethodName).thenComparing(MethodCallDoc::expression)).toList()` |
| appendMyBatisStatements | String | join | `String.join(", ", statement.tableNames())` |
| appendMyBatisStatements |  | cell | `cell(String.join(", ", statement.tableNames()))` |
| appendMyBatisStatements |  | cell | `cell(statement.sourcePath().toString())` |
| appendMyBatisStatements |  | cell | `cell(statement.statementId())` |
| appendMyBatisStatements | markdown | append | `markdown.append("\n## MyBatis Statements\n\n")` |
| appendMyBatisStatements | markdown.append("\n## MyBatis Statements\n\n") | append | `markdown.append("\n## MyBatis Statements\n\n").append("\| Type \| Statement ID \| Tables \| Source \|\n")` |
| appendMyBatisStatements | markdown.append("\n## MyBatis Statements\n\n").append("\| Type \| Statement ID \| Tables \| Source \|\n") | append | `markdown.append("\n## MyBatis Statements\n\n").append("\| Type \| Statement ID \| Tables \| Source \|\n").append("\| --- \| --- \| --- \| --- \|\n")` |
| appendMyBatisStatements | markdown | append | `markdown.append("\| ")` |
| appendMyBatisStatements | markdown.append("\| ") | append | `markdown.append("\| ").append(statement.statementType())` |
| appendMyBatisStatements | markdown.append("\| ").append(statement.statementType()) | append | `markdown.append("\| ").append(statement.statementType()).append(" \| ")` |
| appendMyBatisStatements | markdown.append("\| ").append(statement.statementType()).append(" \| ") | append | `markdown.append("\| ").append(statement.statementType()).append(" \| ").append(cell(statement.statementId()))` |
| appendMyBatisStatements | markdown.append("\| ").append(statement.statementType()).append(" \| ").append(cell(statement.statementId())) | append | `markdown.append("\| ").append(statement.statementType()).append(" \| ").append(cell(statement.statementId())).append(" \| ")` |
| appendMyBatisStatements | markdown.append("\| ").append(statement.statementType()).append(" \| ").append(cell(statement.statementId())).append(" \| ") | append | `markdown.append("\| ").append(statement.statementType()).append(" \| ").append(cell(statement.statementId())).append(" \| ").append(cell(String.join(", ", statement.tableNames())))` |
| appendMyBatisStatements | markdown.append("\| ").append(statement.statementType()).append(" \| ").append(cell(statement.statementId())).append(" \| ").append(cell(String.join(", ", statement.tableNames()))) | append | `markdown.append("\| ").append(statement.statementType()).append(" \| ").append(cell(statement.statementId())).append(" \| ").append(cell(String.join(", ", statement.tableNames()))).append(" \| `")` |
| appendMyBatisStatements | markdown.append("\| ").append(statement.statementType()).append(" \| ").append(cell(statement.statementId())).append(" \| ").append(cell(String.join(", ", statement.tableNames()))).append(" \| `") | append | `markdown.append("\| ").append(statement.statementType()).append(" \| ").append(cell(statement.statementId())).append(" \| ").append(cell(String.join(", ", statement.tableNames()))).append(" \| `").append(cell(statement.sourcePath().toString()))` |
| appendMyBatisStatements | markdown.append("\| ").append(statement.statementType()).append(" \| ").append(cell(statement.statementId())).append(" \| ").append(cell(String.join(", ", statement.tableNames()))).append(" \| `").append(cell(statement.sourcePath().toString())) | append | `markdown.append("\| ").append(statement.statementType()).append(" \| ").append(cell(statement.statementId())).append(" \| ").append(cell(String.join(", ", statement.tableNames()))).append(" \| `").append(cell(statement.sourcePath().toString())).append("` \|\n")` |
| appendMyBatisStatements | statement | sourcePath | `statement.sourcePath()` |
| appendMyBatisStatements | statement.sourcePath() | toString | `statement.sourcePath().toString()` |
| appendMyBatisStatements | statement | statementId | `statement.statementId()` |
| appendMyBatisStatements | statement | statementType | `statement.statementType()` |
| appendMyBatisStatements | statement | tableNames | `statement.tableNames()` |
| appendMyBatisStatements | statements | forEach | `statements.forEach(statement -> markdown.append("\| ").append(statement.statementType()).append(" \| ").append(cell(statement.statementId())).append(" \| ").append(cell(String.join(", ", statement.tableNames()))).append(" \| `").append(cell(statement.sourcePath().toString())).append("` \|\n"))` |
| appendMyBatisStatements | statements | isEmpty | `statements.isEmpty()` |
| appendRelatedClasses |  | cell | `cell(relation.sourceMemberName())` |
| appendRelatedClasses |  | cell | `cell(relation.sourceMemberName())` |
| appendRelatedClasses |  | classLink | `classLink(relation.sourceClassName(), "", classNames)` |
| appendRelatedClasses |  | classLink | `classLink(relation.targetClassName(), "", classNames)` |
| appendRelatedClasses | incoming | forEach | `incoming.forEach(relation -> markdown.append("\| ").append(classLink(relation.sourceClassName(), "", classNames)).append(" \| ").append(relation.relationType()).append(" \| ").append(cell(relation.sourceMemberName())).append(" \|\n"))` |
| appendRelatedClasses | incoming | isEmpty | `incoming.isEmpty()` |
| appendRelatedClasses | markdown | append | `markdown.append("\n## Related Classes\n\n")` |
| appendRelatedClasses | markdown.append("\n## Related Classes\n\n") | append | `markdown.append("\n## Related Classes\n\n").append("### Outgoing References\n\n")` |
| appendRelatedClasses | markdown.append("\n## Related Classes\n\n").append("### Outgoing References\n\n") | append | `markdown.append("\n## Related Classes\n\n").append("### Outgoing References\n\n").append("\| Target \| Relation \| Member \|\n")` |
| appendRelatedClasses | markdown.append("\n## Related Classes\n\n").append("### Outgoing References\n\n").append("\| Target \| Relation \| Member \|\n") | append | `markdown.append("\n## Related Classes\n\n").append("### Outgoing References\n\n").append("\| Target \| Relation \| Member \|\n").append("\| --- \| --- \| --- \|\n")` |
| appendRelatedClasses | markdown | append | `markdown.append("\n### Incoming References\n\n")` |
| appendRelatedClasses | markdown.append("\n### Incoming References\n\n") | append | `markdown.append("\n### Incoming References\n\n").append("\| Source \| Relation \| Member \|\n")` |
| appendRelatedClasses | markdown.append("\n### Incoming References\n\n").append("\| Source \| Relation \| Member \|\n") | append | `markdown.append("\n### Incoming References\n\n").append("\| Source \| Relation \| Member \|\n").append("\| --- \| --- \| --- \|\n")` |
| appendRelatedClasses | markdown | append | `markdown.append("\| ")` |
| appendRelatedClasses | markdown | append | `markdown.append("\| ")` |
| appendRelatedClasses | markdown.append("\| ") | append | `markdown.append("\| ").append(classLink(relation.sourceClassName(), "", classNames))` |
| appendRelatedClasses | markdown.append("\| ").append(classLink(relation.sourceClassName(), "", classNames)) | append | `markdown.append("\| ").append(classLink(relation.sourceClassName(), "", classNames)).append(" \| ")` |
| appendRelatedClasses | markdown.append("\| ").append(classLink(relation.sourceClassName(), "", classNames)).append(" \| ") | append | `markdown.append("\| ").append(classLink(relation.sourceClassName(), "", classNames)).append(" \| ").append(relation.relationType())` |
| appendRelatedClasses | markdown.append("\| ").append(classLink(relation.sourceClassName(), "", classNames)).append(" \| ").append(relation.relationType()) | append | `markdown.append("\| ").append(classLink(relation.sourceClassName(), "", classNames)).append(" \| ").append(relation.relationType()).append(" \| ")` |
| appendRelatedClasses | markdown.append("\| ").append(classLink(relation.sourceClassName(), "", classNames)).append(" \| ").append(relation.relationType()).append(" \| ") | append | `markdown.append("\| ").append(classLink(relation.sourceClassName(), "", classNames)).append(" \| ").append(relation.relationType()).append(" \| ").append(cell(relation.sourceMemberName()))` |
| appendRelatedClasses | markdown.append("\| ").append(classLink(relation.sourceClassName(), "", classNames)).append(" \| ").append(relation.relationType()).append(" \| ").append(cell(relation.sourceMemberName())) | append | `markdown.append("\| ").append(classLink(relation.sourceClassName(), "", classNames)).append(" \| ").append(relation.relationType()).append(" \| ").append(cell(relation.sourceMemberName())).append(" \|\n")` |
| appendRelatedClasses | markdown.append("\| ") | append | `markdown.append("\| ").append(classLink(relation.targetClassName(), "", classNames))` |
| appendRelatedClasses | markdown.append("\| ").append(classLink(relation.targetClassName(), "", classNames)) | append | `markdown.append("\| ").append(classLink(relation.targetClassName(), "", classNames)).append(" \| ")` |
| appendRelatedClasses | markdown.append("\| ").append(classLink(relation.targetClassName(), "", classNames)).append(" \| ") | append | `markdown.append("\| ").append(classLink(relation.targetClassName(), "", classNames)).append(" \| ").append(relation.relationType())` |
| appendRelatedClasses | markdown.append("\| ").append(classLink(relation.targetClassName(), "", classNames)).append(" \| ").append(relation.relationType()) | append | `markdown.append("\| ").append(classLink(relation.targetClassName(), "", classNames)).append(" \| ").append(relation.relationType()).append(" \| ")` |
| appendRelatedClasses | markdown.append("\| ").append(classLink(relation.targetClassName(), "", classNames)).append(" \| ").append(relation.relationType()).append(" \| ") | append | `markdown.append("\| ").append(classLink(relation.targetClassName(), "", classNames)).append(" \| ").append(relation.relationType()).append(" \| ").append(cell(relation.sourceMemberName()))` |
| appendRelatedClasses | markdown.append("\| ").append(classLink(relation.targetClassName(), "", classNames)).append(" \| ").append(relation.relationType()).append(" \| ").append(cell(relation.sourceMemberName())) | append | `markdown.append("\| ").append(classLink(relation.targetClassName(), "", classNames)).append(" \| ").append(relation.relationType()).append(" \| ").append(cell(relation.sourceMemberName())).append(" \|\n")` |
| appendRelatedClasses | markdown | append | `markdown.append("\| - \| - \| - \|\n")` |
| appendRelatedClasses | markdown | append | `markdown.append("\| - \| - \| - \|\n")` |
| appendRelatedClasses | outgoing | forEach | `outgoing.forEach(relation -> markdown.append("\| ").append(classLink(relation.targetClassName(), "", classNames)).append(" \| ").append(relation.relationType()).append(" \| ").append(cell(relation.sourceMemberName())).append(" \|\n"))` |
| appendRelatedClasses | outgoing | isEmpty | `outgoing.isEmpty()` |
| appendRelatedClasses | relation | relationType | `relation.relationType()` |
| appendRelatedClasses | relation | relationType | `relation.relationType()` |
| appendRelatedClasses | relation | sourceClassName | `relation.sourceClassName()` |
| appendRelatedClasses | relation | sourceClassName | `relation.sourceClassName()` |
| appendRelatedClasses | relation.sourceClassName() | equals | `relation.sourceClassName().equals(className)` |
| appendRelatedClasses | relation | sourceMemberName | `relation.sourceMemberName()` |
| appendRelatedClasses | relation | sourceMemberName | `relation.sourceMemberName()` |
| appendRelatedClasses | relation | targetClassName | `relation.targetClassName()` |
| appendRelatedClasses | relation | targetClassName | `relation.targetClassName()` |
| appendRelatedClasses | relation.targetClassName() | equals | `relation.targetClassName().equals(className)` |
| appendRelatedClasses | relations | stream | `relations.stream()` |
| appendRelatedClasses | relations | stream | `relations.stream()` |
| appendRelatedClasses | relations.stream() | filter | `relations.stream().filter(relation -> relation.sourceClassName().equals(className))` |
| appendRelatedClasses | relations.stream().filter(relation -> relation.sourceClassName().equals(className)) | toList | `relations.stream().filter(relation -> relation.sourceClassName().equals(className)).toList()` |
| appendRelatedClasses | relations.stream() | filter | `relations.stream().filter(relation -> relation.targetClassName().equals(className))` |
| appendRelatedClasses | relations.stream().filter(relation -> relation.targetClassName().equals(className)) | toList | `relations.stream().filter(relation -> relation.targetClassName().equals(className)).toList()` |
| appendRelatedClasses |  | sortedRelations | `sortedRelations(relations.stream().filter(relation -> relation.sourceClassName().equals(className)).toList())` |
| appendRelatedClasses |  | sortedRelations | `sortedRelations(relations.stream().filter(relation -> relation.targetClassName().equals(className)).toList())` |
| appendRelatedTables |  | cell | `cell(statement.statementId())` |
| appendRelatedTables |  | cell | `cell(tableName)` |
| appendRelatedTables | markdown | append | `markdown.append("\n## Related Tables\n\n")` |
| appendRelatedTables | markdown.append("\n## Related Tables\n\n") | append | `markdown.append("\n## Related Tables\n\n").append("\| Table \| Statement \| Usage \|\n")` |
| appendRelatedTables | markdown.append("\n## Related Tables\n\n").append("\| Table \| Statement \| Usage \|\n") | append | `markdown.append("\n## Related Tables\n\n").append("\| Table \| Statement \| Usage \|\n").append("\| --- \| --- \| --- \|\n")` |
| appendRelatedTables | markdown | append | `markdown.append("\| - \| - \| - \|\n")` |
| appendRelatedTables | markdown | append | `markdown.append(row)` |
| appendRelatedTables | markdown.append(row) | append | `markdown.append(row).append('\n')` |
| appendRelatedTables | rows | forEach | `rows.forEach(row -> markdown.append(row).append('\n'))` |
| appendRelatedTables | rows | isEmpty | `rows.isEmpty()` |
| appendRelatedTables | statement | statementId | `statement.statementId()` |
| appendRelatedTables | statement | statementType | `statement.statementType()` |
| appendRelatedTables | statement | tableNames | `statement.tableNames()` |
| appendRelatedTables | statement.tableNames() | stream | `statement.tableNames().stream()` |
| appendRelatedTables | statement.tableNames().stream() | map | `statement.tableNames().stream().map(tableName -> "\| " + cell(tableName) + " \| " + cell(statement.statementId()) + " \| " + statement.statementType() + " \|")` |
| appendRelatedTables | statements | isEmpty | `statements.isEmpty()` |
| appendRelatedTables | statements | stream | `statements.stream()` |
| appendRelatedTables | statements.stream() | flatMap | `statements.stream().flatMap(statement -> statement.tableNames().stream().map(tableName -> "\| " + cell(tableName) + " \| " + cell(statement.statementId()) + " \| " + statement.statementType() + " \|"))` |
| appendRelatedTables | statements.stream().flatMap(statement -> statement.tableNames().stream().map(tableName -> "\| " + cell(tableName) + " \| " + cell(statement.statementId()) + " \| " + statement.statementType() + " \|")) | sorted | `statements.stream().flatMap(statement -> statement.tableNames().stream().map(tableName -> "\| " + cell(tableName) + " \| " + cell(statement.statementId()) + " \| " + statement.statementType() + " \|")).sorted()` |
| appendRelatedTables | statements.stream().flatMap(statement -> statement.tableNames().stream().map(tableName -> "\| " + cell(tableName) + " \| " + cell(statement.statementId()) + " \| " + statement.statementType() + " \|")).sorted() | toList | `statements.stream().flatMap(statement -> statement.tableNames().stream().map(tableName -> "\| " + cell(tableName) + " \| " + cell(statement.statementId()) + " \| " + statement.statementType() + " \|")).sorted().toList()` |
| architecture | Comparator | comparing | `Comparator.comparing(ClassDoc::className)` |
| architecture | ComponentType | values | `ComponentType.values()` |
| architecture |  | cell | `cell(relation.sourceMemberName())` |
| architecture | classDoc | className | `classDoc.className()` |
| architecture | classDoc | className | `classDoc.className()` |
| architecture | classDoc | componentType | `classDoc.componentType()` |
| architecture |  | classLink | `classLink(relation.sourceClassName(), "classes/", classNames)` |
| architecture |  | classLink | `classLink(relation.targetClassName(), "classes/", classNames)` |
| architecture |  | classNames | `classNames(result.classes())` |
| architecture | markdown | append | `markdown.append("## ")` |
| architecture | markdown.append("## ") | append | `markdown.append("## ").append(title(type))` |
| architecture | markdown.append("## ").append(title(type)) | append | `markdown.append("## ").append(title(type)).append("\n\n")` |
| architecture | markdown | append | `markdown.append("## Dependency Overview\n\n")` |
| architecture | markdown.append("## Dependency Overview\n\n") | append | `markdown.append("## Dependency Overview\n\n").append("\| Source \| Target \| Relation \| Member \|\n")` |
| architecture | markdown.append("## Dependency Overview\n\n").append("\| Source \| Target \| Relation \| Member \|\n") | append | `markdown.append("## Dependency Overview\n\n").append("\| Source \| Target \| Relation \| Member \|\n").append("\| --- \| --- \| --- \| --- \|\n")` |
| architecture | markdown | append | `markdown.append("* [")` |
| architecture | markdown.append("* [") | append | `markdown.append("* [").append(classDoc.className())` |
| architecture | markdown.append("* [").append(classDoc.className()) | append | `markdown.append("* [").append(classDoc.className()).append("](classes/")` |
| architecture | markdown.append("* [").append(classDoc.className()).append("](classes/") | append | `markdown.append("* [").append(classDoc.className()).append("](classes/").append(classDoc.className())` |
| architecture | markdown.append("* [").append(classDoc.className()).append("](classes/").append(classDoc.className()) | append | `markdown.append("* [").append(classDoc.className()).append("](classes/").append(classDoc.className()).append(".md)\n")` |
| architecture | markdown | append | `markdown.append("None\n\n")` |
| architecture | markdown | append | `markdown.append("\| ")` |
| architecture | markdown.append("\| ") | append | `markdown.append("\| ").append(classLink(relation.sourceClassName(), "classes/", classNames))` |
| architecture | markdown.append("\| ").append(classLink(relation.sourceClassName(), "classes/", classNames)) | append | `markdown.append("\| ").append(classLink(relation.sourceClassName(), "classes/", classNames)).append(" \| ")` |
| architecture | markdown.append("\| ").append(classLink(relation.sourceClassName(), "classes/", classNames)).append(" \| ") | append | `markdown.append("\| ").append(classLink(relation.sourceClassName(), "classes/", classNames)).append(" \| ").append(classLink(relation.targetClassName(), "classes/", classNames))` |
| architecture | markdown.append("\| ").append(classLink(relation.sourceClassName(), "classes/", classNames)).append(" \| ").append(classLink(relation.targetClassName(), "classes/", classNames)) | append | `markdown.append("\| ").append(classLink(relation.sourceClassName(), "classes/", classNames)).append(" \| ").append(classLink(relation.targetClassName(), "classes/", classNames)).append(" \| ")` |
| architecture | markdown.append("\| ").append(classLink(relation.sourceClassName(), "classes/", classNames)).append(" \| ").append(classLink(relation.targetClassName(), "classes/", classNames)).append(" \| ") | append | `markdown.append("\| ").append(classLink(relation.sourceClassName(), "classes/", classNames)).append(" \| ").append(classLink(relation.targetClassName(), "classes/", classNames)).append(" \| ").append(relation.relationType())` |
| architecture | markdown.append("\| ").append(classLink(relation.sourceClassName(), "classes/", classNames)).append(" \| ").append(classLink(relation.targetClassName(), "classes/", classNames)).append(" \| ").append(relation.relationType()) | append | `markdown.append("\| ").append(classLink(relation.sourceClassName(), "classes/", classNames)).append(" \| ").append(classLink(relation.targetClassName(), "classes/", classNames)).append(" \| ").append(relation.relationType()).append(" \| ")` |
| architecture | markdown.append("\| ").append(classLink(relation.sourceClassName(), "classes/", classNames)).append(" \| ").append(classLink(relation.targetClassName(), "classes/", classNames)).append(" \| ").append(relation.relationType()).append(" \| ") | append | `markdown.append("\| ").append(classLink(relation.sourceClassName(), "classes/", classNames)).append(" \| ").append(classLink(relation.targetClassName(), "classes/", classNames)).append(" \| ").append(relation.relationType()).append(" \| ").append(cell(relation.sourceMemberName()))` |
| architecture | markdown.append("\| ").append(classLink(relation.sourceClassName(), "classes/", classNames)).append(" \| ").append(classLink(relation.targetClassName(), "classes/", classNames)).append(" \| ").append(relation.relationType()).append(" \| ").append(cell(relation.sourceMemberName())) | append | `markdown.append("\| ").append(classLink(relation.sourceClassName(), "classes/", classNames)).append(" \| ").append(classLink(relation.targetClassName(), "classes/", classNames)).append(" \| ").append(relation.relationType()).append(" \| ").append(cell(relation.sourceMemberName())).append(" \|\n")` |
| architecture | markdown | append | `markdown.append("\| - \| - \| - \| - \|\n")` |
| architecture | markdown | append | `markdown.append('\n')` |
| architecture | markdown | toString | `markdown.toString()` |
| architecture | matching | forEach | `matching.forEach(classDoc -> markdown.append("* [").append(classDoc.className()).append("](classes/").append(classDoc.className()).append(".md)\n"))` |
| architecture | matching | isEmpty | `matching.isEmpty()` |
| architecture | relation | relationType | `relation.relationType()` |
| architecture | relation | sourceClassName | `relation.sourceClassName()` |
| architecture | relation | sourceMemberName | `relation.sourceMemberName()` |
| architecture | relation | targetClassName | `relation.targetClassName()` |
| architecture | relations | forEach | `relations.forEach(relation -> markdown.append("\| ").append(classLink(relation.sourceClassName(), "classes/", classNames)).append(" \| ").append(classLink(relation.targetClassName(), "classes/", classNames)).append(" \| ").append(relation.relationType()).append(" \| ").append(cell(relation.sourceMemberName())).append(" \|\n"))` |
| architecture | relations | isEmpty | `relations.isEmpty()` |
| architecture | result | classes | `result.classes()` |
| architecture | result | classes | `result.classes()` |
| architecture | result.classes() | stream | `result.classes().stream()` |
| architecture | result.classes().stream() | filter | `result.classes().stream().filter(classDoc -> classDoc.componentType() == type)` |
| architecture | result.classes().stream().filter(classDoc -> classDoc.componentType() == type) | sorted | `result.classes().stream().filter(classDoc -> classDoc.componentType() == type).sorted(Comparator.comparing(ClassDoc::className))` |
| architecture | result.classes().stream().filter(classDoc -> classDoc.componentType() == type).sorted(Comparator.comparing(ClassDoc::className)) | toList | `result.classes().stream().filter(classDoc -> classDoc.componentType() == type).sorted(Comparator.comparing(ClassDoc::className)).toList()` |
| architecture | result | relations | `result.relations()` |
| architecture |  | sortedRelations | `sortedRelations(result.relations())` |
| architecture |  | title | `title(type)` |
| cell | value | replace | `value.replace("\|", "\\\|")` |
| cell | value.replace("\|", "\\\|") | replace | `value.replace("\|", "\\\|").replace("\n", " ")` |
| classLink |  | cell | `cell(className)` |
| classLink |  | cell | `cell(className)` |
| classLink | classNames | contains | `classNames.contains(className)` |
| classNames | Collectors | toSet | `Collectors.toSet()` |
| classNames | classes | stream | `classes.stream()` |
| classNames | classes.stream() | map | `classes.stream().map(ClassDoc::className)` |
| classNames | classes.stream().map(ClassDoc::className) | collect | `classes.stream().map(ClassDoc::className).collect(Collectors.toSet())` |
| classPage | String | join | `String.join(", ", field.annotations())` |
| classPage | String | join | `String.join(", ", method.annotations())` |
| classPage |  | appendCodeList | `appendCodeList(markdown, classDoc.annotations())` |
| classPage |  | appendMethodCalls | `appendMethodCalls(markdown, classDoc.className(), result.methodCalls())` |
| classPage |  | appendMyBatisStatements | `appendMyBatisStatements(markdown, mapperStatements)` |
| classPage |  | appendRelatedClasses | `appendRelatedClasses(markdown, classDoc.className(), result.relations(), classNames(result.classes()))` |
| classPage |  | appendRelatedTables | `appendRelatedTables(markdown, mapperStatements)` |
| classPage |  | cell | `cell(String.join(", ", field.annotations()))` |
| classPage |  | cell | `cell(String.join(", ", method.annotations()))` |
| classPage |  | cell | `cell(field.name())` |
| classPage |  | cell | `cell(field.type())` |
| classPage |  | cell | `cell(method.methodName())` |
| classPage |  | cell | `cell(method.returnType())` |
| classPage |  | cell | `cell(parameters(method))` |
| classPage | classDoc | annotations | `classDoc.annotations()` |
| classPage | classDoc | className | `classDoc.className()` |
| classPage | classDoc | className | `classDoc.className()` |
| classPage | classDoc | className | `classDoc.className()` |
| classPage | classDoc | componentType | `classDoc.componentType()` |
| classPage | classDoc | declarationKind | `classDoc.declarationKind()` |
| classPage | classDoc | fields | `classDoc.fields()` |
| classPage | classDoc | fields | `classDoc.fields()` |
| classPage | classDoc.fields() | forEach | `classDoc.fields().forEach(field -> markdown.append("\| ").append(cell(field.name())).append(" \| `").append(cell(field.type())).append('`').append(" \| ").append(cell(String.join(", ", field.annotations()))).append(" \|\n"))` |
| classPage | classDoc.fields() | isEmpty | `classDoc.fields().isEmpty()` |
| classPage | classDoc | methods | `classDoc.methods()` |
| classPage | classDoc | methods | `classDoc.methods()` |
| classPage | classDoc.methods() | forEach | `classDoc.methods().forEach(method -> markdown.append("\| ").append(cell(method.methodName())).append(" \| `").append(cell(method.returnType())).append('`').append(" \| ").append(cell(parameters(method))).append(" \| ").append(cell(String.join(", ", method.annotations()))).append(" \|\n"))` |
| classPage | classDoc.methods() | isEmpty | `classDoc.methods().isEmpty()` |
| classPage | classDoc | packageName | `classDoc.packageName()` |
| classPage | classDoc | roleSummary | `classDoc.roleSummary()` |
| classPage | classDoc | sourcePath | `classDoc.sourcePath()` |
| classPage |  | classNames | `classNames(result.classes())` |
| classPage | field | annotations | `field.annotations()` |
| classPage | field | name | `field.name()` |
| classPage | field | type | `field.type()` |
| classPage | markdown | append | `markdown.append("\n## Fields\n\n")` |
| classPage | markdown.append("\n## Fields\n\n") | append | `markdown.append("\n## Fields\n\n").append("\| Name \| Type \| Annotations \|\n")` |
| classPage | markdown.append("\n## Fields\n\n").append("\| Name \| Type \| Annotations \|\n") | append | `markdown.append("\n## Fields\n\n").append("\| Name \| Type \| Annotations \|\n").append("\| --- \| --- \| --- \|\n")` |
| classPage | markdown | append | `markdown.append("\n## Methods\n\n")` |
| classPage | markdown.append("\n## Methods\n\n") | append | `markdown.append("\n## Methods\n\n").append("\| Method \| Return Type \| Parameters \| Annotations \|\n")` |
| classPage | markdown.append("\n## Methods\n\n").append("\| Method \| Return Type \| Parameters \| Annotations \|\n") | append | `markdown.append("\n## Methods\n\n").append("\| Method \| Return Type \| Parameters \| Annotations \|\n").append("\| --- \| --- \| --- \| --- \|\n")` |
| classPage | markdown | append | `markdown.append("\| ")` |
| classPage | markdown | append | `markdown.append("\| ")` |
| classPage | markdown.append("\| ") | append | `markdown.append("\| ").append(cell(field.name()))` |
| classPage | markdown.append("\| ").append(cell(field.name())) | append | `markdown.append("\| ").append(cell(field.name())).append(" \| `")` |
| classPage | markdown.append("\| ").append(cell(field.name())).append(" \| `") | append | `markdown.append("\| ").append(cell(field.name())).append(" \| `").append(cell(field.type()))` |
| classPage | markdown.append("\| ").append(cell(field.name())).append(" \| `").append(cell(field.type())) | append | `markdown.append("\| ").append(cell(field.name())).append(" \| `").append(cell(field.type())).append('`')` |
| classPage | markdown.append("\| ").append(cell(field.name())).append(" \| `").append(cell(field.type())).append('`') | append | `markdown.append("\| ").append(cell(field.name())).append(" \| `").append(cell(field.type())).append('`').append(" \| ")` |
| classPage | markdown.append("\| ").append(cell(field.name())).append(" \| `").append(cell(field.type())).append('`').append(" \| ") | append | `markdown.append("\| ").append(cell(field.name())).append(" \| `").append(cell(field.type())).append('`').append(" \| ").append(cell(String.join(", ", field.annotations())))` |
| classPage | markdown.append("\| ").append(cell(field.name())).append(" \| `").append(cell(field.type())).append('`').append(" \| ").append(cell(String.join(", ", field.annotations()))) | append | `markdown.append("\| ").append(cell(field.name())).append(" \| `").append(cell(field.type())).append('`').append(" \| ").append(cell(String.join(", ", field.annotations()))).append(" \|\n")` |
| classPage | markdown.append("\| ") | append | `markdown.append("\| ").append(cell(method.methodName()))` |
| classPage | markdown.append("\| ").append(cell(method.methodName())) | append | `markdown.append("\| ").append(cell(method.methodName())).append(" \| `")` |
| classPage | markdown.append("\| ").append(cell(method.methodName())).append(" \| `") | append | `markdown.append("\| ").append(cell(method.methodName())).append(" \| `").append(cell(method.returnType()))` |
| classPage | markdown.append("\| ").append(cell(method.methodName())).append(" \| `").append(cell(method.returnType())) | append | `markdown.append("\| ").append(cell(method.methodName())).append(" \| `").append(cell(method.returnType())).append('`')` |
| classPage | markdown.append("\| ").append(cell(method.methodName())).append(" \| `").append(cell(method.returnType())).append('`') | append | `markdown.append("\| ").append(cell(method.methodName())).append(" \| `").append(cell(method.returnType())).append('`').append(" \| ")` |
| classPage | markdown.append("\| ").append(cell(method.methodName())).append(" \| `").append(cell(method.returnType())).append('`').append(" \| ") | append | `markdown.append("\| ").append(cell(method.methodName())).append(" \| `").append(cell(method.returnType())).append('`').append(" \| ").append(cell(parameters(method)))` |
| classPage | markdown.append("\| ").append(cell(method.methodName())).append(" \| `").append(cell(method.returnType())).append('`').append(" \| ").append(cell(parameters(method))) | append | `markdown.append("\| ").append(cell(method.methodName())).append(" \| `").append(cell(method.returnType())).append('`').append(" \| ").append(cell(parameters(method))).append(" \| ")` |
| classPage | markdown.append("\| ").append(cell(method.methodName())).append(" \| `").append(cell(method.returnType())).append('`').append(" \| ").append(cell(parameters(method))).append(" \| ") | append | `markdown.append("\| ").append(cell(method.methodName())).append(" \| `").append(cell(method.returnType())).append('`').append(" \| ").append(cell(parameters(method))).append(" \| ").append(cell(String.join(", ", method.annotations())))` |
| classPage | markdown.append("\| ").append(cell(method.methodName())).append(" \| `").append(cell(method.returnType())).append('`').append(" \| ").append(cell(parameters(method))).append(" \| ").append(cell(String.join(", ", method.annotations()))) | append | `markdown.append("\| ").append(cell(method.methodName())).append(" \| `").append(cell(method.returnType())).append('`').append(" \| ").append(cell(parameters(method))).append(" \| ").append(cell(String.join(", ", method.annotations()))).append(" \|\n")` |
| classPage | markdown | append | `markdown.append("\| - \| - \| - \| - \|\n")` |
| classPage | markdown | append | `markdown.append("\| - \| - \| - \|\n")` |
| classPage | markdown | toString | `markdown.toString()` |
| classPage |  | matchingMyBatisStatements | `matchingMyBatisStatements(classDoc, result.sqlStatements())` |
| classPage | method | annotations | `method.annotations()` |
| classPage | method | methodName | `method.methodName()` |
| classPage | method | returnType | `method.returnType()` |
| classPage | new StringBuilder() | append | `new StringBuilder().append("# ")` |
| classPage | new StringBuilder().append("# ") | append | `new StringBuilder().append("# ").append(classDoc.className())` |
| classPage | new StringBuilder().append("# ").append(classDoc.className()) | append | `new StringBuilder().append("# ").append(classDoc.className()).append("\n\n")` |
| classPage | new StringBuilder().append("# ").append(classDoc.className()).append("\n\n") | append | `new StringBuilder().append("# ").append(classDoc.className()).append("\n\n").append("## Summary\n\n")` |
| classPage | new StringBuilder().append("# ").append(classDoc.className()).append("\n\n").append("## Summary\n\n") | append | `new StringBuilder().append("# ").append(classDoc.className()).append("\n\n").append("## Summary\n\n").append("* Package: `")` |
| classPage | new StringBuilder().append("# ").append(classDoc.className()).append("\n\n").append("## Summary\n\n").append("* Package: `") | append | `new StringBuilder().append("# ").append(classDoc.className()).append("\n\n").append("## Summary\n\n").append("* Package: `").append(classDoc.packageName())` |
| classPage | new StringBuilder().append("# ").append(classDoc.className()).append("\n\n").append("## Summary\n\n").append("* Package: `").append(classDoc.packageName()) | append | `new StringBuilder().append("# ").append(classDoc.className()).append("\n\n").append("## Summary\n\n").append("* Package: `").append(classDoc.packageName()).append("`\n")` |
| classPage | new StringBuilder().append("# ").append(classDoc.className()).append("\n\n").append("## Summary\n\n").append("* Package: `").append(classDoc.packageName()).append("`\n") | append | `new StringBuilder().append("# ").append(classDoc.className()).append("\n\n").append("## Summary\n\n").append("* Package: `").append(classDoc.packageName()).append("`\n").append("* Declaration: `")` |
| classPage | new StringBuilder().append("# ").append(classDoc.className()).append("\n\n").append("## Summary\n\n").append("* Package: `").append(classDoc.packageName()).append("`\n").append("* Declaration: `") | append | `new StringBuilder().append("# ").append(classDoc.className()).append("\n\n").append("## Summary\n\n").append("* Package: `").append(classDoc.packageName()).append("`\n").append("* Declaration: `").append(classDoc.declarationKind())` |
| classPage | new StringBuilder().append("# ").append(classDoc.className()).append("\n\n").append("## Summary\n\n").append("* Package: `").append(classDoc.packageName()).append("`\n").append("* Declaration: `").append(classDoc.declarationKind()) | append | `new StringBuilder().append("# ").append(classDoc.className()).append("\n\n").append("## Summary\n\n").append("* Package: `").append(classDoc.packageName()).append("`\n").append("* Declaration: `").append(classDoc.declarationKind()).append("`\n")` |
| classPage | new StringBuilder().append("# ").append(classDoc.className()).append("\n\n").append("## Summary\n\n").append("* Package: `").append(classDoc.packageName()).append("`\n").append("* Declaration: `").append(classDoc.declarationKind()).append("`\n") | append | `new StringBuilder().append("# ").append(classDoc.className()).append("\n\n").append("## Summary\n\n").append("* Package: `").append(classDoc.packageName()).append("`\n").append("* Declaration: `").append(classDoc.declarationKind()).append("`\n").append("* Type: `")` |
| classPage | new StringBuilder().append("# ").append(classDoc.className()).append("\n\n").append("## Summary\n\n").append("* Package: `").append(classDoc.packageName()).append("`\n").append("* Declaration: `").append(classDoc.declarationKind()).append("`\n").append("* Type: `") | append | `new StringBuilder().append("# ").append(classDoc.className()).append("\n\n").append("## Summary\n\n").append("* Package: `").append(classDoc.packageName()).append("`\n").append("* Declaration: `").append(classDoc.declarationKind()).append("`\n").append("* Type: `").append(classDoc.componentType())` |
| classPage | new StringBuilder().append("# ").append(classDoc.className()).append("\n\n").append("## Summary\n\n").append("* Package: `").append(classDoc.packageName()).append("`\n").append("* Declaration: `").append(classDoc.declarationKind()).append("`\n").append("* Type: `").append(classDoc.componentType()) | append | `new StringBuilder().append("# ").append(classDoc.className()).append("\n\n").append("## Summary\n\n").append("* Package: `").append(classDoc.packageName()).append("`\n").append("* Declaration: `").append(classDoc.declarationKind()).append("`\n").append("* Type: `").append(classDoc.componentType()).append("`\n")` |
| classPage | new StringBuilder().append("# ").append(classDoc.className()).append("\n\n").append("## Summary\n\n").append("* Package: `").append(classDoc.packageName()).append("`\n").append("* Declaration: `").append(classDoc.declarationKind()).append("`\n").append("* Type: `").append(classDoc.componentType()).append("`\n") | append | `new StringBuilder().append("# ").append(classDoc.className()).append("\n\n").append("## Summary\n\n").append("* Package: `").append(classDoc.packageName()).append("`\n").append("* Declaration: `").append(classDoc.declarationKind()).append("`\n").append("* Type: `").append(classDoc.componentType()).append("`\n").append("* Source: `")` |
| classPage | new StringBuilder().append("# ").append(classDoc.className()).append("\n\n").append("## Summary\n\n").append("* Package: `").append(classDoc.packageName()).append("`\n").append("* Declaration: `").append(classDoc.declarationKind()).append("`\n").append("* Type: `").append(classDoc.componentType()).append("`\n").append("* Source: `") | append | `new StringBuilder().append("# ").append(classDoc.className()).append("\n\n").append("## Summary\n\n").append("* Package: `").append(classDoc.packageName()).append("`\n").append("* Declaration: `").append(classDoc.declarationKind()).append("`\n").append("* Type: `").append(classDoc.componentType()).append("`\n").append("* Source: `").append(classDoc.sourcePath())` |
| classPage | new StringBuilder().append("# ").append(classDoc.className()).append("\n\n").append("## Summary\n\n").append("* Package: `").append(classDoc.packageName()).append("`\n").append("* Declaration: `").append(classDoc.declarationKind()).append("`\n").append("* Type: `").append(classDoc.componentType()).append("`\n").append("* Source: `").append(classDoc.sourcePath()) | append | `new StringBuilder().append("# ").append(classDoc.className()).append("\n\n").append("## Summary\n\n").append("* Package: `").append(classDoc.packageName()).append("`\n").append("* Declaration: `").append(classDoc.declarationKind()).append("`\n").append("* Type: `").append(classDoc.componentType()).append("`\n").append("* Source: `").append(classDoc.sourcePath()).append("`\n\n")` |
| classPage | new StringBuilder().append("# ").append(classDoc.className()).append("\n\n").append("## Summary\n\n").append("* Package: `").append(classDoc.packageName()).append("`\n").append("* Declaration: `").append(classDoc.declarationKind()).append("`\n").append("* Type: `").append(classDoc.componentType()).append("`\n").append("* Source: `").append(classDoc.sourcePath()).append("`\n\n") | append | `new StringBuilder().append("# ").append(classDoc.className()).append("\n\n").append("## Summary\n\n").append("* Package: `").append(classDoc.packageName()).append("`\n").append("* Declaration: `").append(classDoc.declarationKind()).append("`\n").append("* Type: `").append(classDoc.componentType()).append("`\n").append("* Source: `").append(classDoc.sourcePath()).append("`\n\n").append("## Role\n\n")` |
| classPage | new StringBuilder().append("# ").append(classDoc.className()).append("\n\n").append("## Summary\n\n").append("* Package: `").append(classDoc.packageName()).append("`\n").append("* Declaration: `").append(classDoc.declarationKind()).append("`\n").append("* Type: `").append(classDoc.componentType()).append("`\n").append("* Source: `").append(classDoc.sourcePath()).append("`\n\n").append("## Role\n\n") | append | `new StringBuilder().append("# ").append(classDoc.className()).append("\n\n").append("## Summary\n\n").append("* Package: `").append(classDoc.packageName()).append("`\n").append("* Declaration: `").append(classDoc.declarationKind()).append("`\n").append("* Type: `").append(classDoc.componentType()).append("`\n").append("* Source: `").append(classDoc.sourcePath()).append("`\n\n").append("## Role\n\n").append(classDoc.roleSummary())` |
| classPage | new StringBuilder().append("# ").append(classDoc.className()).append("\n\n").append("## Summary\n\n").append("* Package: `").append(classDoc.packageName()).append("`\n").append("* Declaration: `").append(classDoc.declarationKind()).append("`\n").append("* Type: `").append(classDoc.componentType()).append("`\n").append("* Source: `").append(classDoc.sourcePath()).append("`\n\n").append("## Role\n\n").append(classDoc.roleSummary()) | append | `new StringBuilder().append("# ").append(classDoc.className()).append("\n\n").append("## Summary\n\n").append("* Package: `").append(classDoc.packageName()).append("`\n").append("* Declaration: `").append(classDoc.declarationKind()).append("`\n").append("* Type: `").append(classDoc.componentType()).append("`\n").append("* Source: `").append(classDoc.sourcePath()).append("`\n\n").append("## Role\n\n").append(classDoc.roleSummary()).append("\n\n")` |
| classPage | new StringBuilder().append("# ").append(classDoc.className()).append("\n\n").append("## Summary\n\n").append("* Package: `").append(classDoc.packageName()).append("`\n").append("* Declaration: `").append(classDoc.declarationKind()).append("`\n").append("* Type: `").append(classDoc.componentType()).append("`\n").append("* Source: `").append(classDoc.sourcePath()).append("`\n\n").append("## Role\n\n").append(classDoc.roleSummary()).append("\n\n") | append | `new StringBuilder().append("# ").append(classDoc.className()).append("\n\n").append("## Summary\n\n").append("* Package: `").append(classDoc.packageName()).append("`\n").append("* Declaration: `").append(classDoc.declarationKind()).append("`\n").append("* Type: `").append(classDoc.componentType()).append("`\n").append("* Source: `").append(classDoc.sourcePath()).append("`\n\n").append("## Role\n\n").append(classDoc.roleSummary()).append("\n\n").append("## Annotations\n\n")` |
| classPage |  | parameters | `parameters(method)` |
| classPage | result | classes | `result.classes()` |
| classPage | result | methodCalls | `result.methodCalls()` |
| classPage | result | relations | `result.relations()` |
| classPage | result | sqlStatements | `result.sqlStatements()` |
| configurations | Comparator | comparing | `Comparator.comparing(config -> config.sourcePath().toString())` |
| configurations | config | sourcePath | `config.sourcePath()` |
| configurations | config | sourcePath | `config.sourcePath()` |
| configurations | config.sourcePath() | toString | `config.sourcePath().toString()` |
| configurations | configs | isEmpty | `configs.isEmpty()` |
| configurations | configs | stream | `configs.stream()` |
| configurations | configs.stream() | sorted | `configs.stream().sorted(Comparator.comparing(config -> config.sourcePath().toString()))` |
| configurations | configs.stream().sorted(Comparator.comparing(config -> config.sourcePath().toString())) | forEach | `configs.stream().sorted(Comparator.comparing(config -> config.sourcePath().toString())).forEach(config -> markdown.append("* `").append(config.sourcePath()).append("`\n"))` |
| configurations | markdown | append | `markdown.append("* `")` |
| configurations | markdown.append("* `") | append | `markdown.append("* `").append(config.sourcePath())` |
| configurations | markdown.append("* `").append(config.sourcePath()) | append | `markdown.append("* `").append(config.sourcePath()).append("`\n")` |
| configurations | markdown | append | `markdown.append("None\n")` |
| configurations | markdown | toString | `markdown.toString()` |
| displaySourceRoot | Path | of | `Path.of("")` |
| displaySourceRoot | Path.of("") | toAbsolutePath | `Path.of("").toAbsolutePath()` |
| displaySourceRoot | Path.of("").toAbsolutePath() | normalize | `Path.of("").toAbsolutePath().normalize()` |
| displaySourceRoot | normalizedSourceRoot | startsWith | `normalizedSourceRoot.startsWith(workingDirectory)` |
| displaySourceRoot | normalizedSourceRoot | toString | `normalizedSourceRoot.toString()` |
| displaySourceRoot | relativeSourceRoot | toString | `relativeSourceRoot.toString()` |
| displaySourceRoot | relativeSourceRoot.toString() | isEmpty | `relativeSourceRoot.toString().isEmpty()` |
| displaySourceRoot | sourceRoot | toAbsolutePath | `sourceRoot.toAbsolutePath()` |
| displaySourceRoot | sourceRoot.toAbsolutePath() | normalize | `sourceRoot.toAbsolutePath().normalize()` |
| displaySourceRoot | workingDirectory | getFileName | `workingDirectory.getFileName()` |
| displaySourceRoot | workingDirectory.getFileName() | toString | `workingDirectory.getFileName().toString()` |
| displaySourceRoot | workingDirectory | relativize | `workingDirectory.relativize(normalizedSourceRoot)` |
| index | """     # CodeAtlas          ## Project Overview          * Project: `%s`     * Source: `%s`     * Classes: %d     * API Endpoints: %d     * Controllers: %d     * Services: %d     * Repositories: %d     * Entities: %d          ## Documents          * [Architecture](architecture.md)     * [API](api.md)     * [SQL Statements](sql.md)     * [Tables](tables.md)     * [MyBatis Mappers](mybatis.md)     * [Classes](classes/)     * [Configurations](configs/application.md)     """ | formatted | `"""     # CodeAtlas          ## Project Overview          * Project: `%s`     * Source: `%s`     * Classes: %d     * API Endpoints: %d     * Controllers: %d     * Services: %d     * Repositories: %d     * Entities: %d          ## Documents          * [Architecture](architecture.md)     * [API](api.md)     * [SQL Statements](sql.md)     * [Tables](tables.md)     * [MyBatis Mappers](mybatis.md)     * [Classes](classes/)     * [Configurations](configs/application.md)     """.formatted(overview.projectName(), displaySourceRoot(overview.sourceRoot()), overview.classCount(), overview.endpointCount(), overview.controllerCount(), overview.serviceCount(), overview.repositoryCount(), overview.entityCount())` |
| index |  | displaySourceRoot | `displaySourceRoot(overview.sourceRoot())` |
| index | overview | classCount | `overview.classCount()` |
| index | overview | controllerCount | `overview.controllerCount()` |
| index | overview | endpointCount | `overview.endpointCount()` |
| index | overview | entityCount | `overview.entityCount()` |
| index | overview | projectName | `overview.projectName()` |
| index | overview | repositoryCount | `overview.repositoryCount()` |
| index | overview | serviceCount | `overview.serviceCount()` |
| index | overview | sourceRoot | `overview.sourceRoot()` |
| matchingMyBatisStatements | Comparator | comparing | `Comparator.comparing(SqlStatementDoc::statementId)` |
| matchingMyBatisStatements | classDoc | className | `classDoc.className()` |
| matchingMyBatisStatements | classDoc | className | `classDoc.className()` |
| matchingMyBatisStatements | classDoc | packageName | `classDoc.packageName()` |
| matchingMyBatisStatements | classDoc | packageName | `classDoc.packageName()` |
| matchingMyBatisStatements | classDoc.packageName() | isEmpty | `classDoc.packageName().isEmpty()` |
| matchingMyBatisStatements | statement | ownerName | `statement.ownerName()` |
| matchingMyBatisStatements | statement.ownerName() | equals | `statement.ownerName().equals(qualifiedName)` |
| matchingMyBatisStatements | statements | stream | `statements.stream()` |
| matchingMyBatisStatements | statements.stream() | filter | `statements.stream().filter(statement -> statement.ownerName().equals(qualifiedName))` |
| matchingMyBatisStatements | statements.stream().filter(statement -> statement.ownerName().equals(qualifiedName)) | sorted | `statements.stream().filter(statement -> statement.ownerName().equals(qualifiedName)).sorted(Comparator.comparing(SqlStatementDoc::statementId))` |
| matchingMyBatisStatements | statements.stream().filter(statement -> statement.ownerName().equals(qualifiedName)).sorted(Comparator.comparing(SqlStatementDoc::statementId)) | toList | `statements.stream().filter(statement -> statement.ownerName().equals(qualifiedName)).sorted(Comparator.comparing(SqlStatementDoc::statementId)).toList()` |
| mybatis | Collectors | groupingBy | `Collectors.groupingBy(statement -> statement.ownerName() + "\n" + statement.sourcePath(), LinkedHashMap::new, Collectors.toList())` |
| mybatis | Collectors | toList | `Collectors.toList()` |
| mybatis | Map.Entry | comparingByKey | `Map.Entry.comparingByKey()` |
| mybatis | byMapper | entrySet | `byMapper.entrySet()` |
| mybatis | byMapper.entrySet() | stream | `byMapper.entrySet().stream()` |
| mybatis | byMapper.entrySet().stream() | sorted | `byMapper.entrySet().stream().sorted(Map.Entry.comparingByKey())` |
| mybatis | byMapper.entrySet().stream().sorted(Map.Entry.comparingByKey()) | forEach | `byMapper.entrySet().stream().sorted(Map.Entry.comparingByKey()).forEach(entry -> {     List<SqlStatementDoc> mapperStatements = entry.getValue();     SqlStatementDoc first = mapperStatements.getFirst();     markdown.append("\| ").append(cell(first.ownerName())).append(" \| `").append(cell(first.sourcePath().toString())).append("` \| ").append(mapperStatements.size()).append(" \|\n"); })` |
| mybatis | byMapper | isEmpty | `byMapper.isEmpty()` |
| mybatis |  | cell | `cell(first.ownerName())` |
| mybatis |  | cell | `cell(first.sourcePath().toString())` |
| mybatis | entry | getValue | `entry.getValue()` |
| mybatis | first | ownerName | `first.ownerName()` |
| mybatis | first | sourcePath | `first.sourcePath()` |
| mybatis | first.sourcePath() | toString | `first.sourcePath().toString()` |
| mybatis | mapperStatements | getFirst | `mapperStatements.getFirst()` |
| mybatis | mapperStatements | size | `mapperStatements.size()` |
| mybatis | markdown | append | `markdown.append("\| ")` |
| mybatis | markdown.append("\| ") | append | `markdown.append("\| ").append(cell(first.ownerName()))` |
| mybatis | markdown.append("\| ").append(cell(first.ownerName())) | append | `markdown.append("\| ").append(cell(first.ownerName())).append(" \| `")` |
| mybatis | markdown.append("\| ").append(cell(first.ownerName())).append(" \| `") | append | `markdown.append("\| ").append(cell(first.ownerName())).append(" \| `").append(cell(first.sourcePath().toString()))` |
| mybatis | markdown.append("\| ").append(cell(first.ownerName())).append(" \| `").append(cell(first.sourcePath().toString())) | append | `markdown.append("\| ").append(cell(first.ownerName())).append(" \| `").append(cell(first.sourcePath().toString())).append("` \| ")` |
| mybatis | markdown.append("\| ").append(cell(first.ownerName())).append(" \| `").append(cell(first.sourcePath().toString())).append("` \| ") | append | `markdown.append("\| ").append(cell(first.ownerName())).append(" \| `").append(cell(first.sourcePath().toString())).append("` \| ").append(mapperStatements.size())` |
| mybatis | markdown.append("\| ").append(cell(first.ownerName())).append(" \| `").append(cell(first.sourcePath().toString())).append("` \| ").append(mapperStatements.size()) | append | `markdown.append("\| ").append(cell(first.ownerName())).append(" \| `").append(cell(first.sourcePath().toString())).append("` \| ").append(mapperStatements.size()).append(" \|\n")` |
| mybatis | markdown | append | `markdown.append("\| - \| - \| - \|\n")` |
| mybatis | markdown | toString | `markdown.toString()` |
| mybatis | statement | ownerName | `statement.ownerName()` |
| mybatis | statement | sourcePath | `statement.sourcePath()` |
| mybatis | statements | stream | `statements.stream()` |
| mybatis | statements.stream() | collect | `statements.stream().collect(Collectors.groupingBy(statement -> statement.ownerName() + "\n" + statement.sourcePath(), LinkedHashMap::new, Collectors.toList()))` |
| parameters | Collectors | joining | `Collectors.joining(", ")` |
| parameters | method | parameters | `method.parameters()` |
| parameters | method.parameters() | stream | `method.parameters().stream()` |
| parameters | method.parameters().stream() | map | `method.parameters().stream().map(parameter -> parameter.type() + " " + parameter.name())` |
| parameters | method.parameters().stream().map(parameter -> parameter.type() + " " + parameter.name()) | collect | `method.parameters().stream().map(parameter -> parameter.type() + " " + parameter.name()).collect(Collectors.joining(", "))` |
| parameters | parameter | name | `parameter.name()` |
| parameters | parameter | type | `parameter.type()` |
| render | Files | createDirectories | `Files.createDirectories(classesDirectory)` |
| render | Files | createDirectories | `Files.createDirectories(configsDirectory)` |
| render |  | api | `api(result)` |
| render |  | architecture | `architecture(result)` |
| render | classDoc | className | `classDoc.className()` |
| render |  | classPage | `classPage(classDoc, result)` |
| render | classesDirectory | resolve | `classesDirectory.resolve(classDoc.className() + ".md")` |
| render | configsDirectory | resolve | `configsDirectory.resolve("application.md")` |
| render |  | configurations | `configurations(result.configs())` |
| render |  | index | `index(result.overview())` |
| render |  | mybatis | `mybatis(result.sqlStatements())` |
| render | output | resolve | `output.resolve("_config.yml")` |
| render | output | resolve | `output.resolve("api.md")` |
| render | output | resolve | `output.resolve("architecture.md")` |
| render | output | resolve | `output.resolve("classes")` |
| render | output | resolve | `output.resolve("configs")` |
| render | output | resolve | `output.resolve("index.md")` |
| render | output | resolve | `output.resolve("mybatis.md")` |
| render | output | resolve | `output.resolve("sql.md")` |
| render | output | resolve | `output.resolve("tables.md")` |
| render | outputDirectory | toAbsolutePath | `outputDirectory.toAbsolutePath()` |
| render | outputDirectory.toAbsolutePath() | normalize | `outputDirectory.toAbsolutePath().normalize()` |
| render | result | classes | `result.classes()` |
| render | result | configs | `result.configs()` |
| render | result | overview | `result.overview()` |
| render | result | sqlStatements | `result.sqlStatements()` |
| render | result | sqlStatements | `result.sqlStatements()` |
| render | result | tableUsages | `result.tableUsages()` |
| render |  | sql | `sql(result.sqlStatements())` |
| render |  | tables | `tables(result.tableUsages())` |
| render |  | write | `write(classesDirectory.resolve(classDoc.className() + ".md"), classPage(classDoc, result))` |
| render |  | write | `write(configsDirectory.resolve("application.md"), configurations(result.configs()))` |
| render |  | write | `write(output.resolve("_config.yml"), "title: CodeAtlas\ntheme: minima\n")` |
| render |  | write | `write(output.resolve("api.md"), api(result))` |
| render |  | write | `write(output.resolve("architecture.md"), architecture(result))` |
| render |  | write | `write(output.resolve("index.md"), index(result.overview()))` |
| render |  | write | `write(output.resolve("mybatis.md"), mybatis(result.sqlStatements()))` |
| render |  | write | `write(output.resolve("sql.md"), sql(result.sqlStatements()))` |
| render |  | write | `write(output.resolve("tables.md"), tables(result.tableUsages()))` |
| sortedRelations | relations | stream | `relations.stream()` |
| sortedRelations | relations.stream() | sorted | `relations.stream().sorted(RELATION_ORDER)` |
| sortedRelations | relations.stream().sorted(RELATION_ORDER) | toList | `relations.stream().sorted(RELATION_ORDER).toList()` |
| sql | Comparator | comparing | `Comparator.comparing(SqlStatementDoc::ownerName)` |
| sql | Comparator.comparing(SqlStatementDoc::ownerName) | thenComparing | `Comparator.comparing(SqlStatementDoc::ownerName).thenComparing(SqlStatementDoc::statementId)` |
| sql | String | join | `String.join(", ", statement.tableNames())` |
| sql |  | cell | `cell(String.join(", ", statement.tableNames()))` |
| sql |  | cell | `cell(statement.ownerName())` |
| sql |  | cell | `cell(statement.sourcePath().toString())` |
| sql |  | cell | `cell(statement.sql())` |
| sql |  | cell | `cell(statement.statementId())` |
| sql | markdown | append | `markdown.append("\| ")` |
| sql | markdown.append("\| ") | append | `markdown.append("\| ").append(statement.statementType())` |
| sql | markdown.append("\| ").append(statement.statementType()) | append | `markdown.append("\| ").append(statement.statementType()).append(" \| ")` |
| sql | markdown.append("\| ").append(statement.statementType()).append(" \| ") | append | `markdown.append("\| ").append(statement.statementType()).append(" \| ").append(cell(statement.ownerName()))` |
| sql | markdown.append("\| ").append(statement.statementType()).append(" \| ").append(cell(statement.ownerName())) | append | `markdown.append("\| ").append(statement.statementType()).append(" \| ").append(cell(statement.ownerName())).append(" \| ")` |
| sql | markdown.append("\| ").append(statement.statementType()).append(" \| ").append(cell(statement.ownerName())).append(" \| ") | append | `markdown.append("\| ").append(statement.statementType()).append(" \| ").append(cell(statement.ownerName())).append(" \| ").append(cell(statement.statementId()))` |
| sql | markdown.append("\| ").append(statement.statementType()).append(" \| ").append(cell(statement.ownerName())).append(" \| ").append(cell(statement.statementId())) | append | `markdown.append("\| ").append(statement.statementType()).append(" \| ").append(cell(statement.ownerName())).append(" \| ").append(cell(statement.statementId())).append(" \| `")` |
| sql | markdown.append("\| ").append(statement.statementType()).append(" \| ").append(cell(statement.ownerName())).append(" \| ").append(cell(statement.statementId())).append(" \| `") | append | `markdown.append("\| ").append(statement.statementType()).append(" \| ").append(cell(statement.ownerName())).append(" \| ").append(cell(statement.statementId())).append(" \| `").append(cell(statement.sql()))` |
| sql | markdown.append("\| ").append(statement.statementType()).append(" \| ").append(cell(statement.ownerName())).append(" \| ").append(cell(statement.statementId())).append(" \| `").append(cell(statement.sql())) | append | `markdown.append("\| ").append(statement.statementType()).append(" \| ").append(cell(statement.ownerName())).append(" \| ").append(cell(statement.statementId())).append(" \| `").append(cell(statement.sql())).append('`')` |
| sql | markdown.append("\| ").append(statement.statementType()).append(" \| ").append(cell(statement.ownerName())).append(" \| ").append(cell(statement.statementId())).append(" \| `").append(cell(statement.sql())).append('`') | append | `markdown.append("\| ").append(statement.statementType()).append(" \| ").append(cell(statement.ownerName())).append(" \| ").append(cell(statement.statementId())).append(" \| `").append(cell(statement.sql())).append('`').append(" \| ")` |
| sql | markdown.append("\| ").append(statement.statementType()).append(" \| ").append(cell(statement.ownerName())).append(" \| ").append(cell(statement.statementId())).append(" \| `").append(cell(statement.sql())).append('`').append(" \| ") | append | `markdown.append("\| ").append(statement.statementType()).append(" \| ").append(cell(statement.ownerName())).append(" \| ").append(cell(statement.statementId())).append(" \| `").append(cell(statement.sql())).append('`').append(" \| ").append(cell(String.join(", ", statement.tableNames())))` |
| sql | markdown.append("\| ").append(statement.statementType()).append(" \| ").append(cell(statement.ownerName())).append(" \| ").append(cell(statement.statementId())).append(" \| `").append(cell(statement.sql())).append('`').append(" \| ").append(cell(String.join(", ", statement.tableNames()))) | append | `markdown.append("\| ").append(statement.statementType()).append(" \| ").append(cell(statement.ownerName())).append(" \| ").append(cell(statement.statementId())).append(" \| `").append(cell(statement.sql())).append('`').append(" \| ").append(cell(String.join(", ", statement.tableNames()))).append(" \| `")` |
| sql | markdown.append("\| ").append(statement.statementType()).append(" \| ").append(cell(statement.ownerName())).append(" \| ").append(cell(statement.statementId())).append(" \| `").append(cell(statement.sql())).append('`').append(" \| ").append(cell(String.join(", ", statement.tableNames()))).append(" \| `") | append | `markdown.append("\| ").append(statement.statementType()).append(" \| ").append(cell(statement.ownerName())).append(" \| ").append(cell(statement.statementId())).append(" \| `").append(cell(statement.sql())).append('`').append(" \| ").append(cell(String.join(", ", statement.tableNames()))).append(" \| `").append(cell(statement.sourcePath().toString()))` |
| sql | markdown.append("\| ").append(statement.statementType()).append(" \| ").append(cell(statement.ownerName())).append(" \| ").append(cell(statement.statementId())).append(" \| `").append(cell(statement.sql())).append('`').append(" \| ").append(cell(String.join(", ", statement.tableNames()))).append(" \| `").append(cell(statement.sourcePath().toString())) | append | `markdown.append("\| ").append(statement.statementType()).append(" \| ").append(cell(statement.ownerName())).append(" \| ").append(cell(statement.statementId())).append(" \| `").append(cell(statement.sql())).append('`').append(" \| ").append(cell(String.join(", ", statement.tableNames()))).append(" \| `").append(cell(statement.sourcePath().toString())).append("` \|\n")` |
| sql | markdown | append | `markdown.append("\| - \| - \| - \| - \| - \| - \|\n")` |
| sql | markdown | toString | `markdown.toString()` |
| sql | statement | ownerName | `statement.ownerName()` |
| sql | statement | sourcePath | `statement.sourcePath()` |
| sql | statement.sourcePath() | toString | `statement.sourcePath().toString()` |
| sql | statement | sql | `statement.sql()` |
| sql | statement | statementId | `statement.statementId()` |
| sql | statement | statementType | `statement.statementType()` |
| sql | statement | tableNames | `statement.tableNames()` |
| sql | statements | isEmpty | `statements.isEmpty()` |
| sql | statements | stream | `statements.stream()` |
| sql | statements.stream() | sorted | `statements.stream().sorted(Comparator.comparing(SqlStatementDoc::ownerName).thenComparing(SqlStatementDoc::statementId))` |
| sql | statements.stream().sorted(Comparator.comparing(SqlStatementDoc::ownerName).thenComparing(SqlStatementDoc::statementId)) | forEach | `statements.stream().sorted(Comparator.comparing(SqlStatementDoc::ownerName).thenComparing(SqlStatementDoc::statementId)).forEach(statement -> markdown.append("\| ").append(statement.statementType()).append(" \| ").append(cell(statement.ownerName())).append(" \| ").append(cell(statement.statementId())).append(" \| `").append(cell(statement.sql())).append('`').append(" \| ").append(cell(String.join(", ", statement.tableNames()))).append(" \| `").append(cell(statement.sourcePath().toString())).append("` \|\n"))` |
| tables | Comparator | comparing | `Comparator.comparing(TableUsageDoc::tableName)` |
| tables | Comparator.comparing(TableUsageDoc::tableName) | thenComparing | `Comparator.comparing(TableUsageDoc::tableName).thenComparing(TableUsageDoc::usedBy)` |
| tables | Comparator.comparing(TableUsageDoc::tableName).thenComparing(TableUsageDoc::usedBy) | thenComparing | `Comparator.comparing(TableUsageDoc::tableName).thenComparing(TableUsageDoc::usedBy).thenComparing(TableUsageDoc::sourceName)` |
| tables |  | cell | `cell(usage.sourceName())` |
| tables |  | cell | `cell(usage.sourcePath().toString())` |
| tables |  | cell | `cell(usage.tableName())` |
| tables |  | cell | `cell(usage.usageType())` |
| tables |  | cell | `cell(usage.usedBy())` |
| tables | markdown | append | `markdown.append("\| ")` |
| tables | markdown.append("\| ") | append | `markdown.append("\| ").append(cell(usage.tableName()))` |
| tables | markdown.append("\| ").append(cell(usage.tableName())) | append | `markdown.append("\| ").append(cell(usage.tableName())).append(" \| ")` |
| tables | markdown.append("\| ").append(cell(usage.tableName())).append(" \| ") | append | `markdown.append("\| ").append(cell(usage.tableName())).append(" \| ").append(cell(usage.usedBy()))` |
| tables | markdown.append("\| ").append(cell(usage.tableName())).append(" \| ").append(cell(usage.usedBy())) | append | `markdown.append("\| ").append(cell(usage.tableName())).append(" \| ").append(cell(usage.usedBy())).append(" \| ")` |
| tables | markdown.append("\| ").append(cell(usage.tableName())).append(" \| ").append(cell(usage.usedBy())).append(" \| ") | append | `markdown.append("\| ").append(cell(usage.tableName())).append(" \| ").append(cell(usage.usedBy())).append(" \| ").append(cell(usage.usageType()))` |
| tables | markdown.append("\| ").append(cell(usage.tableName())).append(" \| ").append(cell(usage.usedBy())).append(" \| ").append(cell(usage.usageType())) | append | `markdown.append("\| ").append(cell(usage.tableName())).append(" \| ").append(cell(usage.usedBy())).append(" \| ").append(cell(usage.usageType())).append(" \| ")` |
| tables | markdown.append("\| ").append(cell(usage.tableName())).append(" \| ").append(cell(usage.usedBy())).append(" \| ").append(cell(usage.usageType())).append(" \| ") | append | `markdown.append("\| ").append(cell(usage.tableName())).append(" \| ").append(cell(usage.usedBy())).append(" \| ").append(cell(usage.usageType())).append(" \| ").append(cell(usage.sourceName()))` |
| tables | markdown.append("\| ").append(cell(usage.tableName())).append(" \| ").append(cell(usage.usedBy())).append(" \| ").append(cell(usage.usageType())).append(" \| ").append(cell(usage.sourceName())) | append | `markdown.append("\| ").append(cell(usage.tableName())).append(" \| ").append(cell(usage.usedBy())).append(" \| ").append(cell(usage.usageType())).append(" \| ").append(cell(usage.sourceName())).append(" \| `")` |
| tables | markdown.append("\| ").append(cell(usage.tableName())).append(" \| ").append(cell(usage.usedBy())).append(" \| ").append(cell(usage.usageType())).append(" \| ").append(cell(usage.sourceName())).append(" \| `") | append | `markdown.append("\| ").append(cell(usage.tableName())).append(" \| ").append(cell(usage.usedBy())).append(" \| ").append(cell(usage.usageType())).append(" \| ").append(cell(usage.sourceName())).append(" \| `").append(cell(usage.sourcePath().toString()))` |
| tables | markdown.append("\| ").append(cell(usage.tableName())).append(" \| ").append(cell(usage.usedBy())).append(" \| ").append(cell(usage.usageType())).append(" \| ").append(cell(usage.sourceName())).append(" \| `").append(cell(usage.sourcePath().toString())) | append | `markdown.append("\| ").append(cell(usage.tableName())).append(" \| ").append(cell(usage.usedBy())).append(" \| ").append(cell(usage.usageType())).append(" \| ").append(cell(usage.sourceName())).append(" \| `").append(cell(usage.sourcePath().toString())).append("` \|\n")` |
| tables | markdown | append | `markdown.append("\| - \| - \| - \| - \| - \|\n")` |
| tables | markdown | toString | `markdown.toString()` |
| tables | usage | sourceName | `usage.sourceName()` |
| tables | usage | sourcePath | `usage.sourcePath()` |
| tables | usage.sourcePath() | toString | `usage.sourcePath().toString()` |
| tables | usage | tableName | `usage.tableName()` |
| tables | usage | usageType | `usage.usageType()` |
| tables | usage | usedBy | `usage.usedBy()` |
| tables | usages | isEmpty | `usages.isEmpty()` |
| tables | usages | stream | `usages.stream()` |
| tables | usages.stream() | sorted | `usages.stream().sorted(Comparator.comparing(TableUsageDoc::tableName).thenComparing(TableUsageDoc::usedBy).thenComparing(TableUsageDoc::sourceName))` |
| tables | usages.stream().sorted(Comparator.comparing(TableUsageDoc::tableName).thenComparing(TableUsageDoc::usedBy).thenComparing(TableUsageDoc::sourceName)) | forEach | `usages.stream().sorted(Comparator.comparing(TableUsageDoc::tableName).thenComparing(TableUsageDoc::usedBy).thenComparing(TableUsageDoc::sourceName)).forEach(usage -> markdown.append("\| ").append(cell(usage.tableName())).append(" \| ").append(cell(usage.usedBy())).append(" \| ").append(cell(usage.usageType())).append(" \| ").append(cell(usage.sourceName())).append(" \| `").append(cell(usage.sourcePath().toString())).append("` \|\n"))` |
| title | Character | toUpperCase | `Character.toUpperCase(lowercase.charAt(0))` |
| title | lowercase | charAt | `lowercase.charAt(0)` |
| title | lowercase | substring | `lowercase.substring(1)` |
| title | type | name | `type.name()` |
| title | type.name() | toLowerCase | `type.name().toLowerCase()` |
| write | Files | writeString | `Files.writeString(path, content)` |

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
| [MethodCallDoc](MethodCallDoc.md) | METHOD_PARAMETER | methodCalls |
| [MethodDoc](MethodDoc.md) | METHOD_PARAMETER | method |
| [ProjectOverview](ProjectOverview.md) | METHOD_PARAMETER | overview |
| [SqlStatementDoc](SqlStatementDoc.md) | METHOD_PARAMETER | statements |
| [SqlStatementDoc](SqlStatementDoc.md) | METHOD_RETURN_TYPE | matchingMyBatisStatements |
| [TableUsageDoc](TableUsageDoc.md) | METHOD_PARAMETER | usages |

### Incoming References

| Source | Relation | Member |
| --- | --- | --- |
| - | - | - |
