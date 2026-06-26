package VİZE40;
import java.util.ArrayList;
public class School extends Person{
	private String schoolName;
	private   ArrayList<Teacher> teachers ;
	private ArrayList<Student> students ;
	public School(String name, String schoolName) {
		super(name);
		this.schoolName = schoolName;
		this.teachers = new ArrayList<>();
		this.students = new ArrayList<>();
	}
	public void printAllPersonnel() {
		ArrayList<Person> personel= new ArrayList<>();
		for(int i=0;i<teachers.size();i++) {
			personel.add(teachers.get(i));
		}
		for(int i =0; i<students.size();i++) {
			personel.add(students.get(i));
		}
		 for (Person p : personel) {
		        p.getInfo();
		    }
	}
	public String getSchoolName() {
		return schoolName;
	}
	public void setSchoolName(String schoolName) {
		this.schoolName = schoolName;
	}
	public ArrayList<Teacher> getTeachers() {
		return teachers;
	}
	public void setTeachers(ArrayList<Teacher> teachers) {
		this.teachers = teachers;
	}
	public ArrayList<Student> getStudents() {
		return students;
	}
	public void setStudents(ArrayList<Student> students) {
		this.students = students;
	}
	public void searchById(String id) {
		ArrayList<Person> personel = new ArrayList<>();
	    personel.addAll(teachers);
	    personel.addAll(students);
		for(Person p: personel) {
			if(p.getId().equals(id)) {
				p.getInfo();
			}else {
				System.out.println("there is not the id"); 
				
				
			}
		}
	}
	

}
/*printAllPersonnel() — POLYMORPHISM + DYNAMIC BINDING: ArrayList<Person>'a hem Teacher hem Student eklenir, döngüde p.getInfo() çağrılır, hangi getInfo()'nun çalışacağı runtime'da belli olur.
searchById(String id) — tüm personeli gezer, Person döner, bulamazsa null döner.
getDetailedInfo(String id) — searchById() çağırır, instanceof + casting ile Teacher mı Student mı kontrol eder, Teacher ise findTopStudent() çağrılır, Student ise dersleri listelenir.
assignStudentsToTeachers(ArrayList<Student> unassigned, int attempt) — RECURSIVE: bekleyen öğrencileri öğretmenlere atar, base case 1: liste boş, base case 2: attempt > 3, her turda atanamayan öğrencilerle kendini çağırır.
*/