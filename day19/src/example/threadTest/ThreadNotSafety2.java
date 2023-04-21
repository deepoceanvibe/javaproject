package example.threadTest;

public class ThreadNotSafety2 extends Thread {
    
    static int share;
    
    public static void main(String[] args) {
      ThreadNotSafety2 t1 = new ThreadNotSafety2();
      ThreadNotSafety2 t2 = new ThreadNotSafety2();
      
      t1.start();
      t2.start();
    }
    
    public synchronized static void sharePlus() {		//synchronized 붙이면 안전하게 나옴
    	System.out.println(share++);
    }
    
    public void run() {
      for(int count = 0; count < 10; count++){
       sharePlus();
        
        try { sleep(25); }
        catch (InterruptedException e) {}
      }
    }
}