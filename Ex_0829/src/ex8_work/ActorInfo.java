package ex8_work;

import java.util.Scanner;

public class ActorInfo {
	//배우검색:이병헌
	//광해
	//레드
	//지아이조

	//배우검색:홍길동
	//해당 배우가 존재하지 않습니다.
int cnt=0;
	public void actorSearch(String[][]actor,String name) {
		for( int i = 0; i<actor.length;i++) {

			if(actor[i][0].equals("["+ name+"]")){
				for(int j=0;j<actor[i].length;j++) {
					System.out.println(actor[i][j]);
				}

			}//if

			else {
				cnt++;
				if(cnt>=actor.length)
				System.out.println("해당 배우의 정보가 없습니다");
			}
		}



	}//for

}




