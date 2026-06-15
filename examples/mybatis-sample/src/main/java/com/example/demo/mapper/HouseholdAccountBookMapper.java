package com.example.demo.mapper;

import org.apache.ibatis.annotations.Mapper;

import java.util.List;

@Mapper
public interface HouseholdAccountBookMapper {
    List<String> findByMonth(String targetMonth);

    void insert(String item);

    void update(String item);

    void deleteById(Long id);
}
