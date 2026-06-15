# CodeAtlasCli

## Summary

* Package: `io.github.codeatlas.cli`
* Declaration: `CLASS`
* Type: `UNKNOWN`
* Source: `code-atlas-cli/src/main/java/io/github/codeatlas/cli/CodeAtlasCli.java`

## Role

このクラスは `@Command` が付与されているため、CLIコマンドです。

## Annotations

* `Command`

## Methods

| Method | Return Type | Parameters | Annotations |
| --- | --- | --- | --- |
| main | `void` | String[] args |  |
| run | `void` |  | Override |

## Fields

| Name | Type | Annotations |
| --- | --- | --- |
| - | - | - |

## Method Calls

| Source Method | Scope | Called Method | Expression |
| --- | --- | --- | --- |
| main | System | exit | `System.exit(exitCode)` |
| main | new CommandLine(new CodeAtlasCli()) | execute | `new CommandLine(new CodeAtlasCli()).execute(args)` |
| run | CommandLine | usage | `CommandLine.usage(this, System.out)` |

## Related Classes

### Outgoing References

| Target | Relation | Member |
| --- | --- | --- |
| - | - | - |

### Incoming References

| Source | Relation | Member |
| --- | --- | --- |
| - | - | - |
