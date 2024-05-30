package com;
import java.util.Scanner;
class Person {
	static Vehicle travel(int choice) {
		if(choice ==1) 
			return new Car();
		else if(choice == 2)
			return new Bike();
		else
		return null;
	}
	public static void main(String[] args) {
		Scanner sc= new Scanner(System.in);
		System.out.println("Choose th Vehicle:\n----------");
		System.out.println("1.Car\n2.Bike\nEnter the Choice");
		int choice=sc.nextInt();
		Vehicle obj =travel(choice);
		if(obj instanceof Car) {
			System.out.println("Travelling in car");
		}
		else if(obj instanceof Bike) {
			System.out.println("Travelling in Bike");
		}
		else
			System.out.println("Walking");
		
		sc.close();	
	}

}
