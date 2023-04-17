package interface_example;

public class MainClass {
	public static void main(String[] args) {
		
		RemoteController rc = new RobotCleanerRemoteController("imou", "20만원");
		
		rc.turnOn();
		rc.turnOff();
		
		rc = new TvRemoteController(50);
		
		rc.turnOn();
		rc.turnOff();
	}

}
