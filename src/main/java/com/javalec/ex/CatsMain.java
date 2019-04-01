package com.javalec.ex;

import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.GenericXmlApplicationContext;

public class CatsMain {

	public static void main(String[] args) {
		
//		bean을 설정한 xml 파일이 있는 위치 지정
		String configLocation = "classpath:applicationContext.xml";
//		지정한 위치를 참고하여 설정파일을 얻어옴
		AbstractApplicationContext ctx = new GenericXmlApplicationContext(configLocation);
		
//		설정파일에서 bean을 가져옴
//		getBean()을 이용해서 MyCats타입에서 myCats를 얻어와서 객체를 생성
//		직접 생성이 아닌 외부에서 얻어옴(주입)
		MyCats mycats = ctx.getBean("myCats", MyCats.class);
		
//		호출
		mycats.catsNameInfo();
		mycats.catsAgeInfo();
		
		ctx.close();
		
	}
}
