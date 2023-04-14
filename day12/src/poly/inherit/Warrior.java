package poly.inherit;

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
	
	public void hunt(Monster monster) {
		if(monster.isInActive()) {
			System.out.println(monster.getName() + "은(는) 죽어서, 죽일 수 없습니다.");
			return;
		} 
		
		if(monster.isAttackedInActive(atk)) {
			monster.setAfterAttackedHp(this.atk);
			System.out.println(monster.getName() + "을(를) 죽였습니다.");
			this.exp += monster.getExp();
			
		} else {
			monster.setHp(monster.getHp() - this.atk);	
			System.out.println(monster.getName() + "에게 반격 당했습니다.");					
			this.hp -= monster.getAtk();
		}
		
		
	}
	
}