package poly.inheri;
import poly.inheri.Monster;

public class Magician extends Hero{

	public Magician(String name) {
		super(name, 20, 10, 2, 4, 0, 0);
		
	}
	
	@Override
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
			
			this.setMpAfterMonsterAttack(monster.getAtk());
			
			this.setHpAfterMonsterAttack(monster.getAtk());
			monster.showMonsterCounterAttackMessage(monster.getName());				

		}
		
		
	}
	
	
	
	

}	
