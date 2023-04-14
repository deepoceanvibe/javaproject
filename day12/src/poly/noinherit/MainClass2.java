package poly.noinherit;

public class MainClass2 {

	public static void main(String[] args) {
		
		Rabbit rabbit1 = new Rabbit();
		Rabbit rabbit2 = new Rabbit();
		Warrior warrior1 = new Warrior("햄찌1");
		
		warrior1.huntRabbit(rabbit2);			// *200 정보 넘김
		warrior1.showStatus();

	}

}
