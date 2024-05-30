package com;
import java.util.Scanner;
class Amazon {
	static Electronics order(int choice) {
		if(choice ==1)
			return new Moblie();
		if(choice == 2)
			return new Laptop();
		if(choice == 3)
			return new Headphone();
		else
		return null;
	}
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Order:\n-----------");
		System.out.println("1.Mobile\n2.Laptop\n3.Headphone");
		System.out.println("enter the Choice:");
		int choice = sc.nextInt();
		Electronics e = order(choice);
		if(e instanceof Moblie){
			System.out.println("mobile ordered");
		}
		if(e instanceof Laptop) {
			System.out.println("Laptop is ordered");
		}
		if(e instanceof Headphone) {
			System.out.println("Headphone is ordered");
		}
		else
		System.err.println("Invalid");
		sc.close();
		
		
		
	}

}
