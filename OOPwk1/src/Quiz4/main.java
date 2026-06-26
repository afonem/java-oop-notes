package Quiz4;

public class main {

	public static void main(String[] args) {
	FUllTimeEmployee elaman1 = new FUllTimeEmployee(1000,"ali",122.0,6,5);
	FUllTimeEmployee elaman2 = new FUllTimeEmployee(1000,"veli",122,6,4);
	Department<FUllTimeEmployee>department = new Department<>();
	department.addEmployee(elaman2);
	department.addEmployee(elaman1);
	department.listAll();

	}

}
