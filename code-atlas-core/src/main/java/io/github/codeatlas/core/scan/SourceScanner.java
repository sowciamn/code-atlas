package io.github.codeatlas.core.scan;

import io.github.codeatlas.core.model.ProjectSource;

import java.io.IOException;
import java.nio.file.FileVisitResult;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.SimpleFileVisitor;
import java.nio.file.attribute.BasicFileAttributes;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Optional;
import java.util.Set;
import java.util.regex.Pattern;

/**
 * プロジェクト配下を走査し、解析対象となるソースと設定ファイルを収集する。
 *
 * <p>ビルド生成物やIDE設定などの既定ディレクトリに加え、呼び出し元が指定した
 * ディレクトリ名または解析ルートからの相対パスを走査対象から除外する。</p>
 */
public final class SourceScanner {
    private static final Set<String> DEFAULT_EXCLUDED_DIRECTORIES =
            Set.of("target", "build", ".git", ".idea", ".vscode", "docs");
    private static final Pattern CONFIG_FILE =
            Pattern.compile("application(?:-[^.]+)?\\.(?:yml|yaml|properties)");
    private final Set<Path> excludedPaths;

    /**
     * 既定の除外ディレクトリだけを使用するスキャナーを作成する。
     */
    public SourceScanner() {
        this(Set.of());
    }

    /**
     * 既定の除外ディレクトリに任意の除外パスを追加したスキャナーを作成する。
     *
     * <p>追加値は解析ルートからの相対パスとして扱う。単一要素の値は同名ディレクトリも
     * 除外し、複数要素の値は相対パスが一致するサブツリーを除外する。</p>
     *
     * @param additionalExcludedDirectories 追加で除外するディレクトリ名または相対パス
     * @throws IllegalArgumentException 絶対パスが指定された場合
     */
    public SourceScanner(Set<String> additionalExcludedDirectories) {
        Set<Path> normalized = new LinkedHashSet<>();
        additionalExcludedDirectories.stream()
                .filter(value -> value != null && !value.isBlank())
                .map(this::normalizeExcludedPath)
                .forEach(normalized::add);
        this.excludedPaths = Set.copyOf(normalized);
    }

    /**
     * 指定ディレクトリ配下のJavaソース、リソース、ビルド定義、設定ファイルを収集する。
     *
     * @param rootDirectory 解析対象プロジェクトのルートディレクトリ
     * @return 収集したプロジェクトソース情報
     * @throws IllegalArgumentException 指定パスがディレクトリとして存在しない場合
     * @throws IOException ファイルツリーの走査に失敗した場合
     */
    public ProjectSource scan(Path rootDirectory) throws IOException {
        Path root = rootDirectory.toAbsolutePath().normalize();
        if (!Files.isDirectory(root)) {
            throw new IllegalArgumentException("Source directory does not exist: " + rootDirectory);
        }

        List<Path> javaFiles = new ArrayList<>();
        List<Path> resourceFiles = new ArrayList<>();
        List<Path> configFiles = new ArrayList<>();

        Files.walkFileTree(root, new SimpleFileVisitor<>() {
            @Override
            public FileVisitResult preVisitDirectory(Path dir, BasicFileAttributes attrs) {
                if (!dir.equals(root) && isExcludedDirectory(root.relativize(dir))) {
                    return FileVisitResult.SKIP_SUBTREE;
                }
                return FileVisitResult.CONTINUE;
            }

            @Override
            public FileVisitResult visitFile(Path file, BasicFileAttributes attrs) {
                String name = file.getFileName().toString();
                if (name.endsWith(".java")) {
                    javaFiles.add(file);
                }
                if (isResource(file, root)) {
                    resourceFiles.add(file);
                }
                if (CONFIG_FILE.matcher(name).matches()) {
                    configFiles.add(file);
                }
                return FileVisitResult.CONTINUE;
            }
        });

        Comparator<Path> byRelativePath = Comparator.comparing(path -> root.relativize(path).toString());
        javaFiles.sort(byRelativePath);
        resourceFiles.sort(byRelativePath);
        configFiles.sort(byRelativePath);

        return new ProjectSource(
                root,
                javaFiles,
                resourceFiles,
                optionalFile(root.resolve("pom.xml")),
                optionalFile(root.resolve("build.gradle")),
                configFiles);
    }

    private boolean isExcludedDirectory(Path relativeDirectory) {
        if (DEFAULT_EXCLUDED_DIRECTORIES.contains(relativeDirectory.getFileName().toString())) {
            return true;
        }
        return excludedPaths.stream().anyMatch(excluded -> {
            if (excluded.getNameCount() == 1
                    && relativeDirectory.getFileName().equals(excluded.getFileName())) {
                return true;
            }
            return relativeDirectory.equals(excluded) || relativeDirectory.startsWith(excluded);
        });
    }

    private Path normalizeExcludedPath(String value) {
        String normalizedSeparators = value.trim().replace('\\', '/');
        Path path = Path.of(normalizedSeparators).normalize();
        if (path.isAbsolute()) {
            throw new IllegalArgumentException("Exclude path must be relative: " + value);
        }
        return path;
    }

    private boolean isResource(Path file, Path root) {
        Path relative = root.relativize(file);
        for (int index = 0; index < relative.getNameCount(); index++) {
            if ("resources".equals(relative.getName(index).toString())) {
                return true;
            }
        }
        return false;
    }

    private Optional<Path> optionalFile(Path path) {
        return Files.isRegularFile(path) ? Optional.of(path) : Optional.empty();
    }
}
