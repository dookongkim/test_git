package ex6_exception;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Ex2_Exception {
	public static void main(String[] args) {

		//키보드에서 정수를 입력받는다
		//정수가 입력되지 않았을 때도 정상종료가 가능하도록 처리
		//---------------------
		//정수 : 5
		//결과 : 5

		//정수 : a
		//정수만 입력할 수 있습니다

		Scanner sc=new Scanner(System.in);
		int n=0;
		
		try {
			System.out.print("정수 : ");
			n=sc.nextInt();
			System.out.print("결과 : "+n);

		} catch (InputMismatchException e) {
			System.out.println("정수만 입력할 수 있습니다");
			
		}
		


	}
}
