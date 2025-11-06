package com.yedam.board.mapper;

import java.util.List;
import java.util.Map;

import org.apache.ibatis.annotations.Mapper;
//import org.apache.ibatis.annotations.Select;

import com.yedam.board.BoardVO;
import com.yedam.board.ReplyVO;

@Mapper
public interface BoardMapper {
	
	// 등록
	int insertBoard(BoardVO board);
	
	// 수정
	int updateBoard(BoardVO board);
	
	// 게시글 삭제
	int deleteBoard(Map<String, Object> map);
		
	// 단건 조회
	BoardVO getListByBno(Long bno);
	
	// 전체 조회
//	@Select("SELECT * FROM tbl_board") => BoardMapper.xml에서 생성했음 (MyBatis뭐시기 xml)
	List<BoardVO> getList();
	
	// 전체 조회(검색)
	List<BoardVO> getListByWriter(BoardVO board);
	
	// 댓글 등록
//	int insertReply(ReplyVO reply);
	
	// 페이징 - 전체 건수 조회
	
}
