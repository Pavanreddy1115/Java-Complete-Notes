package com;
import java.util.Scanner;
public class EmployeeMain {
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the id:");
		
		 System.out.println("Enter the name:");
		 int n = sc.nextInt();
		 String nam = sc.next();
		 
		Employee e = new Employee();
		e.setId(n);
		 int id = e.getId();
		 
		e.setName(nam);
		String name = e.getName();
		System.out.println("Employee Id :"+id);
		System.out.println("Employee name :"+name);
		sc.close();
		
	}

}
