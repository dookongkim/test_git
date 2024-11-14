package test;

import java.io.Serializable;

public class Food implements Serializable {
	private String name;
	private int kcal;

	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getKcal() {
		return kcal;
	}
	public void setKcal(int kcal) {
		this.kcal = kcal;
	}

	public Food() {
		
		
	}//기본 생성자
	
	public Food(String name,int kcal) {
	this.name=name;
	this.kcal=kcal;
		
	}//매개변수 생성자
	
	@Override
	public String toString() {
		
		return super.toString();
	}
}
