package Finalcomparea;

import java.util.ArrayList;

import java.util.Collections;

public class main {

	public static void main(String[] args) {
		EBook e1 = new EBook(1, "Clean Code", 250.0, 5.4);
		EBook e2 = new EBook(2, "Effective Java", 180.0, 3.2);
		EBook e3 = new EBook(3, "Design Patterns", 320.0, 7.1);
		e1.applyDiscount(0.9);
		System.out.println(e1.isReserved()); // false
		e1.reserve();
		System.out.println(e1.isReserved()); // true
		EBook kopya = e2.clone();
		ArrayList<EBook> liste = new ArrayList<>();
		liste.add(e1);
		liste.add(e2);
		liste.add(e3);
		Collections.sort(liste);
		Library<EBook> kutuphane = new Library<>("Ankara Kütüphanesi");
		kutuphane.add(e1);
		kutuphane.add(e2);
		kutuphane.add(e3);
		kutuphane.listAll();

		EBook bulunan = kutuphane.findId(2);
		if (bulunan != null) bulunan.displayInfo();
		

	}

}
