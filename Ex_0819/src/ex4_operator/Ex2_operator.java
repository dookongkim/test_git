package ex4_operator;

public class Ex2_operator {
		public static void main(String[] args) {
				
			//비교연산자
			//변수나 상수의 값을 비교하여 참과 거짓을 판단하는 연산자
			int n1=10;
			int n2=20;
			boolean res = n1<n2;
			System.out.println(res);
			
			res = (n1+=n1)>n2;
			System.out.println(res);
			
			res= n1<=n2;
			System.out.println(res);
			
			res= n1==n2;
			System.out.println(res);
			
			res= n1 !=n2;
			System.out.println(res);
			
		}
}