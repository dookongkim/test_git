package ex3_work;

import java.util.Scanner;

public class Ex1_switch_work {
	public static void main(String[] args) {
		
		//키보드에서 정수 두개와 연산자를 입력받는다
		//입력받은 두 정수의 연산 결과 출력
		//------------------------
		//정수1 : 15
		//정수2 : 20
		//연산자 : +
		//15+20 = 35
		
		Scanner sc=new Scanner(System.in);
		
		System.out.print("정수1 : ");
		int num1=sc.nextInt();
		System.out.print("정수2 : ");
		int num2=sc.nextInt();
		
		System.out.print("연산자 : ");
		String cal=sc.next();
		
		int result=0;
		switch (cal) {
		case "+":
		result= num1+num2;
			break;
		case "-":
		result= num1-num2;
			break;
		case "*":
		result= num1*num2;
			break;
		case "/":
		result= num1/num2;
			break;
		default:
			System.out.println("올바른 연산자를 입력하시오");
			break;
		}//switch
		System.out.println(num1+cal+num2+"="+result);
	}//main
}
