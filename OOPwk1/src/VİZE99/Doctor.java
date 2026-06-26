package VİZE99;

import java.util.ArrayList;

public class Doctor extends Person {
	private String specialty;
	private ArrayList<Patient> patients;
	private int experienceYears;
	private boolean isAvaible;
	private int maxPatientLoad;
	public Doctor (String name , int age, String specialty, int experienceYears,int maxPatientLoad) {
		super(name,age);
		this.experienceYears=experienceYears;
		this.specialty=specialty;
		this.maxPatientLoad=maxPatientLoad;
		this.patients = new ArrayList<>();
		
	}
	

}
