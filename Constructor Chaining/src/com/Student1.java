package com;

public class Student1 {
	int age;
	String name;
	Student1(int age){
		this.age= age;
	}
	Student1(int age,String name){
		this(age);//this(22);avoiding repetition->this.age = age;
		this.name = name;
	}
	public static void main(String[] args) {
		Student1 sc = new Student1(22,"tom");
		System.out.println("Age :"+sc.age);
		System.out.println("name :"+ sc.name);
	}

}
