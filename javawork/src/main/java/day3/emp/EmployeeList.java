package day3.emp;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

// 테이블 전체 레코드 담기
// 등록, 수정, 삭제, 조회, 전체 조회, 정렬
public class EmployeeList {

	// 필드 선언
	List<Employee> list;

	// 생성자
	public EmployeeList(List<Employee> list) {
		this.list = list;
	}

	// 전체 조회
	public void selectAll() {
		for (Employee emp : list) {
			System.out.println(emp);
		}
	}// end selectAll

	// 등록
	public void insert(Employee employee) {
		List<Employee> newList = new ArrayList<>(list);
		newList.add(employee);
		list = newList;
		System.out.println("등록되었습니다.");
		selectAll();
	} // end insert

	// 수정
	public void update(Employee upd) {
		for (Employee emp : list) {
			if (upd.getEmployeeId() == emp.getEmployeeId()) {
				list.set(list.indexOf(emp), upd);
				System.out.println("수정되었습니다.");
			} // end if
		} // end for
		System.out.println("수정할 id가 없습니다.");
	} // end update

	// 삭제
	public void delete(int id) {
//		list.indexOf(list)
	}
	
	
	// 단건 조회 (find) 사번
	public Employee findById(int id) {
		for (Employee emp : list) {
			if (id == emp.getEmployeeId()) {
				return emp;
			} // end if
		} // end for
		return null;
	}

	// 단건 조회 이름
//	public Employee findByName(String nm) {
//		for(Employee emp : list) {
//			if(emp.getFirstName().equals(nm)) {
//				return emp;
//			} // end if
//		} // end for
//		return null;
//	}
	// 람다식
	public Employee findByName(String nm) {
		// stream ??
		return list.stream().filter((Employee e) -> e.getFirstName().equals(nm)).findFirst().get();
	}

	// 검색 (filter)
	public List<Employee> findBySalary(int sal) {
		// collect ??
		return list.stream().filter((Employee e) -> e.getSalary() > sal).collect(Collectors.toList());
	}

	// 정렬 (이름 순으로 정렬) 파괴 함수 => stream 때문에
//	public List<Employee> findOrderByName(){
//		return list.stream()
//				.sorted((Employee a, Employee b) -> a.getFirstName().compareTo(b.getFirstName()))
//				.collect(Collectors.toList());
//	}
	
	// 비파괴 함수
	public List<Employee> findOrderByName() {
		// generic 덕분에 타입 생략 가능 (Employee a, Employee b)
		list.sort((a, b) -> a.getFirstName().compareTo(b.getFirstName()));
		return list;
	}
	
	// 정렬 (급여 순으로 정렬)
	public List<Employee> findOrderBySalary(){
		return list.stream()
				.sorted((Employee a, Employee b) -> (int)(a.getSalary() - b.getSalary()))
				.collect(Collectors.toList());
	}

}
