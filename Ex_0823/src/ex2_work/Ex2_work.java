package ex2_work;

import java.util.Random;

public class Ex2_work {
	public static void main(String[] args) {


		//1~45 사이의 중복되지 않는 난수들을 저장하는 lotto 배열을 만들고
		//값을 출력
		//11 7  5 9 31  42
		//num 

		
		/*
		int[] num={0,0,0,0,0,0};
		
		int j=0;
		int i=0;
		System.out.println("금주의 로또 번호는...");


		for(i=0;i<6;i++) {
			lotto[i] = new Random().nextInt(6)+1;
			
			for(j=0;j<i;j++) {
				
				if(lotto[i] == lotto[j]) {
				i--;
				break;}
			}
		*/
		int[] lotto = new int[6];
		
		outer : for(int i=0;i<lotto.length;) {
			
			lotto[i]= new Random().nextInt(45)+1;
			
			//중복값 비교
			for( int j=0;j<i;j++)
				if(lotto[i]==lotto[j]) {
						continue outer; //중복이면 outer for문으로
				}
			//중복되지 않으면 i++로 다음방 이동
			
			i++;
		}
		
		for(int k=0;k<lotto.length;k++)//출력
			System.out.print(lotto[k]+ " ");
		
		


	}//main


}









