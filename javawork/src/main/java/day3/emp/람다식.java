package day3.emp;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;

public class 람다식 {
	public static void main(String[] args) {
		List<Employee> list = Arrays.asList(
				new Employee(100,"홍길동", 3000),
				new Employee(101,"고길동", 4000),
				new Employee(102,"이길동", 2000)
				);
		
		// 1. Comparator 구현 객체
		System.out.println("사번 순 정렬");
		list.sort(new MySort());
		System.out.println(list);
		
		// 2. 익명 클래스
		System.out.println("급여 순 정렬");
		list.sort(new Comparator<Employee>() {

			@Override
			public int compare(Employee o1, Employee o2) {
				// TODO Auto-generated method stub
				return (int)(o1.getSalary() - o2.getSalary());
			}});
		System.out.println(list);
		
		// 3. 람다표현식 (JS의 화살표함수와 같음) => 많이 사용됨
		System.out.println("람다표현식");
		list.sort((Employee o1, Employee o2) -> o1.getFirstName().compareTo(o2.getFirstName()));
		System.out.println(list);
		
		// 4. Comparator 스태틱 메소드
		System.out.println("스태틱 메소드");
		list.sort(Comparator.comparing((Employee e) -> e.getSalary()));
		System.out.println(list);
		
		// 5. 스태틱 메소드 -> 메소드 참조(더블 콜론 - 람다표현식 축약문법)
		System.out.println("더블 콜론");
		list.sort(Comparator.comparing(Employee::getSalary));
		System.out.println(list);
		
		System.out.println("1============");
		list.forEach(e -> System.out.println(e));
		System.out.println("2============");
		list.forEach( System.out::println);
		
		
	} // end main
} // end class

// class가 여러 개가 될 수 있지만 public은 하나만
class MySort implements Comparator<Employee> {

	@Override
	public int compare(Employee o1, Employee o2) {
		// TODO Auto-generated method stub
		return o1.getEmployeeId() - o2.getEmployeeId();
	}
	
}// end class
