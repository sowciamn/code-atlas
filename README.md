# CodeAtlas

CodeAtlasは、ソースコードから機械的に確認できる情報を抽出し、GitHub Pagesで公開可能なMarkdown解説書を生成するJava製CLIです。LLMや推測による説明には依存しません。

## 対応対象

MVPではJava 21、Spring Bootアプリケーション、MyBatis Mapper XMLに対応します。

* Javaのクラス、インターフェース、enum、アノテーション、メソッド、引数、フィールド
* 同一プロジェクト内クラス間のフィールド、コンストラクタ引数、メソッド引数、戻り値による依存関係
* Springコンポーネントの分類
* Spring MVCのAPIエンドポイント
* MyBatis Mapper XMLのstatement、SQL本文、利用テーブル候補
* `application.yml`、`application.yaml`、`application.properties`とプロファイル別設定

解析処理はプラグインSPIとして分離されており、複数プラグインの結果を合成できます。
CodeAtlas自身も解析対象にでき、クラス間依存関係からリンク付きで各クラスの詳細へ移動できます。

## セットアップとビルド

必要な環境:

* JDK 21以上
* Maven 3.9以上、または同梱のMaven Wrapper

```bash
./mvnw clean package
```

システムにMavenがある場合は、`mvn clean package`も使用できます。

## 実行方法

```bash
java -jar code-atlas-cli/target/code-atlas-cli.jar generate \
  --source ./examples/springboot-sample \
  --output ./docs/samples/springboot-sample
java -jar code-atlas-cli/target/code-atlas-cli.jar generate \
  --source . \
  --output ./docs/samples/code-atlas
java -jar code-atlas-cli/target/code-atlas-cli.jar generate \
  --source ./examples/mybatis-sample \
  --output ./docs/samples/mybatis-sample
```

Maven経由:

```bash
./mvnw clean install
./mvnw -pl code-atlas-cli exec:java \
  -Dexec.args="generate --source ./examples/springboot-sample --output ./docs/samples/springboot-sample"
```

## 出力

* `index.md`: プロジェクト概要と主要ページへのリンク
* `architecture.md`: コンポーネント種別ごとのクラス一覧とリンク付き依存関係一覧
* `api.md`: クラスページへのリンクを含むAPIエンドポイント一覧
* `sql.md`: MyBatis Mapper XMLから抽出したSQL statement一覧
* `tables.md`: テーブルからMapper statementを逆引きする影響調査用一覧
* `mybatis.md`: MyBatis Mapper namespace、XML、statement件数の一覧
* `classes/*.md`: クラスごとの役割、宣言、アノテーション、メソッド、フィールド、リンク付きクラス参照、Mapper statement
* `configs/application.md`: application設定ファイル一覧
* `_config.yml`: GitHub Pages向けの最小設定

## モジュール

* `code-atlas-core`: 共通モデル、SourceScanner、解析・レンダリングSPI
* `code-atlas-plugin-java`: JavaParserによるJava共通解析
* `code-atlas-plugin-springboot`: Spring Boot分類とエンドポイント抽出
* `code-atlas-plugin-mybatis`: MyBatis Mapper XML、SQL、テーブル利用解析
* `code-atlas-renderer-markdown`: Markdown生成
* `code-atlas-cli`: Picocli CLIと実行可能jar

## 今後の拡張

`CodeAnalyzerPlugin`を実装し、CLIのプラグイン一覧へ登録することで、Struts、Python、Next.jsなどの解析器を追加できます。`DocumentationRenderer`の実装を追加すれば、Markdown以外の出力形式にも対応できます。型解決、複数パスを持つマッピング、MyBatis動的SQLの評価、完全なSQL構文解析も独立して拡張できます。

## Codexでの開発

リポジトリ固有の開発規約は`AGENTS.md`に記載しています。Codexはリポジトリを開いた際に、このファイルをプロジェクト指示として読み込みます。

日本語JavaDocの整備からテスト、コミット、pushまでをまとめて実行する場合は、リポジトリスキルを明示的に呼び出します。

```text
$document-and-push
```

このスキルは`.agents/skills/document-and-push`にあり、誤操作を避けるため暗黙実行を無効にしています。
