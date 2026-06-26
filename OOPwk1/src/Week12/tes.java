package Week12;

public class tes {

	public static void main(String[] args) {
		DeluxeRoom room1= new DeluxeRoom(111,"hsdf",250.0,false);
		Hotel<DeluxeRoom> hotel = new Hotel<>();
		hotel.listAll();
		hotel.showRoomPrices(0);

	}

}
