package ex1_string;

import java.util.Scanner;

public class Ex7_String {
	public static void main(String[] args) {

		//입력 : aabab
		//   a2b1a1b1

		Scanner sc=new Scanner(System.in);
		System.out.print("입력 : ");
		String str=sc.next();

		String result="";//결과출력용 변수

		int cnt=1;

		for(int i=1;i<str.length();i++) {


			if(str.charAt(i) == str.charAt(i-1)) {
				cnt++;

			}

			else {
				result=result+str.charAt(i);
				result=result+cnt;
				cnt=1;
			}
		}//for

		
		System.out.println(result);




	}//main


}
