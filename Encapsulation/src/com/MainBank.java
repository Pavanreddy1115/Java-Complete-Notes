package com;

public class MainBank {
	public static void main(String[] args) {
		BankAccount b = new BankAccount();
		b.setAccountNumber(1125488);
		int b1 = b.getAccountNumber();
		System.out.println("Account Number is:"+b1);
		b.setBalance(10000.00);
		double b2 = b.getBalance();
		System.out.println("Balance :"+b2);
	}

}
