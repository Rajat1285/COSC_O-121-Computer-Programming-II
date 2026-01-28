package e2;

public class Staff {
	 
  StaffMember[] arr = new StaffMember[6];
 
	
	
	
	

	
	
	
	public Staff() {
		

		
		arr[0]=new Employee();
		arr[1]=new StaffMember();
		arr[2]=new Volunteer();
		arr[3]=new Executive();
		arr[4]=new Hourly();
		arr[5]=new Volunteer();
		 
 
		
		
	}

	
	
 
	
	


public void payday() {
	
	for(int i =0;i<arr.length;i++) {
		
	 
		
		if(arr[i] instanceof Volunteer) {
			
			
			
			
			
			
			
		}
		
		else {
			
		
			
 arr[i].pay();
   
 
   
   
			
		}
		
		
		
		
	}
 
 
 


	
	

	

		
		
	}

}



