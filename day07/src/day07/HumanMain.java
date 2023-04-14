package day07;

public class HumanMain {

	public static void main(String[] args) {
		
		Human h1 = new Human();
		h1.name = "유정원";
		h1.age = 25;
		h1.height = 160;
		
		System.out.println("사람 1의 이름 : " + h1.name);
				
		Human h2 = new Human();
		h2.name = "이준규";
		h2.age = 25;
		h2.height = 173;
		
		System.out.println("사람 2의 키 : " + h2.height);

	}

}
