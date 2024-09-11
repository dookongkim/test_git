package ex1_file;

import java.io.File;

public class Ex4_File {
	public static void main(String[] args) {
		
		String path="c:/Iotest/aaa";
		
		File f=new File(path);
		
		//file 클래스가 참조하는 path 경로가 존재하지 않으면
		if( !f.exists()) {
			//물리적으로 폴더들을 생성하는 메서드
			f.mkdirs();
		
		}
		else
			System.out.println("이미 폴더가 있음");
		
		
		

	}//main
}
