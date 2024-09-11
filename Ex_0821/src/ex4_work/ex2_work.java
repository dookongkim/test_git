package ex4_work;

public class ex2_work {
	public static void main(String[] args) {
		
		//2중for문 
		//1 2 3 4 5 6 7 8 9 10
		//2 3 4 5 6 7 8 9 10 1
		//3 4 5 6 7 8 9 10 1 2
		//총 100개 출력
		//10 1 2 3 4 5 6 7 8 9
		
		for(int i=1;i<=10;i++) {
			
			for(int j=i;j<=10;j++) {
				System.out.print(j +" ");
			}
			for(int j=1;j<=i-1;j++) {
				System.out.print(j +" ");
			}
			
			System.out.println();
		}//outer
		
		System.out.println("--------------------");
		
		for(int i=1;i<=10;i++) {
			
			for(int j=0;j<10;j++) {
				
				int num= i+j;
				if(num>10)
					num-=10;
				System.out.print(num+" ");
				
			}
			
			System.out.println();
			
			
		}
		
		
		
	}//main
}
