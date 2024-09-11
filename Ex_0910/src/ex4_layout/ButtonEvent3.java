package ex4_layout;

import java.awt.Button;
import java.awt.Font;
import java.awt.Frame;
import java.awt.Label;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;

public class ButtonEvent3 {
	public static void main(String[] args) {

		Frame f=new Frame();
		f.setLayout(null);
		f.setBounds(300, 300, 500, 500);

		//f.dispose(); 하나만 종료

		f.addWindowListener(new WindowAdapter() {
			@Override
			public void windowClosing(WindowEvent e) {
				new PopupClass();

			}
		});




		f.setVisible(true);

	}//main
}
