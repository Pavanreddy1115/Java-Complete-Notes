package customException;
import java.util.Scanner;
public class Vehicle {
	public static void checkCar(int num)throws InvalidCarException {
		if(num == 1354) {
			System.out.println("Car Details are correct");
		}
		else {
		 throw new InvalidCarException("Details are Wrong");
		}
	}
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter Car Number");
		int det = sc.nextInt();
		sc.close();
		
		try {
			checkCar(det);
		}
		catch(InvalidCarException e) {
			System.out.println(e.getMessage());
		}
		
	}

}
