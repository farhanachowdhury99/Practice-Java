package constructor;

import java.util.Scanner;

public class learnScanner {
	
	public static void main (String[] args) {
		
		Scanner newScanner= new Scanner(System.in);
		
		System.out.println("Enter your first name");
		
		String firstName= newScanner.nextLine();
		
		System.out.println("First name is "+firstName);
		
		System.out.println("Enter Last name");
		
		String lastName=newScanner.nextLine();
		
		System.out.println("Last name is "+lastName);
		
	}

}
