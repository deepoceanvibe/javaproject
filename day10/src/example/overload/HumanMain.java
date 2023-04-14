package example.overload;

public class HumanMain {

	public static void main(String[] args) {
		Human h1 = new Human();
		System.out.println(h1.name);
		System.out.println(h1.age);
		
		Human h2 = new Human("김휴먼", 25);
		System.out.println(h2.name);
		System.out.println(h2.age);

	}

}
