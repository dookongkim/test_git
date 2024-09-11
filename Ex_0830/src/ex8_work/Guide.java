package ex8_work;

import java.util.Scanner;

//가이드 클래스
public class Guide {
	
	
	Scanner sc=new Scanner(System.in);
	
	

	public int MenuList() {
		
		System.out.println("1.관광객 정보");
		System.out.println("2.목적지 변경");
		System.out.println("3.etc.종료");
		System.out.print(">>");
		int n=sc.nextInt();
		return n;
	}
	
	
	
}
