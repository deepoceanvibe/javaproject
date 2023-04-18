package exception.multi;

import java.util.Scanner;

public class MultiCatchExample {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);

		try {
			System.out.println(new StringBuffer("1번째 데이터 : "));
			String data1 = sc.next();
			System.out.println(new StringBuffer("2번째 데이터 : "));
			String data2 = sc.next();
			
			int i = Integer.parseInt(data1);
			int j = Integer.parseInt(data2);
			
			int result = i / j;
			/*
			System.out.println
				(new StringBuffer(i)
							.append("/")
							.append(j)
							.append("=")
							.append(result));
			*/
			
			System.out.println(i + "/" + j + "=" + result);
			
			String str = null; 
			str.charAt(0);		// str에 null넣어서 0번째값 반환안됨 -> Exception e
			
		} catch(NumberFormatException | NullPointerException e) {
			System.err.println(new StringBuffer("데이터는 숫자만 넣어주세요."));
		} catch(ArithmeticException e) {
			System.err.println(new StringBuffer("0으로 나눌 수 없습니다."));
		} catch(Exception e) {
			System.err.println(new StringBuffer("알 수 없는 에러가 발생했습니다."));
			System.err.println(new StringBuffer("복구 중입니다."));
			
		} finally {
			sc.close();
		}
		
	}

}
