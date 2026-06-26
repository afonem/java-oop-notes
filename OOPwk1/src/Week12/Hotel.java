package Week12;

import java.util.ArrayList;

public class Hotel<T extends Room>  {
	private ArrayList<T> rooms;

	public Hotel() {
		
		rooms= new ArrayList<>();
	}
	public void  addRoom(T room) {
		rooms.add(room);
	}
	public void listAll(){
		for(T room : rooms) {
			room.displayInfo();
		}
		
	}
	public void showRoomPrices(int nights) {
		for(T room : rooms) {
			System.out.println("room " + room.roomNumber + "prc "+ nights +"   " +  room.calculatePrice(nights));
		}
	}

}
