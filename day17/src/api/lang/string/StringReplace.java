package api.lang.string;

public class StringReplace {
	
	public static void main(String[] args) {

		String notice = """ 
						룰루랄라
						안녕?
						내이릉은 정원정원
						정원정원정원정원정원정원
						이라능.
						""";
	
		
		String notice2 = notice.replace("정원", "준규");
		System.out.println(notice2);
	
	}

}
