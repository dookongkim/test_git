package ex1_inheritance;

public class ExtendsMain {
	public static void main(String[] args) {
		
		Child c=new Child();
		//상속관계에서 자식클래스는 부모가 가진 속성이나 메서드를 자유롭게 가져다 쓸 수 있다.
		System.out.println(c.car);
		System.out.println(c.str);
		
		
		//부모클래스는 자식의 속성이나 메서드를 마음대로 가져다 쓸 수 없다.
		Parent p=new Parent();
		//System.out.println(p.car);
		
		//c 라는 객체가 Parent와 인스턴스가 같은지 확인
		if(c instanceof Parent) {
			System.out.println("c는 Parent의 자식");
		}
		
		
		
	}//main
}
