package ex2_single_for;

import java.util.Scanner;

public class ex6_singleFor {
	public static void main(String[] args) {


		//키보드에서 정수 n1, n2를 입력받는다
		//n1부터 n2까지의 합을 계산하여 출력
		//단,n1,n2의 순서를 다르게 입력하여도 결과는 똑같이 출력한다
		// 수1:
		// 수2:
		// 결과:

		Scanner sc=new Scanner(System.in);
		int sum=0;

		System.out.print("수1 : ");
		int n1=sc.nextInt();
		System.out.print("수2 : ");
		int n2=sc.nextInt();

		if(n1>n2) {
			int num=n1;
			n1=n2;
			n2=num;
		}

		for(int i=n1;i<=n2;i++) 
			sum+=i;


		System.out.printf("결과 : %d \n",sum);


	}//main
}