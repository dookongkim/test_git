package ex6_atm;

import java.util.Scanner;

public class UserMain {
	public static void main(String[] args) {
		/*
		 1.입금
		 2.출금
		 3.잔액확인
		 etc.종료
		 >> 1
		 -- 입 금 --
		 입금액 : 1000
		 입금성공
		 ----------
		 1.입금
		 2.출금
		 3.잔액확인
		 etc.종료
		 >> 3
		 -- 잔액확인 --
		 1000원
		 -----------
		 */


		Scanner sc=new Scanner(System.in);
		int money=0;

		Atm atm=new Atm();


		while(true) {
			System.out.printf("1.입금\n2.출금\n3.잔액확인\netc.종료\n");
			System.out.print(">> ");
			int n=sc.nextInt();
			if(n==1) 
				atm.insertMoney();
			else if(n==2) {
				atm.outMoney();
			}
			else if(n==3) {
				atm.checkMoney();
			}
			else {
				System.out.println("종료합니다");
				break;
			}
		}
	}//main
}
