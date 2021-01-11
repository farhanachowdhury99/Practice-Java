package practice;

public class Static {
	
	public static String stName="John Smith";
	
	public String address="Michigan";
	
	int age;
	
	public String stinformation="There are 50 students in the class";
	
	String stFatherName= "John William";
	
	String stMotherName= "Selena William";
	
	public static void tvDisplay() {
		
		System.out.println("TV display is UHD");
		
	}
	
		
		
		public void TV() {
			
			System.out.println("Display is good");
			
		

		
		
	}
	
	
	
	
	
	public static void main (String[] args) {
		
		// Static.stName= "James William";
		
		
		 System.out.println(Static.stName);
		 
		 Static add= new Static ();
				 
		System.out.println(add.address);
		
		add.age=36;
		
		System.out.println(add.age);
		
		System.out.println(Static.stName+" "+ "age is "+add.age);
		
		Static stInfo = new Static ();
		
		System.out.println(stInfo.stinformation);
		
		Static Father= new Static();
		
		System.out.println(Father.stFatherName);
		
		System.out.println(stName+ " Father's name is "+Father.stFatherName);
		
		Static.tvDisplay();
		
		Static display= new Static();
		
		
		System.out.println(display.stMotherName);
		
	display.TV();
	
		
		
		
			
		
		
		
		 
		
	}
	

}
