package com.example.demo.board.web;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.board.service.ReplyService;
import com.example.demo.board.service.ReplyVO;

import lombok.RequiredArgsConstructor;

@RequiredArgsConstructor
@RestController
public class ReplyController {
	
	private final ReplyService replyService;
	
	// 댓글 등록
	@PostMapping("/reply")   // localhost/reply
	public Map<String, Object> regiReply(@RequestBody ReplyVO reply) {
		int cnt = replyService.regiReply(reply);
		Map<String, Object> map = new HashMap<>(); // {"result":"success", data: 1}
		map.put("result", "success");
		map.put("data", reply);
		return map; // {result : "success", data: reply}
		
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
