package ex1_single_array;

import java.util.Scanner;

public class Ex2_single_array {
	public static void main(String[] args) {
		
		//배열에 값을 입력해서 저장하고 홀수와 짝수의 개수 찾아 출력
		//-------------------
		//배열의 크기:5
		//정수:5
		//정수:3
		//정수:2
		//정수:7
		//정수:10
		//-----
		//홀수:3
		//짝수:2
		
		
		Scanner sc=new Scanner(System.in);
		System.out.print("배열의 크기 :");
		int size=sc.nextInt();
		
		int cnt_1=0; //짝수 개수
		int cnt_2=0; //홀수 개수
		
		int [] num=new int [size]; //배열 선언
		
		for(int i=0;i<num.length;i++) {
			
			System.out.print("정수: ");
			num[i]=sc.nextInt();
		}
		//개선된 for문
		for(int n :num) {
			if(n%2==0)
				cnt_1++;
			else
				cnt_2++;
		}
//		
//		for(int i=0;i<num.length;i++) {
//			
//			System.out.print("정수: ");
//			num[i]=sc.nextInt();
//			if(num[i]%2==0)   //짝수
//				cnt_1 += 1;
//			else
//				cnt_2 += 1;
//		}
		
		System.out.println("----------------");
		System.out.println("홀수 : "+cnt_2);
		System.out.println("짝수 : "+cnt_1);
		
	}//main
}
