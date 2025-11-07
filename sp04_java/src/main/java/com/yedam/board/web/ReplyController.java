package com.yedam.board.web;

import java.util.List;

import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.yedam.board.service.ReplyService;
import com.yedam.board.service.ReplyVO;

import lombok.RequiredArgsConstructor;

@RequiredArgsConstructor
@RestController
public class ReplyController {
	
	private final ReplyService replyService;
	
	// 댓글 등록
	@PostMapping("/reply")   // localhost/reply
	public int regiReply(@RequestBody ReplyVO reply) {
		return replyService.regiReply(reply);
		
	}
		
	// 댓글 삭제
	@DeleteMapping("/reply/{rno}") // localhost/reply/10
	public int deleteReply(@PathVariable("rno") Long rno) {
		return replyService.deleteReply(rno);
	}
	
	// 전체 조회
	@GetMapping("/board/{bno}/reply") // localhost/{bno}/reply/
	public List<ReplyVO> select(@PathVariable("bno") Long bno) {
		return replyService.listReply(bno);
	}
	
}
