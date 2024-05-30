package com;

import java.util.Scanner;

public class Number {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the NUmber :");
		int n = sc.nextInt();
		System.out.println("ENter the base:");
		int m = sc.nextInt();
		 int res = 1;
		    for (int i = 1; i <= m; ++i) {
		    	res = res*n;
		    	 
	    }
		    System.out.println("Fact :"+res);
	       
	  
	 
			sc.close();
		}
		
	
}


