package exception.trycatch;

import java.util.Scanner;

public class NoTryCatchhExample {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		int preValue = scan.nextInt();
		int nextValue = scan.nextInt();

		System.out.println(preValue / nextValue);
		
		scan.close();
	}

}
