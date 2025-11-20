package com.example.demo.book.service;

import java.time.LocalDate;

import com.fasterxml.jackson.annotation.JsonFormat;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@AllArgsConstructor
@NoArgsConstructor
@Builder
@Data
public class BookVO {
		
	private Long bookNo;
	private String bookName;
	private String bookCoverimg;
	@JsonFormat(pattern = "yyyy-MM-dd")
	private LocalDate bookDate;
	private Long bookPrice;
	private String bookPublisher;
	private String bookInfo;
	
}
