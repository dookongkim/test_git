package ex1_control_stratement;

public class Ex7_switch {
	public static void main(String[] args) {
		
		//8월은 31일까지 있습니다
		
		//2월은 28일까지 있습니다

		//13월은 없습니다

		
		int month=8;
		
		switch (month) {
		
		case 1:
			System.out.println("1월은 31일까지 있습니다");
			break;
		case 2:
			System.out.println("2월은 28일까지 있습니다");
			break;
		case 3:
			System.out.println("3월은 31일까지 있습니다");
			break;
		case 4:
			System.out.println("4월은 30일까지 있습니다");
			break;
		case 5:
			System.out.println("5월은 31일까지 있습니다");
			break;
		case 6:
			System.out.println("6월은 30일까지 있습니다");
			break;
		case 7:
			System.out.println("7월은 31일까지 있습니다");
			break;
		case 8:
			System.out.println("8월은 31일까지 있습니다");
			break;
		case 9:
			System.out.println("9월은 30일까지 있습니다");
			break;
		case 10:
			System.out.println("10월은 31일까지 있습니다");
			break;
		case 11:
			System.out.println("11월은 30일까지 있습니다");
			break;
		case 12:
			System.out.println("12월은 31일까지 있습니다");
			break;

		default:
			System.out.println("1월~12월 까지 입력");
			break;
		}
		
		
		
	}
}
