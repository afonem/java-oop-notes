package Week9_çalışma2task2;

import java.util.ArrayList;

public class ScoreManager {
	private ArrayList<Double> scores = new ArrayList<>();
	public void addScore(double a) throws ScoreException{
		if(a<0 || a >100) {
			throw new ScoreException(a);
		}
		else {
			scores.add(a);
			System.out.println("d");
		}
		
	}
	public double calculateAverage() {
		int a = scores.size();
		double toplam =0;
		for(double b: scores) {
			toplam+=b;
			
		}
		if(a!=0) {
		System.out.println(toplam/a); }
		else {
			System.out.println("there is not any score");
		}
		return toplam/a;
	}
	public double getMax() {
		double max = scores.get(0);
		for(double a : scores ) {
			if(a<=max) {
				max=a;
			}
		}
		return max;
	}
	public double getMin() {
		double min = scores.get(0);
		for(double a : scores ) {
			if(a>=min) {
				min=a;
			}
		}
		return min;
	}
	public ArrayList<Double> getScores() {
	    return scores;
	}


}
