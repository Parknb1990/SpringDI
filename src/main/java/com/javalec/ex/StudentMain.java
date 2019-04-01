package com.javalec.ex;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class StudentMain {
	
	public static void main(String[] args) {
		
		//.. xml파일이 아닌 어노테이션을 이용한 스프링 예제
		AnnotationConfigApplicationContext ctx = new AnnotationConfigApplicationContext(ApplicationConfig.class);
		
		Student student1 = ctx.getBean("student1", Student.class);
		System.out.println("이름 : "+student1.getName());
		System.out.println("나이 : "+student1.getAge());
		System.out.println("취미 : "+student1.getHobbys());
		System.out.println("신장 : "+student1.getHeight());
		System.out.println("몸무게 : "+student1.getWeight());
		
		
	}

}
