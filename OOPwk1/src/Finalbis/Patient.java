package Finalbis;

public abstract class Patient {
	protected int id;
	protected String name;
	protected double dailyRate;
	public Patient(int id, String name, double dailyRate) {
	
		this.id = id;
		this.name = name;
		this.dailyRate = dailyRate;
	}
	public abstract void disPlayInfo();
	
	
	

}
