package ex1_random;

import java.util.Random;

public class Ex2_random {
	public static void main(String[] args) {
		
		//Random 클래스를 이용하여
		//대문자 A~Z사이의 값중 하나를 랜덤으로 출력
		//======================
		//결과 : C
				
		int alpha=new Random().nextInt('Z'-'A'+1)+'A';
		
		System.out.printf("%c ",alpha);
		
	}//main
}