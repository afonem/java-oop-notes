package VİZE40;



public class Person {
	private String name ;
	private String id ;
	private java.util.Date dateRegistered;
	public Person(String name ) {
		this.dateRegistered = new java.util.Date();
		this.id= "P" + System.currentTimeMillis();
		this.name= name;
		
	}
	public void getInfo() {
		System.out.println(name + "ID: "+ this.id+ "date of contact :  " + this.dateRegistered);
	}
	public String toString() {
		return name + "  id: "+ this.id;
	}
	public boolean equals(Object o) {
        if (o instanceof Person) {
            Person other = (Person) o;
            return this.id.equals(other.id);
        }
        return false;
    }
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getId() {
		return id;
	}
	public void setId(String id) {
		this.id = id;
	}
	public java.util.Date getDateRegistered() {
		return dateRegistered;
	}
	public void setDateRegistered(java.util.Date dateRegistered) {
		this.dateRegistered = dateRegistered;
	}

}
