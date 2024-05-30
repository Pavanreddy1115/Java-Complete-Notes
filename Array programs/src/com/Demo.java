package com;

public class Demo {
	public static void main(String[] args) {
		// Array Declaration
		int[] a;

		//Array Creation
		a = new int[3];

		// printing Array Elements
		System.out.println(a[0]);
		System.out.println(a[1]);
		System.out.println(a[2]);
		System.out.println("***************");

		//Array Initialization
		a[0] = 20;
		a[2] = 40;
		System.out.println(a[0]);
		System.out.println(a[1]);
		System.out.println(a[2]);

		System.out.println("***************");

		//Array Declaration and Creation
		double[] x = new double[2];
		System.out.println(x[0]);
		System.out.println(x[1]);

		System.out.println("-------------");
		x[0] = 1.2;
		x[1] = 12.0;

		System.out.println(x[0]);
		System.out.println(x[1]);


	}

}
