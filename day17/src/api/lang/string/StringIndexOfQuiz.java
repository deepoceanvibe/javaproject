package api.lang.string;

import java.util.Scanner;

public class StringIndexOfQuiz {

	public static void main(String[] args) {
		
		/*
		 * 1. 특정 문장을 스캐너로 입력 받은 후
		 * 2. 입력받은 문장에서 조회할 단어를 적고
		 * 3. 단어가 몇 개 있는지 카운팅 하고,
		 * 4. 몇 번 인덱스에 각각 있는지 콘솔에 찍어주기
		 */
		
		Scanner scan = new Scanner(System.in);
		
		System.out.println("문장을 입력해주세요.");
		String s = scan.nextLine();
		
		System.out.println("찾으시는 단어를 입력해주세요.");
		String w = scan.nextLine();
		
		
		
		for(int i = s.indexOf(w); i != -1;) {
			System.out.println(w + "(은)는 " + i + "번 인덱스에 있습니다."); 
			break;
		}

		
		
	}
}