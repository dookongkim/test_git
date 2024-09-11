package ex4_operator;

public class Ex3_operator {
	public static void main(String[] args) {
		
		//논리연산자
		//비교연산자를 통한 연산이 두개 이상 필요할때 사용
		int age=30;
		int limit = 35;
		boolean res = limit-age>5  &&  (age+=5) >= 30;
		System.out.println("&&연산의 결과 : "+res);
		System.out.println(age);
		
		
		//||(or)연산자
		int i1=10,i2=20;
		res=(i1+=10)>=20 || (i2+=2)-10 ==11;
		System.out.println("||연산의 결과 : " +res);
		System.out.println(i2);
		
		//!(not)연산자
		System.out.println(!res);
		
		System.out.println(res);
		
		res=!res; //자주사용
		System.out.println(res);
		
		System.out.println("------------------");
		
		//증감연산자
		//1씩 증가시키거나 1씩 감소시키는 여산자
		//선행증감과 후행증감의 차이점
		int a=10;
		System.out.println("a: " + ++a);
		
		int b=10;
		System.out.println("b: "+ b++ );
		System.out.println(b);
		
		b--;
		++b;
		b++;
		b--;
		--b;
		b++;
		++b;
		System.out.println(b--);
		System.out.println(b);
		
		//여러값 증가시킬때 b += 2
		System.out.println("--------------");
		
		//삼항(조건)연산자 ( ?   :  )
		//하나의 조건을 정의하여 그 조건이 참일때와 거짓일때에 대해 원하는 결과를 얻기위해 사용
		int aa=10;
		int bb=15;
		res =++aa >=bb ? false:true;
		System.out.println(res);
		
		aa=10;
		bb=20;
		char res2 =(aa+=aa)==bb ? 'Y' : 'N';
		System.out.println(res2);
		
		System.out.println("-------------");
		
		a=10;
		b=12;
		char O =++a>=b||a-2<=b && b+1-b >=0 &&(a+=b)-(a%b)>10 ? 'O' : 'X';
		                                          
		
		System.out.println(O);
	             
	}//main

}
