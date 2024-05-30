package com;

public class User extends Uber {
	
	@Override
	void payAmount() {
		System.out.println("Pay the Amount of 500rs");
	}
	
	@Override
	void bookCab() {
		System.out.println("Cab is Booked");
	}
	
	public static void main(String[] args) {
		User u = new User();
		u.bookCab();
		u.payAmount();
	}
		
	

}
