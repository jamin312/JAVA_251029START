package day3.emp;

import java.util.Date;

// 원래는 EmployeeVO
// Employee 테이블 구조
// 테이블 레코드 1건을 담기 emp = {employee_id:1, first_name : "aaa", ...}
public class Employee {
	
	private int employeeId;
	private String firstName;
	private String email;
	private long salary;
	private Date hireDate; // import할 때 util 부모 , sql 자식
	
	public Employee() {};
	
	public Employee(int employeeId, String firstName, long salary) {
		super();
		this.employeeId = employeeId;
		this.firstName = firstName;
		this.salary = salary;
	}

	//toString 오버라이딩
	@Override
	public String toString() {
		return "Employee [employeeId=" + employeeId + ", firstName=" + firstName + ", salary="
				+ salary + "]";
	}

	// getter, setter
	public int getEmployeeId() {
		return employeeId;
	}

	public void setEmployeeId(int employeeId) {
		this.employeeId = employeeId;
	}

	public String getFirstName() {
		return firstName;
	}

	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public long getSalary() {
		return salary;
	}

	public void setSalary(long salary) {
		this.salary = salary;
	}

	public Date getHireDate() {
		return hireDate;
	}

	public void setHireDate(Date hireDate) {
		this.hireDate = hireDate;
	}
	
	
	
}
