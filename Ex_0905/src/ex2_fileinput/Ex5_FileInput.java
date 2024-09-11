package ex2_fileinput;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;

public class Ex5_FileInput {
	public static void main(String[] args) {

		//text.txt의 내용을 읽어
		//회문인지 아닌지 판단
		//--------------------
		//abc은(는) 회문이 아닙니다

		String path="C:/IOtest/test.txt";
		File f=new File(path);
		byte[] b_read=new byte[(int)f.length()];
		FileInputStream fis=null;

		String ori="";//원본
		String rev="";//원본을 뒤집어서 저장할 변수

		if(f.exists()) {

			try {

				fis =new FileInputStream(f);
				//fis 가 읽어온 내용을 b_read 배열에 1byte씩 담는다
				fis.read(b_read);

				//byte 배열을 String 타입으로 변환
				ori =new String(b_read);

				//원본을 뒤집어서 저장
				for(int i=ori.length()-1;i>=0;i--) {
					rev +=ori.charAt(i);


				}//for

				//결과확인
				if(ori.equals(rev)) {
					System.out.println(ori+"는 회문입니다");

				}else {
					System.out.println(ori+"는 회문이 아닙니다");
				}


			} catch (Exception e) {
				// TODO: handle exception
			} finally {

					try {
						if(fis !=null)
						fis.close();
					} catch (IOException e) {
						// TODO Auto-generated catch block
						e.printStackTrace();
					}
			}

		}




	}//main


}
