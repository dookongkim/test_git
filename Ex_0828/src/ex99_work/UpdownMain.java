package ex99_work;

import java.util.Random;
import java.util.Scanner;

public class UpdownMain {
	public static void main(String[] args) {
		
		//Up&Down 게임 만들기
		//값:30
		//Down
		//값:15
		//UP
		//값:21
		//3회만에 정답
		int cnt=0;
		int num=0;
		Scanner sc=new Scanner(System.in);
		System.out.println("1에서 50사이 난수가 생성되었습니다");
		int ran= new Random().nextInt(50)+1;
		Updown up=new Updown();
		
		
		while(true) {
			System.out.print("값 : ");
			num=sc.nextInt();
			String check=up.check(num, ran);
			cnt++;
			if(check=="정답") {
			System.out.println(cnt+"회 만에 정답");
			break;
			}
			
			//정답을 맞히면 현재 while문 탈출
		}

		
	}//main
}
