package ex5_work;

public class Ex2_work {
	public static void main(String[] args) {

		/*
		 * (\t 사용)
		 02 X 01 = 02	03 X 01 = 03	04 X 01 = 04 ..... 09 X 01 = 09
		 02 X 02 = 04   03 X 02 = 06    03 X 02 = 06 ..... 09 X 02 = 18
		 ......
		 02 X 09 = 19    j X i = i*j
		 */
		
		for(int i=1;i<=9;i++) {
			
			for(int j=2;j<=9;j++) {
				System.out.printf("%02d X %02d = %02d\t",j,i,j*i);
			}
			System.out.println();
		}
		
		
		

	}//main


}
