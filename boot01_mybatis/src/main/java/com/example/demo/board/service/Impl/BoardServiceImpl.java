package com.example.demo.board.service.Impl;

import java.util.List;
import java.util.Map;

import org.springframework.stereotype.Service;

import com.example.demo.board.mapper.BoardMapper;
import com.example.demo.board.service.BoardService;
import com.example.demo.board.service.BoardVO;

import lombok.RequiredArgsConstructor;

@Service
@RequiredArgsConstructor
public class BoardServiceImpl implements BoardService{
	
	private final BoardMapper boardMapper;
	
	@Override
	public int insertBoard(BoardVO board) {
		return boardMapper.insertBoard(board);
	}

	@Override
	public int updateBoard(BoardVO board) {
		return boardMapper.updateBoard(board);
	}

	@Override
	public int deleteBoard(Map<String, Object> map) {
		return boardMapper.deleteBoard(map);
	}

	@Override
	public BoardVO getListByBno(Long bno) {
		return boardMapper.getListByBno(bno);
	}

	@Override
	public List<BoardVO> getList() {
		return boardMapper.getList();
	}

	@Override
	public List<BoardVO> getListByWriter(BoardVO board) {
		return boardMapper.getListByWriter(board);
	}

}
