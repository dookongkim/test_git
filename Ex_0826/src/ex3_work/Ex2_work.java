package ex3_work;

import java.util.Scanner;

public class Ex2_work {
	public static void main(String[] args) {

		//키보드에서 입력받은 값 크기의 홀수 마방진 만들기
		//----------------------------------
		//3*3/5*5/7*7
		//가로라인/세로라인,대각선의 합이동일하다
		//홀수 : 3 or 5 or 7
		//08 01 06
		//03 05 07
		//04 09 02
		//n*n 배열 이용하여 정리

		Scanner sc=new Scanner(System.in);

		System.out.print("홀수 : ");
		int n=sc.nextInt();

		int col=0;
		int row=0;

		int val=1;
		
		col=n/2;
		int[][] arr=new int[n][n];
		//         3 3
		while(val<=n*n) {
			arr[row][col]=val;// val = 1~s^2까지

			if(val%n==0) {
				row++;
			}
			else {
				row--;
				col++;
			}				
			
			if(row<0)
				row=n-1;
			if(row>=n)
				row=0;
			if(col<0)
				col=n-1;
			if(col>=n)
				col=0;

			val++;
		}


		for(int k=0;k<arr.length;k++) {
			for(int j=0;j<arr[k].length;j++) {
				System.out.print(arr[k][j]+ " ");
			}
			System.out.println();
		}

	}//main
}
