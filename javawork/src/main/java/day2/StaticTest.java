package day2;

/*
 * 스태틱 영역이 따로 있음
 * */
public class StaticTest {
	public static void main(String[] args) {
		Student s1 = new Student(1, "무단객식 둘리");
		Student s2 = new Student(2, "검성 고길동");
		
		// static 클래스 이름 접근 가능, 객체 생성 없이 사용 가능
		System.out.println(Student.schoolName);
		
		Student.schoolName = "영진";
		
		System.out.println(s1.name);
		System.out.println(s1.schoolName);
		
		System.out.println(s2.name);
		System.out.println(s2.schoolName);
	}
}
