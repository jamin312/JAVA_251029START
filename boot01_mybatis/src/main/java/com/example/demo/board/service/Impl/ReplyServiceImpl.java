package com.example.demo.board.service.Impl;

import java.util.List;

import org.springframework.stereotype.Service;

import com.example.demo.board.mapper.ReplyMapper;
import com.example.demo.board.service.ReplyService;
import com.example.demo.board.service.ReplyVO;

import lombok.RequiredArgsConstructor;

@Service
@RequiredArgsConstructor
public class ReplyServiceImpl implements ReplyService{
	
	private final ReplyMapper replyMapper;

	@Override
	public int regiReply(ReplyVO reply) {
		return replyMapper.regiReply(reply);
	}

	@Override
	public List<ReplyVO> listReply(Long bno) {
		return replyMapper.listReply(bno);
	}

	@Override
	public int deleteReply(Long rno) {
		return replyMapper.deleteReply(rno);
	}
	
	
	
}
