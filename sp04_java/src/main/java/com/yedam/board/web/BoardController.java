package com.yedam.board.web;

import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

import com.yedam.board.service.BoardService;
import com.yedam.board.service.BoardVO;

@Controller
public class BoardController {

	@Autowired
	BoardService boardService;
	
	//JSON
	@GetMapping("/api/board")
	@ResponseBody
	public List<BoardVO> selectJson() {
		return boardService.getList();
	}
	
	// 전체 조회
	@GetMapping("/board")
	public String selectall(Model model) {
		model.addAttribute("list", boardService.getList());
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
		boardService.insertBoard(board);
		return "redirect:/board";
	}

	// 수정 페이지로 이동
	@GetMapping("/board/modify") // /board/update?bno=1 or /board/update/1
	public String modifypage(Model model, @RequestParam("bno") Long bno) {
		BoardVO vo = boardService.getListByBno(bno);
		model.addAttribute("board", vo);
		return "board/register";
	}

	// 수정 처리
	@PostMapping("/board/modify")
	public String modify(BoardVO board) {
		boardService.updateBoard(board);
		return "redirect:/board";
	}

	// 삭제 처리
	@PostMapping("/board/delete")
	public String delete(@RequestParam Map<String, Object> map) {
		boardService.deleteBoard(map);
		return "redirect:/board";
	}
	
	// 단건 조회
	@GetMapping("/board/info")
	public void info(@RequestParam("bno") Long bno, Model model) {
		model.addAttribute("board", boardService.getListByBno(bno));
	}
	

}
