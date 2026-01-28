package e1;

public class Person {
	
	//attributes
	private String name;
	private String address;
	private String phone;
	private String email;
	
	//Q6
	
	private static int count=0;
	
	
	//constructor 
	public Person() {
		
		count++;
		
		
		
	}
	
	public Person(String name,String address, String phone, String email) {
		
		this();
		setName(name);
		setAddress(address);
		setPhone(phone);
		
		setEmail(email);
		
		
		
		
		
	}
	
	
	//setters 
	
	public void setName(String name) {this.name=name;}
	public void setAddress(String address) {this.address=address;}
	public void setPhone(String phone) {this.phone=phone;}
	public void setEmail(String email) {this.email=email;}
	
	//getters
	
	public String getName() {return this.name;}
	public String getAddress() {return this.address;}
	public String getPhone() {return this.phone;}
	public String getEmail() {return this.email;}
	
	
	//methods
	
//	public String toString() {return "Name :"+name+"Address :"+address+"Phone: "+phone+"email: "+email;}
	
	
	public static int getCount() {return count;}
	
	
	
	
	

}
