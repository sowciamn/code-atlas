# SQL Statements

| Type | Owner | Statement ID | SQL | Tables | Source |
| --- | --- | --- | --- | --- | --- |
| DELETE | com.example.demo.mapper.HouseholdAccountBookMapper | deleteById | `delete from household_account_book where id = #{id}` | household_account_book | `src/main/resources/mapper/HouseholdAccountBookMapper.xml` |
| SELECT | com.example.demo.mapper.HouseholdAccountBookMapper | findByMonth | `select hab.id, hab.account_date, c.name as category_name from household_account_book hab left join category c on hab.category_id = c.id where hab.target_month = #{targetMonth}` | household_account_book, category | `src/main/resources/mapper/HouseholdAccountBookMapper.xml` |
| INSERT | com.example.demo.mapper.HouseholdAccountBookMapper | insert | `insert into household_account_book ( item_name ) values ( #{item} )` | household_account_book | `src/main/resources/mapper/HouseholdAccountBookMapper.xml` |
| UPDATE | com.example.demo.mapper.HouseholdAccountBookMapper | update | `update household_account_book set item_name = #{item} where id = #{id}` | household_account_book | `src/main/resources/mapper/HouseholdAccountBookMapper.xml` |
