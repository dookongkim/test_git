package ex7_method_work;

public class TestResult {

	public int printRes(String str) {
		//연산 및 최종결과
		//question이 OOXXO 라면 1+2+0+0+1의 결과인 4
		//OXXOOXOOO 라면 1+0+0+1+2+0+1+2+3 의 결과인 10
		//OOXXOXXOOOO 라면
		//1+2+0+0+1+0+0+1+2+3+4 의 결과인 14 출력
		int result=0;
		int cnt=0;

		for(int i=0;i<str.length();i++) {
			if(str.charAt(i)=='O') {
				cnt++;
			}
			else if(str.charAt(i)=='X') {
				cnt=0;
			}
			result=result + cnt;
		}//for
		
		return result;
	}
}
	



