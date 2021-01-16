package constructor;

import java.util.Scanner;

public class LearnScanner {
	
	public static void main (String[] args) {
		
		Scanner  learnScan = new Scanner(System.in);
		
		System.out.println("Enter your first name");
		
		String firstName=learnScan.nextLine();
		
		System.out.println("My name is  "+firstName);
		
		
		System.out.println("Enter your last name");
		
		String lastName=learnScan.nextLine();
		
		System.out.println("My last name is "+lastName);
		
		System.out.println("My full name is "+firstName+" "+ lastName);
		
		
	}

}
