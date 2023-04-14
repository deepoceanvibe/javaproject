package day05_1;

public class Method2 {
	/*
	 * 매개변수 (parameter)
	 * 메서드 호출시 불완전한 문장을 채워주기 위해 사용함
	 */
	
	public static void greet(String name) {				// 매개변수 
		System.out.println(name + "님 안녕하세요!");
	}
	
	public static void getThaiNumber() {
		System.out.println("능 : 1");
		System.out.println("썸 : 2");
		System.out.println("쌈 : 3");
		System.out.println("씨 : 4");
	}
	
	
	public static void main(String[] args) {
		/*
		 * 위 구문은 return 이 없으므로
		 * System.out.println(); 사이에 넣을 수 없다
		 * 메서드 종료 후 호출 위치로 전달할 값이 없기 때문.
		 */
	
		greet("유정원");
		getThaiNumber();
	}

}
