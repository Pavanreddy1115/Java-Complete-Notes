package com;

public class Person {
	private int age;
	private String name;
	private String country;
	

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		if(age>0) {
		this.age = age;
		System.out.println("Age is valid");
		}
		else {
			System.out.println("Age is invalid");
		}
	}
		
	
	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	
	
	}
	public String getCountry() {
		return country;
	}

	public void setCountry(String country) {
		this.country = country;
	
	
	}
}
