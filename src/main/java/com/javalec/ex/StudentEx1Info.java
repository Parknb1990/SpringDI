package com.javalec.ex;

public class StudentEx1Info {

	private StudentEX1 student;
	
	public StudentEx1Info(StudentEX1 student) {
		this.student = student;
	}
	
	public void getStudentInfo() {
		if(student != null) {
			System.out.println("name : "+student.getName());
			System.out.println("age : "+student.getAge());
			System.out.println("grade : "+student.getGradeNum());
			System.out.println("class : "+student.getClassNum());
			System.out.println("----------------------------");
		}
	}
	
	public void setStudent(StudentEX1 student) {
		this.student = student;
	}
}
