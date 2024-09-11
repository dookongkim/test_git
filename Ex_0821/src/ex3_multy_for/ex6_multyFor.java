package ex3_multy_for;

import java.util.Random;

public class ex6_multyFor {
	public static void main(String[] args) {
		
		//01 02 03 04 05
		//02 04 06 08 10
		//03 06 09 12 15
		//04 08 12 16 20
		//05 10 15 20 25
		
		//Random rd=new Random();
		//int n=rd.nextInt(9-5+1)+5;
		//System.out.println(n);
		
		for(int i=1;i<=5;i++) {
			
			for(int j=1;j<=5;j++) {
				
				
				System.out.printf("%02d ",j*i);
				
			}
			System.out.println();
		}
	}//main
}
