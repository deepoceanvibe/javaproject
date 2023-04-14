package example.override;

public class Student extends Human{
	
	public String major;
	
	@Override									// 가독성, 유지보수 측면에서 알아보기 쉽게 하기 위해 표시함
	public void  자기소개하기() {
		System.out.println("이름 : " + name);
		System.out.println("나이 : " + age);
		System.out.println("전공 : " + major);
		
	}

}
