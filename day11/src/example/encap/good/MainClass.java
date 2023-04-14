package example.encap.good;

public class MainClass {

	public static void main(String[] args) {
		
		MyBirthday mb = new MyBirthday(1999, 2, 11);
		
		mb.showDateInfo();
		System.out.println(mb.getDay());
	}

}
