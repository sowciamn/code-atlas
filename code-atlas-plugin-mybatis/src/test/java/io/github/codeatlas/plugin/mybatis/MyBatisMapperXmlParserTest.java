package io.github.codeatlas.plugin.mybatis;

import io.github.codeatlas.core.model.SqlStatementType;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.io.TempDir;

import java.nio.file.Files;
import java.nio.file.Path;

import static org.assertj.core.api.Assertions.assertThat;
import static org.assertj.core.api.Assertions.tuple;

class MyBatisMapperXmlParserTest {
    @TempDir
    Path tempDir;

    @Test
    void extractsStatementsDynamicSqlAndTableNames() throws Exception {
        Path xml = tempDir.resolve("HouseholdAccountBookMapper.xml");
        Files.writeString(xml, """
                <?xml version="1.0" encoding="UTF-8" ?>
                <!DOCTYPE mapper PUBLIC "-//mybatis.org//DTD Mapper 3.0//EN"
                        "https://mybatis.org/dtd/mybatis-3-mapper.dtd">
                <mapper namespace="com.example.HouseholdAccountBookMapper">
                    <select id="findByMonth">
                        select * from public.household_account_book hab
                        left join category c on hab.category_id = c.id
                        <where><if test="month != null">hab.month = #{month}</if></where>
                    </select>
                    <insert id="insert">insert into household_account_book (item) values (#{item})</insert>
                    <update id="update">update household_account_book set item = #{item}</update>
                    <delete id="deleteById">delete from household_account_book where id = #{id}</delete>
                </mapper>
                """);

        MyBatisMapperDoc mapper = new MyBatisMapperXmlParser()
                .parse(xml, Path.of("src/main/resources/mapper/HouseholdAccountBookMapper.xml"))
                .orElseThrow();

        assertThat(mapper.namespace())
                .isEqualTo("com.example.HouseholdAccountBookMapper");
        assertThat(mapper.interfaceName()).isEqualTo("HouseholdAccountBookMapper");
        assertThat(mapper.statements())
                .extracting(statement -> statement.statementId(), statement -> statement.statementType())
                .containsExactly(
                        tuple("findByMonth", SqlStatementType.SELECT),
                        tuple("insert", SqlStatementType.INSERT),
                        tuple("update", SqlStatementType.UPDATE),
                        tuple("deleteById", SqlStatementType.DELETE));
        assertThat(mapper.statements().getFirst().sql())
                .isEqualTo("select * from public.household_account_book hab "
                        + "left join category c on hab.category_id = c.id "
                        + "hab.month = #{month}");
        assertThat(mapper.statements().getFirst().tableNames())
                .containsExactly("public.household_account_book", "category");
        assertThat(mapper.statements().get(1).tableNames())
                .containsExactly("household_account_book");
        assertThat(mapper.statements().get(2).tableNames())
                .containsExactly("household_account_book");
        assertThat(mapper.statements().get(3).tableNames())
                .containsExactly("household_account_book");
    }
}
