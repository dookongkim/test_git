package ex2_multy_array;

public class ex6_multyArray {
	public static void main(String[] args) {
		
		//2차원 배열 array에서 5를 초과하는 첫번 째 값을 찾아 출력하시오
		
		int[][] array= { {1,2,3},
						 {4,5,6},
						 {7,8,9}};
		
		a:for(int i=0;i<array.length;i++) {
			
			for(int j=0;j<array[i].length;j++) {
				
				if(array[i][j]>5) {
					System.out.println(array[i][j]);
					break a;
				}
			}
		}
		
	}//main
}



