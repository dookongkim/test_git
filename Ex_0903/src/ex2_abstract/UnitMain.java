package ex2_abstract;

public class UnitMain {
	public static void main(String[] args) {
		
		Terran t1=new Terran("Marin", 100, false);
		t1.decEnergy();
		System.out.println("t1 : "+t1.getEnergy());
		
		Zerg z1=new Zerg("Queen",200,true);
		z1.decEnergy();
		System.out.println("z1 : "+z1.getEnergy());
		
		Protoss p1=new Protoss("Observer", 30, true);
		p1.decEnergy();
		System.out.println("p1 : "+p1.getEnergy());
	}//main
}