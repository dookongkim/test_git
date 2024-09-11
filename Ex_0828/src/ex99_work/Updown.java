package ex99_work;



public class Updown {

	int cnt=0;
	String result="";

	public String check(int n,int random) {
		//키보드에서 받은 값이 up인지,down인지,정답인지 판단
		//Up&Down 게임 만들기
		//값:30
		//Down
		//값:15
		//UP
		//값:21
		//3회만에 정답
		if(n>random) {
			System.out.println("Down");
			result="오답";
		}
		else if(n<random) {
			System.out.println("Up");
			result="오답";
		}
		else if(n==random) {
			result="정답";
		}
		return result;
	
	}

}
