package Quiz2;

public class Student extends Person  {
	private int studentID;

	public Student(String name, int age, int studentID) {
		super(name, age);
		this.studentID = studentID;
		
	}

	public Student(String name, int studentID) {
		super(name);
		this.studentID = studentID;
		
	}

	public int getStudentID() {
		return studentID;
	}

	public void setStudentID(int studentID) {
		this.studentID = studentID;
	}

	@Override
	public void showInfo() {
		
		super.showInfo();
		System.out.println("ID:  " +this.studentID);
	}
	
	

}
