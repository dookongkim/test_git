package ex4_super;

public class Child extends Parent {
	
	//super : 부모클래스
	//super() : 부모생성자
	//super.method(); : 부모의 메서드
	//super.name : 부모의 변수

		public Child() {
			super();//부모클래스의 생성자
			System.out.println("Child의 생성자");
		}
		@Override
		public int getValue() {
			//Parent.getValue();
		//return super.getValue();
			return 100;
		}
		
		
		public void setValue(int value) {
			super.value=value;
			
		}
		
		
		
}
