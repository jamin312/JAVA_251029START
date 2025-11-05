package com.mapper;

import java.util.List;

import org.apache.ibatis.annotations.Mapper;
//import org.apache.ibatis.annotations.Select;

@Mapper
public interface BoardMapper {
	
	// 등록
	int insertBoard(BoardVO board);
	
	// 수정
	int updateBoard(BoardVO board);
	
	// 삭제
	int deleteBoard(Long bno);
	
	// 단건 조회
	BoardVO getListByBno(Long bno);
	
	// 전체 조회
//	@Select("SELECT * FROM tbl_board") => BoardMapper.xml에서 생성했음 (MyBatis뭐시기 xml)
	List<BoardVO> getList();
	
	// 전체 조회(검색)
	List<BoardVO> getListByWriter(BoardVO board);
	
	// 페이징 - 전체 건수 조회
	
}
