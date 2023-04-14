package example.super_;

public class Airplane {
	
	public String planeCode;
	public int speed;
	public int gas;
	
	public Airplane(String planeCode) {
		this.planeCode = planeCode;
		this.speed = 0;
		this.gas = 100;
	}
	
	public void fly() {
		if(this.speed + 100 >= 900) {
			this.speed = 900;
			this.gas -= 3;
			return;
		}
		if(this.gas - 3 < 0) {
			System.out.println("연료 부족으로 가속 불가능.");
			return;
		}
		this.speed += 100;
		this.gas -= 3;
	}
	
	public void showStatus() {
		System.out.println("비행넘버는 " + planeCode + " 입니다.");
		System.out.println("비행속도는 " + speed + " 입니다.");
		System.out.println("비행연료는 " + gas + " 입니다.");
	}

}
