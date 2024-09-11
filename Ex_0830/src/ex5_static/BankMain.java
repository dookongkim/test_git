package ex5_static;

public class BankMain {
	public static void main(String[] args) {
		
		Bank b1=new Bank("강남","02-1234-5678");
		Bank b2=new Bank("홍천","033-1234-5678");
		Bank b3=new Bank("서강대","02-2222-2222");
		
		//static은 객체생성(new) 없이도 클래스명.을 통해 바로 사용가능
	
		Bank.interest=0.1f;
		
		b1.myBank();
		b2.myBank();
		b3.myBank();
		
		
		
		
		
		
	}//main
}
