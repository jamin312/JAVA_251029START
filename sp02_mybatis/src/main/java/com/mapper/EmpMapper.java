package com.mapper;

import java.util.List;
import java.util.Map;

import org.apache.ibatis.annotations.Mapper;

// Mapper를 넣는 이유 : ?
@Mapper
public interface EmpMapper {
	List<Employee> findAll(); // 여러 건
	Map findOne(int id); // 단 건
}
