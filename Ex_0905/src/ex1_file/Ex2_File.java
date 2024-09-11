package ex1_file;

import java.io.File;

public class Ex2_File {
	public static void main(String[] args) {
		
		String path = "C:\\java_kjw\\util\\eclipse";
		
		File f=new File(path);
		
		if(f.isDirectory()) {
			//file 클래스가 참조하는 경로의 하위 요소들의
			//이름을 모두 가져와서 names 배열에 담는다
			String[]names = f.list();
			
			
			//names 에 담긴 하위 요소들의 이름 반복문으로 출력
			for(int i=0;i<names.length;i++) {
				System.out.println(names[i]);
			}//for
		}
		
	}//main
}