package ex5_class_array;

import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		
		Vending ven=new Vending();
	
		
		System.out.print("insert coin : ");
		ven.showCans(sc.nextInt());
		
		System.out.print("음료 선택 : ");
		ven.selectCan(sc.next());
		
	}
}
