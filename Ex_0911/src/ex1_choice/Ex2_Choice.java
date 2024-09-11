package ex1_choice;

import java.awt.Choice;
import java.awt.Frame;
import java.awt.Label;
import java.awt.event.ItemEvent;
import java.awt.event.ItemListener;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;

public class Ex2_Choice {
	public static void main(String[] args) {

		Frame f=new Frame();

		f.setLayout(null);
		f.setBounds(150, 150, 500, 200);

		
		Choice city=new Choice();
		
		city.add("서울");
		city.add("인천");
		city.add("부산");
		
		
		city.setBounds(50, 50, 100, 30);
		
		f.add(city);
		
		
		Label l=new Label("서울");
		
		
		
		city.addItemListener(new ItemListener() {
			
			@Override
			public void itemStateChanged(ItemEvent e) {
				
			
				l.setText(city.getSelectedItem()) ;
	
				l.setBounds(150, 100, 100, 50);
				f.add(l);
				l.setVisible(true);
			}
		});
		
		
		
		
		f.addWindowListener(new WindowAdapter() {
			@Override
			public void windowClosing(WindowEvent e) {
				System.exit(0);
			}
		});

		
		f.setVisible(true);


	}//main
}
