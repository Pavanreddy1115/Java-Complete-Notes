package com;

public class Mobile {
	Mobile(String brand){
		System.out.println("brand"+brand);
		
	}
	Mobile(int Price){
		
	}
	Mobile(String Brand,int Price){
		
	}
	 Mobile(int Price,String Brand){
		 
	 }
	public static void main(String[] args) {
		Mobile m= new Mobile(200);
		Mobile m1 = new Mobile("mi");
		new Mobile("redmi",500);
		new Mobile(600,"realme");
	}

}
