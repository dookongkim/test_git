package ex2_value_type;

public class Ex1_valueType {
		public static void main(String[] args) {
			
			/*
			기본 자료형
			1.논리형 : boolean
			2.문자형 : char
			3.정수형 : byte     1byte  (-128 ~ 127)
					 short    2byte  (-32768 ~ 32767)
					 int      4byte  (-21억 ~ 21억)
					 long     8byte  (-900경 ~ 900경)
			4.실수형 : float    4.x byte
					 double   8.x byte
			  */
			
			//변수: 자료형과 함께 사용하며 값을 저장하는 공간
			//변수 선언 규칙
			//자료형 변수명; (선언)
			//변수명=값;   (대입)
			//자료형 변수명=값;(초기화)
			
			//변수명 작성 규칙
			//1.숫자로 시작할 수 없다
			//2._를 제외한 특수문자 사용할 수 없다
			//3.한글을 사용하지 않는다
			//4.변수의 첫글자는 반드시 소문자로 작성한다
			
			//논리형
			//논리형은 true , false 중 한개만 넣을수 있다
			boolean b1;
			b1=true;
			b1=false;
			System.out.println("b1 : "+ b1);
			
			//문자형: 홑따옴표 안에 딱 한글자만 저장할 수 있는 자료형
			char ch='A';
			System.out.println("ch : " + ch);
			
			ch++;
			System.out.println("ch : "+ch);
			
			//정수형: 소수점이 없는 정수 데이터를 저장할 수 있는 자료형
			//byte b = 128; -> 표현범위를 벗어나는 값은 담을 수 없다
			int n=2100000000;
			long lo=2200000000L;
			long lo2=100;
			
			System.out.println("n : "+n);
			System.out.println("lo : "+lo);
			
			//실수형: 소수점을 갖고있는 값을 저장할 수 있는 자료형
			float f=3.14f;
			double d=3.14;
			f=100;
			d=100;
			System.out.println("f: "+f);
			System.out.println("d: "+d);
			
		}//main
}
