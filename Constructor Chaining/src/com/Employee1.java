package com;

public class Employee1 {
	int id;
	String name;
	double salary;
	
	Employee1(int id){
		this.id = id;
	}
	Employee1(int id,String name) {
	    this(id);
	    this.name = name;
	}
	Employee1(int id,String name,double salary) {
		this( id, name);
		this.salary = salary;
		
	}
	public static void main(String[] args) {
		Employee1 e = new Employee1(100,"jhon", 2.8);
		System.out.println("Emp id : "+e.id);
		System.out.println("Emp name :"+e.name);
		System.out.println("Emp salary :"+e.salary);
	}

}
