package com;

public class Car1 {
	String brand;
	int cost;
	Car1(String brand){
		this.brand = brand;
	}
	Car1(String brand,int cost){
		this(brand);
		this.cost = cost;
	}
	public static void main(String[] args) {
		Car1 c = new Car1("Suzuki",2000);
		System.out.println("Brand :"+c.brand);
		System.out.println("Cost :"+c.cost);
	}

}
