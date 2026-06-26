package VİZE99;

import java.util.ArrayList;

public class Patient extends Person{
	
	private String diagnosis;
	private int severity;
	private ArrayList<String> treatmentLog;
	private Doctor assignedDoctor;
	private boolean isHospitalized;
	private int waitigDays;
	public Patient(String name, int age ,String diagnosis,int severity) {
		super(name,age);
		this.diagnosis=diagnosis;
		this.severity=severity;
	}
	@Override
	public void getInfo() {
		// TODO Auto-generated method stub
		super.getInfo();
		
	}
	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return super.toString();
	}
	

}
