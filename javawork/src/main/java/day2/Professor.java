package day2;

public class Professor {
	int no;
	String name;
	String addr;
	int roomNo;
	
	// 기본 생성자(매개변수X)
	// 생성자가 하나도 선언된 게 없으면 컴파일러가 자동으로 추가
	// 하지만 생성자가 존재하면 기본 생성자를 추가 생성해야 함
	
	public Professor() {
		this(0, "무명"); // this() : 다른 생성자를 호출		
	}
	
	public Professor(int no, String name) {
		this.no = no; // this : 자신 객체
		this.name = name;
	}


	


	
	
}
