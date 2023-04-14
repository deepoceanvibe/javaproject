package day08;

public class Car {
	
	public String modelName;
	public int maxPassengers;
	public int currentSpeed;
	public String owner;
	public int gas;
	
	public final static int BOOST_SPEED = 10;
	public final static int BREAK_SPEED = 10;
	
	public Car(String mN, int mP, int cS, String own, int g) {
		modelName = mN;
		maxPassengers = mP;
		currentSpeed = cS;
		owner = own;
		gas = g;
	}

	
	public void accelerate() {
		currentSpeed += BOOST_SPEED;
	}
	
	public void break_() {
		currentSpeed -= BREAK_SPEED;
	}
	
	public void showStatus() {
		System.out.println("차종 : " + modelName);
		System.out.println("최대 승객  : " + maxPassengers);
		System.out.println("현재속도 : " + currentSpeed);
		System.out.println("차주 : " + owner);
		System.out.println("연료량 : " + gas);
	}

}
