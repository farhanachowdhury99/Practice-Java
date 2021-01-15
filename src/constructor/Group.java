package constructor;

import java.util.Scanner;

public class Group {
	
		
	public static void main (String[] args) {
		
		Scanner groupWork= new Scanner (System.in);
		
		System.out.println("Enter first name");
		String firstName=groupWork.nextLine();
		System.out.println("First name: "+firstName);
		
		System.out.println("Enter last name");
		String lastName=groupWork.nextLine();
		System.out.println("Last name: "+lastName);
		
		System.out.println("Enter your age");
		int age=groupWork.nextInt();
		System.out.println("Age is: "+age);
		
		System.out.println("Enter the points");
		double points=groupWork.nextDouble();
		
		
		if (points>=15) {
			System.out.println("Grade is A");
			
			
		}
		
		if (points <15) {
			System.out.println("Grade is B");
						
		}
		
		if (points <12) {
			System.out.println("Grade is C");
		
			
		
	}
		
		if (points <8) {
			System.out.println("Grade is D");
		
	}
		
		if (points >4) {
			System.out.println("Grade is F");
		
		
}
	}
	}
