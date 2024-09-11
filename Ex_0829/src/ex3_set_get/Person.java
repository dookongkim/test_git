package ex3_set_get;

import java.util.Set;

public class Person {
	
	private String name;
	private int age;
	private String regeon;
	
	//this : 현재 클래스 자신
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	public String getRegeon() {
		return regeon;
	}
	public void setRegeon(String regeon) {
		this.regeon = regeon;
	}
	
}
