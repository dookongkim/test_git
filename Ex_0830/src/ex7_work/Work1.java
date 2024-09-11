package ex7_work;



public class Work1 {

	//입력 : aabbcca
	//결과 : abc
	private String res = "";


	public void getResult(String str) {
		System.out.print("결과 : ");

		b:for(int i=0;i<str.length();i++) {
			//겹치는게 있다면

			for(int j=1;j<=i;j++) {
				if(str.charAt(i)==str.charAt(i-j)) {
					continue b;
				}		
			}
			System.out.print(str.charAt(i));
			//겹치는게 없다면 출력


		}//for
		System.out.println();

	}//Result

	private String result="a";
	public void Result(String input) {

		for(int i=0;i<input.length();i++) {


			if(result.indexOf(input.charAt(i))==-1){// result에 값이 없으면(-1) 저장,있으면 패스
				result+=input.charAt(i);
			}
		}
		System.out.println("결과 : "+result);
	}


}
