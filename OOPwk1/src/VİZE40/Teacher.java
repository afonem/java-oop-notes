package VİZE40;

import java.util.ArrayList;

public class Teacher extends Person {
	private int maxStudents;
	private ArrayList<Student> students;
	private String subject;
	public Teacher(String name, int maxStudents, String subject) {
		super(name);
		this.students = new ArrayList<Student>();
		this.maxStudents = maxStudents;
		this.subject = subject;
	}
	public void addStudent(Student a) {
	    for(int i = 0; i < students.size(); i++) {
	        if(students.get(i).equals(a)) {
	            System.out.println("Student has already added");
	            return;
	        }
	    }
	    // Döngü bittikten SONRA kontrol et
	    if(students.size() < maxStudents) {
	        students.add(a);
	        System.out.println("done");
	    } else {
	        System.out.println("Teacher max capacity reached");
	    }
	}
	@Override
	public void getInfo() {
		// TODO Auto-generated method stub
		super.getInfo();
		System.out.println(maxStudents+ "  doluluk yüzdesi" + (students.size()/maxStudents)*100);
	}
	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return super.toString() + " " + subject;
	}
	public Student findTopStudent(ArrayList<Student> remaining, Student bestSoFar) {

	    // BASE CASE — liste boş, en iyiyi döndür
	    if (remaining.isEmpty()) {
	        return bestSoFar;
	    }

	    // Son elemanı al
	    Student current = remaining.get(remaining.size() - 1);
	    remaining.remove(remaining.size() - 1);

	    // Gpa'ları karşılaştır
	    double currentGpa = current.calculationGpa(current.getGrade());
	    double bestGpa = (bestSoFar == null) ? -1 : bestSoFar.calculationGpa(bestSoFar.getGrade());

	    // Daha iyiyse güncelle
	    Student newBest;
	    if (currentGpa > bestGpa) {
	        newBest = current;
	    } else {
	        newBest = bestSoFar;
	    }

	    // Recursive çağrı
	    return findTopStudent(remaining, newBest);
	}
	public int getMaxStudents() {
		return maxStudents;
	}
	public void setMaxStudents(int maxStudents) {
		this.maxStudents = maxStudents;
	}
	public ArrayList<Student> getStudents() {
		return students;
	}
	public void setStudents(ArrayList<Student> students) {
		this.students = students;
	}
	public String getSubject() {
		return subject;
	}
	public void setSubject(String subject) {
		this.subject = subject;
	}
}
