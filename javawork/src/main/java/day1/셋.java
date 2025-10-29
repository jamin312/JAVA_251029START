package day1;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Set;

public class 셋 {
	public static void main(String[] args) {
		
		Set<String> fruits = new HashSet<>();
		
		fruits.add("사과");
		fruits.add("사과"); // Set은 중복값을 허용하지 않음
		fruits.add("바나나");
		
		System.out.println(fruits);
		
		// 전체 조회 index 없음, 순서 없음 (집합 => 일렬로 줄을 세우고(Iterator))
		Iterator<String> iter = fruits.iterator();
		while(iter.hasNext()) { // 다음 요소가 있는 지 검사
			String item = iter.next(); // 이동하면서 조회
			System.out.println(item);
		}
		
		// 리스트를 셋에 넣으면 중복값 제거
		List<String> names = (List<String>)Arrays.asList("사과", "사과", "포도");
		System.out.println(names);
		
		Set distinctName = new HashSet(names);
		System.out.println(distinctName);
		
		
	}
}
