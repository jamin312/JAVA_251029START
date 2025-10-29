package day1;

public class 반복문 {
	public static void main(String[] args) {
		
		//A ~ Z까지 반복 출력하시오
		for (int i = 0; i < 26; i++) {
			System.out.print((char)('A' + i));
		}
		
		System.out.println();
		
		// 숫자 48에서 57까지 출력하시오
		for (int i = 48; i < 58; i++) {
			System.out.print(i + " " + (char)i + " ");
		}
		
		System.out.println();
	}
}
