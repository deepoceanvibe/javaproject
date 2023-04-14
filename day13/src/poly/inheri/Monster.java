package poly.inheri;

public class Monster {
	
	private String name;
	private int hp;
	private int atk;
	private int def;
	private int exp;
	
	public Monster(String name, int hp, int atk, int def, int exp) {
		this.name = name;
		this.hp = hp;
		this.atk = atk;
		this.def = def;
		this.exp = exp;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getHp() {
		return hp;
	}

	public void setHp(int hp) {
		this.hp = hp;
	}

	public int getAtk() {
		return atk;
	}

	public void setAtk(int atk) {
		this.atk = atk;
	}

	public int getDef() {
		return def;
	}

	public void setDef(int def) {
		this.def = def;
	}

	public int getExp() {
		return exp;
	}

	public void setExp(int exp) {
		this.exp = exp;
	}
	
	public boolean isInactive() {					
		return hp <= 0 ? true : false;
	}
	
	public boolean isInactivAfterNext(int warriorAtk) {	
		return (hp - warriorAtk) <= 0 ? true : false;
	}
	
	public void setAfterAttackedHp(int warriorAtk) {	
		this.hp = this.hp - (warriorAtk - this.def); 
	}
	
	public void showMonsterAlreadyDeadMessage(String monsterName) {
		System.out.println("이 " + monsterName + "는(은) 죽어서 교전할 수 없습니다.");
	}
	
	public void showMonsterNowDeadMessage(String monsterName) {
		System.out.println("이 " + monsterName + "(이)가 죽었습니다.");
	}
	
	public void showMonsterCounterAttackMessage(String monsterName) {
		System.out.println("이 " + monsterName + "(이)가 반격했습니다.");
	}

}
