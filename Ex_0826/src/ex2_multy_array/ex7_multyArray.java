package ex2_multy_array;

public class ex7_multyArray {
	public static void main(String[] args) {
		
		//2차원 배열 array 에서 3의 배수를 제외한 값들만 출력한다
		
		
		int[][] array= {{1,2,3},
						{4,5,6},
						{7,8,9}};

		for(int i=0;i<array.length;i++)
			for(int j=0;j<array[i].length;j++) {
				if(array[i][j]%3!=0)
				System.out.println(array[i][j]);
			}
		
		
		
		
	}//main
}
