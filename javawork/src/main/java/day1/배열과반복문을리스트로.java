package day1;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class 배열과반복문을리스트로 {
	public static void main(String[] args) {
		// 성적 5개 int[] score = { 5, 4, 3, 5, 2 }; // 배열을 ArrayList로 변경
		
//		ArrayList<Integer> list = (List<Integer>)Arrays.asList(5,4,3,5,2);
		ArrayList<Integer> list = new ArrayList<Integer>();		
		list.add(5);
		list.add(4);
		list.add(3);
		list.add(5);
		list.add(2);
		
		int cnt = 0;
		// 성적 출력
		for (int i : list) {
			System.out.print(i + "점 ");

			// 통과 여부 3점 이상이면 통과
			if (i >= 3) {
				System.out.println("success");
				cnt++;
			} else {
				System.out.println("fail " + (3 - i) + "점 차이로 통과되지 못 했습니다.");
			}
		}

		System.out.println("통과된 건수는 " + cnt + "건 입니다.");
		System.out.println("통과되지 못한 건수는 " + (list.size() - cnt) + "건 입니다.");
		
	}// end main
} // end class
