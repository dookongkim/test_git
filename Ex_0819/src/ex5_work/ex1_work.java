package ex5_work;

public class ex1_work {
	public static void main(String[] args) {
		
		/*
		 과수원이 있다
		 배 사과 오렌지를 키우는데, 하루 생산되는 과일의 개수는 각각
		 5, 7, 5개
		 1.하루에 생산되는 과일의 총 개수
		 2.전체 과일의 시간당 평균 생산갯수 출력 
		 단, 시간당 평균을 담을 변수타입은 float 으로 한다
		 각 과일의 갯수를 담을 변수 타입은 int로 한다
		 */
		int a=5,b=7,c=5;
		int sum=a+b+c;
		System.out.println("하루에 생산되는 과일의 총 개수: "+sum);
		
		float avg,avg_a,avg_b,avg_c;
		avg=sum/24f;
		avg_a=a/24f;
		avg_b=b/24f;
		avg_c=c/24f;
		System.out.println("전체 과일의 시간당 평균 생산갯수: "+avg);
		System.out.println("배의 시간당 평균 생산갯수 : "+avg_a);
		System.out.println("사과의 시간당 평균 생산갯수 : "+avg_b);
		System.out.println("오렌지의 시간당 평균 생산갯수 : "+avg_c);
		
		
		
	}
}
