package ex5_work;

import java.util.Scanner;

public class Ex1_work {
	public static void main(String[] args) {

		/*
		 사용자가 현재 가지고 있는 돈을 입력받는다
		 크림빵,새우깡,콜라를 잔돈을 하나도 남기지 않고 구입하는
		 경우의 수를 모두 출력하시오 ( 단, 구입하지 않는 상품이 있으면 안된다
		 --크림빵:500원 새우깡:700원 콜라:400원
		 ------------------------------
		 (3중 for 사용) , break continue 사용 x
		 소지금: 4000
		 크림빵:1개 새우깡:1개 콜라:7개
		 크림빵:2개 새우깡:2개 콜라:4개
		 크림빵:3개 새우깡:3개 콜라:1개
		 크림빵:5개 새우깡:1개 콜라:2개
		      a개      b개     c개
		    500원   700원   400원
		 */

		Scanner sc=new Scanner(System.in);
		System.out.print("소지금: ");
		int money=sc.nextInt();

		int a=500,b=700,c=400;

		int max_a = money/a;
		int max_b = money/b;
		int max_c = money/c;

		for(int i=1;i<max_a;i++) {
			for(int j=1;j<max_b;j++) {
				for(int k=1; k<max_c;k++) {

					if(money==(a*i+b*j+c*k)) 
						System.out.printf("크림빵:%d개 새우깡:%d개 콜라:%d개\n",i,j,k);
				}
			}
		}

	}//main
}
