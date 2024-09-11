package ex2_overloading;

public class Bread {
	
	//1
	public void makeBread() {
		System.out.println("1) makeBread()");
		System.out.println("빵을 만들었습니다");
	
	}
	//2
	public void makeBread(int n) {
		System.out.println("2) makeBread()");
		for(int i=0;i<n;i++)
			System.out.println("빵을 만들었습니다");
		System.out.println(n+"개의 빵을 만들었습니다");
	
	}
	//3
	public void makeBread(int n,String bread) {
		System.out.println("3) makeBread()");
		for(int i=0;i<n;i++)
			System.out.println(bread+"을 만들었습니다");
		System.out.println(n+"개의 "+bread+"을 만들었습니다");
		
	}
	

}