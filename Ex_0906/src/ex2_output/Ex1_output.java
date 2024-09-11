package ex2_output;

import java.io.PrintStream;

public class Ex1_output {
	public static void main(String[] args) {
		
		//PrintStream은 OutputStream의 대표적인 자식클래스
		//화면에 데이터를 출력하기 위한 클래스
		
		PrintStream ps=System.out;
		
		ps.write(65);
		ps.write('B');
		ps.write('\n');
		ps.write('1');
		
		//Stream을 닫아줘야 더이상 write 하지 않고 콘솔에 데이터 출력
		ps.close();
		
		
		
	}//main
}
