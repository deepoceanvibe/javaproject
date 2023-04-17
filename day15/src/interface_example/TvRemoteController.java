package interface_example;

public class TvRemoteController implements RemoteController{
	
	public final int inch;
	public int channel;
	
	public TvRemoteController(int inch) {
		this.inch = inch;
		this.channel = 1;
	}
		
	@Override
	public void turnOn() {
		System.out.println("Tv를 켭니다.");
	}
	
	@Override
	public void turnOff() {
		System.out.println("Tv를 끕니다.");
	}
	
	public void setChannelDown() {
		if(this.channel - 1 < 1) {
			this.channel = 1;
		} else {
			this.channel--;
		}
	
	}
	
	public void setChannel(int channel) {
		if(channel < 1) {
			this.channel = 1;
		} else {
			this.channel = channel;
		}
	}

}
