package has_a;

public class Police {
	
	private Gun gun;		// 인스턴스 변수로 gun을 가짐으로써, police가 gun을 상속없이 소유하게 됨.
	private String name;
	private int height;
	
	public Police(Gun gun, String name, int height) {
		this.gun = gun;
		this.name = name;
		this.height = height;
	}
	
	public void shoot() {
		gun.shoot();
	}
	
	public void showStatus() {
		System.out.println("소유총기 : " + gun);
		System.out.println("이름 : " + name);
		System.out.println("키 : " + height);
	}

}
