package com;

public class Employee {

	Employee(int id){
		this(23,"tom");
		System.out.println("id"+id);
	}
	Employee(double salary){
		this(100);
		System.out.println("salary :"+salary);
	}
	Employee(int age,String name){
		
		System.out.println("Age :"+age+"   "+"Name :"+name);
	}
	public static void main(String[] args) {
		new Employee(4.5);
	}

}
