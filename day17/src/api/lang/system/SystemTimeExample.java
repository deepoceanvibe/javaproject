package api.lang.system;

public class SystemTimeExample {
	public static void main(String[] args) {
		
		/*
		 * currentTimeMillis()와 nanoTime()메서드는
		 * UNIX 시간이라는 체계를 사용한다.
		 * UNIX 시간 : 1970.01.01부터 잰 시간
		 */
		
		long start = System.currentTimeMillis();
		long sum = 0;
		
		for(long i = 1; i < 1000000000L; i++) {
			sum += i;
		}
		
		long end = System.currentTimeMillis();
		System.out.println("계산에 소요된 시간 : " + (end - start));
	}

}
