package e1;

public class Student extends Person {
	
	//attributes
	private String status;
	
	
   //constructors
	
	public Student() {};
    
	public Student(String name, String address, String phone, String email , String status ) {
		
		super(name,address,phone,email);
		this.status=status;
		
		
		/* if we put this new code before super it will give us an error as the contructor call must be made 
		 * in the first statement.
		 */
		
		
	}
	
	//getters and setters 
	
	public void setStatus(String status) {
		
		this.status=status;
		
	}
	
	public String getStatus() {
		
		return status;
	}
	
	


	public String toString() {
		
		
        return "Name :"+getName()+"Address :"+getAddress()+"Phone: "+getPhone()+"email: "+getEmail()+"Status: "+status;
        
		
		
		
	}
	
	




}
