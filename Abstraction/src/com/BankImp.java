package com;

public class BankImp implements Bank {

	 int bal ;
	BankImp(int bal){
		this.bal=bal;
		
	}
@Override
    public void deposit(int amount) {
	System.out.println("Deposting Amount"+amount);
	bal = bal+amount;
	System.out.println("Amount Deposited Successfully");
	
	
}
@Override
public void withDraw(int amount) {
	System.out.println("Withdrawing Amount:"+amount);
	bal = bal-amount;
	System.out.println("Amount Withdraw Sucessfully");
	
}
public void checkBalance() {
	System.out.println("The amount is :"+bal);
}
static void display(Bank b) {
	
	b.deposit(2000);
	b.withDraw(3000);
	b.checkBalance();
}
public static void main(String[] args) {
	
	display(new BankImp(5000));
	
	
	
}
	

}
