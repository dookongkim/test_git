package ex4_continue;

public class Ex1_continue {
	public static void main(String[] args) {
		
		//continue문 : 반복문 내에서 특정 문장을 건너뛸 때 사용
		
		for(int i = 1; i<=3;i++) {
			for(int j=1;j<=5;j++) {
				
				if(j%2==0) {
					
					//for문 안에서 호출된 continue 라면
					//단 ,증감식이 없다면 조건식으로 간다
					//가장 가까운 for문의 증감식으로 간다
					continue;
				}
				
				System.out.print(j+ " ");
				
			}
			
			System.out.println();
		}
		
		
	}//main
}