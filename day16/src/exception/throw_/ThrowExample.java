package exception.throw_;

public class ThrowExample {
	
	public static int calcSum(int n) throws Exception {
		if(n <= 0) {
			throw new Exception();						// 예외 강제로 만들기!!!
		}
		int sum = 0;
		for(int i = 1; i <= n; i++) {
			sum += i;
		}
		return sum;
	}

	public static void main(String[] args) {
		try {
			int result1 = calcSum(100);
			System.out.println(new StringBuffer("1~100까지의 누적합" + result1));
			
			int result2 = calcSum(-100);
			System.out.println(new StringBuffer("1~100까지의 누적합" + result2));
			
		}catch(Exception e) {
			System.out.println(new StringBuffer("매개값을 양수로 전달해주세요."));
		}
		
	}

}
