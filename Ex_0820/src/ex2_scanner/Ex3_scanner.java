package ex2_scanner;

import java.util.Scanner;

public class Ex3_scanner {
	public static void main(String[] args) {

		//출력할 달 : 8
		//8월은 31일까지 있습니다

		Scanner sc=new Scanner(System.in);

		System.out.print("출력할 달 : ");
		int month=sc.nextInt();

		switch (month) {

		case 1:case 3:case 5:
		case 7:case 8:case 10:case 12:
			System.out.println(month+"월은 31일까지 있습니다");
			break;
		case 2:
			System.out.println(month+"월은 28일까지 있습니다");
			break;
		case 4:case 6:case 9:case 11:
			System.out.println(month+"월은 30일까지 있습니다");
			break;	
		default:
			System.out.println(month+"월은 없는 달입니다");
			break;
		}//switch
	}//main
}
