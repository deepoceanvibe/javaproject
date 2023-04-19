package api.lang.string;

public class StringSubstring {
	public static void main(String[] args) {
		
		String ssn = "950313-1349595";
		System.out.println(ssn);
		
		String last = ssn.substring(7);			// 7번 부터 끝까지
		System.out.println(last);
		
		String first = ssn.substring(0, 6);		// 0번 부터 5번 까지
		System.out.println(first);
	}

}
