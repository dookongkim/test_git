package ex1_string;

import java.util.Scanner;

public class Ex3_String {
	public static void main(String[] args) {
		
		//주민등록번호 : 901122-1234567
		//당신은 90년 11월 22에 태어난 남자입니다
		
		Scanner sc=new Scanner(System.in);
		
		System.out.print("주민등록번호 : ");
		String num=sc.next();
		
		String year=num.substring(0,2);
		
		String month=num.substring(2,4);
		
		String day=num.substring(4,6);
		
		String s;
		if(num.charAt(7)=='1')
			s="남자";
		else if(num.charAt(7)!='1')
			s="여자";
		else
			s=" ";
		
		System.out.printf("당신은 %s년 %s월 %s일 에 태어난 %s 입니다.",year,month,day,s);
		
		
	}//main
}
