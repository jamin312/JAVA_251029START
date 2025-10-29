package day1;

public class 문자타입 {
	public static void main(String[] args) {
		int c1 = '가';
		System.out.println((char)c1);
		System.out.println((int)c1);	// 형변환 == 캐스트연산자
		
		int d1 = 'A';
		System.out.println(d1);
		System.out.println((char)d1);
		System.out.println(d1 + 32);
		System.out.println((char)(d1 + 32)); // 소문자 'a'
	}
}
