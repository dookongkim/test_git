package ex2_window_event;

import java.awt.Frame;

public class FrameMain {
	public static void main(String[] args) {
		
		Frame f=new Frame("이벤트 감지 연습");
		f.setSize(400,400);
		f.setLocation(500,200);
		
		//현재 프레임에게 윈도우 감지자 등록
		f.addWindowListener( new MyEvent() );
		
		
		f.setVisible(true);
		
		
	}//main
}
