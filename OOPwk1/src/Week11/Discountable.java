package Week11;

public interface Discountable<T> {
	 void applyDiscount(T item , double rate);
	 double getDiscountedPrice(T item , double rate);
	

}
