package ex2_multy_array;

public class ex1_multyArray {
	public static void main(String[] args) {
		
		//다차원 배열
		//1차원 배열이 2개 모이면 2차원 배열
		//1차원 배열이 3개 모이면 3차원 배열
		
		//new int [1차원 배열의 수][각 1차원 배열의 index수];
		//new int[큰방][작은방];
		
		
		int [][] arr1= new int [2][3];
	
						 //   0    1   2
		arr1[0][0]=100;  //0 100 200 300
		arr1[0][1]=200;  //1 400 500 600
		arr1[0][2]=300;
		
		arr1[1][0]=400;
		arr1[1][1]=500;
		arr1[1][2]=600;

		System.out.println(arr1[1][1]);
		
		for(int i=0;i<arr1.length;i++) {
			for(int j=0;j<arr1[i].length;j++) {
				System.out.print(arr1[i][j]+" ");
			}
			System.out.println();
		}
	}//main
}
