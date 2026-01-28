package e2;

public class Employee extends StaffMember {
	
	
	private String SIN;
	private double payRate;
	
	
	//getters and setters 
	
	public String getSIN() {
		return SIN;
	}
	public void setSIN(String sIN) {
		SIN = sIN;
	}
	public double getPayRate() {
		return payRate;
	}
	public void setPayRate(double payRate) {
		this.payRate = payRate;
	}

	
	public String toString() {
		
		return  "Address: "+getAddress()+"Name: "+getName()+"Phone: "+getPhone()+"SIN: "+getSIN()+"payRate: "+getPayRate();
		
		
		
		
		
	}
	
	
	public double pay() {
		
		System.out.println("Employee");
		return 5000;
		
	}
	
	
	
}
