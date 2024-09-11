package ex99_work;

import java.util.Scanner;

public class WokrMain {
	public static void main(String[] args) {

		//배열 strArr의 값 중 하나를 랜덤으로 가져온다
		//가져온 값을 무작위로 섞어서 보여주고 정답을 맞히는 코드를 작성
		//--------------------------------
		//문제 : PEOH
		//>> phoe
		//오답...
		//>> hope
		//정답!

		String[] strArr= {"CHANGE","HOPE","VIEW"};
		Scanner sc=new Scanner(System.in);
		WorkArr w=new WorkArr(strArr);

		String answer=w.getAnswer();//정답 
		String question=w.scrambledWord();//섞은 단어

		System.out.println("문제 : "+question);
		while(true) {
			System.out.print(">> ");

			if(sc.next().equalsIgnoreCase(answer)) {
				System.out.println("정답");
				break;
			}
			else {
				System.out.println("오답");
			}

		}

	}//main
	
}

