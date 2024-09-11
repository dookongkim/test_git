package ex9_work;

import java.util.Random;
import java.util.Scanner;

public class NumBaseball {
	public static void main(String[] args) {

		//1~9사이의 난수 세개를 중복되지않도록 생성하고
		//키보드에서 입력받은 값으로 strike,ball,out을 판단
		//Ball: 숫자는 같고, 자리는 다를때
		//Strike:숫자와 자리가 같을때
		//out:같은 숫자 하나도 없을때
		//숫자를 맞추면 게임 종료
		Scanner sc=new Scanner(System.in);

		int[] com=new int[3];

		do {

			for(int i=0;i<com.length;i++) {
				com[i]=new Random().nextInt(9)+1;
			}
		}while(com[0]==com[1]||com[0]==com[2]||com[1]==com[2]);

		System.out.println(""+com[0]+com[1]+com[2]);

		System.out.print("입력 : ");


		while(true) {

			int num=sc.nextInt();

			int[] user= {num/100,num/10%10,num%10};

			int strike=0;
			int ball=0;

			//경우의 수 3*3
			for(int i=0;i<user.length;i++) {

				for(int j=0;j<com.length;j++) {
					if(i==j) {
						if(com[i]==user[j])
							strike++;
					}
					else {
						if(com[i]==user[j])
							ball++;
					}	
				}
			}

			if(strike==com.length) {
				System.out.println("정답! - "+com[0]+com[1]+com[2]);
				break;
			}

			else {
				if(strike>0||ball>0) {
					System.out.println(strike+"Strike, "+ball+"Ball");
				}
				else
					System.out.println("Out");
			}

			System.out.println("---------------");
		}//while



	}//main
}
