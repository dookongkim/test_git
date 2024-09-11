package ex8_thread;

public class ThreadMain {
	public static void main(String[] args) {
		Thread1 t1=new Thread1();
		Thread2 t2=new Thread2();
		
		//인접한 위치에서 호출된 스레드들은 
		//누가 먼저 실행될지 아무도 모름
		
		t1.start();
		
		try {
			Thread.sleep(1000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		t2.start();
		
	}
}
