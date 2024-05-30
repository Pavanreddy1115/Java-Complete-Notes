package com;
/**
 * 
 *Example of Generalization
 *A Method return different type of objects is called FactoryDesign Pattern.
 *we achieve factory Design pattern by having Generalized return type.
 *In the below method, if the return type was pizza ,method can return only object of pizza
 *there fore ,if the return type was Food,it can return
 *object of Pizza,Burger,Biryani .(Generalization)
 */
import java.util.Scanner;
class Hotel {
	static Food orderFood(int choice) {
		if(choice == 1) {
			Pizza p = new Pizza();
			return p;//return new Pizza()
		}
		else
			if(choice == 2){
				Burger b = new Burger();
				return b;//return new Burger()
			}
			else 
				if(choice == 3) {
					Biryani be = new Biryani();
					return be;//return new Biryani()
				}
				else
					return null;
	}

public static void main(String[] args) {
	Scanner sc = new Scanner(System.in);
	System.out.println("Menu:\n----------");
	System.out.println("1.Pizza\n2.Burger\n3.Biryani");
	System.out.println("Enter the Choice:");
	int choice = sc.nextInt();
	//if choice is 1-> Food obj = new Pizza();
	//if choice is 2-> Food obj = new Burger();
	//if choice is 3-> Food obj = new Biryani();
	//if choice is 4,5,6..-> Food obj = null;
	Food obj = orderFood(choice);
	if(obj instanceof Pizza) {
		System.out.println("Eating Pizza");
	}
	if(obj instanceof Burger) {
		System.out.println("Eating Burger");
	}
	if(obj instanceof Biryani) {
		System.out.println("Eating Biryani");
	}
	else
		System.out.println("invalid");
	sc.close();

	
	
	
}
	
}



