package vize12;

public class text {

	public static void main(String[] args) {
		Animal a = new Horse("at", 70,100);
		Dog d = new Dog("köps",55,99);
		Horse a2 = new Horse("addd",75,65);
		Animal d2 = new Dog("akaal",60,100);
		
		Race race1 = new Race(6);
		race1.addParticipant(a);
		race1.addParticipant(d);
		race1.addParticipant(a2);
		race1.addParticipant(d2);
		d.toString();
		race1.startRace(race1.getParticipant(), 0);
		

	}

	
		
		
	}


