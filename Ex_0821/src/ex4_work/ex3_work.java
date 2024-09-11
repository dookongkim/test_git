package ex4_work;

import java.util.Random;

public class ex3_work {
	public static void main(String[] args) {

		//2중for문
		//        *         1    
		//      * * *       3           
		//    * * * * *     5          
		//  * * * * * * *   7            
		//* * * * * * * * * 9           


		for(int i=0;i<5;i++) {
			
			for(int j=0;j<5+i;j++) {
					
				if(i+j>3) 
				System.out.print("* ");
				
				
				else
				System.out.print("  ");
				
			}
			System.out.println();
		}

		
		for(int i=0;i<5;i++) {
			
			for(int j=8;j>i;j--) {
				
				if(i+j<8)
				System.out.print("* ");
				
				else
				System.out.print("  ");
			}
			
			System.out.println("");
		}
		





	}//main
}
