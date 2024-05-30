package com;
import java.util.Scanner;
public class Average {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the First Number:");
		 int n1= sc.nextInt();
		 System.out.println("Enter the Second Number");
		 int n2 = sc.nextInt();
		 System.out.println("Enter the Third Number");
		 int n3 = sc.nextInt();
		 System.out.println("Average of three Number is "+(n1+n2+n3)/3);
		sc.close();
	}

}
