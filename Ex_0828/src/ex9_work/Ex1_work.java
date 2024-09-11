package ex9_work;

import java.util.Scanner;

public class Ex1_work {
	public static void main(String[] args) {
		char [] origin = {'a','b'};
		//키보드에서 입력받은 값을 암호화 한 결과를 출력
		//---------------------------
		//입력: abc123
		//결과: `~!wer
		//
			
		
		Scanner sc=new Scanner(System.in);
		System.out.print("입력 : ");
		String input=sc.next();
		Encryption e=new Encryption();
		
		String a=e.en(input);
		System.out.println(a);
		
		
	}//main
}
