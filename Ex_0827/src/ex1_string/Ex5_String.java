package ex1_string;

import java.util.Scanner;

public class Ex5_String {
	public static void main(String[] args) {

		//키보드에서 입력받은 값이 회문(수)인지 판단하기  12321 // 23432 // 기러기  토마토 스윙스  42중24
		//-----------------------------
		//입력:ab11ba
		//ab11ba 은(는) 회문입니다

		//입력:abcde
		//abcde 은(는) 회문이 아닙니다

		Scanner sc=new Scanner(System.in);
		System.out.print("입력 : ");
		String str=sc.next();

		for(int i=0;i<str.length();i++) {

			if(str.charAt(i)!=str.charAt(str.length()-i-1)) {
				System.out.println(str+" 은(는) 회문이 아닙니다.");
				break;
			}
			else if(i==str.length()-1)
				System.out.println(str+" 은(는) 회문입니다.");

			else 
				continue;	


		}//for


	}//main
}
