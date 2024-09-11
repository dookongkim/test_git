package ex11_thread;

public class ThreadW extends Thread{
	
	public void count(int n) {
		int k=n;
		for(int i=0;i<=k;i++) {
			try {
				Thread.sleep(1000);
				System.out.println(""+n);
				n--;
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
		
		System.out.println("스레드 종료");
		System.exit(0);
		
		
	}
	
	@Override
	public void run() {
		
		System.out.println("Thread 실행중");
		
		try {
			Thread.sleep(500);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		
	}//run
	
	
	
	
}
