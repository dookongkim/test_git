package ex3_multy_for;

import java.nio.file.spi.FileSystemProvider;

public class ex1_multyFor {
	public static void main(String[] args) {

		//다중for문:for문 안에 for문이 들어가 있는 경우
		//1 2 3 4 5
		//1 2 3 4 5
		//1 2 3 4 5
		//

		for(int i=1;i<=3;i++) { //행(y)

			for(int j=1;j<=5;j++) { //열(x)
				System.out.print(j +" ");
			}//inner
			System.out.println();
		}//outer
		System.out.println("----------------");

		for(int i=1;i<=3;i++) {
			for(int j=3;j>=1;j--) {
				System.out.print(j+" ");
			}
			System.out.println();
		}




	}//main
}