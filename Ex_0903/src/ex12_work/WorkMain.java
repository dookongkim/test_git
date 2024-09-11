package ex12_work;

public class WorkMain {
	public static void main(String[] args) {
		
		//1~100 사이의 난수 두개를 더하는 문제
		//답을 입력하여 5문제가 정답처리될 때 까지 코드를 반복
		//게임이 끝날 때 5문제를 모두 맞히는데 몇초가 걸렸는지 출력
		//--------------------------
		//23 + 48 = 71
		//정답
		//21 + 36 = 10
		//오답 
		//......
		//결과: 9초
		
		
		ThreadNum t=new ThreadNum();
		t.start();
		t.PlusExam();
		
		
		
		
	}//main
	
	
}
