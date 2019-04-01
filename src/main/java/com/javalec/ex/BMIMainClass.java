package com.javalec.ex;

import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.GenericXmlApplicationContext;

public class BMIMainClass {

	public static void main(String[] args) {
		
		String configLocation = "classpath:applicationCTX1.xml";
		//..  스프링 컨테이너 생성
		AbstractApplicationContext ctx = new GenericXmlApplicationContext(configLocation);
		//.. 스프링 컨테이너에서 컴포넌트를 가져옴
		MyInfo myinfo = ctx.getBean("myInfo", MyInfo.class);
		myinfo.getInfo();
		ctx.close();
	}
}
