# MyBatisMapperXmlParser

## Summary

* Package: `io.github.codeatlas.plugin.mybatis`
* Declaration: `CLASS`
* Type: `UNKNOWN`
* Source: `code-atlas-plugin-mybatis/src/main/java/io/github/codeatlas/plugin/mybatis/MyBatisMapperXmlParser.java`

## Role

コードから機械的に判定できる役割情報はありません。

## Annotations

None

## Methods

| Method | Return Type | Parameters | Annotations |
| --- | --- | --- | --- |
| parse | `Optional<MyBatisMapperDoc>` | Path xmlPath, Path sourcePath |  |
| documentBuilder | `DocumentBuilder` |  |  |
| statements | `List<SqlStatementDoc>` | Element mapper, String namespace, Path sourcePath |  |
| statementType | `SqlStatementType` | String elementName |  |
| normalizeSql | `String` | String sql |  |
| tableNames | `List<String>` | String sql |  |

## Fields

| Name | Type | Annotations |
| --- | --- | --- |
| TABLE_REFERENCE | `Pattern` |  |

## Method Calls

| Source Method | Scope | Called Method | Expression |
| --- | --- | --- | --- |
| documentBuilder | DocumentBuilderFactory | newInstance | `DocumentBuilderFactory.newInstance()` |
| documentBuilder | builder | setEntityResolver | `builder.setEntityResolver((publicId, systemId) -> new InputSource(new StringReader("")))` |
| documentBuilder | factory | newDocumentBuilder | `factory.newDocumentBuilder()` |
| documentBuilder | factory | setAttribute | `factory.setAttribute(XMLConstants.ACCESS_EXTERNAL_DTD, "")` |
| documentBuilder | factory | setAttribute | `factory.setAttribute(XMLConstants.ACCESS_EXTERNAL_SCHEMA, "")` |
| documentBuilder | factory | setExpandEntityReferences | `factory.setExpandEntityReferences(false)` |
| documentBuilder | factory | setFeature | `factory.setFeature("http://apache.org/xml/features/nonvalidating/load-external-dtd", false)` |
| documentBuilder | factory | setFeature | `factory.setFeature("http://xml.org/sax/features/external-general-entities", false)` |
| documentBuilder | factory | setFeature | `factory.setFeature("http://xml.org/sax/features/external-parameter-entities", false)` |
| normalizeSql | sql | replaceAll | `sql.replaceAll("\\s+", " ")` |
| normalizeSql | sql.replaceAll("\\s+", " ") | trim | `sql.replaceAll("\\s+", " ").trim()` |
| parse | "mapper" | equals | `"mapper".equals(root.getTagName())` |
| parse | Optional | empty | `Optional.empty()` |
| parse | Optional | of | `Optional.of(new MyBatisMapperDoc(namespace, interfaceName, sourcePath, statements))` |
| parse | document | getDocumentElement | `document.getDocumentElement()` |
| parse |  | documentBuilder | `documentBuilder()` |
| parse | documentBuilder() | parse | `documentBuilder().parse(xmlPath.toFile())` |
| parse | namespace | lastIndexOf | `namespace.lastIndexOf('.')` |
| parse | namespace | substring | `namespace.substring(separator + 1)` |
| parse | root | getAttribute | `root.getAttribute("namespace")` |
| parse | root | getAttribute | `root.getAttribute("namespace")` |
| parse | root.getAttribute("namespace") | isBlank | `root.getAttribute("namespace").isBlank()` |
| parse | root.getAttribute("namespace") | trim | `root.getAttribute("namespace").trim()` |
| parse | root | getTagName | `root.getTagName()` |
| parse | root | hasAttribute | `root.hasAttribute("namespace")` |
| parse |  | statements | `statements(root, namespace, sourcePath)` |
| parse | xmlPath | toFile | `xmlPath.toFile()` |
| statementType | elementName | toLowerCase | `elementName.toLowerCase(Locale.ROOT)` |
| statements | List | copyOf | `List.copyOf(statements)` |
| statements | children | getLength | `children.getLength()` |
| statements | children | item | `children.item(index)` |
| statements | element | getAttribute | `element.getAttribute("id")` |
| statements | element.getAttribute("id") | trim | `element.getAttribute("id").trim()` |
| statements | element | getTagName | `element.getTagName()` |
| statements | element | getTextContent | `element.getTextContent()` |
| statements | element | hasAttribute | `element.hasAttribute("id")` |
| statements | mapper | getChildNodes | `mapper.getChildNodes()` |
| statements |  | normalizeSql | `normalizeSql(element.getTextContent())` |
| statements |  | statementType | `statementType(element.getTagName())` |
| statements | statements | add | `statements.add(new SqlStatementDoc(namespace, element.getAttribute("id").trim(), type, sql, sourcePath, tableNames(sql)))` |
| statements |  | tableNames | `tableNames(sql)` |
| tableNames | List | copyOf | `List.copyOf(names)` |
| tableNames | TABLE_REFERENCE | matcher | `TABLE_REFERENCE.matcher(sql)` |
| tableNames | candidate | startsWith | `candidate.startsWith("(")` |
| tableNames | matcher | find | `matcher.find()` |
| tableNames | matcher | group | `matcher.group(1)` |
| tableNames | names | add | `names.add(candidate)` |

## Related Classes

### Outgoing References

| Target | Relation | Member |
| --- | --- | --- |
| [MyBatisMapperDoc](MyBatisMapperDoc.md) | METHOD_RETURN_TYPE | parse |
| [SqlStatementDoc](SqlStatementDoc.md) | METHOD_RETURN_TYPE | statements |
| [SqlStatementType](SqlStatementType.md) | METHOD_RETURN_TYPE | statementType |

### Incoming References

| Source | Relation | Member |
| --- | --- | --- |
| [MyBatisAnalyzer](MyBatisAnalyzer.md) | FIELD | parser |
