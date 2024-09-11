package ex5_check_box;

import java.awt.Frame;
import java.awt.Label;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;
import java.awt.event.WindowListener;

public class HobbyFrame {

	
	//int ... <-- varible arguments 
	// 외부에서 전달받은 인자의 개수만큼 알아서 배열로 생성 
	public HobbyFrame(int... data) {
		
		Frame f=new Frame();

		f.setLayout(null);
		f.setBounds(500, 100, 500, 300);

		Label text=new Label("당신의 취미");
		text.setBounds(10, 30, 150, 30);
		
		f.add(text);
		
		//결과저장변수
		String res="";
		
		if(data[0]==1) 
			res+="뉴스 ";
			
		if(data[1]==1) 
			res+="스포츠 ";
		
		if(data[2]==1) 
			res+="영화 ";
		
		if(data[3]==1) 
			res+="음악 ";
		
		Label result=new Label(res);
		result.setBounds(10, 100, 300, 30);
		
		f.add(result);
		


		f.addWindowListener(new WindowAdapter() {
			@Override
			public void windowClosing(WindowEvent e) {
				f.dispose();

			}
		});
		f.setVisible(true);


	}

}
