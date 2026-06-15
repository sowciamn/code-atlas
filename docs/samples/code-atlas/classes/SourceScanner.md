# SourceScanner

## Summary

* Package: `io.github.codeatlas.core.scan`
* Declaration: `CLASS`
* Type: `UNKNOWN`
* Source: `code-atlas-core/src/main/java/io/github/codeatlas/core/scan/SourceScanner.java`

## Role

コードから機械的に判定できる役割情報はありません。

## Annotations

None

## Methods

| Method | Return Type | Parameters | Annotations |
| --- | --- | --- | --- |
| scan | `ProjectSource` | Path rootDirectory |  |
| isExcludedDirectory | `boolean` | Path relativeDirectory |  |
| normalizeExcludedPath | `Path` | String value |  |
| isResource | `boolean` | Path file, Path root |  |
| optionalFile | `Optional<Path>` | Path path |  |

## Fields

| Name | Type | Annotations |
| --- | --- | --- |
| DEFAULT_EXCLUDED_DIRECTORIES | `Set<String>` |  |
| CONFIG_FILE | `Pattern` |  |
| excludedPaths | `Set<Path>` |  |

## Method Calls

| Source Method | Scope | Called Method | Expression |
| --- | --- | --- | --- |
| isExcludedDirectory | DEFAULT_EXCLUDED_DIRECTORIES | contains | `DEFAULT_EXCLUDED_DIRECTORIES.contains(relativeDirectory.getFileName().toString())` |
| isExcludedDirectory | excluded | getFileName | `excluded.getFileName()` |
| isExcludedDirectory | excluded | getNameCount | `excluded.getNameCount()` |
| isExcludedDirectory | excludedPaths | stream | `excludedPaths.stream()` |
| isExcludedDirectory | excludedPaths.stream() | anyMatch | `excludedPaths.stream().anyMatch(excluded -> {     if (excluded.getNameCount() == 1 && relativeDirectory.getFileName().equals(excluded.getFileName())) {         return true;     }     return relativeDirectory.equals(excluded) \|\| relativeDirectory.startsWith(excluded); })` |
| isExcludedDirectory | relativeDirectory | equals | `relativeDirectory.equals(excluded)` |
| isExcludedDirectory | relativeDirectory | getFileName | `relativeDirectory.getFileName()` |
| isExcludedDirectory | relativeDirectory | getFileName | `relativeDirectory.getFileName()` |
| isExcludedDirectory | relativeDirectory.getFileName() | equals | `relativeDirectory.getFileName().equals(excluded.getFileName())` |
| isExcludedDirectory | relativeDirectory.getFileName() | toString | `relativeDirectory.getFileName().toString()` |
| isExcludedDirectory | relativeDirectory | startsWith | `relativeDirectory.startsWith(excluded)` |
| isResource | "resources" | equals | `"resources".equals(relative.getName(index).toString())` |
| isResource | relative | getName | `relative.getName(index)` |
| isResource | relative.getName(index) | toString | `relative.getName(index).toString()` |
| isResource | relative | getNameCount | `relative.getNameCount()` |
| isResource | root | relativize | `root.relativize(file)` |
| normalizeExcludedPath | Path | of | `Path.of(normalizedSeparators)` |
| normalizeExcludedPath | Path.of(normalizedSeparators) | normalize | `Path.of(normalizedSeparators).normalize()` |
| normalizeExcludedPath | path | isAbsolute | `path.isAbsolute()` |
| normalizeExcludedPath | value | trim | `value.trim()` |
| normalizeExcludedPath | value.trim() | replace | `value.trim().replace('\\', '/')` |
| optionalFile | Files | isRegularFile | `Files.isRegularFile(path)` |
| optionalFile | Optional | empty | `Optional.empty()` |
| optionalFile | Optional | of | `Optional.of(path)` |
| scan | CONFIG_FILE | matcher | `CONFIG_FILE.matcher(name)` |
| scan | CONFIG_FILE.matcher(name) | matches | `CONFIG_FILE.matcher(name).matches()` |
| scan | Comparator | comparing | `Comparator.comparing(path -> root.relativize(path).toString())` |
| scan | Files | isDirectory | `Files.isDirectory(root)` |
| scan | Files | walkFileTree | `Files.walkFileTree(root, new SimpleFileVisitor<>() {      @Override     public FileVisitResult preVisitDirectory(Path dir, BasicFileAttributes attrs) {         if (!dir.equals(root) && isExcludedDirectory(root.relativize(dir))) {             return FileVisitResult.SKIP_SUBTREE;         }         return FileVisitResult.CONTINUE;     }      @Override     public FileVisitResult visitFile(Path file, BasicFileAttributes attrs) {         String name = file.getFileName().toString();         if (name.endsWith(".java")) {             javaFiles.add(file);         }         if (isResource(file, root)) {             resourceFiles.add(file);         }         if (CONFIG_FILE.matcher(name).matches()) {             configFiles.add(file);         }         return FileVisitResult.CONTINUE;     } })` |
| scan | configFiles | add | `configFiles.add(file)` |
| scan | configFiles | sort | `configFiles.sort(byRelativePath)` |
| scan | dir | equals | `dir.equals(root)` |
| scan | file | getFileName | `file.getFileName()` |
| scan | file.getFileName() | toString | `file.getFileName().toString()` |
| scan |  | isExcludedDirectory | `isExcludedDirectory(root.relativize(dir))` |
| scan |  | isResource | `isResource(file, root)` |
| scan | javaFiles | add | `javaFiles.add(file)` |
| scan | javaFiles | sort | `javaFiles.sort(byRelativePath)` |
| scan | name | endsWith | `name.endsWith(".java")` |
| scan |  | optionalFile | `optionalFile(root.resolve("build.gradle"))` |
| scan |  | optionalFile | `optionalFile(root.resolve("pom.xml"))` |
| scan | resourceFiles | add | `resourceFiles.add(file)` |
| scan | resourceFiles | sort | `resourceFiles.sort(byRelativePath)` |
| scan | root | relativize | `root.relativize(dir)` |
| scan | root | relativize | `root.relativize(path)` |
| scan | root.relativize(path) | toString | `root.relativize(path).toString()` |
| scan | root | resolve | `root.resolve("build.gradle")` |
| scan | root | resolve | `root.resolve("pom.xml")` |
| scan | rootDirectory | toAbsolutePath | `rootDirectory.toAbsolutePath()` |
| scan | rootDirectory.toAbsolutePath() | normalize | `rootDirectory.toAbsolutePath().normalize()` |

## Related Classes

### Outgoing References

| Target | Relation | Member |
| --- | --- | --- |
| [ProjectSource](ProjectSource.md) | METHOD_RETURN_TYPE | scan |

### Incoming References

| Source | Relation | Member |
| --- | --- | --- |
| - | - | - |
