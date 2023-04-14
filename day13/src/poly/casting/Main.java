package poly.casting;

public class Main {
	public static void main(String[] args) {
		
		Parent p = new Child();
		
		p.method1();
		p.method2();					// ***** 오버라이딩하면, 자식꺼부터 호출함 ***** 
		
		System.out.println("----------------------------------");
		
		Child c = (Child)p;
		c.method3();
		
		Child cc = new Child();			// 부모, 자식꺼 다 호출 가능
		cc.method3();
	}

}
