package ex7_thread;

public class Ex1_SingleThread extends Thread{
	
	//스레드는 독립적인 실행단위
	//한 번에 두 개 이상의 프로세스를 실행가능하게 해준다
	
	
	@Override
	public void run() {
		//프로세스의 독립적인 수행을 위한 영역
		for(int i=0;i<10;i++) {
			System.out.println("스레드 실행 중"+ i);
			try {
				Thread.sleep(500);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}//for
	}

}