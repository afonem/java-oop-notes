package BütW_toStringCompa;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Inventory<T extends Product> {
	private List<T> items ;

	public Inventory() {
		
		this.items = new ArrayList<>();
	}
	public List<T> getItems() {
		return items;
	}
	public void setItems(List<T> items) {
		this.items = items;
	}
	public void addItem(T item) { 
		items.add(item);
	}

    
	public void printSorted() {
		 List<T> sorted = new ArrayList<>(items);
	    Collections.sort(sorted);
	    for (T item : sorted) {
	        System.out.println(item);
	    }
	}

    
    public List<T> filterByMaxPrice(double maxPrice) {  List<T> result = new ArrayList<>();
    for (T item : items) {
        if (item.price <= maxPrice) {
            result.add(item);
        }
    }
    return result;
}
   
    	
    

    
    public T cloneMostExpensive() {
    	T a =null;
    	for(T item:items) {
    		if(item.price>=a.price) {
    			a=item;
    		}
    		
    	}
    	return (T)a.clone();
    	
    }
    	
    }

	


