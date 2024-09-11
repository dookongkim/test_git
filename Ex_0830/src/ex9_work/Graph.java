package ex9_work;

import java.util.Scanner;

public class Graph {
	//0~9 사이의 난수를 100개 발생시킨다
	//100개의 수를 분석하여 0의 개수부터 9의 개수까지를 그래프화 하시오
	//---------------
	//110910981065177909091.....
	//0의 개수: ##### 5
	//1의 개수: ####### 7
	//2의 개수:
	//......
	//9의 개수: ### 3

	public void graph(int arr[]) {
		
		for(int i=0;i<10;i++) {
			int cnt=0;
			System.out.print(i+"의 개수 : ");
			for(int j=0;j<arr.length;j++) {
				if(i==arr[j]) {
					cnt++;		
					System.out.print("#");
				}
				
				
			}
			System.out.println(" "+cnt);
		}


	}//graph


}

