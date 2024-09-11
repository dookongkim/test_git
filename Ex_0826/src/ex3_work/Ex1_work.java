package ex3_work;

public class Ex1_work {
	public static void main(String[] args) {
		
		
		//2차원 배열 arr에 값을 담고 출력하시오
		//----------------------
		//0 1 2 3
		//1 2 3 4
		//2 3 4 5
		//3 4 5 6
		
		int [][]arr=new int[4][4];
		
		int i=0;
		int j=0;
		int cnt=0;
		for(i=0;i<arr.length;i++) {
			
			
			for(j=0;j<arr[i].length;j++) {
				arr[i][j]=arr[i][j]+i+j;
				
			}//inner
			
			System.out.println();
		}//outer
		
		
		for(int k=0;k<arr.length;k++) {
			for(int l=0;l<arr[k].length;l++) {
				System.out.print(arr[k][l]+" ");
			}
			System.out.println();
		}
		
		
		
	}//main
}
