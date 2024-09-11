package ex1_control_stratement;

public class Ex4_switch {
	
		public static void main(String[] args) {
			
			//if문과 유사하게 생겼지만,switch문은 () 안에 조건식이 아닌 비교값이 들어가며
			//비교값과 조건값을 비교하는 구조
			//switch(비교값){
			// case 조건값: 
			//      <비교값과 조건값이 일치할 때 실행되는영역>
			// break;
			//}
			
			//1.비교값과 조건값의 타입 동일해야함
			//2.조건값이 중복되어선 안됨
			
			int n=2;
			switch(n) {
			case 1:
				System.out.println("1.게임하기");
				break; // switch문 탈출하는 키워드
			case 2:
				System.out.println("2.게임설명");
				break;
			case 3:
				System.out.println("3.제작자");
				break;
				
			default: //비교값과 조건값이 하나도 일치하지 않을때 실행
					System.out.println("올바른 메뉴를 선택하시오");
				break;
				
			}
		
			
			
			
		}

}
