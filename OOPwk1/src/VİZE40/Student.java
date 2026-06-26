package VİZE40;

import java.util.ArrayList;

public class Student extends Person{

	private ArrayList<Double> grade ;
	
	private double gpa ;
	private ArrayList<String> courses;
	public Student(String name, int grade) {
		super(name);
		this.grade = new ArrayList<>();
		this.courses = new ArrayList<>();
		
	}
	public double calculationGpa(ArrayList<Double> grades) {
		int a = grades.size();
		double toplam;
		if(grades.size()>0) {
			toplam = grades.get(grades.size()-1);
			grades.remove(grades.size()-1);
			return toplam + calculationGpa(grades);
		} else
			return 0;
		}
	
		
	
	
	public ArrayList<Double> getGrade() {
		return grade;
	}
	public void setGrade(ArrayList<Double> grade) {
		this.grade = grade;
	}
	public double getGpa() {
		return gpa;
	}
	public void setGpa(double gpa) {
		this.gpa = gpa;
	}
	public ArrayList<String> getCourses() {
		return courses;
	}
	public void setCourses(ArrayList<String> courses) {
		this.courses = courses;
	}
	@Override
	public void getInfo() {
		// TODO Auto-generated method stub
		super.getInfo();
		System.out.println("");
	}
	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return super.toString() + "  gpa: " ;
	}
	public void enrollCourse(String course) {
		boolean control = true;
		for(int i = 0;i<courses.size();i++) {
			if(courses.get(i).equals(course)) {
				System.out.println("there is alread the course");
				control = false;
				break;
			}
		}
		if(control==true) {
			courses.add(course);
			System.out.println("the course " +" "+ course + "  added" );
		}
	}
	

}
