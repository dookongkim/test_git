package ex2_single_for;

public class ex2_singleFor {
	public static void main(String[] args) {
		
		//10부터 1까지 감소되는 값 출력
		
		/*for(int i=10;i>=1;i--) {
			
			System.out.println(i);
		}
		*/
		System.out.println("------------");
		
		//1부터 100까지 반복하는 문장에서 
		//5의 배수만 출력
		for(int i=5;i<=100;i=i+5) {
			System.out.println(i);
		}
		
		for (int i=1;i<=100;i++) {
			if(i%5==0)
			System.out.println(i);
		}
		
		for(int i=1;i<=20;i++) {
			int n=i*5;
			
			System.out.println(n);
		}
	}
}
