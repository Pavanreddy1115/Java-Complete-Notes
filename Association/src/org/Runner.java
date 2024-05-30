package org;

public class Runner {
	public static void main(String[] args) {
		District dis = new District("Bengaluru");
		State s = new State("Karnataka", dis);
		Country c = new Country("India", s);
		
		System.out.println("Country Name:"+c.name);
		System.out.println("State name:"+c.state.name);
		System.out.println("District Name:"+c.state.district.name);
		
		
	}
}
