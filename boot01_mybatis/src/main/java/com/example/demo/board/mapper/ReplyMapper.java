package com.example.demo.board.mapper;

import java.util.List;

import org.apache.ibatis.annotations.Mapper;

import com.example.demo.board.service.ReplyVO;

@Mapper
public interface ReplyMapper {
	// 댓글 조회
	List<ReplyVO> listReply(Long bno);
	
	// 댓글 등록
	int regiReply(ReplyVO reply);

	// 댓글 삭제
	int deleteReply(Long rno);
}
