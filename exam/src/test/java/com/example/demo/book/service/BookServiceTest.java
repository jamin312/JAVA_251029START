package com.example.demo.book.service;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import com.example.demo.book.mapper.BookMapper;

import lombok.extern.slf4j.Slf4j;

@Slf4j
@SpringBootTest
public class BookServiceTest {
	
	@Autowired
	BookMapper bookMapper;	
	
	@Test
	public void test() {
		
	}
}
