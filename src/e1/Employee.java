package e1;
import java.util.Date; 
 

public class Employee extends Person{
	
	//attributes
	private String office;
	private int salary;
	private  Date dateHired;
	
	
	
	//Constructors 
	
	
	/*
	 * we need this so that Faculty and Staff class can call this to initialize 
	 * this parent class with the default values 
	 * when they cannot call the constructor with 
	 * parameters 
	*/
	
	
	public Employee() {}
	
	public Employee(String name, String address, String phone,String email) {
		
     super(name,address,phone,email);
		
		
		
	}
	
	//Ans 4 
	public Employee(String name, String address, String phone,String email,String office,int salary,Date dateHired) {
		
	     super(name,address,phone,email);
			setOffice(office);
			setSalary(salary);
			setDateHired(dateHired);
			
			
		}
	
	//setters 
	
	public void setOffice(String office) {this.office=office;}
	public void setSalary(int salary) {this.salary=salary;}
	public void setDateHired(Date dateHired) {this.dateHired=dateHired;}
	
	//getters
	
	public String getOffice() {return office;}
	public int getSalary() {return salary;}
	public Date getDateHired() {return dateHired;}
	

	//methods 
	
	public String toString() {
		
		   return "Name :"+getName()+"Address :"+getAddress()+"Phone: "+getPhone()+"email: "+getEmail()+"Date Hired: "+dateHired;
		
	}
	
	
	

}
