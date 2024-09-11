package ex4_layout;

import java.awt.Button;
import java.awt.Font;
import java.awt.Frame;
import java.awt.Label;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class PopupClass {

	public PopupClass() {
		Frame check=new Frame();
		check.setLayout(null);
		check.setBounds(400, 400, 300, 300);

		Button b1=new Button("yes");
		Button b2=new Button("no");


		b1.setBounds(50, 140, 100, 100);
		b2.setBounds(150, 140, 100, 100);

		//글꼴,글자스타일,크기
		Font font=new Font("",Font.PLAIN,15);
		Label msg=new Label("정말로 종료 하겠습니까?");
		msg.setBounds(50, 20, 200, 120);
		msg.setFont(font);
		check.add(msg);


		check.add(b1);
		check.add(b2);

		ActionListener act=new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				String str=e.getActionCommand();
				switch(str) {
				case "yes":
					System.exit(0);
					break;

				case "no" :
					check.dispose();
					break;


				}//switch

			}
		};

		b1.addActionListener(act);
		b2.addActionListener(act);

		check.setResizable(false);
		check.setVisible(true);

	}

}
