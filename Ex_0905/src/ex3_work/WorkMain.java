package ex3_work;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class WorkMain {
	public static void main(String[] args) {

		Scanner sc=new Scanner(System.in);

		List<Person> personArr = new ArrayList<Person>();

		while(true) {

			System.out.println("1.정보추가");
			System.out.println("2.정보삭제");
			System.out.println("3.전체정보");
			System.out.println("etc.종료");
			System.out.print(">> ");

			switch (sc.nextInt()) {

			case 1: //정보 추가
				Person p=new Person();
				System.out.print("이름 : ");
				p.setName(sc.next());

				System.out.print("나이 : ");
				p.setAge(sc.nextInt());

				System.out.print("전화번호 : ");
				p.setTel(sc.next());

				//값을 받은 Person 객체를 ArrayList에 담는다
				personArr.add(p);
				System.out.println("정보 저장 성공");

				break;

			case 2://정보삭제
				System.out.print("삭제할 이름 : ");
				String name=sc.next();
				for(int i=0;i<personArr.size();i++) {
					if(name.equals(personArr.get(i).getName())){
						personArr.remove(i);
						System.out.println(name+"삭제 성공");
						break;
					}
				}

				break;

			case 3://전체정보
				System.out.println("등록 인원 : 총 "+personArr.size()+"명");
				for(int i=0;i<personArr.size();i++) {
					System.out.printf("%s / %d / %s\n ",
							personArr.get(i).getName(),
							personArr.get(i).getAge(),
							personArr.get(i).getTel());
				} 

				break;

			default:
				System.out.println("종료");
				return;
			}//switch

		}//while





	}//main

}
