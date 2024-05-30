package customException;
import java.util.Scanner;
public class Amazon {
	
	static void checkEligibilty(int marks) throws InvalidMarksException{ 
		if( marks>60) {
			System.out.println("Apply for Interview");
		}
		else 
			throw new InvalidMarksException("not Eligible");
	}
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter  the Marks:");
		int marks=sc.nextInt();
		sc.close();
		try {
			checkEligibilty(marks);
		}
		catch(InvalidMarksException e) {
			System.out.println(e.getMessage());
		}
		
	}

}
