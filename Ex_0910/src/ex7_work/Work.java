package ex7_work;

import java.awt.Button;
import java.awt.Color;
import java.awt.Font;
import java.awt.Frame;
import java.awt.Label;
import java.awt.Panel;
import java.awt.TextField;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;

public class Work {
	static String res;
	static int money=0;
	public static void main(String[] args) {
		
		Frame f=new Frame();
		f.setLayout(null);
		f.setBounds(500, 200, 500, 700);

		Panel p=new Panel();
		p.setBounds(50, 50, 400, 30);
		p.setBackground(Color.BLUE);

		TextField tf=new TextField(20);

		Button btn=new Button("OK");
		btn.setBounds(0, 0, 100, 25);

		btn.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				res=tf.getText();
				System.out.println(res);
				String[] str=new String[4];
				
				GetCoin gc=new GetCoin();
				Font font=new Font("",Font.PLAIN,20);
				str[0]=gc.GetCoin(res,0);
				str[1]=gc.GetCoin(res,1);
				str[2]=gc.GetCoin(res,2);
				str[3]=gc.GetCoin(res,3);
				
				Label q1=new Label(str[0]);
				Label q2=new Label(str[1]);
				Label q3=new Label(str[2]);
				Label q4=new Label(str[3]);
				
				q1.setFont(font);
				q2.setFont(font);
				q3.setFont(font);
				q4.setFont(font);
				
				q1.setBounds(170, 200, 200, 30);
				q2.setBounds(170, 250, 200, 30);
				q3.setBounds(170, 300, 200, 30);
				q4.setBounds(170, 350, 200, 30);
				
				f.add(q1);
				f.add(q2);
				f.add(q3);
				f.add(q4);
				
			}
		});

		
		
		p.add(tf);
		p.add(btn);
		f.add(p);

		

		f.addWindowListener(new WindowAdapter() {
			@Override
			public void windowClosing(WindowEvent e) {
				System.exit(0);
			}
		});

	

		f.setVisible(true);

		




	}//main
}
