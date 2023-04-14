package example.encap.good;

public class MyBirthday {
	
	private int year; 
	private int month; 
	private int day;
	
	// 우클릭 -> source -> generate constructor using fields
	
	public MyBirthday(int year, int month, int day) {
		setYear(year);
		setMonth(month);
		setDay(day);
	} 
	
	void showDateInfo() {
		System.out.println("내 생일은");
		System.out.println(year + "년");
		System.out.println(month + "월");
		System.out.println(day + "일");
	}
	
	// Setter : 은닉변수에 값 저장
	// Getter : 은닉변수의 값 불러오기 (조회 어려운 데이터 조회하기)
	
	public void setDay(int day) {
		if(day < 1 || day > 31) {		
			this.day = 1;
		} else {
			this.day = day;
		}
	}
	
	public int getDay() {
		return this.day;
	}
	
	public void setMonth(int month) {
		if(month < 1 || month > 12) {
			this.month = 1;
		} else {
			this.month = month;
		}
	}
	
	public int getMonth() {
		return this.month;
	}
	
	public void setYear(int year) {
		if(year < 0 || year > 2023) {
			this.year = 1;
		} else {
			this.year = year;
		}
	}
	
	public int getYear() {
		return this.year;
	}
	
	

}
