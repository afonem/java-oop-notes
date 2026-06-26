package Finalcomparea;

public class EBook extends Book implements IReservable,Cloneable,Comparable<EBook>{
     private double fileSize;
     private boolean reserrved;
	public EBook(int id, String title, double price, double fileSize) {
		super(id, title, price);
		this.fileSize = fileSize;
		
	}

	@Override
	
	public boolean isReserved() {
	    return reserrved;
	}
		
		
	

	@Override
	public void reserve() {
	if ( this.reserrved==true) {
		System.out.println("already reserrved");
	}
	else {
		this.reserrved=true;
		System.out.println("tamamdır");
	}
		
		
	}

	@Override
	public void displayInfo() {
		System.out.println(this.fileSize);
		System.out.println(this.id);
		System.out.println(this.price);
		System.out.println(this.title);
		
	}

	@Override
	public int compareTo(EBook o) {
		return Double.compare(this.price, o.getPrice());
	}
	@Override
	public EBook clone() {
	    try {
	        return (EBook) super.clone();
	    } catch (CloneNotSupportedException e) {
	        System.out.println("Kopyalama başarısız.");
	        return null;
	    }
	}
	
	
		
	

}
