package e2;
 

public class Hourly extends Employee {
	
	
	
	
	
	
	private int hoursWorked;

	public int getHoursWorked() {
		return hoursWorked;
	}

	public void setHoursWorked(int hoursWorked) {
		this.hoursWorked = hoursWorked;
	}
	
	
	
	public void addHours(int moreHours) 
	
{
		
setHoursWorked(getHoursWorked()+moreHours);

}
	
	
public String toString() {
		
		return  "Address: "+getAddress()+"Name: "+getName()+"Phone: "+getPhone()+"SIN: "+getSIN()+"payRate: "+getPayRate()
		 +"Hours Worked: "+getHoursWorked();
		
		
		
		
		
		
	}
	
	
	public double pay() {
		
		System.out.println("Hourly");
		return 3000;
		
	}
	
 }
	


