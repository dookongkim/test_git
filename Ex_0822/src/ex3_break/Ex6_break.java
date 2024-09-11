package ex3_break;

import java.util.Scanner;

public class Ex6_break {
	public static void main(String[] args) {
		
		//소수 판단하기  1과 자기자신
		//정수 : 3
		//3은 소수
		
		//정수 : 10
		//10은 소수가 아님
		
		//정수 : 1
		//1은 소수가 아님
		Scanner sc=new Scanner(System.in);
		
		/*System.out.print("정수 : ");
		int num=sc.nextInt();
		int i=0;
		
		
		for(i=num-1;i>=1;i--) {
			
			if(num%i==0) {
				break;
			}
		}
		if(i==1)
			System.out.println(num+"은 소수");
		else
		System.out.println(num+"은 소수가 아님");
		
		*/
		System.out.println("정수:");
		int n=sc.nextInt();
		
		
		int i=0;
		for(i=2;i<=n;i++) {
			if(n%i==0)
				break;
		}
		if( i==n )
			System.out.println(n+"은 소수");
		else
			System.out.println(n+"은 소수가 아님");
		
		
		
	}//main
}












