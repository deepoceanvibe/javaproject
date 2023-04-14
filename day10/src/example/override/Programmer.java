package example.override;

public class Programmer extends Human{
	
	public String field;
	public String language;
	
	@Override
	public void 자기소개하기() {
		System.out.println("이름 : " + name);
		System.out.println("나이 : " + age);
		System.out.println("분야 : " + field);
		System.out.println("언어 : " + language);
		
	}
	
	@Override
	public void 코딩하기() {
		System.out.println("코딩 할 수 있습니다");
	
	}
	

}
