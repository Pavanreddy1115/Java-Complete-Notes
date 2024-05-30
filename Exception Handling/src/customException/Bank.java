package customException;
import java.util.Scanner;
public class Bank {
	
	public static void main(String[] args) {
	Scanner sc = new Scanner(System.in);
	System.out.println("Enter the amount to be Withdrawn:");
	int amount = sc.nextInt();
	sc.close();
	int bal = 5000;
	if(amount <= bal) {
		System.out.println("The Amount is Withdrawn Succesfully!");
	}else {
		try {
			throw new InsufficientBalanceException("Insufficient balance");
		}
		catch(Exception e ){
			System.out.println(e.getMessage());
		}
	}
	
			
	}
}
