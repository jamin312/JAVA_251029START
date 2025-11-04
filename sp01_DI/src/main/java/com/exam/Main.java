package com.exam;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

// XML 기반 DI
public class Main {
	public static void main(String[] args) {
		
		// 컨테이너 == 어플리케이션컨텍스트
		// xml이 객체를 생성함
		ApplicationContext context = new ClassPathXmlApplicationContext("classpath:applicationContext2.xml");
		
		Restaurant restaurant = context.getBean(Restaurant.class);
		restaurant.order();
		
		EmpService empService = context.getBean(EmpService.class);
		empService.register();
		
	} // end main
} // end class
