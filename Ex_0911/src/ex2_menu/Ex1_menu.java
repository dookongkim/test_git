package ex2_menu;

import java.awt.Frame;
import java.awt.Menu;
import java.awt.MenuBar;
import java.awt.MenuItem;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;

import javax.swing.text.html.HTMLEditorKit.LinkController;

public class Ex1_menu {
	public static void main(String[] args) {

		Frame f=new Frame("메뉴 연습");

		f.setBounds(500, 200, 300, 500);
		

		MenuBar mb=new MenuBar();
		Menu mFile=new Menu("File");
	
		MenuItem miNew=new MenuItem("new");
		MenuItem miOpen=new MenuItem("open");
		MenuItem miSave=new MenuItem("save");
		
		Menu mWindow=new Menu("Window");
		MenuItem miWin=new MenuItem("new window");
		
		
		Menu miEditor=new Menu("editor");
		MenuItem miToggle=new MenuItem("toggle");
		MenuItem miClone=new MenuItem("clone");
		
		//window 메뉴의 하위인 editor 메뉴의 하위메뉴를 추가
		miEditor.add(miToggle);
		miEditor.add(miClone);
		
		mWindow.add(miWin);
		mWindow.add(miEditor);
		
		
		
		//메뉴에 하위메뉴 추가한 형태
		mFile.add(miNew);
		mFile.add(miOpen);
		mFile.add(miSave);
		
		mb.add(mFile);
		mb.add(mWindow);
		
		f.setMenuBar(mb);
		//miWin 메뉴에 감지자 추가
		miWin.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				System.out.println("window clicked");
			}
		});
		//miToggle 메뉴에 감지자 추가
		miToggle.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				System.out.println("toggle clicked");
				
			}
		});
		
		//exit 관리
		f.addWindowListener(new WindowAdapter() {
			@Override
			public void windowClosing(WindowEvent e) {
				System.exit(0);
			}
		});
		
	
		f.setVisible(true);



	}//main
}
