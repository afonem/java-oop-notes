package Week12;

public  abstract class  Room {
	protected int roomNumber;
	protected String type;
	protected double pricePerNight;
	public Room(int roomNumber, String type, double pricePerNight) {
	
		this.roomNumber = roomNumber;
		this.type = type;
		this.pricePerNight = pricePerNight;
	}
	public abstract void displayInfo();
	public abstract double calculatePrice(int nights);
	

}
