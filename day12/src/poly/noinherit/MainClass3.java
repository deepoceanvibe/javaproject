package poly.noinherit;

public class MainClass3 {
	
	public static void main(String[] args) {
		
		Warrior warrior1 = new Warrior("쀼");
		Rat rat1 = new Rat();
		Rat rat2 = new Rat();
		
		warrior1.huntRat(rat1);
		warrior1.huntRat(rat1);
		warrior1.huntRat(rat1);
		
		warrior1.showStatus();
		
	}

}
