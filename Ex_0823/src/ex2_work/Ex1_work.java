package ex2_work;

import java.util.Random;

public class Ex1_work {
	public static void main(String[] args) {

		//변수 money에 10~5000 사이의 난수를 발생시켜 
		//단, 1710,3450과 같이 1의자리 숫자는 반드시 0이어야 한다
		//coin 배열을 사용하여 난수 money를 동전으로 바꿨을때
		//가장 적은수의 동전을 사용하는 경우의 수 출력
		//----------------------------
		//값 : 2590
		//500원: 5
		//100원:
		//50원 : 1
		//10원 : 4


		int money= new Random().nextInt(500)+1;
		money *= 10;
		System.out.println("값: "+money);

		int[] coin= {500,100,50,10};

		for(int i =0; i< coin.length;i++) {

			int res = money/coin[i]; 

			if(res>0) {
				System.out.println(coin[i]+ "원 : "+res);
				money = money %coin[i];
			}

		}

		/*int[] num= {0,0,0,0};

		num[0]=money/coin[0];
		num[1]=money/coin[1];
		num[2]=money/coin[2];
		num[3]=money/coin[3];



		int i=num[0];
		a:for(int j=num[1];j>=0;j--) {
			for(int k=num[2];k>=0;k--) {
				for(int l=num[3];l>=0;l--) {
					if(money==500*i+100*j+50*k+10*l) {
						System.out.printf("500원:%d\n100원:%d\n50원:%d\n10원:%d\n",i,j,k,l);
						break a;
					}
				}
			}
		}
		 */










	}//main
}
