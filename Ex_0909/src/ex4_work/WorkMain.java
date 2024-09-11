package ex4_work;

import java.util.Random;
import java.util.Scanner;
import java.util.ServiceConfigurationError;

public class WorkMain {
	public static void main(String[] args) {

		//id,승,무,패 정보를 가지는 클래스를 만든다
		//가위바위보 게임을 한 뒤 그 결과를 클래스에 세팅하고
		//Object 스트림으로 저장 및 로드

		//id : aaa   //키보드
		//새로운 유저
		//0승 0무 0패
		//-------------------------
		//가위(s) 바위 (r) 보(p) : s  //키보드
		//당신이 졌습니다
		//0승 0무 1패
		//다시 하실? (y/n) : y
		//가위(s) 바위 (r) 보(p) : r 
		//비겼습니다
		//0승 1무 1패
		//다시 하실? (y/n) : n
		//게임 종료

		//id: aaa
		//로드 성공
		//0승 1무 1패

		Scanner sc=new Scanner(System.in);
		User user=new User();

		int win=0;
		int lose=0;
		int draw=0;

		System.out.print("id : ");
		user.setId(sc.next());
		
		//기록 로드
		ScoreLoader sl=new ScoreLoader();
		user= sl.startLoad(user.getId());
		
		lose=user.getLose();
		win=user.getWin();
		draw=user.getDraw();

		
		
		System.out.printf("%d승 %d무 %d패\n",win,lose,draw);

		a:	while(true) {

			int random=new Random().nextInt(3);

			System.out.print("가위(s) | 바위(r) | 보(p) : ");
			String rsp=sc.next();
			int usercnt=0;

			if(rsp.equalsIgnoreCase("s")) {
				usercnt=0;
			}
			else if(rsp.equalsIgnoreCase("r")){
				usercnt=1;
			}
			else if(rsp.equalsIgnoreCase("p"));{
				usercnt=2;
			}

			if(usercnt-random==-2 || usercnt-random==1) {
				System.out.println("이겼습니다");
				user.setWin(++win);
			}
			else if(usercnt-random==0) {
				System.out.println("비겼습니다");
				user.setDraw(++draw);
			}
			else {
				System.out.println("졌습니다");
				user.setLose(++lose);
			}
			System.out.printf("%d승 %d무 %d패\n",win,lose,draw);

			System.out.print("한번더 ?(y/n) : ");

			if(!sc.next().equals("y")) {
				System.out.println("게임 종료");
				break;
			}
			else
				continue a;


		}//while

		//저장 
		ScoreWriter sw=new ScoreWriter();
		sw.startWrite(user);






	}//main
}
