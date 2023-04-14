package day07;

public class CatMain {
	
	public static void showCatInfo(Cat cat) {
		
		System.out.println("고양이 이름 " + cat.name);
		System.out.println("고양이 품종 " + cat.kind);
		System.out.println("고양이 성별 " + cat.gender);
		System.out.println("고양이 나이 " + cat.age);
		
	}
	

	public static void main(String[] args) {
		
		Cat c1 = new Cat();
		c1.kind = "샴";
		c1.name = "로이";
		c1.gender = "남";
		c1.age = 4;
		
		showCatInfo(c1);
		
		Cat c2 = new Cat();
		c2.kind = "아메리칸 숏헤어";
		c2.name = "미니";
		c2.gender = "여";
		c2.age = 7;
		
		showCatInfo(c2);
		
		Cat c3 = new Cat();
		c3.kind = "코랫";
		c3.name = "훈남";
		c3.gender = "남";
		c3.age = 6;
		
		showCatInfo(c3);

	}
	

}
