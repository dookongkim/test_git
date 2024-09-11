package ex7_work;

import java.util.Scanner;

public class Workmain {
	public static void main(String[] args) {
		
		//입력 : 123
		//123은(는) 숫자입니까? true
		
		//입력 : a12
		//a12은(는) 숫자입니까? false
		
		Scanner sc=new Scanner(System.in);
		
		IsNum isnum= new IsNum();
		
		System.out.print("입력 : ");
		String str=sc.next();
		
		System.out.print(str+"은(는) 숫자입니까?");
		System.out.println(isnum.isNum(str));
		
		
		
		
	}
}
