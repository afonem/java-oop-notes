package Week10çalışma1;

public class Car extends Vehicle implements Rentable {
	
		
		
	@Override
	public void rent() {
	    if (isRented) {
	        System.out.println("the car already rended!");
	    } else {
	    	System.out.println("rented");
	        isRented = true;
	    }
	}

	@Override
	public void returnVehicle() {
		if(isRented==false) {
			isRented=true;
		}else {
			isRented=false;
		}
		
		
	}

	private int doors;

	public Car(int id, String brand, int doors) {
		super(id, brand);
		this.doors = doors;
	}

	@Override
	public String getInfo() {
		
		return "1998 ww";
	}
	

}
