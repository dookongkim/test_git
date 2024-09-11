package ex5_check_box;

import java.awt.BufferCapabilities;
import java.awt.Button;
import java.awt.Checkbox;
import java.awt.CheckboxGroup;
import java.awt.Color;
import java.awt.Font;
import java.awt.Frame;
import java.awt.Label;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.ItemEvent;
import java.awt.event.ItemListener;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;



public class Ex1_CheckBoxTest {
	
	static int n_movie=2;
	static int n_news=2;
	static int n_sprots=2;
	static int n_music=2;
	static String gender="";
	
	public static void main(String[] args) {

		Frame f=new Frame("질문을 위한 프레임");
		f.setLayout(null);
		f.setBounds(500, 100, 800, 350);

		Font font=new Font("",Font.BOLD,30);
		Label q1=new Label("1.관심 분야는 무엇입니까?");
		q1.setFont(font);
		q1.setBounds(50,50,500,35);

		Checkbox news=new Checkbox("news");
		Checkbox sports=new Checkbox("sports");
		Checkbox movie=new Checkbox("movie");
		Checkbox music=new Checkbox("music");

		news.setBounds(50, 100, 60, 30);
		sports.setBounds(110, 100, 60, 30);
		movie.setBounds(180, 100, 60, 30);
		music.setBounds(240, 100, 60, 30);

		
		//news 체크박스의 선택여부

		//	news.addItemListener(new ItemListener() {
		//	
		//	@Override
		//	public void itemStateChanged(ItemEvent e) {
		//	int n=e.getStateChange();
		//	
		//	if(n==1) {
		//		System.out.println("news select");
		//}
		//	else {
		//			System.out.println("news unselect");
		//				}
		//		}
		//		});

		//체크박스들의 현재 상태를 묶어서 감지
		ItemListener hobby_listener=new ItemListener() {

			@Override
			public void itemStateChanged(ItemEvent e) {

				String item = e.getItem().toString();

				switch(item) {
				case "news":
					n_news=e.getStateChange();
					break;
					
				case "sports":
					n_sprots=e.getStateChange();
					break;
					
				case "movie":
					n_movie=e.getStateChange();
					break;

				case"music":
					n_music=e.getStateChange();
					break;
					
				}//switch

			}
		};

		
		
		news.addItemListener(hobby_listener);
		sports.addItemListener(hobby_listener);
		movie.addItemListener(hobby_listener);
		music.addItemListener(hobby_listener);
		

		Button btnHobby=new Button("확인");		
		btnHobby.setBounds(330,100,70,30);
		
		btnHobby.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				HobbyFrame hf=new HobbyFrame(n_news, n_sprots, n_movie, n_music);
				
			}
		});
		
		Label q2=new Label("2. 당신의 성별은?");
		q2.setFont(font);
		q2.setBounds(50, 150, 500, 40);
		
		CheckboxGroup group=new CheckboxGroup();
		Checkbox male=new Checkbox("남자",group,true);
		Checkbox female=new Checkbox("여자",group,false);
		
		male.setBounds(50, 210, 70, 30);
		female.setBounds(120, 210, 70, 30);
		
		//라디오버튼의 이벤트 감지자
		male.addItemListener(new ItemListener() {
			
			@Override
			public void itemStateChanged(ItemEvent e) {
				System.out.println("i am male");
				gender="male";
				
			}
		});
		
		female.addItemListener(new ItemListener() {
			
			@Override
			public void itemStateChanged(ItemEvent e) {
				System.out.println("i am female");
				gender="female";
			}
		});
		
		
		f.add(q1);
		f.add(sports);
		f.add(news);
		f.add(movie);
		f.add(music);
		f.add(btnHobby);
		f.add(q2);
		f.add(female);
		f.add(male);
		
		btnHobby.setVisible(true);
		
		f.addWindowListener(new WindowAdapter() {
			@Override
			public void windowClosing(WindowEvent e) {

				System.exit(0);

			}
		});



		f.setVisible(true);




	}//main
}
