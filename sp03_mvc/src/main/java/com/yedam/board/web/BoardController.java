package com.yedam.board.web;

import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;

import com.yedam.board.BoardVO;
import com.yedam.board.ReplyVO;
import com.yedam.board.mapper.BoardMapper;

@Controller
public class BoardController {
	
	@Autowired BoardMapper boardMapper;
	
	// 전체 조회
	@GetMapping("/board")
	public String selectall(Model model) {
		model.addAttribute("list", boardMapper.getList());
		return "board/list";
	}
	
	// 등록 페이지
	@GetMapping("/board/register")
	public String registerpage() {
		// 페이지 이동이라서 return 만
		return "board/register";
	}
	
	// 등록 처리
	@PostMapping("/board/register")
	public String register(BoardVO board) {
		boardMapper.insertBoard(board);
		return "redirect:/board";
	}
	
	// 수정 페이지로 이동
	@GetMapping("/board/modify") // /board/update?bno=1 or /board/update/1
	public String modifypage(Model model, @RequestParam("bno") Long bno) {
		BoardVO vo = boardMapper.getListByBno(bno);
		model.addAttribute("board", vo);
		return "board/register";
	}
	
	// 수정 처리
	@PostMapping("/board/modify")
	public String modify(BoardVO board) {
		boardMapper.updateBoard(board);
		return "redirect:/board";
	}
	
	// 삭제 처리
	@PostMapping("/board/delete")
	public String delete(@RequestParam Map<String, Object> map) {
		boardMapper.deleteBoard(map);
		return "redirect:/board";
	}


}
