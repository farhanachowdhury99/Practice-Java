package practice;

public class Casting {
	
	public static void main (String[] args) {
		
		double price = 60.99;
		int discountedPrice = (int) price;
		
		System.out.println(discountedPrice);
		
		
		int num1=50;
		int num2=60;
		int num3=num1;
		int num4=num3+num2;
		
		System.out.println(num4);
		
		int age = 64;
		double newAge = (double)age;
		
		System.out.println(newAge);
		
		int number =60;
		byte total = (byte) number;
		System.out.println(total);
		
	}

}
