package com.mapper;

import java.util.Date;
import java.util.List;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

// DTO, DO, VO
@AllArgsConstructor
@NoArgsConstructor
@Builder
@Data
public class BoardVO {
	// Ctrl + Shift + Y 는 대문자를 소문자로
	// 실제로는 bno, title이지만 resultmap으로 boardno, boardtitle 사용 가능
	// 쿼리문에서의 alias와 같은 역할
	private Long bno;
	private String title;
	private String content;
	private String writer;
	private Date regdate; // yyyy-MM-dd
	private Date updatedate;
	
	List<ReplyVO> reply;
}
