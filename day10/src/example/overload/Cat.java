package example.overload;

public class Cat {
	
	public String kind;
	public String name;
	
	public Cat(String kind, String name) {
		this.kind = kind;
		this.name = name;
		System.out.println("지금부터 이 아이의 이름은 " + name + " 입니다");
	}
	
	public Cat() {
		kind = "품종 미입력";
		name = "이름 미입력";
	}
	
	public void call() {
		System.out.println("야옹아 이리와");
	}
	
	public void call(String name) {
		System.out.println(name + "아, 이리와");
	}
	
}
