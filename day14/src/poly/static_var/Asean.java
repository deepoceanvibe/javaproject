package poly.static_var;

public class Asean {
	
	private String name;
	private int attendanceScore;
	private int finalTermScore;
	
	public static int presentationScore;
	
	public Asean(String name, int attendanceScore, int finalTermScore) {
		this.name = name;
		this.attendanceScore = attendanceScore;
		this.finalTermScore = finalTermScore;
	}
	
	static {
		presentationScore = 29;
	}

	public void showStudentScore() {
		System.out.println("학생명 : " + this.name);
		System.out.println("출석점수 : " + this.attendanceScore);
		System.out.println("팀점수 : " + presentationScore);
		System.out.println("기말점수 : " + this.finalTermScore);
		System.out.println("최종점수 : " + (attendanceScore + presentationScore + finalTermScore));
	}
}
