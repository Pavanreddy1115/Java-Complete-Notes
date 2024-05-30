package arp;
import java.util.*;
//reading an array
public class Arrp1 {
	public static void main(String[] args) {
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
	}	
		
		
	}


