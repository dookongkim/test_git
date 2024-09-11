package ex4_arraylist;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Ex4_ArrayList {
	public static void main(String[] args) {

		//id : aaa
		//[aaa]
		//id : bbb
		//[aaa , bbb ]
		//id : aaa
		//중복된 id




		List<String> list=new ArrayList<String>();
		Scanner sc=new Scanner(System.in);
		a:while(true) {
			System.out.print("id : ");
			String id=sc.next();
			
			if(list.contains(id)) {
				System.out.println("중복된 id");
				continue ;
			}
			
			//for(int i=0;i<list.size();i++) {
			//	if( list.get(i).equals(id)) {
			//		System.out.println("중복된 id");
			//		
			//		continue a;
			//	}
			//}//for
			
			list.add(id);
			System.out.println(list);

		}//while



	}//main
}
