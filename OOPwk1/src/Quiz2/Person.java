package Quiz2;

public class Person {
	private String name;
	private int age;
	public Person(String name, int age) {
		
		this.name = name;
		this.age = age;
	}
	public Person(String name) {
		
		this.name = name;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getAge() {
		return  18;
	}
	public void setAge(int age) {
		this.age = 18;
	}
	public void showInfo() {
		System.out.println("Student name = " + this.name + "  student age :  " + this.age);
	}
	
	

}
