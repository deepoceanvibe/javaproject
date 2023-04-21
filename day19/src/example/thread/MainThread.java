package example.thread;

public class MainThread {
	
	public static void main(String[] args) {
		
		Runnable trd = new MultiThread();
		Thread sTrd = new Thread(trd);
		
		System.out.println("보조쓰레드 준비 완료!");
		
		sTrd.start();
		System.out.println("먼저 끝날지 알 수 없는 메인쓰레드");
	}

}
