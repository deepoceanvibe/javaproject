package poly.noinherit;

public class Ghost {

	private int hp;
	private int atk;
	private int def;
	
	public Ghost() {
		this.hp = 10;
		this.atk = 5;
		this.def = 0;
	}
	
	public void showStatus() {
		
		System.out.println("귀신");
		System.out.println("체력 : " + this.hp);
		System.out.println("공격력 : " + this.atk);
		System.out.println("방어력 : " + this.def);
		System.out.println("--------------------");
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
	
	public boolean isGhostActive() {					// 몬스터 사망여부를 체크해주는 getter
		return hp >= 0 ? true : false;
	}
	
	public boolean isAttackedGhostActive(int userAtk) {	// 공격받은 몬스터 사망여부를 체크해주는 getter
		return (hp - userAtk) > 0? true : false;
	}

}
