package ex5_work;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;
import java.util.Scanner;

public class WorkThread extends Thread {

	String []str={"pineapple","grape","orange","apple","banana","lemon"};
	List<String> list=new ArrayList<String>();

	Random r=new Random();
	Scanner sc=new Scanner(System.in);


	@Override
	public void run() {
		Thread t=new Thread();
		
		while(true) {
			try {
				t.sleep(3000);
				list.add(str[r.nextInt(str.length)]);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		
		}
		

	}//run
		
		
	public void Play() {
		list.add(str[r.nextInt(str.length)]);
		while(true) {
			System.out.println(list);
			System.out.print(">>");
			String answer=sc.next();
			
			for(int i=0;i<list.size();i++) {
				if(list.get(i).equals(answer)) {
					list.remove(i);
					break;
				}

			}

			if(list.size()==0) {
				System.out.println("클리어");
				break;
			}
		}//while
		
	}
	
	
	
}
