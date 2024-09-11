package ex7_work;

public class IsNum {
	
	public boolean isNum(String str) {	
		
		
																									
		for(int i=0;i<str.length();i++) {
			char ch=str.charAt(i);

			if(ch<'0'||ch>'9')
				return false;
		}		
		return true;
	}
	
}
