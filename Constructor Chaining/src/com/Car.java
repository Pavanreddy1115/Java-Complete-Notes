package com;

public class Car {

	Car(int x){
		System.out.println(1);
	}

	Car(){
		this(100);
		System.out.println(2);
	}
	public static void main(String[] args) {
		System.out.println("Start");
		
		
		System.out.println("End");
		
	}




}
