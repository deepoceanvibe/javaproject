package example.thread;

public class MultiThread implements Runnable{

	@Override
	public void run() {
		
		try {
			for(int i = 0; i < 500; i++) {
				System.out.println("보조쓰레드 : 실행" + i);
				Thread.sleep(1000);
			}
			
		} catch(Exception e) {
		e.printStackTrace();
	}
	


	}
}
