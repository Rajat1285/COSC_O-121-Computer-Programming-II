package e1;

public class Faculty extends Employee {
	
	
	private String officeHour;
	private String rank;
	
	
	//constructors 
	
	public Faculty() {}
	
	public Faculty(String name, String address, String phone, String email,String officeHour,String rank) {
		
		super(name,address,phone,email);
		setOfficeHour(officeHour);
		setRank(rank);
		
		
	}
	
	
	//Setters
	
	public void setOfficeHour(String officeHour) {this.officeHour=officeHour;}
	public void setRank(String rank) {this.rank=rank;}
	
	//Getters
	
	public String officeHour() {return this.officeHour;}
	public String rank() {return this.rank;}
	
	
	//methods
	
	public String toString() {
		
		return "Name :"+getName()+"Address :"+getAddress()+"Phone: "+getPhone()+"email: "+getEmail()+"Date Hired: "+getDateHired()+"office Hour: "+officeHour+"rank: "+rank;
		
	}
	
	

}
