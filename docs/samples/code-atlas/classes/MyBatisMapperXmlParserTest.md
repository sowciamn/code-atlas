# MyBatisMapperXmlParserTest

## Summary

* Package: `io.github.codeatlas.plugin.mybatis`
* Declaration: `CLASS`
* Type: `UNKNOWN`
* Source: `code-atlas-plugin-mybatis/src/test/java/io/github/codeatlas/plugin/mybatis/MyBatisMapperXmlParserTest.java`

## Role

コードから機械的に判定できる役割情報はありません。

## Annotations

None

## Methods

| Method | Return Type | Parameters | Annotations |
| --- | --- | --- | --- |
| extractsStatementsDynamicSqlAndTableNames | `void` |  | Test |

## Fields

| Name | Type | Annotations |
| --- | --- | --- |
| tempDir | `Path` | TempDir |

## Method Calls

| Source Method | Scope | Called Method | Expression |
| --- | --- | --- | --- |
| extractsStatementsDynamicSqlAndTableNames | Files | writeString | `Files.writeString(xml, """     <?xml version="1.0" encoding="UTF-8" ?>     <!DOCTYPE mapper PUBLIC "-//mybatis.org//DTD Mapper 3.0//EN"             "https://mybatis.org/dtd/mybatis-3-mapper.dtd">     <mapper namespace="com.example.HouseholdAccountBookMapper">         <select id="findByMonth">             select * from public.household_account_book hab             left join category c on hab.category_id = c.id             <where><if test="month != null">hab.month = #{month}</if></where>         </select>         <insert id="insert">insert into household_account_book (item) values (#{item})</insert>         <update id="update">update household_account_book set item = #{item}</update>         <delete id="deleteById">delete from household_account_book where id = #{id}</delete>     </mapper>     """)` |
| extractsStatementsDynamicSqlAndTableNames | Path | of | `Path.of("src/main/resources/mapper/HouseholdAccountBookMapper.xml")` |
| extractsStatementsDynamicSqlAndTableNames |  | assertThat | `assertThat(mapper.interfaceName())` |
| extractsStatementsDynamicSqlAndTableNames | assertThat(mapper.interfaceName()) | isEqualTo | `assertThat(mapper.interfaceName()).isEqualTo("HouseholdAccountBookMapper")` |
| extractsStatementsDynamicSqlAndTableNames |  | assertThat | `assertThat(mapper.namespace())` |
| extractsStatementsDynamicSqlAndTableNames | assertThat(mapper.namespace()) | isEqualTo | `assertThat(mapper.namespace()).isEqualTo("com.example.HouseholdAccountBookMapper")` |
| extractsStatementsDynamicSqlAndTableNames |  | assertThat | `assertThat(mapper.statements())` |
| extractsStatementsDynamicSqlAndTableNames | assertThat(mapper.statements()) | extracting | `assertThat(mapper.statements()).extracting(statement -> statement.statementId(), statement -> statement.statementType())` |
| extractsStatementsDynamicSqlAndTableNames | assertThat(mapper.statements()).extracting(statement -> statement.statementId(), statement -> statement.statementType()) | containsExactly | `assertThat(mapper.statements()).extracting(statement -> statement.statementId(), statement -> statement.statementType()).containsExactly(tuple("findByMonth", SqlStatementType.SELECT), tuple("insert", SqlStatementType.INSERT), tuple("update", SqlStatementType.UPDATE), tuple("deleteById", SqlStatementType.DELETE))` |
| extractsStatementsDynamicSqlAndTableNames |  | assertThat | `assertThat(mapper.statements().get(1).tableNames())` |
| extractsStatementsDynamicSqlAndTableNames | assertThat(mapper.statements().get(1).tableNames()) | containsExactly | `assertThat(mapper.statements().get(1).tableNames()).containsExactly("household_account_book")` |
| extractsStatementsDynamicSqlAndTableNames |  | assertThat | `assertThat(mapper.statements().get(2).tableNames())` |
| extractsStatementsDynamicSqlAndTableNames | assertThat(mapper.statements().get(2).tableNames()) | containsExactly | `assertThat(mapper.statements().get(2).tableNames()).containsExactly("household_account_book")` |
| extractsStatementsDynamicSqlAndTableNames |  | assertThat | `assertThat(mapper.statements().get(3).tableNames())` |
| extractsStatementsDynamicSqlAndTableNames | assertThat(mapper.statements().get(3).tableNames()) | containsExactly | `assertThat(mapper.statements().get(3).tableNames()).containsExactly("household_account_book")` |
| extractsStatementsDynamicSqlAndTableNames |  | assertThat | `assertThat(mapper.statements().getFirst().sql())` |
| extractsStatementsDynamicSqlAndTableNames | assertThat(mapper.statements().getFirst().sql()) | isEqualTo | `assertThat(mapper.statements().getFirst().sql()).isEqualTo("select * from public.household_account_book hab " + "left join category c on hab.category_id = c.id " + "hab.month = #{month}")` |
| extractsStatementsDynamicSqlAndTableNames |  | assertThat | `assertThat(mapper.statements().getFirst().tableNames())` |
| extractsStatementsDynamicSqlAndTableNames | assertThat(mapper.statements().getFirst().tableNames()) | containsExactly | `assertThat(mapper.statements().getFirst().tableNames()).containsExactly("public.household_account_book", "category")` |
| extractsStatementsDynamicSqlAndTableNames | mapper | interfaceName | `mapper.interfaceName()` |
| extractsStatementsDynamicSqlAndTableNames | mapper | namespace | `mapper.namespace()` |
| extractsStatementsDynamicSqlAndTableNames | mapper | statements | `mapper.statements()` |
| extractsStatementsDynamicSqlAndTableNames | mapper | statements | `mapper.statements()` |
| extractsStatementsDynamicSqlAndTableNames | mapper | statements | `mapper.statements()` |
| extractsStatementsDynamicSqlAndTableNames | mapper | statements | `mapper.statements()` |
| extractsStatementsDynamicSqlAndTableNames | mapper | statements | `mapper.statements()` |
| extractsStatementsDynamicSqlAndTableNames | mapper | statements | `mapper.statements()` |
| extractsStatementsDynamicSqlAndTableNames | mapper.statements() | get | `mapper.statements().get(1)` |
| extractsStatementsDynamicSqlAndTableNames | mapper.statements().get(1) | tableNames | `mapper.statements().get(1).tableNames()` |
| extractsStatementsDynamicSqlAndTableNames | mapper.statements() | get | `mapper.statements().get(2)` |
| extractsStatementsDynamicSqlAndTableNames | mapper.statements().get(2) | tableNames | `mapper.statements().get(2).tableNames()` |
| extractsStatementsDynamicSqlAndTableNames | mapper.statements() | get | `mapper.statements().get(3)` |
| extractsStatementsDynamicSqlAndTableNames | mapper.statements().get(3) | tableNames | `mapper.statements().get(3).tableNames()` |
| extractsStatementsDynamicSqlAndTableNames | mapper.statements() | getFirst | `mapper.statements().getFirst()` |
| extractsStatementsDynamicSqlAndTableNames | mapper.statements() | getFirst | `mapper.statements().getFirst()` |
| extractsStatementsDynamicSqlAndTableNames | mapper.statements().getFirst() | sql | `mapper.statements().getFirst().sql()` |
| extractsStatementsDynamicSqlAndTableNames | mapper.statements().getFirst() | tableNames | `mapper.statements().getFirst().tableNames()` |
| extractsStatementsDynamicSqlAndTableNames | new MyBatisMapperXmlParser() | parse | `new MyBatisMapperXmlParser().parse(xml, Path.of("src/main/resources/mapper/HouseholdAccountBookMapper.xml"))` |
| extractsStatementsDynamicSqlAndTableNames | new MyBatisMapperXmlParser().parse(xml, Path.of("src/main/resources/mapper/HouseholdAccountBookMapper.xml")) | orElseThrow | `new MyBatisMapperXmlParser().parse(xml, Path.of("src/main/resources/mapper/HouseholdAccountBookMapper.xml")).orElseThrow()` |
| extractsStatementsDynamicSqlAndTableNames | statement | statementId | `statement.statementId()` |
| extractsStatementsDynamicSqlAndTableNames | statement | statementType | `statement.statementType()` |
| extractsStatementsDynamicSqlAndTableNames | tempDir | resolve | `tempDir.resolve("HouseholdAccountBookMapper.xml")` |
| extractsStatementsDynamicSqlAndTableNames |  | tuple | `tuple("deleteById", SqlStatementType.DELETE)` |
| extractsStatementsDynamicSqlAndTableNames |  | tuple | `tuple("findByMonth", SqlStatementType.SELECT)` |
| extractsStatementsDynamicSqlAndTableNames |  | tuple | `tuple("insert", SqlStatementType.INSERT)` |
| extractsStatementsDynamicSqlAndTableNames |  | tuple | `tuple("update", SqlStatementType.UPDATE)` |

## Related Classes

### Outgoing References

| Target | Relation | Member |
| --- | --- | --- |
| - | - | - |

### Incoming References

| Source | Relation | Member |
| --- | --- | --- |
| - | - | - |
