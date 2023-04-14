package example.super_;

public class SupersonicAirplane extends Airplane{
	
	public SupersonicAirplane(String planeCode) {
		super(planeCode);
	}
	
	@Override
	public void fly() {
		
		if(this.speed < 900) {
			super.fly();												// 부모쪽 fly 먼저 실행 후, (900이하)
			
		} else if(this.speed + 300 <= 2200 && this.gas >= 5) {			// 자식쪽 fly 실행 (900초과, 2200미만 가스 5이상)
			this.speed += 300;
			this.gas -= 5;
			
		} else if(this.speed + 300 >= 2200 && this.gas >= 5) {			// 자식쪽 fly 실행 (2200이상, 가스 5이상)
			this.speed = 2200;
			this.gas -= 5;
			
		} else {
			System.out.println("연료가 부족합니다.");
		}
			
	
	}
	
	@Override
	public void showStatus() {
		System.out.println("비행넘버는 " + planeCode + " 입니다.");
		System.out.println("비행속도는 " + speed + " 입니다.");
		System.out.println("비행연료는 " + gas + " 입니다.");
	}
	
	
	
	
}
