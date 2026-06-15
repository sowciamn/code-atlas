package io.github.codeatlas.core;

import io.github.codeatlas.core.model.AnalysisResult;
import io.github.codeatlas.core.model.ConfigDoc;
import io.github.codeatlas.core.model.ProjectOverview;
import io.github.codeatlas.core.model.ProjectSource;
import io.github.codeatlas.core.spi.CodeAnalyzerPlugin;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.io.TempDir;

import java.nio.file.Path;
import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

import static org.assertj.core.api.Assertions.assertThat;

class AnalysisEngineTest {
    @TempDir
    Path tempDir;

    @Test
    void appliesAllSupportedPluginsInRegistrationOrder() {
        ProjectSource source = new ProjectSource(
                tempDir, List.of(), List.of(), Optional.empty(), Optional.empty(), List.of());
        List<String> applied = new ArrayList<>();

        CodeAnalyzerPlugin first = plugin("first", applied, "first.yml");
        CodeAnalyzerPlugin second = plugin("second", applied, "second.yml");

        AnalysisResult result = new AnalysisEngine(List.of(first, second)).analyze(source);

        assertThat(applied).containsExactly("first", "second");
        assertThat(result.configs())
                .extracting(config -> config.fileName())
                .containsExactly("first.yml", "second.yml");
    }

    private CodeAnalyzerPlugin plugin(
            String id,
            List<String> applied,
            String configName
    ) {
        return new CodeAnalyzerPlugin() {
            @Override
            public String pluginId() {
                return id;
            }

            @Override
            public boolean supports(ProjectSource source) {
                return true;
            }

            @Override
            public AnalysisResult analyze(ProjectSource source) {
                throw new UnsupportedOperationException();
            }

            @Override
            public AnalysisResult analyze(ProjectSource source, AnalysisResult currentResult) {
                applied.add(id);
                List<ConfigDoc> configs = new ArrayList<>(currentResult.configs());
                configs.add(new ConfigDoc(Path.of(configName), configName));
                ProjectOverview overview = currentResult.overview();
                return new AnalysisResult(
                        overview,
                        currentResult.classes(),
                        currentResult.endpoints(),
                        configs,
                        currentResult.relations(),
                        currentResult.sqlStatements(),
                        currentResult.tableUsages());
            }
        };
    }
}
