package com;
import java.util.Scanner;
public class Multiplication {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the Number");
		int n = sc.nextInt();
		
		for(int i=0;i<10;i++) {
			System.out.println(n +"*"+ (i+1)+ "=" + n*(i+1) );
			sc.close();
		}
	}

}
