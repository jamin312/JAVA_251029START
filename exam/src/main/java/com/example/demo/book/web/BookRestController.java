package com.example.demo.book.web;

import java.util.List;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.book.service.BookService;
import com.example.demo.book.service.BookVO;
import com.example.demo.book.service.RentVO;

import lombok.RequiredArgsConstructor;

@RequiredArgsConstructor
@RestController
public class BookRestController {
	
	private final BookService bookService;
	
	@PostMapping("/regiBook")
	public  long regiBook(@RequestBody BookVO vo) {
		return bookService.regiBook(vo);
	}
	
	@GetMapping("/listBook")
	public List<BookVO> listBook() {
		return bookService.getlist();
	}
	
	@GetMapping("/listBookInfo")
	public List<RentVO> listBookInfo() {
		return bookService.getRent();
	}
	
}
