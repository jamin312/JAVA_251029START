package com.example.demo.book.web;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class BookController {
	
	@GetMapping("/book")
	public void bookInsert() {}
	
	@GetMapping("/list")
	public void list() {}
	
	@GetMapping("/bookInfo")
	public void bookInfo() {}
	
}
