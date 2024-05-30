package com;
import java.util.Scanner;
public class Circle {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the Radius:");
		double r = sc.nextDouble();
		double pie = 3.14;
		double per = 2* pie *r; 
		double Area = pie * r * r;
		System.out.println("Perimeter is = "+ per);
		System.out.println("Area is = "+Area);
		sc.close();
	}

}
