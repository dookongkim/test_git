package ex8_work;
//가이드클래스,관광객클래스,메인  , static 사용

import java.util.Scanner;

//관광객 수 : 2  키보드입력
//1.이름 : hong
//1.나이 : 20
//-------------
//2.이름 : kim
//2.나이 : 22
//-------------
//1.관광객 정보
//2.목적지 변경
//3.etc.종료
//>>1
//
//1.이름:hong
//1.나이:20
//1.목적지 : 불국사 
//-------------
//2.이름:kim
//2.나이:22
//2.목적지 : 불국사 
//-------------
//1.관광객 정보
//2.목적지 변경
//3.etc.종료
//>>2
//
//어디로 변경? : 석굴암
//-------------
//1.관광객 정보
//2.목적지 변경
//3.etc.종료


public class WorkMain {
	public static void main(String[] args) {

		Scanner sc=new Scanner(System.in);

		Travel t=new Travel();
		Guide g=new Guide();

		System.out.print("관광객 수 :");

		t.InsertInfo(sc.nextInt());

		
		while(true) {
		int n=g.MenuList(); 

		if(n==1) {
			t.Tourist(); 
		}
		else if(n==2) {
			t.Change();
			
		}
		else if(n==3)
			break;

		}


	}//main



}














