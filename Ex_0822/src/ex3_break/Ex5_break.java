package ex3_break;

import java.util.Scanner;

public class Ex5_break {
	public static void main(String[] args) {

		//키보드에서 정수 두개를 입력받아, 두 수의 최대공약수 구하기
		//수1 : 10
		//수2 : 4
		//최대공약수 : 2

		//최대공약수가 없습니다

		Scanner sc=new Scanner(System.in);
		System.out.print("수1 : ");
		int n1=sc.nextInt();
		System.out.print("수2 : ");
		int n2=sc.nextInt();

		if(n1<n2) {
			int num=n2;
			n2=n1;
			n1=num;
		}
		int a=n2;
		int i=n1;

		
		for(;i>=1;i--) {

			if( n1%i==0 && n2%i==0 ) {			
				break;
			}
			
		}//for
		if(i==1)
		System.out.println("최대공약수가 없습니다");
		else
		System.out.println("최대공약수 :"+i);

	}//main
}
