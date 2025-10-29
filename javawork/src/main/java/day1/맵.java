package day1;

import java.util.HashMap;
import java.util.Set;

public class 맵 {
	public static void main(String[] args) {
		// 키 값은 중복이 안 됨
		HashMap<Integer, String> map = new HashMap<Integer,String>();
		
		// 추가
		map.put(100, "홍길동");
		map.put(110, "김길동");
		map.put(120, "이길동");
		System.out.println("추가 후 :" + map);
		
		// 삭제
		map.remove(100);
		System.out.println("삭제 후 :" + map);
		
		// 변경
		map.put(110, "이순신");
		System.out.println("수정 후 :" + map);
		
		// 검색
		System.out.println("120번 사원은 : "+ map.get(120));
		
		// 전체 조회 -> key를 list로 변환해서
		// map.keySet() 은 map 안에 들어있는 모든 키들의 “뷰(view)” 를 돌려줘
		Set<Integer> keys = map.keySet();
		for(Integer key : keys) {
			System.out.println(key + " : " + map.get(key));
		}
		
		
	} // end main
}
