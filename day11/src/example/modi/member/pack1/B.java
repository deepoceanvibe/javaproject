package example.modi.member.pack1;

public class B {
	
	public B() {
		A a = new A();
		
		a.a = 1;
		a.b = 3;
		// a.c = 5; a.c가 private이라 접근안됨
		
		a.method1();
		a.method2();
		// a.method3(); a.method3();가 private이라 접근안됨
	}


}
