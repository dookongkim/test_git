package ex2_single_for;

import java.util.Scanner;

public class ex4_singleFor {
	public static void main(String[] args) {

		//키보드에서 값을 받고, 입력받은 값에 해당하는 구구단 출력
		//값:1
		//2~9 사이의 값을 입력하세요

		Scanner sc=new Scanner(System.in);

		System.out.println("숫자를 입력하시오");
		int num=sc.nextInt();

		if(num<=1 || num>=10) {
			System.out.println("2~9 사이의 값을 입력하세요");
		}

		else {
			for(int i=1;i<=9;i++) {
				System.out.printf("%d x %d = %d\n",num,i,num*i);
			}
		}


	}//main
}
