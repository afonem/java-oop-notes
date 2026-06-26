package Finalbis;

public class main {

	public static void main(String[] args) {
		Patient a = new InPatient(5,"ad",5.5,3,9.6);
		
		InPatient hasta1= (InPatient)a;
		hasta1.disPlayInfo();

	}

}
