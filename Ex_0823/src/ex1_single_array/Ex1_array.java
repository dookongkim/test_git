package ex1_single_array;

public class Ex1_array {
	public static void main(String[] args) {
		
		//배열 : 같은 자료형 끼리 모아둔 하나의 묶음
		//효율적인 자료관리를 위해 반드시 필요
		
		int su1=100;
		int su2=200;
		int su3=300;
		int su4=400;
	
		System.out.println(su1);
		System.out.println(su2);
		System.out.println(su3);
		System.out.println(su4);
		
		System.err.println("---------------------");
		
		//1)배열 선언
		int[] arr;
		
		//2)배열 생성
		arr = new int[4];
		
		//3)초기화
		//초기화를 하지 않으면
		//정수->0 , 문자->' ', 문자열->null , 실수-> 0.0 으로 초기화 된다
		
		arr[0]=100;
		arr[1]=200;
		arr[2]=300;
		arr[3]=400;
		
		//존재하지 않는 index에 값을 넣을 수 없다
		//arr[4]=500;
		
		
		
		//배열의 선언 , 생성, 초기화를 한번에
		//    스택       힙
		//int[] arr2={10,20,30,40};
		
		for(int i=0; i<arr.length;i++)
		System.out.println(arr[i]);
		
		System.out.println("----------------------");
		
		int[] arr2= new int[3];
		//arr2[0]=10;
		//arr2[1]=20;
		//arr2[2]=30;
		
		for(int i=0; i<arr2.length;i++) {
			
			arr2[i]=(i+1)*10;
			System.out.println(arr2[i]);
		
		
		
		}
		
		}//main
		
		
		
		
	}

