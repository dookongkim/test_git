package ex5_class_array;

public class Vending {


	private Can []cans=new Can[5];
	private int money; 

	//음료수의 종류와 가격을 초기화
	public Vending() {
		cans[0]=new Can("coke",1000);
		cans[1]=new Can("fanta",800);
		cans[2]=new Can("vita",1200);
		cans[3]=new Can("icetea",900);
		cans[4]=new Can("coffee",700);
	}
	
/*	public void init() {
		for(int i=0;i<cans.length;i++) {
			cans[i]=new Can();
		}
			cans[0].setName("coke");
			cans[0].setPrice(1000);

			cans[1].setName("fanta");
			cans[1].setPrice(800);

			cans[2].setName("vita");
			cans[2].setPrice(1200);

			cans[3].setName("icetea");
			cans[3].setPrice(900);

			cans[4].setName("coffee");
			cans[4].setPrice(700);
		
	}
*/
	//들어온 금액(m)으로 마실수 있는 음료의 목록 출력
	public void showCans(int m) {
		money = m;

		for(int i=0;i<cans.length;i++) {
			if(cans[i].getPrice()<=money) {
				System.out.printf("%s - %d\n",cans[i].getName(),cans[i].getPrice());
			}

		}
	}	
	
	//음료를 선택하고 잔액을 계산하는 메서드
	public void selectCan(String name) {

		for(int i=0;i<cans.length;i++) {
			if(cans[i].getName().equalsIgnoreCase(name)) {
				System.out.println(name + "선택됨");
				System.out.println("잔액 : "+(money-cans[i].getPrice())+"원");
			}

		}
	}
}

