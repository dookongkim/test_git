package ex2_multy_array;

public class ex3_multyArray {
	public static void main(String[] args) {
		
		String[][] stu= {{"길순","100","90"},
						 {"길동","80","92","85"}};
		
		
		for(int i=0;i<stu.length;i++) {
			for(int j=0;j<stu[i].length;j++) {
				System.out.print(stu[i][j]+ " ");
			}
			System.out.println();
		}
		
		
		
		
	}//main
}
