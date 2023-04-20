package collection.map;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class HashMapLoginQuiz {
	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		
		
		System.out.println("아이디를 입력해주세요.");
		String id = scan.nextLine();
		
		System.out.println("비밀번호를 입력해주세요.");
		int pw = scan.nextInt();
		
		Map<String, Integer> idpw = new HashMap<>();
		idpw.put(id, pw);
		
		
		System.out.println("로그인 아이디를 입력해주세요.");
		String inputId = scan.next();
		
		System.out.println("로그인 비밀번호를 입력해주세요.");
		int inputPw = scan.nextInt();
		
		Map<String, Integer> input = new HashMap<>();
		input.put(inputId, inputPw);
		
		
		
		if(idpw.containsKey(inputId) && idpw.get(inputId).equals(inputPw)) {
			System.out.println("로그인에 성공했습니다.");
		} else {
			System.out.println("다시 입력해주세요.");
		}
		
		
	}

}
