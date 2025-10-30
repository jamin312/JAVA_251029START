package day2;
/*
 * 테스트 
 * */
public class Main {
	public static void main(String[] args) {
		// 2. 객체 생성
		//		참조변수			인스턴스(힙(메모리)에 저장 공간 할당)
		Student std = new Student();
		std.no = 2006001;
		std.name = "고길동";
		std.addr = "대구";
		
		Student std3 = new Student(2001, "둘리");
		
		Student std4 = new Student(2001, "또치", "서울");
		
		Professor prof = new Professor();
		
		//3. 사용
		std.addLecture();
		
		// 얕은 복사(주소만 복사) - 하나의 같은 인스턴스를 참조함
		Student std2 = std;
		std2.name = "홍길동";
		
		System.out.println(std.name);
		System.out.println(std == std2);
	}
}
