# HouseholdAccountBookMapper

## Summary

* Package: `com.example.demo.mapper`
* Declaration: `INTERFACE`
* Type: `UNKNOWN`
* Source: `src/main/java/com/example/demo/mapper/HouseholdAccountBookMapper.java`

## Role

このインターフェースは `@Mapper` が付与されているため、MyBatis Mapper interfaceです。

## Annotations

* `Mapper`

## Methods

| Method | Return Type | Parameters | Annotations |
| --- | --- | --- | --- |
| findByMonth | `List<String>` | String targetMonth |  |
| insert | `void` | String item |  |
| update | `void` | String item |  |
| deleteById | `void` | Long id |  |

## Fields

| Name | Type | Annotations |
| --- | --- | --- |
| - | - | - |

## Method Call Relations

### Outgoing Calls

| Target | Expression |
| --- | --- |
| - | - |

### Incoming Calls

| Source | Expression |
| --- | --- |
| - | - |

## Method Calls

### Project Calls

| Source Method | Scope | Resolved Target | Called Method | Expression |
| --- | --- | --- | --- | --- |
| - | - | - | - | - |

### Library / Utility Calls

Library / Utility calls are omitted from this page. Count: 0.

## Related Classes

### Outgoing References

| Target | Relation | Member |
| --- | --- | --- |
| - | - | - |

### Incoming References

| Source | Relation | Member |
| --- | --- | --- |
| - | - | - |

## MyBatis Statements

| Type | Statement ID | Tables | Source |
| --- | --- | --- | --- |
| DELETE | deleteById | household_account_book | `src/main/resources/mapper/HouseholdAccountBookMapper.xml` |
| SELECT | findByMonth | household_account_book, category | `src/main/resources/mapper/HouseholdAccountBookMapper.xml` |
| INSERT | insert | household_account_book | `src/main/resources/mapper/HouseholdAccountBookMapper.xml` |
| UPDATE | update | household_account_book | `src/main/resources/mapper/HouseholdAccountBookMapper.xml` |

## Mapper Statement Relations

| Mapper Method | Statement | Type | Tables |
| --- | --- | --- | --- |
| deleteById | deleteById | DELETE | household_account_book |
| findByMonth | findByMonth | SELECT | household_account_book, category |
| insert | insert | INSERT | household_account_book |
| update | update | UPDATE | household_account_book |

## Related Tables

| Table | Statement | Usage |
| --- | --- | --- |
| category | findByMonth | SELECT |
| household_account_book | deleteById | DELETE |
| household_account_book | findByMonth | SELECT |
| household_account_book | insert | INSERT |
| household_account_book | update | UPDATE |
