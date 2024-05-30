package com;

public class PersonMain {
	public static void main(String[] args) {
		
	
	Person p = new Person();
	p.setAge(22);
	 int p1 = p.getAge();
	 System.out.println("Person age is:"+p1);
	 p.setName("raju");
	 String p2 = p.getName();
	 System.out.println(" name of the perosn :"+p2);
	 p.setCountry("India");
	 String p3 = p.getCountry();
	 System.out.println("Country is :"+p3);
	
	}
}
