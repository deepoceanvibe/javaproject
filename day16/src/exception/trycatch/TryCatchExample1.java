package exception.trycatch;

public class TryCatchExample1 {
	
	public static void main(String[] args) {
		
		int i = 10;
		int j = 0;
		
		try {
			System.out.println(i / j);
			System.out.println(new StringBuffer("예외발생 안할때만 실행됨"));
			
		} catch(Exception e) {
			System.out.println(new StringBuffer("0으로 나눠서 catch블록으로 넘어옴"));
		}
		
		System.out.println(new StringBuffer("어쨌든 잘 마무리했음."));
	
	}

}
