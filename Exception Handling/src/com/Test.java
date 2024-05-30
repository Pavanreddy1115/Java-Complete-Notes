package com;

public class Test {
	public static void main(String[] args) {
		int[] a= {10,20,30};
		System.out.println("Start");
		
		try {
			System.out.println(a[100]);
		}
		catch(ArrayIndexOutOfBoundsException e) {
			System.out.println("invalid Index Position");
			
		}
		System.out.println("End");
	}

}
