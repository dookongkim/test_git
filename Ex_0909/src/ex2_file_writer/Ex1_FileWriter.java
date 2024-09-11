package ex2_file_writer;

import java.io.File;
import java.io.FileWriter;

public class Ex1_FileWriter {
	public static void main(String[] args) {
		File f=new File("c:/IOtest/filewriter.txt");
		FileWriter fw=null;
		
		
		
		
		try {
			fw=new FileWriter(f,true);
			String str="나는 filewriter의 예제 입니다.\n";
			fw.write(str);
			
		} catch (Exception e) {
			// TODO: handle exception
		}finally {
			try {
				if(fw!=null)
					fw.close();
			} catch (Exception e2) {
				// TODO: handle exception
			}
			
		}
		
	
		
	}//main
}