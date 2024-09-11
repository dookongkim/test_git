package ex2_multy_array;

public class ex5_multyArray {
	public static void main(String[] args) {

		int [][] arr= { {5,17,2,1},
						{11,6},
						{9,15,20},
						{13,21,30} };
		int sum=0;
		int cnt=0;
		for(int i=0;i<arr.length;i++) {

			for(int j=0;j<arr[i].length;j++) {

				sum=sum+arr[i][j];
				cnt++;
			}
		}

		float avg=sum/cnt;
		
		System.out.println("총 합 : "+sum);
		System.out.printf("평 균 : %.1f",avg);


	}//main
}
