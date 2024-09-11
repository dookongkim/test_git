package ex6_label;

import java.util.Scanner;

public class Ex4_label_workl {
	public static void main(String[] args) {
		
		//2 ~ 12 사이의 n값을 키보드에서 입력받는다.
		//1~6까지의 숫자로 이루어진 두 개의 주사위가 던져졌을 때
		//합이 키보드에서 입력받은 n값이 되는 첫번째 경우의 수를 출력
		//값 : 13
		//올바른 범위의 값을 입력하시오
		//값 : 5
		//(1,4)
		
		Scanner sc=new Scanner(System.in);
		int n=0;
		
		while(true) {
		if(n<2 || n>12) {
			System.out.println("올바른 범위의 값을 입력하시오");
			System.out.print("값 : ");
		n=sc.nextInt();
		}
		else
		break;
		}//while
		
		int i=0;
		int j=0;
		
		go:for(i=1;i<=6;i++) {
			for(j=1;j<=6;j++) {
				if((i+j)==n)
				break go;
			}
		}
		System.out.printf("(%d,%d)",i,j);
			
		
		
		
		
		
		
		
		
		//back:do{
		//	
		//System.out.print("값 : ");
		//n=Sc.nextInt();
		//}while(n>=2&&n<=12);
		
	
		
	}//main
}
