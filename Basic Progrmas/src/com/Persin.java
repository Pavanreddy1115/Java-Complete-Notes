package com;

public class Persin {
int age;
String name;
Persin(int age,String name){
	this.age = age;
	this.name = name;
}
public static void main(String[] args) {
	Persin p = new Persin(22,"raju");
	Persin p1 = new Persin(23,"raju");
	System.out.println("Age : "+p.age+"   "+"Name :"+p.name);
	System.out.println("Age :"+p1.age+"   "+"name :"+p1.name);
}

}
