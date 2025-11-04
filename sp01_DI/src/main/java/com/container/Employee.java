package com.container;

import java.util.Date;

import lombok.Builder;
import lombok.Data;

@Builder // 생성자 대신 builder 사용
@Data
public class Employee {
	
	private int employeeId;
	private String firstName;
	private String email;
	private long salary;
	private Date hireDate;
	
	
}
