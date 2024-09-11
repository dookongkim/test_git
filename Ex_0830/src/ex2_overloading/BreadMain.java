package ex2_overloading;

public class BreadMain {
	public static void main(String[] args) {
		
		//1)makeBread()
		//빵을 만들었습니다
		//2)makeBread()
		//빵을 만들었습니다
		//빵을 만들었습니다
		//2개의 빵을 만들었습니다
		//3)makeBread()
		//크림빵을 만들었습니다
		//크림빵을 만들었습니다
		//2개의 크림빵을 만들었습니다
		
		Bread bd=new Bread();
		
		bd.makeBread();
		
		bd.makeBread(2);

		bd.makeBread(2,"크림빵");
		
		
	}//main
}
