package com.mapper;

import java.util.List;
import java.util.Map;

import org.junit.jupiter.api.Disabled;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit.jupiter.SpringExtension;


@ExtendWith(SpringExtension.class)
@ContextConfiguration("classpath:spring/datasource-context.xml")
public class EmpMapperTest {
	
	
	@Autowired EmpMapper empMapper;
	
	@Test
	public void test1() {
		Map map = empMapper.findOne(100);
		System.out.println("1" + map);
	}
	
	@Disabled
	@Test
	public void test() {
		List<Employee> list = empMapper.findAll();
		list.stream().forEach(e -> System.out.println(e));
		System.out.println("2" + list.get(1));
	}
} // end class
