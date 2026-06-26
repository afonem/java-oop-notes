package Finalbis;

import java.util.ArrayList;

public class Ward <T extends Patient>{
	private ArrayList<T> patients;
	public Ward() {
		this.patients= new ArrayList<>();
	}
	public void addPatient(T patient) {
	 patients.add(patient);
	}
	public void listAll() {
		for(T a:patients) {
		a.disPlayInfo();
			
		}
	}
	

}
