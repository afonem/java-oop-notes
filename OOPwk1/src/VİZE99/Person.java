package VİZE99;

import java.util.ArrayList;

public class Person {
	private int age;
	private String id;
	private String name ;
	private java.util.Date dateRegistered;
	private ArrayList<String> contactHistory;
	public Person(String name ,int age) {
		this.contactHistory=new ArrayList<>();
		this.age=age;
		this.name=name;
		this.id = "P" + System.currentTimeMillis();
		this.dateRegistered = new java.util.Date();
		
	}
	public void addcontacHistory (String note) {
		contactHistory.add(note);
	}
	public void getInfo() {
		System.out.println("Person age: " + this.age + " \n" + "Person name:  "+this.name);
		
	}
	public void addContact(String note ) {
		this.contactHistory.add(note);
		
	}
	public void getContactHistory() {
		for (int i = 0 ; i<contactHistory.size();i++) {
			System.out.println(this.name + "  " + contactHistory.get(i));
		}
	}
	public boolean equals(Object o) {
        if (o instanceof Person) {
            Person other = (Person) o;
            return this.id.equals(other.id);
        }
        return false;
    }
	public String toString() {
		return "ID" + id + "      Name: "+ name + "Age:  "+ age + "Date of contact : " + this.dateRegistered;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	public String getId() {
		return id;
	}
	public void setId(String id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public java.util.Date getDateRegistered() {
		return dateRegistered;
	}
	public void setDateRegistered(java.util.Date dateRegistered) {
		this.dateRegistered = dateRegistered;
	}
	public void setContactHistory(ArrayList<String> contactHistory) {
		this.contactHistory = contactHistory;
	}
	

}
