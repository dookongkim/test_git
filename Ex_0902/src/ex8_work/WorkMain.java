package ex8_work;

import java.util.Scanner;

public class WorkMain {
	public static void main(String[] args) {
		
		//키보드에서 입력받은 문장의 홀수번째 문자만 추출하여 결과로 보여주기
		
		//클래스2개
		//입력: helloWorld
		//hlool
		
		
		Scanner sc=new Scanner(System.in);
		System.out.print("입력 : ");
		String str=sc.next();
		
		Printhol pr=new Printhol();
		pr.print1(str);
		pr.print2(str);
		
		
	}//main
}
