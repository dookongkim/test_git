package ex1_file_reader;

import java.io.File;
import java.io.FileReader;

public class Ex2_FileReader {
	public static void main(String[] args) {
		
		//text.txt 의 내용을 읽어서
		//알파벳 대문자의 개수와, 소문자의 개수를 출력
		//---------------
		//대문자:3
		//소문자:8
		
		File f=new File("C:/IOtest/test.txt");
		FileReader fr=null;
		
		int cnt_small=0;
		int cnt_big=0;
		try {
			fr=new FileReader(f);
			int readChar=0;
			
			while((readChar=fr.read())!=-1 ) {
				if( (char)readChar>='a'&& (char)readChar<='z') {
					cnt_small++;
				}
				else if((char)readChar>='A' && (char)readChar<='Z') {
					cnt_big++;
				}
				
			}
			System.out.println("대문자 : "+cnt_big);
			System.out.println("소문자 : "+cnt_small);
			
		} catch (Exception e) {
			// TODO: handle exception
		}finally {
			try {
				if(fr!=null)
					fr.close();
			} catch (Exception e2) {
				// TODO: handle exception
			}
			
		}
		
		
		
	}//main
}
