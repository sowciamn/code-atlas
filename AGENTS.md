# CodeAtlas 開発ガイド

## プロジェクト方針

- Java 21とMavenマルチモジュール構成を維持する。
- LLMに依存せず、ソースコードから機械的に確認できる事実だけを扱う。
- Spring Boot固有処理は`code-atlas-plugin-springboot`に置き、Java共通処理やcoreへ漏らさない。
- 将来の言語・フレームワーク追加を妨げないよう、解析と出力の責務を分離する。
- MVPの範囲を超える抽象化や、依頼に関係しないリファクタリングを避ける。

## モジュール責務

- `code-atlas-core`: 共通モデル、ソース収集、解析・レンダリングSPI。
- `code-atlas-plugin-java`: JavaParserを利用するJava共通解析。
- `code-atlas-plugin-springboot`: Springコンポーネント分類とAPIエンドポイント抽出。
- `code-atlas-renderer-markdown`: GitHub Pages向けMarkdown生成。
- `code-atlas-cli`: PicocliによるCLIと処理の組み立て。
- `examples/springboot-sample`: 動作確認用の最小Spring Bootプロジェクト。
- `docs`: サンプルを解析して生成したMarkdown成果物。

## 実装規約

- 既存のパッケージ構成、record、SPI、命名規則を優先する。
- Mavenモジュール名は`code-atlas-*`形式にする。
- 解析できないファイルがあっても、可能な範囲で残りの解析を継続する。
- 型解決など未対応の情報を推測して補完しない。
- 生成順序は可能な限り決定的にし、同じ入力から安定した出力を生成する。
- 新しい本番依存関係を追加する前に、その必要性と既存依存で代替できないかを確認する。

## コメントとJavaDoc

- 公開クラス、公開インターフェース、公開record、公開メソッドには日本語JavaDocを付ける。
- recordのJavaDocでは、各コンポーネントを`@param`で説明する。
- JavaDocには責務、前提、制約、戻り値、例外など、コードだけでは把握しにくい情報を書く。
- 単純な代入や処理名の言い換えにすぎないコメントは追加しない。
- 非公開処理には、対応範囲や継続条件など判断理由が読み取りにくい場合だけJavaDocを付ける。
- 実装変更時は関連JavaDocも更新し、実装と異なる説明を残さない。
- コードから判断できない意図や将来予定をコメントとして断定しない。

## テストと生成物

- 変更に対応するJUnit 5とAssertJのテストを追加または更新する。
- JavaコードやPOMを変更したら、リポジトリルートで`./mvnw clean test`を実行する。
- 実行可能jarやパッケージ構成に影響する変更では`./mvnw clean package`も実行する。
- 解析・レンダリング結果が変わる場合は、CLIでサンプルを解析して`docs`を更新する。
- `target/`などのビルド成果物はコミットしない。

## Git運用

- コミット前に`git status --short`、`git diff`、`git diff --check`を確認する。
- 作業ツリーに依頼と無関係な変更がある場合は、対象を確認せず一括ステージしない。
- コミットメッセージは変更目的が分かる簡潔な日本語にする。
- 通常の`git push`を使用し、`--force`と`--force-with-lease`は使用しない。
- リモート履歴が先行している場合は内容を確認し、ユーザーの変更を失わない方法で統合する。
- テスト失敗、未解決の競合、push先不明、認証失敗がある状態ではpushしない。
