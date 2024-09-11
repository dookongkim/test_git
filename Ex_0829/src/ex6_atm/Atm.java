package ex6_atm;

import java.util.Scanner;

public class Atm {

	private int total_money;

	public int getTotal_money() {
		return total_money;
	}

	public void setTotal_money(int total_money) {
		this.total_money = total_money;
	}

	Scanner sc=new Scanner(System.in);

	//입금기능
	public void insertMoney() {
		System.out.println("-- 입 금 --");
		System.out.print("입금액 : ");
		total_money+=sc.nextInt();
		System.out.println("입금 성공");
		System.out.println("----------");
	}

	//출금기능
	public void outMoney() {
		
		System.out.println("-- 출 금 --");
		System.out.print("출금액 : ");
		total_money-=sc.nextInt();
		System.out.println("출금 성공");
		System.out.println("----------");
	}
	//잔액확인
	public void checkMoney() {
		System.out.println( "-- 잔액확인 --");
		System.out.println(total_money);
		System.out.println("-----------");
	}	
}
