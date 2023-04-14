package day08;

// 힙의 인스턴스 변수를 초기화해주기 위해 생성자를 사용함.	


public class Cat {
	public String name;
	public int age;
	public String kind;
	public String hairColor;
	
	
	public Cat(String nm, int a, String kd, String hc) {
		name = nm;
		age = a;
		kind = kd;
		hairColor = hc;
		
	}

	
	public void showCatInfo() {							
		System.out.println(name);
		System.out.println(age);
		System.out.println(kind);
		System.out.println(hairColor);
	}
}
