package POliWeek8;

public class tsxt {

	public static void main(String[] args) {
		Bike bk1 = new Bike("bs",35);
		Bus mst = new Bus("otosan",150);
		Car bmw = new Car("bmw",240);
		bmw.showInfo();
		bk1.move();
		mst.showInfo();
		mst.move();
		bmw.showInfo();
		bmw.move();

	}

}
