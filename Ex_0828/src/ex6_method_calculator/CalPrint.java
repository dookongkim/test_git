package ex6_method_calculator;

public class CalPrint {

	public void printResult(int n,int m,String str) {

		switch (str) {
		case "+": 
			System.out.printf("%d + %d = %d\n",n,m,n+m );
			break;
		case "-": 
			System.out.printf("%d - %d = %d\n",n,m,n-m );
			break;
		case "*": 	
			System.out.printf("%d * %d = %d\n",n,m,n*m );
			break;
		case "/": 
			System.out.printf("%d / %d = %d\n",n,m,n/m );
			break;
		}
	}
}
