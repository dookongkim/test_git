package ex3_casting;

public class Ex1_promotion {
		public static void main(String[] args) {
			
			//캐스팅(형변환)
			//1.promotion casting
			//큰 자료형에 작은 자료형이 대입되는 것
			double dd=100.5; //8byte
			int n =200;  //4byte
			dd = n;
			System.out.println(dd);
			
			char c='D';   //2byte
			int i=100;    //4byte
			i=c;
			System.out.println(i);
			
			
			
		}//main
}
