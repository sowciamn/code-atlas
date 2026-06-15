package io.github.codeatlas.plugin.mybatis;

import io.github.codeatlas.core.model.SqlStatementDoc;
import io.github.codeatlas.core.model.SqlStatementType;
import org.w3c.dom.Document;
import org.w3c.dom.Element;
import org.w3c.dom.Node;
import org.w3c.dom.NodeList;
import org.xml.sax.InputSource;
import org.xml.sax.SAXException;

import javax.xml.XMLConstants;
import javax.xml.parsers.DocumentBuilder;
import javax.xml.parsers.DocumentBuilderFactory;
import javax.xml.parsers.ParserConfigurationException;
import java.io.IOException;
import java.io.StringReader;
import java.nio.file.Path;
import java.util.ArrayList;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Locale;
import java.util.Optional;
import java.util.Set;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

/**
 * MyBatis Mapper XMLからnamespace、SQL文、利用テーブル候補を抽出する。
 *
 * <p>動的SQLは評価せず、statement要素配下のテキストノードを連結して扱う。</p>
 */
public final class MyBatisMapperXmlParser {
    private static final Pattern TABLE_REFERENCE = Pattern.compile(
            "(?i)\\b(?:insert\\s+into|delete\\s+from|from|join|update)\\s+"
                    + "([A-Za-z0-9_.$#{}-]+)");

    /**
     * XMLを解析し、MyBatis Mapper XMLの場合だけMapper情報を返す。
     *
     * @param xmlPath 読み取るXMLファイル
     * @param sourcePath プロジェクトルートからのXML相対パス
     * @return mapper要素とnamespaceを持つ場合は解析結果、それ以外は空
     * @throws IOException XMLファイルを読み取れない場合
     * @throws IllegalArgumentException XML構文を解析できない場合
     */
    public Optional<MyBatisMapperDoc> parse(Path xmlPath, Path sourcePath) throws IOException {
        try {
            Document document = documentBuilder().parse(xmlPath.toFile());
            Element root = document.getDocumentElement();
            if (root == null
                    || !"mapper".equals(root.getTagName())
                    || !root.hasAttribute("namespace")
                    || root.getAttribute("namespace").isBlank()) {
                return Optional.empty();
            }

            String namespace = root.getAttribute("namespace").trim();
            List<SqlStatementDoc> statements = statements(root, namespace, sourcePath);
            int separator = namespace.lastIndexOf('.');
            String interfaceName = separator >= 0 ? namespace.substring(separator + 1) : namespace;
            return Optional.of(new MyBatisMapperDoc(
                    namespace, interfaceName, sourcePath, statements));
        } catch (ParserConfigurationException | SAXException exception) {
            throw new IllegalArgumentException(
                    "Failed to parse MyBatis Mapper XML: " + xmlPath, exception);
        }
    }

    /**
     * DOCTYPEを許可しつつ、外部DTD、外部エンティティ、外部スキーマを取得しない
     * XMLパーサーを構築する。
     *
     * @return 外部参照を無効化したDocumentBuilder
     * @throws ParserConfigurationException 必要なセキュリティ設定を適用できない場合
     */
    private DocumentBuilder documentBuilder() throws ParserConfigurationException {
        DocumentBuilderFactory factory = DocumentBuilderFactory.newInstance();
        factory.setFeature("http://xml.org/sax/features/external-general-entities", false);
        factory.setFeature("http://xml.org/sax/features/external-parameter-entities", false);
        factory.setFeature("http://apache.org/xml/features/nonvalidating/load-external-dtd", false);
        factory.setAttribute(XMLConstants.ACCESS_EXTERNAL_DTD, "");
        factory.setAttribute(XMLConstants.ACCESS_EXTERNAL_SCHEMA, "");
        factory.setExpandEntityReferences(false);
        DocumentBuilder builder = factory.newDocumentBuilder();
        builder.setEntityResolver((publicId, systemId) ->
                new InputSource(new StringReader("")));
        return builder;
    }

    private List<SqlStatementDoc> statements(
            Element mapper,
            String namespace,
            Path sourcePath
    ) {
        List<SqlStatementDoc> statements = new ArrayList<>();
        NodeList children = mapper.getChildNodes();
        for (int index = 0; index < children.getLength(); index++) {
            Node node = children.item(index);
            if (!(node instanceof Element element)) {
                continue;
            }
            SqlStatementType type = statementType(element.getTagName());
            if (type == SqlStatementType.UNKNOWN || !element.hasAttribute("id")) {
                continue;
            }
            String sql = normalizeSql(element.getTextContent());
            statements.add(new SqlStatementDoc(
                    namespace,
                    element.getAttribute("id").trim(),
                    type,
                    sql,
                    sourcePath,
                    tableNames(sql)));
        }
        return List.copyOf(statements);
    }

    private SqlStatementType statementType(String elementName) {
        return switch (elementName.toLowerCase(Locale.ROOT)) {
            case "select" -> SqlStatementType.SELECT;
            case "insert" -> SqlStatementType.INSERT;
            case "update" -> SqlStatementType.UPDATE;
            case "delete" -> SqlStatementType.DELETE;
            default -> SqlStatementType.UNKNOWN;
        };
    }

    private String normalizeSql(String sql) {
        return sql.replaceAll("\\s+", " ").trim();
    }

    /**
     * 対応キーワード直後の単一識別子だけをテーブル名候補として抽出する。
     *
     * <p>SQL構文解析やサブクエリ評価は行わず、出現順を維持して重複を除外する。</p>
     *
     * @param sql 空白を正規化したSQL本文
     * @return 抽出できたテーブル名候補
     */
    private List<String> tableNames(String sql) {
        Set<String> names = new LinkedHashSet<>();
        Matcher matcher = TABLE_REFERENCE.matcher(sql);
        while (matcher.find()) {
            String candidate = matcher.group(1);
            if (!candidate.startsWith("(")) {
                names.add(candidate);
            }
        }
        return List.copyOf(names);
    }
}
