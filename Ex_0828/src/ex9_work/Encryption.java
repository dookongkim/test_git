package ex9_work;

public class Encryption {

	//키보드에서 입력받은 값을 암호화 한 결과를 출력
	//---------------------------
	//입력: abc123
	//결과: `~!wer


	char[] abc= {'a','b','c','d','e','f','g','h','i','j','k','l','m','n','o','p','q','r','s','t','u','v',
			'w','x','y','z','0','1','2','3','4','5','6','7','8','9'};


	char []test= {'`','~','!','@','#','$','%','^','&','*','(',')','-','_','+','=','|','[',']','{','}',
			';',':',',','.','/','q','w','e','r','t','y','u','i','o','p'};

	String save="";

	public String en(String str) {
		
		for(int i=0;i<str.length();i++) {
			
			for(int j=0;j<abc.length;j++) {
				
				if(str.charAt(i)==abc[j])
					save=save+test[j];
			}
		}//for
		return save;
	}
}



