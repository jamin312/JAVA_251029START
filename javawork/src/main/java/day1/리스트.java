package day1;

import java.util.ArrayList;

public class 리스트 {
	public static void main(String[] args) {
		ArrayList<String> list = new ArrayList<String>();
		// 추가
		list.add("사과");
		list.add("키위");
		list.add("딸기");
		System.out.println(list);
		
		// 삽입
		list.add(0,"멜론");
		System.out.println(list);
		
		// 삭제
		list.remove(1);
		System.out.println(list);
		
		// 변경
		list.set(0, "망고");
		System.out.println(list);
		
		// 단건 조회
		System.out.println("첫 번째 과일은 " + list.get(0));
		
		// 전체 조회 1. for
		String temp = null;
		for(int i = 0; i<list.size(); i++) {
			temp = list.get(i);
			System.out.println(i + " : " + temp);
		}
		
		System.out.println("향상된 for문");
		
		// 향상된 for
		for(String cc : list) {
			System.out.println(cc);
		}
		
	}
}
