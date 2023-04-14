package day06;

public class Assignment {
	// 머릿속에 메모리구조 그리면서 보기
	
	public static void getPow(int num) {
		int result = num * num;
		System.out.println("입력된 수 : " + num);
		System.out.println(num + "의 제곱수 : " + (num * num));
	}
	
	public static void getIntroduce() {
		System.out.println("네이버 클라우드 과정 6기 수업입니다.");
		System.out.println("기초 자바 진행중입니다.");
		System.out.println("메서드 파트를 진행중입니다.");
		
	}
	
	public static void logincheck(String id, int password) {
		if(password == 3306) {
			System.out.println(id + "님 환영합니다!");
		} else {
			System.out.println("비밀번호를 다시 확인해주세요.");
		}
	}
	
	

	public static void main(String[] args) {
		logincheck("asdf", 3306);
		logincheck("asdf", 1234);
		
		getIntroduce();
		
		getPow(59);
		
		
	}

}
