package e3;

public class Dove extends Bird implements Flyable {
	
	public int age() {
		return 0;}
	
	
	public  Dove(int age) {
		
	 this.age=age;
		
	}
	
	
	public String howToFly() {
		
		
		 System.out.println("Dove's fly using wings!");
		 return null;
	}
	
	

}
