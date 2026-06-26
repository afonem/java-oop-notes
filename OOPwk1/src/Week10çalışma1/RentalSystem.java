package Week10çalışma1;

import java.util.ArrayList;

public class RentalSystem {
	private ArrayList<Vehicle> vehicles = new ArrayList<>();
    public void addVehicle(Vehicle v) {
    	vehicles.add(v);
    }
    public void listVehicles() {
    	for(Vehicle a:vehicles) {
    		a.getInfo();
    	}
    }
    public Vehicle findById(int id) throws  VehicleNotFoundException {
    	for(Vehicle a : vehicles) {
    		if(a.getId()==id) {
    			return a;
    		}
    	}
		throw new VehicleNotFoundException("notfindacar");
    	
    }
}
