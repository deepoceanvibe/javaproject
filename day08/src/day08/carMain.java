package day08;

public class carMain {

	public static void main(String[] args) {
		
		Car c1 = new Car("아우디 A6", 5, 0, "정원", 100);
	
		
		c1.accelerate();
		c1.accelerate();
		c1.accelerate();

		c1.showStatus();
		
		c1.break_();
		c1.break_();

		c1.showStatus();

	}

}
