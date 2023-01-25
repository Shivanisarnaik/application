package com;

public class Test {
	public static void main(String[] args) {
		System.out.println("Test class......");
		
		Student student=new Student();
		student.setId(1);
		student.setName("Sita");
		student.setAddress("pune");
		
		System.out.println("Student :" +student);
	}

}
