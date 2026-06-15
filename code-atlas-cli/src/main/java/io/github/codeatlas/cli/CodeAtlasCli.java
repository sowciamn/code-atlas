package io.github.codeatlas.cli;

import io.github.codeatlas.core.AnalysisEngine;
import io.github.codeatlas.core.model.AnalysisResult;
import io.github.codeatlas.core.model.ProjectSource;
import io.github.codeatlas.core.scan.SourceScanner;
import io.github.codeatlas.plugin.java.JavaAnalyzer;
import io.github.codeatlas.plugin.mybatis.MyBatisAnalyzer;
import io.github.codeatlas.plugin.springboot.SpringBootAnalyzer;
import io.github.codeatlas.renderer.markdown.MarkdownRenderer;
import picocli.CommandLine;
import picocli.CommandLine.Command;
import picocli.CommandLine.Option;

import java.nio.file.Files;
import java.nio.file.Path;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Set;
import java.util.concurrent.Callable;

/**
 * CodeAtlasのコマンドラインエントリポイント。
 *
 * <p>Picocliを使用してサブコマンドを解釈し、解析からMarkdown生成までの処理を起動する。</p>
 */
@Command(
        name = "code-atlas",
        mixinStandardHelpOptions = true,
        description = "Generate Markdown documentation from source code.",
        subcommands = CodeAtlasCli.GenerateCommand.class)
public final class CodeAtlasCli implements Runnable {
    /**
     * CLIを実行し、Picocliが返す終了コードでプロセスを終了する。
     *
     * @param args コマンドライン引数
     */
    public static void main(String[] args) {
        int exitCode = new CommandLine(new CodeAtlasCli()).execute(args);
        System.exit(exitCode);
    }

    /**
     * サブコマンドが指定されていない場合に利用方法を表示する。
     */
    @Override
    public void run() {
        CommandLine.usage(this, System.out);
    }

    /**
     * プロジェクトを解析してMarkdownドキュメントを生成するgenerateサブコマンド。
     */
    @Command(name = "generate", description = "Analyze a project and generate Markdown documentation.")
    static final class GenerateCommand implements Callable<Integer> {
        @Option(names = "--source", required = true, paramLabel = "<path>",
                description = "Project root to analyze.")
        private Path sourceDirectory;

        @Option(names = "--output", required = true, paramLabel = "<path>",
                description = "Directory for generated Markdown.")
        private Path outputDirectory;

        @Option(names = "--exclude", paramLabel = "<path>", split = ",",
                description = "Directory name or source-relative path to exclude. Repeatable.")
        private List<String> excludes = List.of();

        /**
         * 入力検証、ソース収集、プラグイン選択、解析、Markdown生成を順に実行する。
         *
         * @return 正常終了時は0、解析元ディレクトリが存在しない場合は2
         * @throws Exception ソース走査またはMarkdown出力に失敗した場合
         */
        @Override
        public Integer call() throws Exception {
            if (!Files.isDirectory(sourceDirectory)) {
                System.err.println("Source directory does not exist: " + sourceDirectory);
                return 2;
            }

            Set<String> additionalExcludes = new LinkedHashSet<>(excludes);
            ProjectSource source = new SourceScanner(additionalExcludes).scan(sourceDirectory);
            AnalysisEngine engine = new AnalysisEngine(List.of(
                    new JavaAnalyzer(),
                    new SpringBootAnalyzer(),
                    new MyBatisAnalyzer()));
            AnalysisResult result = engine.analyze(source);
            new MarkdownRenderer().render(result, outputDirectory);

            System.out.printf(
                    "Generated CodeAtlas documentation in %s (%d classes, %d endpoints).%n",
                    outputDirectory.toAbsolutePath().normalize(),
                    result.overview().classCount(),
                    result.overview().endpointCount());
            return 0;
        }
    }
}
