package day1;
/* p520
 * 래퍼 클래스 (감싸다)
 * char      int     long  float double <- 8가지
 * Character Integer Long  Float Double
 * 1. 객체화 => null값 가능 / 파라미터?age=   => int는 에러 , Integer는 가능 (null 값 허용 여부)
 * 2. 형변환
 *  int를 Integer 박싱, Integer를 int를 언박싱 // 객체로 만들면 박싱, 반대면 언박싱
 * */
public class 문자열형변환 {
	public static void main(String[] args) {
		String strAge = "27";
		// String을 int로 변환 / 정수만 Integer로 풀어서 사용
		int age = Integer.parseInt(strAge);
		
		System.out.println("제 나이는 " + age + "세 입니다.");
		
		// int를 String으로 변환 
		strAge = Integer.toString(age);
		
		// isDigit 숫자인가? => return은 boolean
		System.out.println(Character.isDigit('a'));
		System.out.println(Character.isDigit('1'));
	}
}
