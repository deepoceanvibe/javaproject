package example.this_car;

public class Car {

	public String model;
	public int speed;
	
	public Car(String model) {
		this.model = model;				// 인스턴스변수 model에 model(테슬라) 집어넣어라
		this.speed = 0;					// 인스턴스변수 speed 호출하고싶을때
	}
	
	void accel() {
		if(this.speed + 10 >= 150) {
			this.speed = 150;
		}else {
			this.speed += 10;
		}
	}
	
	void showStatus() {
		System.out.println("모델명 : " + this.model);
		System.out.println("현재속도 : " + this.speed);
	}
	
	
	
}
