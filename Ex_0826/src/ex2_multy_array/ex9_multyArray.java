package ex2_multy_array;

import java.util.Scanner;

public class ex9_multyArray {
	public static void main(String[] args) {

		//학생들의 수학, 영어성적을 등록하는 프로그램이 있다
		//몇 명의 정보를 저장할것인지 입력받고
		//그 수만큼 학생들의 이름,수학,영어 를 추가하자
		//------------------------------------
		//등록인원 : 2
		//이름 : hong
		//수학 : 90
		//영어 : 87
		//------------
		//이름 : kim
		//수학 : 77
		//영어 : 100
		//------------
		//2명 등록 성공
		//hong 90 87
		//kin 77 100
		Scanner sc=new Scanner(System.in);

		System.out.print("등록인원 : ");
		int n=sc.nextInt();

		String sub[]= {"이름","수학","영어"};
		

		String info [][] = new String[n][sub.length];   // 배열 선언



		for(int i=0;i<info.length;i++) {

			for(int j=0;j<info[i].length;j++) {
				
				System.out.print(sub[j]+" : "); 
				
				info [i][j]=sc.next();
			}
			System.out.println("-----------");
		}

		
		System.out.println(n+"명 등록성공");
		for(int i=0;i<info.length;i++) {
			for(int j=0;j<info[i].length;j++) {
				System.out.print(info[i][j]+ " ");
			}
			System.out.println();
		}







	}//main
}
