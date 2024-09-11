package ex1_file_reader;

import java.io.File;
import java.io.FileReader;

public class Ex1_FileReader {
	public static void main(String[] args) {
		
		//byte 기반의 스트림이 ...Stream 클래스를 사용하여
		//1byte 단위로 읽고 쓰는 작업을 했다면,
		//char 기반의 ...Reader, ...Writer은 2byte단위로 읽고 쓸 수
		//있기 때문에 한글로 구성된 파일을 입출력 하기에 적합
		
		File f=new File("C:/IOtest/test.txt");
		FileReader fr=null;
		
		try {
			fr=new FileReader(f);
			int readChar=0;
			
			while((readChar=fr.read())!=-1 ) {
				System.out.print((char)readChar);
				
			}
			
			
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
		
		
	}
}
