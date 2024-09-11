package ex2_while;

public class Ex3_do_while {
	public static void main(String[] args) {
		
		//do-while 문 :선 처리 후 비교
		//do{
		// < 조건식이 참일때 실행되는 영역>
		//}while(조건식);
		
		int a=5;
		
		do {
			
			//조건식에 상관없이 최소 한 번은 반드시 실행
			System.out.println(a++);
			
		}while(a<=10);
		
		
		
	}//main
}
