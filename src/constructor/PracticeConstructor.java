package constructor;

public class PracticeConstructor {
	
	String stname;
	String phoneNumber;
	String staddress;
	String department;
	int age1;
	int salary;
	
	
	
	
	public PracticeConstructor() {
		
		
	}

	public PracticeConstructor(String name, String address, int age) {
		
		System.out.println("The employee name is "+name+" address is "+address+" age is "+age);
		
		
	}

		
		public PracticeConstructor(String stname, String phoneNumber,String staddress,String department,int age1,int salary ) {
						
		
		
		this.stname=stname;
		this.phoneNumber=phoneNumber;
		this.staddress=staddress;
		this.department=department;
		this.age1=age1;
		this.salary=salary;
		
		System.out.println("The employee name is "+this.stname+" phone number is "+this.phoneNumber+" address is "+this.staddress+ "department is "+department+ "age is "+this.age1+ " salary is "+this.salary);
		
		
	}
		
		
		
	
	public static void main (String[] args) {
		
		PracticeConstructor Office= new PracticeConstructor("Alisha", "Queens,NY", 20);
		PracticeConstructor mainOffice= new PracticeConstructor("Alisha", "286548 ", "New york ", "Quality Control ", 20, 50000);
		
	
		
	}
	
	
	
	
	
	
	
	
}
