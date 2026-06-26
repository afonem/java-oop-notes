package Week10çalışma1;

public class Main {

	public static void main(String[] args) {
		Vehicle bmw = new Car(123222,"2011bmw",5);
Vehicle  ww = new Car(111205,"2021bmw",5);
		Car  byd = new Car(12002,"2021",5);
         Car audi = new Car(111122,"2025audi",5);
		RentalSystem a = new RentalSystem();
		a.addVehicle(audi);
		a.addVehicle(bmw);
		a.addVehicle(byd);
		a.addVehicle(ww);
		byd.rent();
		byd.rent();
		audi.rent();
		byd.returnVehicle();
		byd.rent();
		try {
			Vehicle found = a.findById(123222);
			Vehicle found2 = a.findById(12002);
			Vehicle found3 = a.findById(18605);
		}catch(VehicleNotFoundException e) {
			System.out.println(e.getMessage());
		}

	}

}
