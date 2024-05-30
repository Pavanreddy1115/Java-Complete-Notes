package com;

public class Jerry extends Employee {
	
	@Override
	void work() {
		System.out.println("Employee is Working");
	}
	@Override
	void walk() {
		System.out.println("Employee is walikmg");
	}
	public static void main(String[] args) {
		Jerry j = new Jerry();
		j.work();
		j.walk();
	}
	
	

}
