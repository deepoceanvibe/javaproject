package day08;

public class BasketballPlayerMain {

	public static void main(String[] args) {
		
		BasketballPlayer p1 = new BasketballPlayer("강백호", 187, 18, 2600);
		BasketballPlayer p2 = new BasketballPlayer("채치수", 197, 19, 3200);
		
		
		p1.showInfo();
		p1.dunkShoot();
			
		p2.showInfo();
		p2.dunkShoot();
		
		
				
	}

}
