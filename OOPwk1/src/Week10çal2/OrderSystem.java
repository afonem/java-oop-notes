package Week10çal2;

import java.util.ArrayList;

public class OrderSystem {
	private ArrayList<Product> products = new ArrayList<>();
	public void addProduct(Product a) {
		products.add(a);
	}
	public Product foundById(int i) throws ProductNotFoundExceptions{
		for(Product a: products) {
			if(a.getId()==i) {
				return a;
			}
		}
			  throw new ProductNotFoundExceptions("yokkk");
			
			
		}
	
		
		
	}


