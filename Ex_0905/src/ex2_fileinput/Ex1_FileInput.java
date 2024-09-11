package ex2_fileinput;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.util.stream.Stream;

public class Ex1_FileInput {
	public static void main(String[] args) {
		
		String path ="C:\\Iotest/test.txt";
		File f=new File(path);
		
		if(f.exists()) {
			try {
				FileInputStream fis=new FileInputStream(f);
				int code=0;
				
				
				//path 경로에서 더이상 읽을게 없을 때 까지
				while((code=fis.read()) !=-1) {
					
					char ch=(char)code;
					System.out.print(ch);
					
				}//while
				
			} catch (Exception e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			
			
			
		}
		
		
		
	}//main
}
