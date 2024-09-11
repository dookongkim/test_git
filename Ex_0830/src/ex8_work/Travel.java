package ex8_work;

import java.util.Scanner;

//관광객 클래스
public class Travel { 

	public String[] name;
	public int[] age;
	int cnt;
	static String dest;
	Scanner sc=new Scanner(System.in);
	//2
	public void InsertInfo(int n) {
		name=new String[n];
		age=new int[n];

		for(int i=0;i<n;i++) {
			System.out.print((i+1)+". 이름 :");
			String names=sc.next();
			name[i]=names;

			System.out.print((i+1)+". 나이 :");
			int ages=sc.nextInt();
			age[i]=ages;
			System.out.println("-----------");
			cnt++;
			dest="석굴암";
		}//for
	}
	
	public void Tourist() {//1번
		
		for(int i=0;i<cnt;i++) {
			System.out.println((i+1)+". 이름 :"+name[i]);
			System.out.println((i+1)+". 나이 :"+age[i]);
			System.out.println((i+1)+". 목적지 :"+dest);
			System.out.println("--------------");
		}
	}
	public void Change() {
		System.out.print("어디로 변경? : ");
		dest=sc.next();
	}
		

	}




