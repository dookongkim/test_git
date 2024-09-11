package ex4_constructor;

public class PenMain {
	public static void main(String[] args) {
		
		Pen p1=new Pen();
		
		Pen p2=new Pen("gold");
		//생성자는 new 와 함께 사용된 후 , 재 호출이 불가하다
		//p2.Pen();
		
		System.out.println(p2.getColor());
		
		Pen p3=new Pen(500,"black") ;
			
		
	}
	
	
	
	
}
