package ex1_control_stratement;

public class Ex6_switch {
	public static void main(String[] args) {
		
		//switch문의 비교값 으로 사용될수있는 타입은
		//정수형,문자,문자열 (short,int,char,string)
		
		String last_name="박";
		
		switch (last_name) {
		case"김":
			System.out.println("22%");
			//break;
		case"나":
			System.out.println("10%");
			break;
		case"박":
			System.out.println("7%");
			break;
		case"이":
			System.out.println("17");
			break;
		default:
			System.out.println("데이터가없습니다");
			break;
		}
		
		
		
	}//main
}
