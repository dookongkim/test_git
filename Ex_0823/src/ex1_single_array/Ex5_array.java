package ex1_single_array;

public class Ex5_array {
	public static void main(String[] args) {

		//배열 arr에 담긴 값 중 가장 큰 값 출력 하고
		//arr의 값들을 오름차순으로 정리
		//가장 큰 값: 19
		//1 4 7 13 15 19  

		int[] arr= {4,13,7,19,1,15};

		int max=0;

		for(int i=0;i<arr.length;i++) {

			if(arr[i]>max) 
				max=arr[i];

		}
		System.out.println(max);

		

		for(int i=0;i<arr.length;i++) {

			for(int j=i;j<arr.length;j++ ) {
				if(arr[j]<arr[i]) {
					int n=arr[j];
					arr[j]=arr[i];
					arr[i]=n;

				}
				
			}

			System.out.print(arr[i]+ " ");
		}



	}//main

}
