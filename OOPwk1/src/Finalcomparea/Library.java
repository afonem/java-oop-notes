package Finalcomparea;

import java.util.ArrayList;

public class Library<T extends Book> {
	private String name;
	private ArrayList<T> books;
	public Library(String name) {
		this.name= name;
		this.books= new ArrayList<>();
	}
	public void add(T book) {
		books.add(book);
	}
	public T findId(int id) {
		for(T a : books) {
			if(a.getId()==id) {
				System.out.println("this id = " + a);
				return a ;
				
			}
		}
		System.out.println("bulunamadı hata");return null;
		
	}
	public void listAll() {
		for(T a : books) {
			a.displayInfo();
		}
	}
	

}
