package ex1_single_array;

import java.util.Scanner;

public class Ex3_array {
	public static void main(String[] args) {
		//키보드에서 정수를 입력받습니다
		//입력받은 정수만큼 알파벳을 A부터 순차적으로 출력
		//-----------------
		//값 : 5
		//ABCDE
		
		Scanner sc=new Scanner(System.in);
		
		System.out.print("값 : ");
		int n=sc.nextInt();
		char[] c= new char[n];
		
		char k='A';
		
		for(int i=0;i<c.length;i++) {	
			c[i]=k++;
			
		System.out.print(c[i]);
		
		}
		
	}//
}
