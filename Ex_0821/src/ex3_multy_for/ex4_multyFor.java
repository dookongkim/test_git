package ex3_multy_for;


public class ex4_multyFor {
	public static void main(String[] args) {

		//A B C D
		//E F G H
		//I J K L

		char alpha='A';
		
		for(int i=0;i<3;i++) {
			
			for(int j=0;j<4;j++) {
				
				System.out.printf("%c ",alpha++);
				
			}
		System.out.println();
		}
	}//main
}
