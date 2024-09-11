package ex1_abstract;

public class AbsMain {
	public static void main(String[] args) {
		
		//추상클래스는 자식을 통해서 객체화 됨
		AbsChild ac=new AbsChild();
		ac.setVAlue(10);
		
		//추상클래스는 직접 인스턴스를 가질수 없다.
		//즉 객체화 시킬 수 없다
		AbsTest at=new AbsTest() {
			
			@Override
			public void setVAlue(int n) {
				// TODO Auto-generated method stub
				
			}
		};	
		
	
	}//main
}
