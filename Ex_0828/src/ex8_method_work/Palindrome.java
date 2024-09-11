package ex8_method_work;

public class Palindrome {
	
	String reverse="";
	
	public String rotate(String str) {
		//원본 문자열을 뒤집어서 저장하는부분
		//12321
		
		
		
		for(int i=str.length()-1;i>=0;i--) {
			
		reverse= reverse +str.charAt(i);
				
		}//for
		
		
		return reverse;
		
	}//rotate
	
	
}
