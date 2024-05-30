package com;

public class EmployeeMainClass {
	public static void main(String[] args) {
		Employee emp = new Employee();
		System.out.println("Name : "+emp.name);
		System.out.println("SAl : "+emp.sal);
		Employee.work();
	}

}
