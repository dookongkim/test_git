package ex3_multy_for;

public class ex5_multyFor {
	public static void main(String[] args) {

		//* * * * *
		//1 2 3 4 5
		//* * * * *
		//1 2 3 4 5
		//* * * * *

		for(int i=1;i<=5;i++) {

			for(int j=1;j<=5;j++) {

				if(i%2==1)
					System.out.print("* ");
				else
					System.out.print(j+" ");

			}
			System.out.println();
		}
	}//main
	
}
