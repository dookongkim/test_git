package ex6_generic;

public class GenMain {
	public static void main(String[] args) {
		
		
		Gen<String> gen=new Gen<String>();
		gen.setValue("hi");
		String s=gen.getValue();
		System.out.println(s);
		
		//제너릭 타입은 기본 자료형을 인식하지 못하므로
		//int 를 넣고싶다면 Integer
		//char -> Character 와 같은
		//기본자료형의 Wrapper 클래스가 정의되야 함
		
		Gen<Integer> gen2=new Gen<Integer>();
		gen2.setValue(2334);
		int n=gen2.getValue();
		System.out.println(n);
		
		Gen<Character> gen3=new Gen<Character>();
		gen3.setValue('c');
		char c=gen3.getValue();
		System.out.println(c);
	}
}
