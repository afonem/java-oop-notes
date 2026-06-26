package Quiz4;

public abstract class Employee {
	protected int id ;
	protected String name ;
	protected double baseSalary ;
	public Employee(int id, String name, double baseSalary) {
		
		this.id = id;
		this.name = name;
		this.baseSalary = baseSalary;
	}
	public abstract void disPlayInfo();
	

}
