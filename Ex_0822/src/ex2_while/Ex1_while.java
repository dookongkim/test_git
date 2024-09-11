package ex2_while;

public class Ex1_while {
	public static void main(String[] args) {
		
		//while문: 간편한 구성을 가진 반복문
		//선 비교 후 처리
		//while(조건식){
		// < 조건식이 참일 때 실행되는 영역 >
		//}
		
		int num=1;
		
		while(num<=3) {
			
			System.out.println(num);
			
			num++;
		}
		
		System.out.println("---★---");
		
		//5
		//4
		//3
		//2
		//1
		
		int n=5;
		while (n>=1) {
		System.out.println(n--);
			
		}
		
		
		
		
	}//main
	
	
}
