package ex1_control_stratement;

public class Ex8_switch {

		public static void main(String[] args) {
			
			int month=9;
			
			switch (month) {
			
			case 1:
			case 3:
			case 5:
			case 7:
			case 8:
			case 10:
			case 12:
				System.out.println(month+"월은 31일까지 있습니다");
				break;
			case 2:
				System.out.println(month+"월은 28일까지 있습니다");
				break;
			case 4:
			case 6:
			case 9:
			case 11:
				System.out.println(month+"월은 30일까지 있습니다");
				break;
				
			default:
				System.out.println(month+"월은 없는 달입니다");
				break;
			}
		}
}
