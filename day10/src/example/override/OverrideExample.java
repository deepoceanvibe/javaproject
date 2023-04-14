package example.override;

public class OverrideExample {

	public static void main(String[] args) {
		
		Student s1 = new Student();
		s1.name = "김학생";
		s1.age = 25;
		s1.major = "컴공";
	
		s1.자기소개하기();
		s1.코딩하기();
		
		Programmer p1 = new Programmer();
		p1.name = "김개발";
		p1.age = 28;
		p1.field = "백엔드";
		p1.language = "자바";
		
		p1.자기소개하기();
		p1.코딩하기();

	}

}
