package com.example.demo.book.service.Impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.book.mapper.BookMapper;
import com.example.demo.book.service.BookService;
import com.example.demo.book.service.BookVO;
import com.example.demo.book.service.RentVO;

@Service
public class BookServiceImpl implements BookService{

	@Autowired
	BookMapper bookMapper;
	
	@Override
	public long regiBook(BookVO book) {
		return bookMapper.regiBook(book);
	}

	@Override
	public List<BookVO> getlist() {
		return bookMapper.getList();
	}

	@Override
	public List<RentVO> getRent() {
		return bookMapper.getRent();
	}
	
	
	
}
