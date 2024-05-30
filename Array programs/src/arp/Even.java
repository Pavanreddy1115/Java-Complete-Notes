package arp;

public class Even {
	 static  int sumOfArr(int[] ar) {
		 int sum =0;
		 for (int i = 0; i < ar.length; i++) {
			 
			 sum = sum+ar[i];
			
		}
		 return sum;
	 } 	
	public static void main(String[] args) {
		int ar[]= {2,4,5,6,7};
		
	      System.out.println(sumOfArr(ar));
	
		}

	 
	 } 	
	
