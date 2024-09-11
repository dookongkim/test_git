package ex1_random;

import java.util.Random;

public class Ex1_random {
	public static void main(String[] args) {
		
		//1~5사이의 난수 발생
		//new Random().nextInt(난수의 범위)+시작수
		
		int n1 = new Random().nextInt(4)+2;
		
		System.out.println(n1);
		
		//1024~33152 사이의 난수
		//new Random().nextInt(끝수-시작수+1) +시작수
		int n2= new Random().nextInt(33152-1024+1)+1024;
		
		System.out.println(n2);
		
		
		System.out.println("-----------------------");
		//2~9사이의 난수를 발생시켜 구구단 출력
		
		int num= new Random().nextInt(9-2+1)+2;
		
		for(int i=1;i<=9;i++)
			System.out.printf("%d X %d = %d\n",num,i,num*i);
		
		
	}//main
}
