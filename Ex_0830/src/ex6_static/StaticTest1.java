
package ex6_static;

public class StaticTest1 {

	int n;
	static String str;

	public void inputTest() {
		n=10;
		str="안녕";
		int num=10;

		//일반 메서드에서는 static 변수의 선언,생성이 불가능
		//static int num2=20;

	}

	public static void inputTest2() {
		//static 메서드에서는 일반 변수의 사용이 불가.
		//n=20;
		str="반가워";

		//static 메서드 에서 만들어진 지역변수는
		//기본타입이여도 (static이 아니여도) 사용이 가능
		int num=10;
		
		//static 메서드에서는 static 변수의 선선,생성이 불가능
		//static int num2=20;


	}

}