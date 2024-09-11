package ex5_work;

public class WorkMain {
	public static void main(String[] args) {
		
		WorkThread w=new WorkThread();
		w.setDaemon(true);
		w.start();
		w.Play();

		
	}//main
}
