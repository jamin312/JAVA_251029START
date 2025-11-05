package com.mapper;

import static org.junit.jupiter.api.Assertions.assertEquals;

import java.util.List;

import org.junit.jupiter.api.Disabled;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit.jupiter.SpringExtension;

@ExtendWith(SpringExtension.class)
@ContextConfiguration("classpath:spring/datasource-context.xml")
public class BoardMapperTest {

	@Autowired
	BoardMapper boardMapper;
	
	@Disabled
	@Test
	void test() {

		// given => 테스트가 의존할 데이터를 명시적으로 주입

		// when => 오직 “행동 1개”에 집중 (테스트 이름도 행동 중심으로)
		List<BoardVO> list = boardMapper.getList();

		// then => assert로 기대값 명시
		// **assert는 “기대값과 실제값을 비교해서 다르면 테스트를 실패로 만드는 장치”**
		assertEquals(list.get(0).getWriter(), "user00");

		for (BoardVO board : list) {
			System.out.println(board.getBno() + " : " + board.getTitle());
			for (ReplyVO reply : board.getReply()) {
				System.out.println(reply.getReply());
			}
		}
	} // end test

	@Test
	void insertTest() {
		// given
		BoardVO board = new BoardVO();
		board.setContent("등록테스트");
		board.setTitle("등록테스트");
		board.setWriter("user00");

		// when
		int result = boardMapper.insertBoard(board);
		
		long bno = board.getBno();
		System.out.println(bno);
		BoardVO chk = boardMapper.getListByBno(bno);
		// then
		assertEquals(result, 1);
		System.out.println(chk.getTitle());
		
	}

	@Disabled
	@Test
	void updateTest() {
		// given
		BoardVO board = new BoardVO();
		board.setContent("수정테스트");
		board.setTitle("수정테스트");
		board.setBno(1l);

		// when
		int result = boardMapper.updateBoard(board);

		// then
		assertEquals(result, 1);
	}

	@Disabled
	@Test
	void deleteTest() {
		// given
		long bno = 6l;

		// when
		int result = boardMapper.deleteBoard(bno);

		// then
		assertEquals(result, 1);
	}

	@Test
	void 검색() {
		BoardVO board = BoardVO.builder()
//							.title("등록")
//							.writer("user00")
							.build();
		List<BoardVO> list = boardMapper.getListByWriter(board);

	}

} // end class
