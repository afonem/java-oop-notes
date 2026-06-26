package VİZE99;

import java.util.ArrayList;

public class Hospital {
	private String hospitalName;
	private ArrayList<Doctor> doctors;
	private ArrayList<Patient> patients;
	private ArrayList<Patient> waitgQueue;
	private ArrayList<Patient> dischargedPatients;
	public Hospital(String hospitalName) {
		this.hospitalName=hospitalName;
	    this.dischargedPatients = new ArrayList<Patient>();
	    this.doctors= new ArrayList<>();
	    this.waitgQueue=new ArrayList<>();
	    this.patients=new ArrayList<>();
	}

}
