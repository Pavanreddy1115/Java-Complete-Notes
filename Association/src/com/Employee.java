package com;

public class Employee {
	String name = "Tom";
	Laptop l = new Laptop();
	public static void main(String[] args) {
		Employee employee = new Employee();
		System.out.println("name:"+employee.name);
		System.out.println("Brand:"+employee.l.brand);
	}

}
class Laptop{
	String brand = "HP";
}


