package com.container;

public class LombokBuilder {
	public static void main(String[] args) {
		
		// 생성자 대신 builder를 사용해서 객체를 생성
		Employee emp = Employee.builder()
				.employeeId(100)
				.email("")
				.build();
	}
}
