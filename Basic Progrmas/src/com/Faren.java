package com;
import java.util.Scanner;
public class Faren {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the Degrees:");
		int n = sc.nextInt();
		if(n>=-9 && n<=9)
		{
			System.out.println(n+"is digit ");
		}
		else
		{
			System.out.println(n+"is number");
		}
	
		sc.close();
	}

}
