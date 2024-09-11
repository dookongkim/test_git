package ex7_method_work;

public class WorkMain {
	public static void main(String[] args) {
			
		//question이 OOXXO 라면 1+2+0+0+1의 결과인 4
		//OXXOOXOOO 라면 1+0+0+1+2+0+1+2+3 의 결과인 10
		//OOXXOXXOOOO 라면
		//1+2+0+0+1+0+0+1+2+3+4 의 결과인 14 출력
		
		String question="OOXXOXXOOO";
		
		TestResult t=new TestResult();
		
		System.out.println(t.printRes(question));
		
	}//main
}


