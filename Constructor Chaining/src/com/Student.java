package com;

public class Student {
	Student(int age){
		this(5.7);
		System.out.println("Age :"+age);
	}
Student(String name){
	System.out.println("Name :"+name);
	}
Student(double heigt){
	this("tom");
	System.out.println("Height :"+heigt);
}
public static void main(String[] args) {
	new Student(23);
}
	

}
