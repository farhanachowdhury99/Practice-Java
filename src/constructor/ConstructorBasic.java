package constructor;

public class ConstructorBasic {
	
	String name;
	int age;
	int score;
	String address;
	
	ConstructorBasic(){
		
		
	}
	
	
	ConstructorBasic(String name, int age, int score, String address){
		this.name=name;
		this.age=age;
		this.score=score;
		this.address=address;
		
	System.out.println("Student name is "+name+ " age is "+age+ " received score of "+score+ " and recides on "+address);
	
		
					
		
	}
	
	public static void main (String[] args) {
		
		ConstructorBasic basic=new ConstructorBasic("Farhana", 20, 100, "Michigan");
		
		
		
		
		
		
	}

}
