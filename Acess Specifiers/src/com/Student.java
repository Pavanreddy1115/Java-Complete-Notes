package com;

//Accessing Specifiers
public class Student {

	public static int id = 101;
	public int age = 22;

	public void study() {
		System.out.println("Studying java");
	}
	public static void main(String[] args) {
		System.out.println("id = "+id);

		Student s = new Student();
		System.out.println("Age : "+s.age);
		s.study();


	}

}
