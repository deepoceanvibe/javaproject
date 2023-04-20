package api.util.random;

import java.util.Random;

public class RandomExample {

	public static void main(String[] args) {
		
		Random r = new Random();
		
		double d = r.nextDouble();
		System.out.println("실수랜덤값 : " + d);
		
		boolean b = r.nextBoolean();
		System.out.println("논리랜덤값 : " + b);
		
		int i = r.nextInt();
		System.out.println("정수랜덤값 : " + i);
	
		i = r.nextInt(10);
		System.out.println("정수(0~9) : " + i);
		
		i = r.nextInt(10) + 1;
		System.out.println("정수(1~10) : " + i);
		
		
	}

}
