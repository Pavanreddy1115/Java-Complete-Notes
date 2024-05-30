package org;

import com.Car;

public class CarMainClass {
	public static void main(String[] args) {
		
		Car c = new Car();
		System.out.println(c.Brand);
		System.out.println(c.color);
		
		Car.start();
		Car.stop();
	}

}
