package e3;

import java.util.Arrays;

public class Test {

	public static void main(String[] args) throws CloneNotSupportedException {
		// TODO Auto-generated method stub
		
		
		//car object :
		
		
		Car[] arr = {new Car(1),new Car(2),new Car(3),new Car(4),new Car(5)};
		
		Arrays.sort(arr);
		
		
		for(Car k:arr) {
			
			System.out.println(k.year);
			
			
		}
		
		
		//Dove object 
		
		Dove d = new Dove(20);
		
		Dove cloneofd= (Dove)d.clone();
		
		
		
		System.out.println("Age of new clone:"+d.age);
		
		
		
		//Copter object 
		
		Copter cop = new Copter ();
		
		System.out.println(cop.year);
		
		
		

	}

}
