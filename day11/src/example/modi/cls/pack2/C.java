package example.modi.cls.pack2;

import example.modi.cls.pack1.B;

public class C {
	
	B b = new B();
	
	// B는 public 이므로 접근 가능 but, 패키지가 다르므로 import 해야함
	
	// A a = new A();
	
	// A는 default 이므로 패키지가 다르기 때문에 무조건 호출 불가능

}
