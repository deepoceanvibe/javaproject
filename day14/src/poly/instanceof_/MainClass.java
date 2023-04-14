package poly.instanceof_;

public class MainClass {

	public static void main(String[] args) {
		
		Human h1 = new Human("김사람", 28);
		h1.showInfo();
		Human s1 = new Student("김학생", 25);
		s1.showInfo();
		Cat c1 = new Cat("몽몽", 4);
		c1.meow();
		
		System.out.println(h1 instanceof Human);
		System.out.println(s1 instanceof Human);
		System.out.println(h1 instanceof Student);		// 자식은 부모를 보유하지 않음
		System.out.println(s1 instanceof Student);

	}

}
