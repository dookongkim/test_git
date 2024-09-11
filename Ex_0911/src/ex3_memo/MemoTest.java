package ex3_memo;

import java.awt.Button;
import java.awt.FileDialog;
import java.awt.Font;
import java.awt.Frame;
import java.awt.TextArea;
import java.awt.TextField;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;
import java.awt.event.TextEvent;
import java.awt.event.TextListener;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;
import java.io.BufferedWriter;
import java.io.FileWriter;

import javax.swing.JOptionPane;

public class MemoTest {
	public static void main(String[] args) {

		Frame f=new Frame();
		f.setLayout(null);
		f.setBounds(500, 100, 250, 400);

		Font font= new Font("",Font.PLAIN,20);
		TextField tf=new TextField();

		tf.setBounds(10, 40, 180, 30);
		tf.setFont(font);


		Button btn=new Button("OK");
		btn.setBounds(195, 40, 40, 30);

		//버튼 비활성화 : false
		btn.setEnabled(false);

		//여러줄을 입력받는것이 가능한 TextArea 
		TextArea ta=new TextArea("",0,0,TextArea.SCROLLBARS_VERTICAL_ONLY);
		ta.setBounds(10, 80, 230, 250);
		ta.setEnabled(false);

		Button btnSave=new Button("SAVE");
		btnSave.setBounds(10, 330, 110, 60);

		Button btnClose=new Button("CLOSE");
		btnClose.setBounds(130, 330, 110, 60);

		f.add(tf);
		f.add(btn);
		f.add(ta);
		f.add(btnSave);
		f.add(btnClose);

		f.addWindowListener(new WindowAdapter() {
			@Override
			public void windowClosing(WindowEvent e) {
				System.exit(0);
			}
		});

		//TextFiled에 값이 들어있는 경우에만 OK 버튼 활성화

		tf.addTextListener(new TextListener() {

			@Override
			public void textValueChanged(TextEvent e) {
				if(tf.getText().equals("")) {
					btn.setEnabled(false);
				}
				else
					btn.setEnabled(true);


			}
		});

		btn.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				String str=tf.getText()+"\n";
				ta.append(str);

				//TextField 의 내용을 비움
				tf.setText("");
				//커서 tf로 복귀
				tf.requestFocus();

			}
		});

		//키보드의 엔터 감지
		tf.addKeyListener(new KeyAdapter() {
		
			@Override
			public void keyTyped(KeyEvent e) {
				
				if(e.getKeyChar()==KeyEvent.VK_ENTER) {
					String str=tf.getText()+"\n";
					ta.append(str);

					//TextField 의 내용을 비움
					tf.setText("");
					//커서 tf로 복귀
					tf.requestFocus();
				}
				
			}
		});
		//CLOSE 버튼
		btnClose.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				f.dispose();
				
			}
		});

		
		//SAVE 버튼 클릭 시 TextArea의 값 Stream으로 저장
		
		btnSave.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				
				String message=ta.getText();
				FileWriter fw=null;
				BufferedWriter bw=null;
				
				
				try {
					FileDialog fd=new FileDialog(f,"저장",FileDialog.SAVE);
					fd.setVisible(true);
					
					//저장경로 얻기
					String path=fd.getDirectory()+fd.getFile();
					System.out.println(path);
					
					//저장 안하고 취소 눌렀을때
					if(fd.getFile()==null) {
						JOptionPane.showMessageDialog(f, "저장 취소");
					
					}
					//스트림으로 message 기록
					
					fw=new FileWriter(path);
					bw=new BufferedWriter(fw);
					
					bw.write(message);
					
					bw.flush();
					
					if(fd.getFile()!=null) {
						JOptionPane.showMessageDialog(f, "저장 성공");
						
					}
					
					//ta.setText("");
				} catch (Exception e2) {
					
				}finally {
					try {
						if(bw!=null)
							bw.close();
						if(fw!=null)
							fw.close();
					} catch (Exception e3) {
						// TODO: handle exception
					}
				}
				
				
			}
		});
		


		f.setResizable(false);
		f.setVisible(true);


	}//main
}
