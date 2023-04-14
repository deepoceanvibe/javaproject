package example.this_human;

public class HumanMain {

	public static void main(String[] args) {
		
		Human h1 = new Human("김인간", 20);
		h1.showInfo();
		
		Human h2 = new Human("이사람");
		h2.showInfo();
		
		Human noname = new Human();
		noname.showInfo();

	}

}
