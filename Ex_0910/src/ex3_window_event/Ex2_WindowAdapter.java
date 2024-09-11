package ex3_window_event;

import java.awt.Frame;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;
import java.awt.event.WindowListener;

public class Ex2_WindowAdapter {
	public static void main(String[] args) {

		Frame f=new Frame();
		f.setSize(300,200);
		f.setLocation(200,500);

		//어댑터 클래스를 통해서 x버튼 클릭 감지
		f.addWindowListener( new WindowAdapter() {
			@Override
			public void windowClosing(WindowEvent e) {
				System.out.println("종료");
				System.exit(0);
			}
		});



		f.setVisible(true);



	}//main
}
