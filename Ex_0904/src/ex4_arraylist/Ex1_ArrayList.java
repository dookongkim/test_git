package ex4_arraylist;

import java.util.ArrayList;

public class Ex1_ArrayList {
	public static void main(String[] args) {
		
		ArrayList<Integer> list=new ArrayList<Integer>();
		list.add(10);
		list.add(20);
		list.add(20); 
		list.add(30);
		
		//1번 인덱스의 값을 30으로 수정
		list.set(1, 30);
		//2번 인덱스 삭제, 메모리 공간도 삭제
		list.remove(2);
		list.remove(2);
		//list에 담긴 모든 내용 완전히 삭제
		//list.clear();
		//list.get(i);
		//1번 인덱스에 20을 새롭게 추가
		list.add(1,20);
		
		
		System.out.println(list.size());
		System.out.println(list);
		//System.out.println( list.get(0) );
		
		for(int i=0;i<list.size();i++) {
			System.out.println(list.get(i));
		}
		
		
	}//main
	
}
