package poly.inherit;

public class MainClass {

	public static void main(String[] args) {
		
		Warrior w1 = new Warrior("햄찌뽕");
		Monster rat1 = new Rat();
		Monster rabbit1 = new Rabbit();
		
		w1.showStatus();
		
		w1.hunt(rabbit1);
		w1.showStatus();
		w1.hunt(rat1);
		w1.showStatus();
		w1.hunt(rat1);
		w1.showStatus();
		w1.hunt(rat1);
		w1.showStatus();


	}

}
