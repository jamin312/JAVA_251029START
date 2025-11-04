package com.container;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.factory.TV;
// XML 기반 DI
public class XML기반설정 {
	public static void main(String[] args) {
		
		// 컨테이너 == 어플리케이션컨텍스트
		// xml이 객체를 생성함
		ApplicationContext context = new ClassPathXmlApplicationContext("classpath:applicationContext2.xml");
		
		TV tv = (TV) context.getBean(TV.class);
		tv.powerOn();
		tv.volumeUp();
		
		
	} // end main
} // end class
