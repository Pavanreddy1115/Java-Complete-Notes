package customException;

import java.util.Scanner;

public class Login {
	public static void main(String[] args) {
		System.out.println("Start");
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the Password:");
		int s = sc.nextInt();
		sc.close();
		if(s==123) {
			System.out.println("valid Password!,Login Succesfully");
		}
		else {
			try {
				throw new InvalidPasswordException("Invalid Message");
			}
			catch(Exception e){
				System.out.println(e.getMessage());
				
				
			}
			
		}
	}
	

}
