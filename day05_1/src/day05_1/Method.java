package day05_1;

import java.security.DomainCombiner;

public class Method {
	
		/*
		 * 메서드 선언(정의) 이후에 호출할 수 있다 
		 * 메서드 선언은 메서드 내부에서 할 수 없다 
		 * 메서드 내부에서는 다른 메서드 호출만 할 수 있다 
		 * 호출하는 과정 : 다른 메서드 내부 지역으로 이동 -> 코드 실행 -> 타 메서드 호출이 끝나면 -> 원래 호출했던 위치로 복귀
		 */
		
		// 메인 메서드와 함께 존재하는 메서드는 static 붙여서 생성
		public static void sayHello() {
			System.out.println("안녕하세요 sayHello 메서드를 호출했네요!");
			System.out.println("다음에 또 호출해주세요!");
			
		}
		
		
		public static int calcSum(int x) {
			int sum = 0;
			for(int i = 1; i <= x; i++) {
				sum += i;
			
			}
			return sum;
		}	
		
		
		public static int totalSum(int a, int b) {
			return a + b;
		}
			
			
		public static void main(String[] args) {
				sayHello();
				calcSum(10);
				
				totalSum(1, 2);
		}	
			
			
			
			
	}


