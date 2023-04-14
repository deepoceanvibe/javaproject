package poly.inheri;

public class MainClass1 {

	public static void main(String[] args) {
		
		
		Hero m1 = new Magician("법사1	");
		Hero w1 = new Warrior("전사1");
		
		Monster rabbit1 = new Rabbit();
		Monster rat1 = new Rat();
		Monster rat2 = new Rat();
		

		m1.showStatus();
		m1.skill1(rat1);
		m1.showStatus();
		m1.skill1(rat1);
		m1.showStatus();
		m1.skill1(rat1);
		m1.showStatus();
		m1.skill1(rat2);
		m1.showStatus();
		m1.skill1(rat2);
		m1.showStatus();
		
	
		
	}

}
