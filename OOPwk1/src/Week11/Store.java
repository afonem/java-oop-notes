package Week11;

public class Store <T extends Product> implements Discountable<T>{
	

	
	

	@Override
	public void applyDiscount(T item, double rate) {
		double discounted=getDiscountedPrice(item,rate);
		item.setPrice(discounted);
		System.out.println("discount applied new price ===  " + discounted );
		
		
	}

	@Override
	public double getDiscountedPrice(T item, double rate) {
		// TODO Auto-generated method stub

		return item.getPrice()*(1-rate/100);
	}

}