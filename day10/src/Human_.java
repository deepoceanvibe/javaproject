
public class Human_ {
	
	public String name;
	public int age;
	
	public Human_(String name, int age) {
		this.name = name;
		this.age = age;
		
	}
	
	public Human_(String name) {
		this(name, 30);
		
	}
	
	public Human_() {
		this("노이름", 35);
		
	}
	
	public void showInfo() {
		System.out.println("이름 : " + name + " 나이 : " + age);
	}
	
	

}
