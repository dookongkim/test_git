package ex9_work;

import java.util.Random;

public class WorkMain {
	public static void main(String[] args) {
		
		//0~9 사이의 난수를 100개 발생시킨다
		//100개의 수를 분석하여 0의 개수부터 9의 개수까지를 그래프화 하시오
		//---------------
		//110910981065177909091.....
		//0의 개수: ##### 5
		//1의 개수: ####### 7
		//2의 개수:
		//......
		//9의 개수: ### 3
		
		Random r=new Random();
		int[] n=new int[100];
		
		for(int i=0;i<n.length;i++) 
		n[i]=r.nextInt(10)+0; // 100개 난수 생성
		
		Graph g=new Graph();
		g.graph(n);
		
		
		
	}//main
}
