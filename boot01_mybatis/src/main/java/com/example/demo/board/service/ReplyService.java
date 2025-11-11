package com.example.demo.board.service;

import java.util.List;
import java.util.Map;

public interface ReplyService {
	
	// 댓글 조회
	List<ReplyVO> listReply(Long bno);
	
	// 댓글 등록
	public int regiReply(ReplyVO reply);

	// 댓글 삭제
	int deleteReply(Long rno);
}
