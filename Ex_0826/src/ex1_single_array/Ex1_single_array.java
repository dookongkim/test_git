package ex1_single_array;

import java.util.Scanner;

public class Ex1_single_array {
	public static void main(String[] args) {

		//학생들의 성적을 입력받고,평균성적 이상인 학생들의 수와
		//평균 이상인 학생들의 번호를 출력

		//학생수:3
		//학생1:90
		//학생2:75
		//학생3:84
		//-----------
		//평균 성적: 83.0
		//---평균이상 학생----
		//->학생1
		//->학생3
		//평균 이상 학생의 수 : 2

		Scanner sc=new Scanner(System.in);

		System.out.print("학생수 : ");
		int num=sc.nextInt();

		int sum=0;
		int cnt=0;
		float avg=0;
		
		int[] stud=new int [num]; //배열 선언하는법 

		for(int i=0;i<stud.length;i++) {
			System.out.print("학생 "+(i+1)+": ");
			stud[i]=sc.nextInt();
		}

		

		
		for(int i=0;i<stud.length;i++) {
			sum=sum+stud[i];
		}
		
		avg = (float)sum / num;
		
		System.out.printf("평균 성적 : %.1f\n",avg);
		System.out.println("---평균이상 학생---");
		
		for(int i=0;i<stud.length;i++) {
			if(stud[i]>(sum/num)) {
				System.out.println("->학생"+(i+1));
				cnt++;
			}
		}

		System.out.println("평균 이상 학생의 수 "+cnt);

	}//main
}
