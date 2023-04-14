package day08;

//생성자를 적용해서 필드 값을 초기화하는 코드를 절약해보세요.


public class BasketballPlayer {
	
	public String name;
	public int height;
	public int age;
	public int salary;
	
	
	public BasketballPlayer(String nm, int hg, int a, int sr) {
		name = nm;
		height = hg;
		age = a;
		salary = sr;	
	}
	
	
	public void showInfo() {
		System.out.println(name);
		System.out.println(height);
		System.out.println(age);
		System.out.println(salary);
	}
	
		
	public void dunkShoot() {
		if(height > 190) {
			System.out.println("덩크슛 성공!");
		}else {
			System.out.println("실패");
		}
	}
		

}
