package Week11çalışm_1;


	public class Aquarium<T> implements Maintainable<T>{
		

		private T animal;

		public Aquarium(T animal) {
			this.animal= animal;
			
		}

		@Override
		public void feed(T animal) {
			if(animal instanceof Fish) {
				System.out.println("\"Balık yemi veriliyor\"");
			}
			else {
				System.out.println("marul verilecek");
			}
			
		}

		@Override
		public void checkStatus(T animal) {
			if(animal instanceof Fish) {
				System.out.println("fish habitat");
			}
			else {
				System.out.println("turtle habitat");
			}
			
			
			
		}

}
