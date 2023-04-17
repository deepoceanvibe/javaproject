package static_singleton;

public class Singleton {
	// '객체 1개'만 만들어 전역에서 접근하도록 하는 패턴
	// 외부에서 생성자를 사용할 수 없도록 함.
	// 자신 클래스 내부에서 스스로 객체를 1개 생성함.
	// 외부에서 객체를 필요로 하는 경우 2번에서 static으로 생성된 객체의 주소를 return함
	
	private Singleton() {
		
	}
	
	private static Singleton instance;
	
	static {
		instance = new Singleton();
	}
	
	public static Singleton getInstatnce() {
		return instance;
	}

}
