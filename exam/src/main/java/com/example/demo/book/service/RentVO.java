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
public class RentVO {
	
	private Long rentNo;
	private Long bookNo;
	private Long rentPrice;
	@JsonFormat(pattern = "yyyy-MM-dd")
	private LocalDate rentDate;
	private char rentStatus;
	private String bookName;
	private Long totalPrice;
	private Long rentCount;
	
}
