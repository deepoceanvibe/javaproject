package api.util.calendar;

import java.util.Calendar;

public class CalendarExample {
	public static void main(String[] args) {
		
		Calendar cal = Calendar.getInstance();
		
		int year = cal.get(Calendar.YEAR);
		int month = cal.get(Calendar.MONTH) + 1;		// 1월이 0부터 시작함
		int day = cal.get(Calendar.DAY_OF_MONTH);
		int week = cal.get(Calendar.DAY_OF_WEEK);
		
		System.out.println(year);
		System.out.println(month);
		System.out.println(day);
		System.out.println(week);
		
		String strweek = null;
		
		switch(week) {
			case Calendar.MONDAY : strweek = "월"; break;
			case Calendar.TUESDAY : strweek = "화"; break;
			case Calendar.WEDNESDAY : strweek = "수"; break;
			case Calendar.THURSDAY : strweek = "목"; break;
			case Calendar.FRIDAY : strweek = "금"; break;
			case Calendar.SATURDAY : strweek = "토"; break;
			case Calendar.SUNDAY : strweek = "일"; break;
			default : strweek = "일"; break;
		}
		
		int hour = cal.get(Calendar.HOUR);
		int minuit = cal.get(Calendar.MINUTE);
		int second = cal.get(Calendar.SECOND);
		
		System.out.println("오늘은 " + year + "년 " + month + "월 " + day + "일 입니다.");
		System.out.println("지금은 " + hour + "시 " + minuit + "분 " + second + "초 입니다.");
		
		
	}
}
