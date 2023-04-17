package final_field;

public class Person {
	
	/*
	 * final 변수는 단 한 번 초기화 될 수 있고
	 * 이후에는 변경이 불가능하기 때문에
	 * 선언시에 아예 직접 초기화를 해주거나
	 * 생성자에서 초기화를 해줘야 한다.
	 */
	
	public final String nationality = "대한민국";
	public final String name;
	public int age;
	
	public Person(String name) {
		this.name = name;
	}

}
