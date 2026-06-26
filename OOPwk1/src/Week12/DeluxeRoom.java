package Week12;

public class DeluxeRoom extends Room implements IBookable {
	public Boolean isOccupied;

	public DeluxeRoom(int roomNumber, String type, double pricePerNight,Boolean isOccupied ) {
		super(roomNumber, type, pricePerNight);
		this.isOccupied=isOccupied;
		
	}

	@Override
	public boolean canBeBooked() {
		// TODO Auto-generated method stub
		return isOccupied;
	}

	@Override
	public void displayInfo() {
		System.out.println(roomNumber);
		System.out.println(type);
		System.out.println(pricePerNight);
		System.out.println(isOccupied);
	
		
		
	}

	@Override
	public double calculatePrice(int nights) {
		
		return pricePerNight*nights;
	}

}
