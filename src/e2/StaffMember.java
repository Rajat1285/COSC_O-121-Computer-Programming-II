package e2;

public class StaffMember {

	
	private String name,address,phone;
	
	

	public String getPhone() {
		return phone;
	}

	public void setPhone(String phone) {
		this.phone = phone;
	}

	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}
	
	
	
	
   //Methods 
	
 @Override
 
	public  String toString() {
		
		return  "Address: "+getAddress()+"Name: "+getName()+"Phone: "+getPhone();
		
		
		
		
	}
	

	public double pay() {
		System.out.println("StaffMember");
		return 10000;

	 
	}
	
	
}
