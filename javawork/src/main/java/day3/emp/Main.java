package day3.emp;

import java.util.Arrays;
import java.util.List;

public class Main {
	public static void main(String[] args) {
		
		List<Employee> list = Arrays.asList(
				new Employee(100,"홍길동", 2000),
				new Employee(101,"고길동", 3000),
				new Employee(102,"이길동", 4000)
				);		
		
		EmployeeList empList = new EmployeeList(list);
		
		// 전체 출력
		System.out.println("전체 출력");
		empList.selectAll();
		
		// 등록
		System.out.println("등록");
		empList.insert(new Employee(103, "박길동", 5000));
		
		// 수정
		
		// 삭제
		
		// 단건 조회 사번
		System.out.println("사번으로 단건 조회");
		Employee res = empList.findById(102);
		System.out.println(res);
		
		// 단건 조회 이름
		System.out.println("이름으로 단건 조회");
		res = empList.findByName("홍길동");
		System.out.println(res);
		
		// 급여로 조회
		System.out.println("급여가 일정 이상 조회");
		List<Employee> resp = empList.findBySalary(2500);
		System.out.println(resp);
		
		// 이름으로 정렬
		System.out.println("이름으로 정렬");
		resp = empList.findOrderByName();
		System.out.println(resp);
		
		// 급여로 정렬
		System.out.println("급여로 정렬");
		resp = empList.findOrderBySalary();
		System.out.println(resp);
		
		
	}// end main
} // end class
