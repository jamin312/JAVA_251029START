package day4;

import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import day3.emp.Employee;

/*
 * 사원 급여 합계 계산
 * 클래스
 * data	(필드)
 * 	=> 	List
 * 		filename
 * 
 * 기능	(메서드)
 * 	=> 	List 초기화
 * 		급여 계산
 * 		정렬
 * 		출력
 * */
public class EmpSalarySum {
	public static void main(String[] args) throws IOException {
		// emp.txt
		
		// 1. scanner로 파일 열기
		Scanner sc = new Scanner(new File("c:/Temp/emp.txt"));
		long sum = 0;
		
		List<Employee> list = new ArrayList<>();
		while (sc.hasNext()) {
			String emp = sc.nextLine();
//		System.out.println(emp);
			String[] empInfo = emp.split(",");

			// 3. 사번, 이름, 급여 출력
//		System.out.print("사번 :" + empInfo[0] + "\t");
//		System.out.print("이름 :" + empInfo[2] + "\t");
//		System.out.println("급여 :" + empInfo[7]);
			int id = Integer.parseInt(empInfo[0]);
			String name = empInfo[1];
			long sal = Long.parseLong(empInfo[7]);

			list.add(new Employee(id, name, sal));
			sum += sal;
		}
		
		long sumSalary = 0;
		// 2. 한 줄 씩 읽기 => 라인만큼 반복문
		
		// 오름차순 정렬
		list.sort((o1, o2) -> (int)(o1.getSalary() - o2.getSalary()));
		
		for(Employee e : list) {
			System.out.println(e);
		}
		
		System.out.println("==========================");
		// stream 이용해서
		list.stream().sorted((a, b) -> (int)(a.getSalary() - b.getSalary()))//.forEach(e -> System.out.println(e));
		.forEach(System.out::println);		// 매개변수 생략
		
		// 4. 급여 합계 출력
		System.out.println("총 사원의 급여 합계는 : " + sum);
	}
}
