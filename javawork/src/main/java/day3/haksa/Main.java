package day3.haksa;

import java.util.ArrayList;

// 패키지, import
public class Main {
	public static void main(String[] args) {
		
		// 부모타입의 참조 변수가 자식 객체를 참조할 수 있다.(자동 형 변환)
		Member student = new Student(1, "고길동", 4);
		Member professor = new Professor(100, "나교수", 4000);
		
		// <Integer> => generic
		ArrayList<Integer> list = new ArrayList<Integer>();
		list.add(100); // add => 원래는 Object 타입을 담았음
		int num = (Integer)list.get(0); // generic 사용하지 않은 경우 (Integer) 형 변환(캐스팅)해야 함
		
		System.out.println(list);
		System.out.println(num);
		
		ArrayList<Member> list2 = new ArrayList<Member>();
		list2.add(student);
		list2.add(professor);
		
		for(Member member : list2) {
			// member.toString() 이 있다고 생각 , 생략된거임
			 System.out.println(member);
			System.out.print(member.name + " ");
			
			// instanceof 생성된 인스턴스가 Student 타입인지 비교
			if(member instanceof Student) {
				// 강제 형 변환
				Student temp = (Student)member;
				System.out.println("학생의 학년은 : " + temp.getGrade());
			} else {
				Professor temp = (Professor)member;
				System.out.println("교수의 급여는 : " + temp.salary);
			}
			
			// Student와 Professor의 필드가 달라서 타입 변환 진행
//			System.out.println((member instanceof Student) ?
//					// (Student) 강제 형 변환(캐스팅) / 부모와 자식은 형 변환 가능
//								((Student)member).getGrade() :
//								((Professor)member).salary);
		} // end for
		
		for(Member member : list2) {
			// 다형성 : 참조하는 자식객체의 오버라이딩된 메서드를 호출 => 실행 결과 다르게
			System.out.println(member.toString());
		}
		
		
	} // end main
} // end class
