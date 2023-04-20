package api.util.date;

import java.text.SimpleDateFormat;
import java.util.Date;

public class DateExample {
	
	public static void main(String[] args) {
		Date date = new Date();
		System.out.println(date);
		
		Date date2 = new Date(123, 10, 9, 18, 30, 0);
		System.out.println(date2);
		
		SimpleDateFormat sdf = new SimpleDateFormat("yyyy년 MM월 dd일 HH시 mm분 ss초");
		SimpleDateFormat sdf1 = new SimpleDateFormat("오늘은 E요일");
		SimpleDateFormat sdf2 = new SimpleDateFormat("오늘은 올 해의 D번째 날");
		System.out.println(sdf.format(date));
		System.out.println(sdf1.format(date));
		System.out.println(sdf2.format(date));
	}
}
