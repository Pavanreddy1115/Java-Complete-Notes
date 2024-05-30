package com;

public class Tom extends Person {
	
	@Override
	void eat() {
		System.out.println("Eating Biryani");
	}
	
	public static void main(String[] args) {
		Tom t = new Tom();
		t.eat();
	}
	

}
