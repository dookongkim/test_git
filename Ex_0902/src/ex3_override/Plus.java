package ex3_override;

public class Plus extends Calculator {

	@Override
	public int getResult(int n, int m) {
		System.out.printf("%d\n",n+m);
		return n+m;
	}
	
}