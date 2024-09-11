package ex4_constructor;

public class Pen {

	private String company;
	private String color;
	private int price;
	
	public Pen() {
		company="barunson";
		price=200;
		color="blue";
	}
	
	public Pen(String color) {
		this.color=color;
				
	}
	
	public Pen(int price,String color) {
		company="monami";
		this.price=price;
		this.color=color;
	}

	
	//getter 
	public String getCompany() {
		return company;
	}

	public String getColor() {
		return color;
	}

	public int getPrice() {
		return price;
	}
	
	
	
}
