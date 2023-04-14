package inheritance;

public class InheritanceExample {

	public static void main(String[] args) {
		
		Student st1 = new Student();
		st1.name = "김학생";
		st1.age = 20;
		st1.major = "컴퓨터공학";
		
		SalaryMan sm1 = new SalaryMan();
		sm1.name = "김대리";
		sm1.age = 30;
		sm1.salary = 4000;
		
		Ceo c1 = new Ceo();
		c1.name = "김회장";
		c1.age = 57;
		c1.company = "(주)딩동회사";
		c1.numberEmployees = 300;
		

	}

}
