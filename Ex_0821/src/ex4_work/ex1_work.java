package ex4_work;

import java.util.Scanner;

public class ex1_work {
	public static void main(String[] args) {
		
		//키보드에서 입력받은 값 까지 반복하는 피보나치 수열
		//정수 : 5
		//1 1 2 3 5
		//정수 : 7
		//1 1 2 3 5 8 13
		
		Scanner sc=new Scanner(System.in);
		System.out.print("정수 : ");
		int insert=sc.nextInt();
		
		int sum=0;
		int num1=1;
		int num2=0;
		
		for(int i=1;i<=insert;i++) {
			
				sum=num1+num2;
				num1=num2;
				num2=sum;
			
			System.out.printf("%d ",sum );
		}
		
		
	}//main
}
