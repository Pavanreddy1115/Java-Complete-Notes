package com;
import java.util.Scanner;
public class Demo {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter first number:");
		int x = sc.nextInt();
		System.out.println("Enter Second number:");
		int y = sc.nextInt();
		try {
		System.out.println(x/y);
		}
		catch(ArithmeticException e) {
			System.out.println("Do not divide by zero");
		}
	
		
		sc.close();
			
	}

}
