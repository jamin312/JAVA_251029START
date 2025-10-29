package day1;

public class 실수유효자리 {
	public static void main(String[] args) {	
		
		// float 형
		// 접미에 f 를 붙여 float 형임을 알려줘야함 / 기본값은 double 이기 때문에 값의 범위가 달라 오류 발생 (큰 -> 작)
		float f = 0.123456789f;  // 유효자리수 7자리
		float f2 = (float)0.123456789; // 강제 형 변환
		
		System.out.println(f);
		System.out.println(f2);
		
		// double 형
		double d = 0.1234567890123456789; // 유효자리수 15자리
		double d2 = 0.12f; // 자동 형 변환 (작 -> 큰)
		
		System.out.println(d);
		System.out.println(d2); // float의 근사값을 담아서 표현
		
	}
}
