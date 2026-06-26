package vize12;

import java.util.ArrayList;

public class Race {
	private ArrayList<Animal> participant ;
	private int laps;
	public Race(int labs) {
		this.laps=labs;
		this.participant= new ArrayList<>();
	}
	public void addParticipant(Animal a) {
		participant.add(a);
		System.out.println("animals added");
	}
	public  void startRace(ArrayList<Animal> remaining, int currentLap) {
		if(currentLap!=laps) {
			
		for(int i = 0 ; remaining.size()>i;i++) {
		remaining.get(i).move();
		
	}
		}
		else {
			
			System.out.println("currentLap!=laps");
			return;
		}
		startRace(remaining,  currentLap + 1);
		
	}
	public ArrayList<Animal> getParticipant() {
		return participant;
	}
	public void setParticipant(ArrayList<Animal> participant) {
		this.participant = participant;
	}
	public void getParticipant(ArrayList<Animal> participant) {
		this.participant = participant;
	}
	public int getLaps() {
		return laps;
	}
	public void setLaps(int laps) {
		this.laps = laps;
	}
}
