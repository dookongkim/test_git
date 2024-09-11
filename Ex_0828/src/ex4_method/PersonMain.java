package ex4_method;

import java.util.Scanner;

public class PersonMain {
	public static void main(String[] args) {
	
		Scanner sc=new Scanner(System.in);
		
		System.out.println("이름 : ");
		String name=sc.next();
		
		System.out.println("나이 : ");
		int age=sc.nextInt();
		
		Person p=new Person();
		String s=p.info(name,age);
		
		System.out.println(s);
			
		
		
		
	}//main
}
