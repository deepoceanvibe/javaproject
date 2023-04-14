package day07;

public class Method3 {
	// 머릿속에 메모리구조 그리면서 보기
	
	/*
	 * 반환유형 (리턴타입)
	 * 
	 * 1. 반환값은 메서드를 호출한 곳으로 전달해주는 return 구문 우측 값
	 * 2. 매개변수는 여러 값을 받을 수 있지만, 반환값은 하나여야 함
	 * 3. return 키워드를 이용해 반환값을 지정할 수 있음
	 * 4. 전달할 반환값의 자료형을 반환유형이라고 함
	 * 5. 반환값이 있는 메서드는 호출문 위치에 하나의 값이 전달되기 때문에 매직넘버 대신 사용 가능
	 * 6. 반환값이 없는 메서드는 void를 기입, 이때 return 구문을 쓰지 않아도 됨
	 * 7. 모든 메서드는 return을 만나는 순간 즉시 종료됨 분기가 아닌 return 구문 하단에는 추가 코드를 작성하면 경고
	 * 
	 */
	
	public static int add(int n1, int n2) {
		return n1 + n2;
	}
	
	public static void callMyName(String name) {
		if(name.length() < 2) {
			System.out.println("이름은 최소 2글자 이상 입력해야 합니다.");
			return;
		}
		System.out.println("내 이름은 " + name + " 입니다.");
	}
	
	
	public static int[] totalOperate(int n1, int n2) {
		int[] total = {n1+n2, n1-n2, n1*n2, n1/n2};
		return total;
	}
	
	
	

	public static void main(String[] args) {
		int result1 = add(3, 5);
		System.out.println(result1);
		
		int result2 = add(add(2, 4), add(5, 6));
		System.out.println(result2);
		
		int[] tot = totalOperate(20, 7);
		System.out.println(tot[0]);
		System.out.println(tot[1]);
		System.out.println(tot[2]);
		System.out.println(tot[3]);

		callMyName("김자바");		
		callMyName("채");


	}

}
