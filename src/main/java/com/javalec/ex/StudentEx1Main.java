package com.javalec.ex;

import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.GenericXmlApplicationContext;

public class StudentEx1Main {

	public static void main(String[] args) {
		
		/*
		 * <bean id="student1" class="com.javalec.ex.Student">
			<constructor-arg value="홍길동" />
			<constructor-arg value="18" />
			<constructor-arg value="5" />
			<constructor-arg value="2" />
			</bean> 
			
			<bean id="studentInfo" class="com.javalec.ex.StudentInfo">
			<constructor-arg>
			<ref bean="student1" />
			</constructor-arg>
			</bean> >출력<
	
		 */
		String configLoc = "classpath:applicationCTX2.xml";
		AbstractApplicationContext ctx = new GenericXmlApplicationContext(configLoc);
		StudentEx1Info info = ctx.getBean("studentInfo", StudentEx1Info.class);
		info.getStudentInfo();
		
		
		/*
		 * 	<bean id="student2" class="com.javalec.ex.Student">
			<constructor-arg value="김아무개" />
			<constructor-arg value="19" />
			<constructor-arg value="6" />
			<constructor-arg value="5" />
			</bean> >출력<
		 */
		StudentEX1 student2 = ctx.getBean("student2", StudentEX1.class);
		info.setStudent(student2);
		info.getStudentInfo();
		ctx.close();
	}
}
