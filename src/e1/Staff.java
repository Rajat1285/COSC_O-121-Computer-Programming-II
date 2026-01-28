package e1;

public class Staff extends Employee{
	
	//attributes
	private String title;
	

	//constructors
	

	public Staff() {}
    public Staff(String name, String address, String phone,String email,String title)	{
    	
    	
    	
    	 super(name,address,phone,email);
    	 setTitle(title);
    }
    
    
    //setters
    public void setTitle(String title) {this.title=title;}
    
    
    
    //getters
    public String getTitle() {return title;}
    
    
    
    //methods
    
    public String toString() {
    	
    	
    	return "Name :"+getName()+"Address :"+getAddress()+"Phone: "+getPhone()+"email: "+getEmail()+"Date Hired: "+getDateHired()+"title: "+title;
    }
    

}
