package com.javalec.ex;

import java.util.ArrayList;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

//.. 스프링 파일로 사용하겠다고 선언 
@Configuration
public class ApplicationConfig {

	//.. Bean 만듦
	@Bean
	public Student student1() {
		
		ArrayList<String> hobbys = new ArrayList<String>();
		hobbys.add("수영");
		hobbys.add("요리");
		
		Student student = new Student("홍길동", 20, hobbys);
		student.setHeight(180);
		student.setWeight(78);
		
		return student;
	}
	
}
