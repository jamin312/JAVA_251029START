package com.example.demo.book.service;

import java.util.List;

public interface BookService {
	// 책 등록
	long regiBook(BookVO book);
	
	// 책 목록 조회
	List<BookVO> getlist();
	
	// 도서 대여 목록
	List<RentVO> getRent();
}
