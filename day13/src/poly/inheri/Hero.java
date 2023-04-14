package poly.inheri;

import poly.inheri.Monster;

public class Hero {
	private String name;
	private int hp;
	protected int mp;
	private int atk;
	protected int s1atk;
	private int def;
	private int exp;
	
	public Hero(String name, int hp, int mp, int atk, int s1atk, int def, int exp) {
		this.name = name;
		this.hp = hp;
		this.mp = mp;
		this.atk = atk;
		this.s1atk = s1atk;
		this.def = def;
		this.exp = exp;
		}
	
	public void showStatus() {
		System.out.println("아이디 : " + this.name);
		System.out.println("체력 : " + this.hp);
		System.out.println("마력 : " + this.mp);
		System.out.println("공격력 : " + this.atk);
		System.out.println("스킬1공격력 : " + this.s1atk);
		System.out.println("방어력 : " + this.def);
		System.out.println("획득경험치 : " + this.exp);
		System.out.println("--------------------");
	}
	
	public void hunt(Monster monster) {
		if(monster.isInactive()) {
			monster.showMonsterAlreadyDeadMessage(monster.getName());
			return;
		} 
		
		if(monster.isInactivAfterNext(this.atk)) {
			monster.setAfterAttackedHp(this.atk);
			this.gainMonsterExp(monster.getExp());
			monster.showMonsterNowDeadMessage(monster.getName()); 
			
			
		} else {
			monster.setAfterAttackedHp(this.atk);
			this.setHpAfterMonsterAttack(monster.getAtk());
			monster.showMonsterCounterAttackMessage(monster.getName());				

		}
		
		
	}
	
	public void skill1(Monster monster) {
		if(monster.isInactive()) {
			monster.showMonsterAlreadyDeadMessage(monster.getName());
			return;
		} 
		
		if(monster.isInactivAfterNext(this.s1atk)) {
			monster.setAfterAttackedHp(this.s1atk);
			this.gainMonsterExp(monster.getExp());
			monster.showMonsterNowDeadMessage(monster.getName()); 
			
			
		} else {
			monster.setAfterAttackedHp(this.s1atk);
			this.setHpAfterMonsterAttack(monster.getAtk());
			monster.showMonsterCounterAttackMessage(monster.getName());				

		}
		
		
	}
		
		

	public int getS1atk() {
		return s1atk;
	}

	public void setS1atk(int s1atk) {
		this.s1atk = atk * 2;
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
	

	public int getMp() {
		return mp;
	}

	public void setMp(int mp) {
		this.mp = mp;
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
	
	public void gainMonsterExp(int monsterExp) {
		this.exp += monsterExp;
	}
	
	public void setHpAfterMonsterAttack(int monsterAtk) {
		if(monsterAtk == 0) {
			return;
		} else if(monsterAtk > 0 && monsterAtk < this.def) {
			this.hp -= (this.def - monsterAtk);
		} else {
			this.hp -= (monsterAtk - this.def);
		}
	}
		
		public void setMpAfterMonsterAttack(int monsterAtk) {
			if(this.mp < this.s1atk) {
				return;
				
			} else {
			this.mp = (this.mp - this.s1atk);
			}
	}
		
		
}
