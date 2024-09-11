package ex2_output;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;

public class Ex2_FileOutput {
	public static void main(String[] args) {

		String path="c:/IOtest/fileOutput예제.txt";

		File f=new File(path);
		
		FileOutputStream fos=null;	

		try {
			//fos 는 기본적으로 덮어쓰기를 하기 때문에
			//새로 입력한 내용으로 완전히 교체됨.
			//fos 생성할 때 true를 지정하면 이어쓰기로 변환
			fos=new FileOutputStream(f,true);
			
			String str="나는 fileOutput의 예제";
			
			//getBytes()를 통해 String을 byte배열로 변경
			//byte기반 스트림인 FileOutputStream을 통해 실제로 기록할수 있다.
			fos.write(str.getBytes());
			
			fos.close();
			
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}finally {
			try {
				if(fos!=null)
					fos.close();
			} catch (Exception e2) {
				// TODO: handle exception
			}
		}
	
		
		
	}
}
