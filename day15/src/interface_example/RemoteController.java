package interface_example;

public interface RemoteController {
	
	// 최대 배터리랑 최소 배터리랑 상수로 지정
	
	int MAX_BATTERY = 100;
	int MIN_BATTERY = 0;
	
	// 리모컨이 갖는 !!필수 기능만!! 정의
	

	public void turnOn();
	public void turnOff();

}   
