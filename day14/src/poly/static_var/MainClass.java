package poly.static_var;

public class MainClass {
	public static void main(String[] args) {
		
		System.out.println(Asean.presentationScore);
		
		Asean a1 = new Asean("채종훈", 20, 43);
		Asean a2 = new Asean("서은영", 20, 46);
		Asean a3 = new Asean("장재인", 20, 45);
		Asean a4 = new Asean("정일윤", 14, 42);
		
		a1.showStudentScore();
		a2.showStudentScore();
		a3.showStudentScore();
		a4.showStudentScore();
		
		System.out.println(a1.presentationScore);		// a1이 static에 가서 들고옴 공용변수라 걍 막 건드릴수있음
	}
	
}
