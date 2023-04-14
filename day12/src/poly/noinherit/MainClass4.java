package poly.noinherit;

public class MainClass4 {

	public static void main(String[] args) {
		
		Warrior warrior1 = new Warrior("뀨");
		Magician magician1 = new Magician("햄지법사");
		
		
		Rat rat1 = new Rat();
		Pig pig1 = new Pig();
		Ghost ghost1 = new Ghost();
		
		
		magician1.showStatus();
		
		magician1.huntGhost(ghost1);
		magician1.showStatus();
		
		magician1.huntGhost(ghost1);
		magician1.showStatus();
		
		magician1.huntGhost(ghost1);
		magician1.showStatus();
		
		ghost1.showStatus();
		magician1.huntGhost(ghost1);
		magician1.showStatus();
		
		ghost1.showStatus();			// 여기서 왜 체력이 2로 고정?	
		magician1.huntGhost(ghost1);
		magician1.showStatus();
		
		ghost1.showStatus();
		magician1.huntGhost(ghost1);
		magician1.showStatus();

		
		

	}

}
