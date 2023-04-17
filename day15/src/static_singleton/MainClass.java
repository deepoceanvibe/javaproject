package static_singleton;

public class MainClass {

	public static void main(String[] args) {
		// Singleton 객체는 생성자가 private 이므로 "인스턴스 생성 불가" !!!
		
		Singleton s1 = Singleton.getInstatnce();
		System.out.println("s1의 주소 : " + s1);
		
		Singleton s2 = Singleton.getInstatnce();
		System.out.println("s2의 주소 : " + s2);
		
		
	}

}
