package ex1_choice;

import java.awt.Choice;
import java.awt.Font;
import java.awt.Frame;
import java.awt.event.ItemEvent;
import java.awt.event.ItemListener;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;

public class Ex1_Choice {
	public static void main(String[] args) {

		Frame f=new Frame();
		f.setLayout(null);
		f.setBounds(400, 100, 500, 250);

		
		Choice day=new Choice();
		
		day.add("SUN");
		day.add("MON");
		day.add("TUE");
		day.add("WED");
		day.add("THU");
		day.add("FIR");
		day.add("SAT");
		
		day.setLocation(50, 100);
		day.setSize(150, 100);// 높이에 사이즈를 넣어도 의미 x (길이, 높이 ) 높이는 글자사이즈에 맞춰짐

		
		Font font=new Font("",Font.ITALIC,30);
		
		day.setFont(font);
		
		//choice 객체에 이벤트감지자 추가
		day.addItemListener(new ItemListener() {
			
			@Override
			public void itemStateChanged(ItemEvent e) {
				
				String s = day.getSelectedItem();
				System.out.println(s);
				
			}
		});
		
		f.add(day);
		
		
		
		
		
		

		f.addWindowListener(new WindowAdapter() {
			@Override
			public void windowClosing(WindowEvent e) {
				System.exit(0);
			}
		});


		f.setVisible(true);

	}//main
}
