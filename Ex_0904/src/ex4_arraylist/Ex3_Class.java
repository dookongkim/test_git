package ex4_arraylist;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;

public class Ex3_Class {
	public static void main(String[] args) {

		//set,map,list 등의 객체를 생성할 때
		//부모클래스 (인터페이스) 로 시작하여 자식클래스를 생성하는것이 
		//메모리에 공간을 잡는데 있어서 유리하다
		
		HashSet<Integer> hs=new HashSet<Integer>();
		
		Set<Integer> hs2=new HashSet<Integer>();

		
		Map<Integer, String> map= new HashMap<Integer, String>();

		List<String> list=new ArrayList<String>();

	}//main
}
