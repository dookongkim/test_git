package ex5_static;

public class Bank {
	
	//static 변수 , static 메서드
	//객체가 아무리 많아도 메모리에 딱 한개만 생성되는 변수나 메서드
	
	
	private String point;
	static float interest;
	private String tel;
	
	public Bank(String point,String tel) {
		interest=10f;
		this.point=point;
		this.tel=tel;
	}
	
	public void myBank() {
		System.out.println("지점 : "+point);
		System.out.println("전화번호 : "+tel);
		System.out.println("이자율 : "+interest );
		System.out.println("-------------");
		
	}
		
}