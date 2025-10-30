package day2;

import java.util.Scanner;

public class CalcTest {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.print("첫 번째 수를 입력하시오 :");
		int n1 = sc.nextInt();

		System.out.print("두 번째 수를 입력하시오 :");
		int n2 = sc.nextInt();

		
		Calculator cal = new Calculator(n1,n2);
		Calculator calC = new Calculator(n1);
		
		cal.add();
		
		cal.mul();
		
		cal.div();
		
		cal.min();
		
		calC.area();
		
		double result = Calculator.rArea(n2);
		System.out.printf("원의 반지름은 %d, 원의 넓이는 %.4f", n2, result);
		System.out.println();
	
	}
}
