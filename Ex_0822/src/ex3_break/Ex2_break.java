package ex3_break;

import java.util.Random;

public class Ex2_break {
	public static void main(String[] args) {
		
		
		//반복문 내부에 switch가 있다면
		//break는 반복문이 아닌 switch문을 빠져나오는 용도로 사용
		while(true) {
			
			int rnd=new Random().nextInt(3)+1;
			
			switch(rnd) {
			
			case 1:
				System.out.println("1생성");
				break;
				
			case 2:
				System.out.println("2 생성");
				break;
			
			default :
				System.out.println("default");
				break;
			}//switch
			if(rnd==3)
				break;
			
			
		}//while
		
		
		
	}//main
}
