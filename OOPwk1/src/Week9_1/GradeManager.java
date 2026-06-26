package Week9_1;

import java.util.ArrayList;

public class GradeManager {
	private ArrayList<Integer> grades = new ArrayList<>();
	public void addGrade (int grade) {
		grades.add(grade);
		
	}
	public double calculateAverage() {
		if(grades.isEmpty()) {
			return 0;
		}
		int sum = 0;
		for(int g : grades) {
			sum+=g;
		}
		return (double)sum/grades.size();
	}
	public int getMax() {
		int max = grades.get(0);
		for(int g : grades) {
			if(g>max) max = g;
		}
		return max;
	}
	public int getMin() {
		int min = grades.get(0);
		for(int g : grades) {
			if(g<min)min = g;
		}
		return min;
	}
	public ArrayList<Integer>getGrades(){
		return grades;
	}

}
