package day4;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.Scanner;

import day3.emp.Employee;

public class EmpSalary {

	String fileName;
	List<Employee> list = new ArrayList<>();
	private long sum = 0;
	
	// getter
	public long getSum() {
		return sum;
	}
	
	// 생성자
	public EmpSalary(String fileName) {
		super();
		this.fileName = fileName;
	}

	// 초기화
	public void init() {
		try {
			Scanner sc = new Scanner(new File(fileName));

			while (sc.hasNext()) {
				String emp = sc.nextLine();
//			System.out.println(emp);
				String[] empInfo = emp.split(",");

				// 3. 사번, 이름, 급여 출력
//			System.out.print("사번 :" + empInfo[0] + "\t");
//			System.out.print("이름 :" + empInfo[2] + "\t");
//			System.out.println("급여 :" + empInfo[7]);
				int id = Integer.parseInt(empInfo[0]);
				String name = empInfo[1];
				long sal = Long.parseLong(empInfo[7]);

				list.add(new Employee(id, name, sal));

			}
		} catch (NumberFormatException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} // end try / catch
	} // end init

	// 급여 계산
	public void cal() {
		// 명령형 프로그래밍 (절차 지향, 객체 지향) why를 강조
//		for(Employee e : list) {
//			sum += e.getSalary();
//		}
		
		// 선언형 프로그래밍 (함수형) what을 강조
		// 멀티 스레드가 가능
		sum = list.stream().mapToLong(Employee::getSalary).sum();
	}

	// 정렬
	public void sort() {
		Comparator<Employee> compare = (o1, o2) -> (int)(o1.getSalary() - o2.getSalary());
		list.sort(compare);
	}

	// 출력
	public void print() {
		for (Employee emp : list) {
			System.out.println(emp);
		}
	}

} // end class
