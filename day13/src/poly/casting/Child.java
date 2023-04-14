package poly.casting;

public class Child extends Parent{

	@Override
	public void method2() {
		System.out.println("자식쪽에서 재정의한 2번 메서드!");
	}
		
	
	public void method3() {
		System.out.println("자식쪽에서 재정의한 3번 메서드!");
	}
}
