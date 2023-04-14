package importex;

import java.util.Scanner;

import fruit.Kiwi;
import fruit.Strawberry;
import hello.bye.Bye;
import hello.hi.Hi;

// 다른 패키지 클래스를 불러오려면, import 해야 함

public class ImportExample {
	public static void main(String[] args) {
		
		Strawberry s = new Strawberry();
		Kiwi k = new Kiwi();
		Hi hi = new Hi();
		Bye bye = new Bye();
		
		Scanner scan = new Scanner(System.in);
		
		Test test = new Test();
	}

}
