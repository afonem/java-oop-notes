package Week11çalışma_2;

public class Garage<T extends Vehicle > implements Servicable<T> {
           T vehicle;

		  @Override
		  public void performMaintenance(T vehicle) {
			if(vehicle instanceof Car) {
				System.out.println("car");
			}
			else {
				System.out.println("dnjvsk");
			}
			
		  }
}


