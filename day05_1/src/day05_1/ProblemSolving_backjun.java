package day05_1;

import java.util.Scanner;

public class ProblemSolving_backjun {

	public static void main(String[] args) {
		// 별찍기
		
		Scanner scan = new Scanner(System.in);
		int N = scan.nextInt();
		scan.close();

		
		
		for(int i = 1; i <= N; i++) {
			
			for(int j = 1; j <= i; j++) {
		
				System.out.print("*");
			}
			
			System.out.println();
			
		}		
		
		
		
		
		
		
		
		
		
		

	}

}
