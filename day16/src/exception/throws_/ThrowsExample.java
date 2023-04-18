package exception.throws_;

public class ThrowsExample {
	
	public static String[] greetings = {"안녕", "니하오", "헬로"};
	
	public static void greet(int idx) throws Exception {			// 메서드 호출로 예외 떠넘기기
		System.out.println(greetings[idx]);
	}
	
	public static void main(String[] args) {
			
		try {
			greet(3);
		} catch(Exception e) {
			e.printStackTrace();									// 예외 원인 찾을때 쓰는 메서드
		}
		System.out.println("프로그램 정상종료.");
		
		
		
		
		
	}

}
