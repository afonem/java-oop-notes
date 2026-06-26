package quiz3;

public abstract class Course {
	protected int id; 
	protected String name ;
	public Course(int id, String name) {
		super();
		this.id = id;
		this.name = name;
	}
	public abstract void displayInfo();

}
