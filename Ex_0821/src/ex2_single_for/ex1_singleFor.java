package ex2_single_for;

public class ex1_singleFor {
	public static void main(String[] args) {
		
		//for문 : 특정 명령을 원하는만큼 반복적으로 처리할 떄 사용
		//for( 초기식;조건식;증감식 ){
		// <조건식이 참일때 수행되는 영역>
		//}
		
		int n=0; //전역변수
		
		for(int i=0; i<=2; i++) {
			//i 는 for문에서의 지역변수
			//for문을 벗어나면 사용할수 없음
			System.out.println(i);
		}
		
		System.out.println("---------------");
		
		int a=1;
		for(;a<3;a++) {
			System.out.println(a);
		}
		
		System.out.println(a);
		
		
		
	}//main
}
