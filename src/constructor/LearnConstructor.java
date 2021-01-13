package constructor;

public class LearnConstructor {
	
	String stName;
	String stAddress;
	int stAge;
	double courseFee;
	
	
	
	public LearnConstructor() {
		
		System.out.println("This is default constructor");
		
		int num1=50;
		int num2=50;
		int total= num1+num2;
		System.out.println("Total is "+total);
		
		
		}
	
	
	
	
	public LearnConstructor (String name) {
		
		System.out.println("Student name is "+name);
				
		
	}
	
	
	public LearnConstructor (String name, int age) {
		System.out.println("Student name is "+name+" "+"age is "+age);
		
	}	 
	
	
	public LearnConstructor (String stname, String staddress, int stage, double courseFee) {
		
		this.stName = stname;
		this.stAddress = staddress;
		this.stAge= stage;
		this.courseFee= courseFee;
	
		
		 
		System.out.println("Student name is "+ this.stName+" Address is "+this.stAddress+" age is "+this.stAge+" course fee is "+ this.courseFee);
		
		
		
		
		
		
		
	}
	
	
	public static void main (String [] args) {
		
		
		
		LearnConstructor learn = new LearnConstructor (); 
		
		LearnConstructor student = new  LearnConstructor("Farhana");
		
		LearnConstructor Farhana = new LearnConstructor("Farhana Chowdhury");
		
		LearnConstructor Siyam = new LearnConstructor("Siyam", 5);
		
		
		
		LearnConstructor Alisha = new LearnConstructor("Alisha", "Michigan", 30, 5000);
		
		
		
				
			
		}
	}
