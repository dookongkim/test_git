package ex1_overloading;

public class OverloadMain {
	public static void main(String[] args) {
		
		OverloadTest ot=new OverloadTest();
		
		ot.result();
		ot.result(10);
		ot.result('A');
		ot.result("hi",22);
		ot.result(22,"hi");
		
		System.out.println('A');
		
	}
}
