package api.lang.string;

public class StringTrim {
	public static void main(String[] args) {
		
		String trimBefore = "                옆에 거슬려요            ";
		
		System.err.println(trimBefore);
		String trimAfter = trimBefore.trim();
		System.out.println(trimAfter);
	}
}
