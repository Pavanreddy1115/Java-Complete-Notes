package arp;

import java.util.Scanner;

public class Biggest {
	int[] readArray() {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the size of the Array");
		int size = sc.nextInt();
		int[]ar=new int[size];
		System.out.println("Enter "+size+"values");
		for(int i=0;i<ar.length;i++) {
		 ar[i]=(int) sc.nextInt();
		 System.out.println(ar[i]);
		}
		sc.close();
		return ar;
	}
	
	void display(int[]ar) {
		for(int i=0;i<ar.length;i++) {
			System.out.println(ar[i]+" ");
	}
	System.out.println();
}	
	
	int getbiggest(int[] ar) {
		int count=0;
		for(int i=0;i<ar.length;i++) {
			
			boolean b= isprime(ar[i]);
			if(b)
				count++;
			
		}
		return count;
		
	}
	boolean isPrime(int n);
	for
	public static void main(String[] args) {
		Biggest bg = new Biggest();
		int[] x = bg.readArray();
		System.out.println("User Entered Array :");
		bg.display(x);
		int bgt = bg.getbiggest(x);
		System.out.println("the sum is:"+bgt);
		
		
	}

}
