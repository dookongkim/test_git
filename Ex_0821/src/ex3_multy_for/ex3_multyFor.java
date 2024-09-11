package ex3_multy_for;

public class ex3_multyFor {
	public static void main(String[] args) {

		//*
		//* *
		//* * *
		//* * * * 
		//* * * * *
		
		for(int i=1;i<=5;i++) {

			for(int j=1;j<=i;j++) {

				System.out.print("* ");
			}

			System.out.println();
		}


		
		
		
		   int num=1;

		for(int i=1;i<=5;i++) {

			for(int j=1;j<=num;j++) {

				System.out.print("* ");
			}
			num++;
			System.out.println();
		}



	}//main
}
