package ex8_work;

public class Printhol {

	
	public void print1(String str) {
		for(int i=0;i<str.length();i++) {
			if(i%2==0)
				System.out.print(str.charAt(i));
		}
		System.out.println();
	}//print1
	
	public void print2(String str) {
		
		for(int i=0;i<str.length();i+=2) {
			System.out.print(str.charAt(i));
			
		}
		
	}//print2
	
	
	
	
}
