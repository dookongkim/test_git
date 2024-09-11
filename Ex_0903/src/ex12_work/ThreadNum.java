package ex12_work;

import java.util.Random;
import java.util.Scanner;

public class ThreadNum extends Thread {

	Scanner sc=new Scanner(System.in);
	Random r=new Random();
	public float sec=0;
	int n;
	int m;;
	int answer;
	int answer_cnt=0;
	@Override

	public void run() {
		while(true) {
			try {
				Thread.sleep(100);
				sec++;
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}

	}//run

	public void PlusExam() {
		while(true) {

			n=r.nextInt(100)+1;
			m=r.nextInt(100)+1;
			
			System.out.printf("%d+%d = ",n,m);
			answer=sc.nextInt();

			if(answer!=(n+m)) {
				do {System.out.println("오답");
				answer=sc.nextInt();}
				while(answer!=(n+m));
				
				System.out.println("정답");
				answer_cnt++;
			}
			else {
				System.out.println("정답");
				answer_cnt++;
			}


			if(answer_cnt==5) {
				System.out.println("결과 : "+sec/10+"초");
				break;
			}

		}//while
		System.out.println("퀴즈를 종료");
		System.exit(0);
		
	}//Thread()






}
