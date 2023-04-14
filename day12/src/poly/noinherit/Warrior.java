package poly.noinherit;

public class Warrior {

	private String id;
	private int hp;
	private int atk;
	private int def;
	private int exp;
	
	public Warrior(String id) {
		this.id = id;
		this.hp = 20;
		this.atk = 3;
		this.def = 1;
		this.exp = 0;
	}
	
	public void showStatus() {
		System.out.println("아이디 : " + this.id);
		System.out.println("체력 : " + this.hp);
		System.out.println("공격력 : " + this.atk);
		System.out.println("방어력 : " + this.def);
		System.out.println("획득경험치 : " + this.exp);
		System.out.println("--------------------");
	}
	
	public void huntRabbit(Rabbit rabbit) {					// rabbit -> *200	
		
		rabbit.setHp(rabbit.getHp() - this.atk);			
															
		if(rabbit.getHp() <= 0) {							// rabbit.setHp(3 - 3); -> setHp으로 가서 0 대입
			System.out.println("토끼를 죽였습니다.");
			this.exp += 5;
			
		} else {
		System.out.println("토끼를 사냥했습니다.");
		}
	}
	
	public void huntRat(Rat rat) {
		
		if(!rat.isRatActive()) {
			System.out.println("이 쥐는 죽어서, 죽일 수 없습니다.");
			return;
		} 
		
		if(!rat.isAttackedRatActive(atk)) {
			System.out.println("쥐를 죽였습니다.");
			this.exp += 80;
			
		} else {
			System.out.println("반격 당했습니다.");
			rat.setHp(rat.getHp() - this.atk);						
			this.hp -= rat.getAtk();
		}
	}
		
	public void huntPig(Pig pig) {
		
		if(!pig.isPigActive()) {
			System.out.println("이 돼지는 죽어서, 죽일 수 없습니다.");
			return;
		} 
		
		if(!pig.isAttackedPigActive(atk)) {
			System.out.println("돼지를 죽였습니다.");
			this.exp += 80;
			
		} else {
			System.out.println("반격 당했습니다.");
			pig.setHp(pig.getHp() - this.atk);						
			this.hp -= pig.getAtk();
		}
	}
	
	public void huntGhost(Ghost ghost) {
		
		if(!ghost.isGhostActive()) {
			System.out.println("이 귀신은 죽어서, 죽일 수 없습니다.");
			return;
		} 
		
		if(!ghost.isAttackedGhostActive(atk)) {
			System.out.println("귀신을 죽였습니다.");
			this.exp += 80;
			
		} else {
			System.out.println("반격 당했습니다.");
			ghost.setHp(ghost.getHp() - this.atk);						
			this.hp -= ghost.getAtk();
		}
	}
		

	}
