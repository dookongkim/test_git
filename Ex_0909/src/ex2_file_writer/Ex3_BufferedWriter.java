package ex2_file_writer;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;

public class Ex3_BufferedWriter {
	public static void main(String[] args) {
		File f=new File("C:/IOtest/bufferedwriter예제.txt");
		
		FileWriter fw=null;
		BufferedWriter bw=null;
		
		try {
			fw=new FileWriter(f);
			bw=new BufferedWriter(fw);
			
			bw.write("bufferedwrite의 예제");
			bw.newLine();//줄바꿈 
			bw.write("두번째 줄");
			
			bw.flush();
			
			
		} catch (Exception e) {
			// TODO: handle exception
		}finally {
			try {
				if(bw!=null)
					bw.close();
				if(fw!=null)
					fw.close();
				
			} catch (Exception e2) {
				// TODO: handle exception
			}
		
		}
		
	}
}
