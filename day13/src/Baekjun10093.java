// 백준 class명 Main으로 하기
import java.util.Scanner;

public class Baekjun10093 {
	public static void main(String[] args) {
	// 두 양의 정수 A, B가 주어졌을 때, 두 수 사이에 있는 정수를 모두 출력하는 프로그램을 작성하시오.	
	
        Scanner scan = new Scanner(System.in);
		int A = scan.nextInt();
		int B = scan.nextInt();
        scan.close();
        
      
        	
        if(A > 0 && B > 0 && A < B) {
        	System.out.println(A~B 사이갯수);
        	System.out.println(A~B);
        	
        } else if(A > 0 && B > 0 && A > B) {
        	System.out.println(B~A 사이갯수);
        	System.out.println(B~A);
        }
      
     
        
        
        

      }
	
}
