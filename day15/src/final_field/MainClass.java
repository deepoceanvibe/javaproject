package final_field;

public class MainClass {

	public static void main(String[] args) {
		
		Person kim = new Person("김자바");
		
		//kim.nationality = "일본";
		//kim.name = "김자바";
		kim.age = 25;
		
		System.out.println("국적 : " + kim.nationality);
		System.out.println("이름 : " + kim.name);
		System.out.println("나이 : " + kim.age);
		

	}

}
