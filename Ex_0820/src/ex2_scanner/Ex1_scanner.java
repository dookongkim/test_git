package ex2_scanner;

import java.util.Scanner;

public class Ex1_scanner {
	public static void main(String[] args) {
		
		//키보드에서 직접 값을 입력받기위해 사용하는 클래스
		Scanner sc= new Scanner(System.in);
		
		System.out.println("정수 : ");
		int num= sc.nextInt();
		System.out.println(num);
		
		System.out.println("문자열 : ");
		String str=sc.next();
		System.out.println(str);
		
	}//main
}
