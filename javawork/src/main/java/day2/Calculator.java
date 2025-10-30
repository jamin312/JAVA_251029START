package day2;

public class Calculator {
	// 필드는 private, 메서드는 public
	private int n1;
	private int n2;
	private double area; // 캡슐화 => read만 가능하도록
	
	// setter, getter
	public double getArea() {
		return area;
	}
	
	public int getN1() {
		return n1;
	}

	public void setN1(int n1) {
		this.n1 = n1;
	}

	public int getN2() {
		return n2;
	}

	public void setN2(int n2) {
		this.n2 = n2;
	}	
	
	public Calculator() {};
	
	public Calculator(int n1) {
		this.n1 = n1;
	}
	
	public Calculator(int n1, int n2) {
		this.n1 = n1;
		this.n2 = n2;
	}
	
	public void add() {
		int result = n1 + n2;
		System.out.println(result);
	}
	
	public void mul() {
		int result = n1 * n2;
		System.out.println(result);
	}
	
	public void div() {
		double result = (double)n1 / (double)n2;
		System.out.println(result);
	}
	
	public void min() {
		int result = n1 - n2;
		System.out.println(result);
	}

	public void area() {
		
		area = Math.PI * n1 * n1; 
		System.out.printf("원의 반지름은 %d, 원의 넓이는 %.4f", n1, area);
		System.out.println();
	}
	
	// 메서드 오버로딩(중복선언) 가능하지만 매개변수 타입 또는 개수가 달라야함
	public static double rArea(int r) {
		return Math.PI * r * r;
	}


	
	
	
}
