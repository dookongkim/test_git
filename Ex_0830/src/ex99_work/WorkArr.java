package ex99_work;

import java.util.Random;
import java.util.Scanner;

public class WorkArr {

	//배열 strArr의 값 중 하나를 랜덤으로 가져온다
	//가져온 값을 무작위로 섞어서 보여주고 정답을 맞히는 코드를 작성
	//--------------------------------
	//문제 : PEOH
	//>> phoe
	//오답...
	//>> hope
	//정답!
	private String answer;
	private String shake;
	

	public WorkArr(String strArr[]) {
		
		shake="";
		int idx=new Random().nextInt(strArr.length);
		answer=strArr[idx]; //정답 저장
		
	}

	public String getAnswer() {
		return answer;
	}
	
	public String scrambledWord() {
		
		int[] inArr=new int[answer.length()]; //글자길이만큼의 배열 생성
		
		//inArr 배열에 중복되지않는 난수 발생시키기
		outer:for(int i=0;i<inArr.length;) {
			
			inArr[i]=new Random().nextInt(answer.length());
			
			for(int j=0;j<i;j++) {
				if(inArr[i]==inArr[j]) {
					continue outer;
				}
					
			}//inner
			
			i++;
		}//outer
		
		//위에서 발생시킨 난수를 기반으로 문장을 섞는다ㅣ
		for(int i=0;i<answer.length();i++) {
			shake+=answer.charAt(inArr[i]);
		}
		return shake;
	}
	
}










