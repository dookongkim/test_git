package ex1_string;

public class Ex2_StringMethod {
	public static void main(String[] args) {
		
		//String 클래스의 메서드 (함수)
		//메서드란 어떤 작업을 수행하기 위한 명령문들의 집합
		//반복적으로 사용되는 코드를 줄이기 위해서 반드시 필요
		
		String name ="Hong Gil Dong";
		int index=name.length();
		System.out.println("name의 길이"+index);
		
		
		                    //앞에서 몇번째에 있는지 알려주는 메서드
		index = name.indexOf('g');       
		System.out.println("첫 문자 g의 위치 : "+index);
		
							//문장이 시작하는 위치
		index=name.indexOf("Gil");
		System.out.println("문장 Gil 의 위치 : "+index);
		
							//뒤에서 몇번째에 있는지.
		
		index=name.lastIndexOf('g');
		System.out.println("마지막 g의 위치 : "+index);
		
							//문장에서 2번째 문자 추출
		
		char c = name.charAt(5);
		System.out.println("추출한 문자 : "+c);
		
							//지정한 지점부터 문장출력
		String sub=name.substring(5);
		System.out.println("추출한 문장 : "+sub);
		
		sub=name.substring(5,10);
		System.out.println("추출한 문장2 : "+sub);
		
		
		String fruit="apPle";
		//equals(): 대소문자 구별
		//equalsIgnoreCase():대소문자 구별 X
		if(fruit.equalsIgnoreCase("Apple"))
			System.out.println("값이 같습니다");
		else 
			System.out.println("값이 틀립니다");
		
		
		String id=" abc123 ";
		//앞 뒤의 의미없는 공백 제거 (중간공백 제거 불가)
		String id_check=id.trim();
		if(id_check.equals("abc123"))
			System.out.println("로그인 성공");
		
		//String으로 받은 숫자를 int 로 변형
		String number="100";
		int n=Integer.parseInt(number); 
		System.out.println(n-10);
		
		//java에서 boolean,int등의 기본자료형을 쓸 수 있도로 ㄱ해주는
		//부모 타입의 클래스를 Wrapper클래스라고 부른다
		//boolean->Boolean
		//char->Character
		//int->Integer
		//byte->Byte
		//short->Short
		//long->Long
		//float->Float
		//double->Double
		
	}//main
}
