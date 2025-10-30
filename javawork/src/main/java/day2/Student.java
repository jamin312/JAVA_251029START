package day2;
// 1. 클래스 설계(선언)
public class Student {
	
	// 학생 전부에 포함되는 내용 - 공유한다 라고 생각
	static String schoolName = "예담";
	
	int no;
	String name;
	String addr;
	
	// 기본 생성자(매개변수가 없는)
	public Student() {}
	
	// 생성자 : 객체가 생성될 때 필드를 초기화.
	//		   리턴 타입 없음, 클래스명과 동일
	public Student(int no, String name) {
		this.no = no;
		this.name = name;
	}
	
	public Student(int no, String name, String addr) {
		this.no = no; // this.는 필드를 가르킴
		this.name = name;
		this.addr = addr;
	}
	
	// 생성자 오버로딩 : 같은 이름의 생성자가 여러 개 선언(매개변수 타입, 개수는 달라야함)

	void addLecture() {
		System.out.println("수강 신청 완료");
	}
	
	
}
