package com.example.demo.book.mapper;

import java.util.List;

import com.example.demo.book.service.BookVO;
import com.example.demo.book.service.RentVO;

public interface BookMapper {
	
	// 도서 등록
	Long regiBook(BookVO book);
	
	// 도서 목록 조회
	List<BookVO> getList();
	
	// 대여 현황 조회
	List<RentVO> getRent();
	
}
