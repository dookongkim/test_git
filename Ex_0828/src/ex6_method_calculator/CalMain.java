package ex6_method_calculator;

import java.util.Scanner;

public class CalMain {
	public static void main(String[] args) {
		
		Scanner sc=new Scanner(System.in);
		System.out.print("수1 : ");
		int n1=sc.nextInt();
		
		System.out.print("수2 : ");
		int n2=sc.nextInt();
	
		System.out.print("연산자 : ");
		String cal=sc.next();
		
		CalPrint calgo = new CalPrint();
		calgo.printResult(n1,n2,cal);
	}
	
	
}
