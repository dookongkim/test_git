package ex1_control_stratement;

public class Ex1_if {
	public static void main(String[] args) {
		
		//제어문: 프로그램의 흐름 제어
		//분기문과 반복문으로 나뉨
		//분기문:if,switch
		//반복문:for,while
		
		//단순 if문
		//if(조건식){
		//   <조건식이 참일떄 실행되는 영역>
		//}
		
		int n=51;
		String str = "";
		
		if ( n==50 ) {
			str="n은 50입니다";
		}
		if(n!=50)
			str="n은 50이 아닙니다";
		
		System.out.println(str);
		
		
	}

}
