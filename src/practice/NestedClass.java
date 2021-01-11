package practice;

import practice.NestedClass.Computer.Mobile;



public class NestedClass {
	
	int num1=500;
	int num2=200;
	
	
	public static void main (String[] args) {
		NestedClass Nested= new NestedClass();
		System.out.println(Nested.num1);
		
		Computer Com = new Computer();
		System.out.println(Com.computername);
		
		System.out.println(Computer.computerprice);
		
		Computer.ComputerDisplay();
		
			
	
		
		
						
		
		
	}
	
	public static class Computer{
		
		String computername= "HP";
		static String computerprice="2000";
		
		public static void ComputerDisplay() {
			System.out.println("Computer Display");
			
		}
		
		public class Mobile{
			
			 String mobileBrand="iphone";
			
			
		}
	}

}
