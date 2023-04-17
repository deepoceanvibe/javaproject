package has_a;

public class MainClass {

	public static void main(String[] args) {
		
		Gun gun = new Gun("M-16", "369486");
		
		Police police = new Police(gun, "나경찰", 180);
		
		police.shoot();
		police.shoot();
		police.shoot();
		police.shoot();
		police.shoot();
		police.shoot();
		
	}

}
