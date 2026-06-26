package Week10çal2;

public class Food extends Product implements Ordeable{
       private int calories;

	   public Food(int id, String name, double price, int calories) {
		super(id, name, price);
		this.calories = calories;
	   }

	   @Override
	   public void order() {
		// TODO Auto-generated method stub
		
	   }

	   @Override
	   public String getInfo() {
		// TODO Auto-generated method stub
		return "calories for this food " + this.calories;
	   }
}
