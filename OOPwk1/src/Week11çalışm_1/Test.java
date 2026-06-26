package Week11çalışm_1;

public class Test {

	public static void main(String[] args) {
		Fish memo = new Fish("memo");
		Aquarium<Fish> aqua = new Aquarium<>(memo);
		aqua.feed(memo);
				

	}

}
