package ex1_string;

import java.util.Scanner;

public class Ex4_String {
	public static void main(String[] args) {

		//키보드에서 아무 값이나 입력받은뒤,
		//입력받은 문자에서 소문자 a의 개수를 판단하시오
		//-------------------------
		//입력 : Aaidasdvsfszxca
		//a의 개수:


		Scanner sc=new Scanner(System.in);

		System.out.print("입력 : ");
		String input=sc.next();
		int cnt=0;

		for(int i=0;i<input.length();i++) {
			if(input.charAt(i)=='a')
				cnt++;
		}

		System.out.print("a의 개수 : "+cnt);

	}//main
}
