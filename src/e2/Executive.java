package e2;

public class Executive extends Employee {

	private double bonus;

	public double getBonus() {
		return bonus;
	}

	public void setBonus(double bonus) {
		this.bonus = bonus;
	}
	
	
	
	public void awardBonus(double Bonus) {
		
		
		
		System.out.println(Bonus);

		
	}
	
	
	public String toString() {
		
		return  "Address: "+getAddress()+"Name: "+getName()+"Phone: "+getPhone()+"SIN: "+getSIN()+"payRate: "+getPayRate()
		+"Bonus: "+getBonus();
		
		
		
		
		
	}
	
	
	public double pay() {
		
		System.out.println("Executive");
		
		return 3000;
		
	}
}
