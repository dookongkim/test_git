package ex8_work;

import java.util.Scanner;

public class ActorMain {
	public static void main(String[] args) {
		//배우검색:이병헌
		//광해
		//레드
		//지아이조
		
		//배우검색:홍길동
		//해당 배우가 존재하지 않습니다.
		
		 
		String[][]actor = {{"[송강호]","박쥐","괴물","관상"},
							{"[마동석]","범죄도시","더파이브","챔피언"},
							{"[이병헌]","광해","레드","지아이조"}};
		Scanner sc=new Scanner(System.in);
		System.out.print("배우검색 :");
		String name=sc.next();
		
		ActorInfo ai=new ActorInfo();
		
		ai.actorSearch(actor,name);
		
		

	}//main
}
