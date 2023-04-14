package poly.noinherit;

public class Pig {
	private int hp;
	private int atk;
	private int def;
	
	public Pig() {
		this.hp = 8;
		this.atk = 3;
		this.def = 0;
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
	
	public boolean isPigActive() {					// 몬스터 사망여부를 체크해주는 getter
		return hp >= 0 ? true : false;
	}
	
	public boolean isAttackedPigActive(int userAtk) {	// 공격받은 몬스터 사망여부를 체크해주는 getter
		return (hp - userAtk) > 0? true : false;
	}

}


