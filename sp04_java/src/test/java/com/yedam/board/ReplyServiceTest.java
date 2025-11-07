package com.yedam.board;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Disabled;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.junit.jupiter.SpringJUnitConfig;

import com.yedam.board.service.ReplyService;
import com.yedam.board.service.ReplyVO;
import com.yedam.config.DataSourceConfig;
import com.yedam.config.MybatisConfig;
import com.yedam.config.RootConfig;

@SpringJUnitConfig(classes = { DataSourceConfig.class, MybatisConfig.class, RootConfig.class })
public class ReplyServiceTest {

	@Autowired
	ReplyService replyService;
	
	@Disabled
	@Test
	public void test() {
		ReplyVO replyVO = new ReplyVO();
		replyVO.setReply("test");
		replyVO.setReplyer("who");
		replyVO.setBno(24l);

		int result = replyService.regiReply(replyVO);

		assertEquals(result, 1);
	}

	// 삭제
	@Test
	public void test1() {
		Long rno = 27l;
		
		int result = replyService.deleteReply(rno);
		
		assertEquals(result, 1);

	}

}
