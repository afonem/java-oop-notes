package Quiz4;

import java.util.ArrayList;

public class Department<T extends Employee>   {
	private ArrayList<T> employee;
	public void addEmployee(T employe) {
		employee.add(employe);
		
	}
	public void listAll() {
		for(T employe:employee) {
			System.out.println(employe);
			
		}
	}
	public double getTotalSalary() {
		return 0;
	}
	public Department() {
		
		employee = new ArrayList<>();
	}
	
	

}
