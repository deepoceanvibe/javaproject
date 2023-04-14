package example.overload;

public class Human {

	public String name;
	public int age;
	
	
	// 생성자 오버로딩
	
	public Human() {
		name = "이름을 입력하지 않았습니다.";
		age = 19;
		
	}
	
	
	public Human(String n, int a) {
		name = n;
		age = a;
		
	}
	
	

}
