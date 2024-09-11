package ex3_work;

import java.util.Scanner;

public class Ex2_if_work {
	public static void main(String[] args) {

		//윤년 구하기
		//윤년 : 1.연도가 4로 나누어 떨어지면 윤년
		//2.연수가 100으로 나누어 떨어지는 해는 평년
		// ->4년주기에 포함되어 있어도 100으로 나눠 떨어지면 평년
		// 즉 ->4년주기에 포함되어 있고 100으로 나눠 떨어지지 않으면 윤년
		//3.100으로 나눠지더라도 400으로도 나눠지면 윤년
		//년도 : 2024
		//2024년은 윤년입니다

		Scanner sc=new Scanner(System.in);
		System.out.print("년도 : ");

		int y=sc.nextInt();
		
       
		//  (4의 배수 100배수 빼고 =윤년) or  400배수=윤년
		if((y%4==0 && y%100!=0)||(y%400==0))
			System.out.println(y+"년은 윤년입니다");
		else
			System.out.println(y+"년은 평년입니다");
		
		
		
		
		/*
		if(y%4==0) {
			year="윤년";
			if(y%100==0) { 
				year="평년";
				if(y%400==0) { 
					year="윤년";
				}
			}
		}//if
		else
			year="평년";
			*/
	}//main
}

