package ex7_work;

import java.util.Scanner;

public class WorkMain {
	public static void main(String[] args) {

		//입력 : aabbcca
		//결과 : abc

		Scanner sc=new Scanner(System.in);
		
		
		System.out.print("입력 : ");
		String str=sc.next();
		
		Work1 w=new Work1();

		w.getResult(str); //결과 보여주세요
		w.Result(str);


	}//main
}
