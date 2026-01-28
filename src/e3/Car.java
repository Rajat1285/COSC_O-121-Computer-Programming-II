package e3;

public class Car extends Vehicle implements Comparable<Car> {
	
	
	
	public Car(int year) {
		
	this.year=year;
		
		
	}

	@Override
	public int compareTo(Car o) {
 
		if(o.year>this.year) {
			
			return -1;
		}
		else return 1;
		
		
	}
	
 //*****very important logic to understand about Array sort of objects try shifting -1 and 1;
	

}
