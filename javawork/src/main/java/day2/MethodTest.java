package day2;

public class MethodTest {
	public static void main(String[] args) {
		printHead(); // 매개 변수 X 리턴 X
		printFooter();
		
		printString("테스트");
		
		sum(5,4); // 매개변수가 있는 메서드, 리턴 X
		 
		mul(5,4); // 매겨변수 O, 리턴 O
		
		totalSum(2,3,4,10); // 가변 매개변수
		
		totalMul(1,2,3,4,5,6,7,8,9);
		
	}// end main
	
	// 총 합
	static int totalMul(int ... score) { // score는 배열로 받음
		int result = 1;
		for (int sc : score) {
			result *= sc;
		}
		System.out.println("총 곱은 " + result);
		return result;
	}
	
	// 총 합
	static int totalSum(int ... score) { // score는 배열로 받음
		int result = 0;
		for (int sc : score) {
			result += sc;
		}
		System.out.println("총 합은 " + result);
		return result;
	}
	
	// 두 수의 곱
	static int mul(int a, int b) {
		int c = a * b;
		System.out.println("두 수의 곱은 " + c);
		return c;
	}
	
	// 두 수의 합
	static void sum(int a, int b) {
		int c = a + b;
		System.out.println("두 수의 합은 " + c);
		return;
	}
	
	// 중복되는 코드 => 메서드
	static void printHead(){
		System.out.println("==================");
		System.out.println("======header======");
		System.out.println("==================");
	} // end printHead
	
	static void printFooter() {
		System.out.println("==================");
		System.out.println("======footer======");
		System.out.println("==================");
	} // end printFooter
	
	// => 만든 메소드에서 반복되는 구조 발생 => 값 넘겨줘서 동일하게
	
	static void printString(String str){
		System.out.println("==================");
		System.out.println("======"+ str +"======");
		System.out.println("==================");
	} // end printHead 
}
