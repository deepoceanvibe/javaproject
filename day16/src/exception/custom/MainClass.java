package exception.custom;

public class MainClass {
	public static void main(String[] args) {
		
		Account acc = new Account();
		acc.deposit(10000);
		System.out.println(new StringBuffer("입급 후 잔액 : " + acc.getBalance() + "원"));

		try {
			acc.withdraw(100000);
		} catch(BalanceInsufficientException e) {
			System.err.println(e.getMessage());
		}
		System.out.println(new StringBuffer("출금 후 잔액 : " + acc.getBalance() + "원"));
	
	
	}

}
