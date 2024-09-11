package ex2_multy_array;

import java.util.Scanner;

public class ex8_multyArray {
	public static void main(String[] args) {

		//키보드에서 입력받은 값 보다 큰 첫번째 값을 찾아 출력하고
		//찾아낸 값이 포함된 행을 모두 출력
		//--------------------------------
		//검색 : 8
		//결과 : 9
		// 9,10,11,12

		int[][] array= {{1,2,3,4},
					{5,6,7,8},
					{9,10,11,12},
					{13,14,15,16}};

		System.out.print("검색 : ");
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();

		int i=0;
		int j=0;

		a:for(i=0;i<array.length;i++) {
			for(j=0;j<array[i].length;j++) {
				if(array[i][j]>n) {
					System.out.println("결과 : "+array[i][j]);
					
					for(int k=0;k<array[i].length;k++)
						System.out.print(array[i][k]+ " ");
					
					break a;
				}

			}

		}//for


	}//main

}
