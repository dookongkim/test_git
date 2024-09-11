package ex3_window_event;

import java.awt.Frame;

public class FrameMain {
	public static void main(String[] args) {
		
		Frame f=new Frame();
		f.setSize(300,200);
		f.setLocation(500,100);
		
		//x 버튼 클릭을 감지하는 이벤트감지자 등록
		
		f.addWindowListener( new ClosingEvent() );
		
		f.setVisible(true);
		
		

		
	}//main
}
