package day1;

/*
 * p200
 * int[] arr = {1,2,3};
 * String[] arr = new String[3];		
 * 
 * JS					JAVA
 * for(item of list) => for (int item : list)
 * for (item in list) 
 * list.foreach()
 * */
public class 배열과향상된반복문 {
	public static void main(String[] args) {
		// 성적 5개
		int[] score = { 5, 4, 3, 5, 2 };
		int cnt = 0;
		// 성적 출력
		for (int sc : score) {
			System.out.print(sc + "점 ");
			if (sc >= 3) {
				System.out.println("success");
				cnt++;
			} else {
				System.out.println("fail " + (3 - sc) + "점 차이로 통과되지 못 했습니다.");
			}
		}

		System.out.println("통과된 건수는 " + cnt + "건 입니다.");
		System.out.println("통과되지 못한 건수는 " + (score.length - cnt) + "건 입니다.");

	}// end main
} // end class
