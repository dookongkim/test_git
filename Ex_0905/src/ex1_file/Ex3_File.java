package ex1_file;

import java.io.File;

public class Ex3_File {
	public static void main(String[] args) {

		String path="C:\\java_kjw\\util\\eclipse";

		File parentFile=new File(path);

		if(!parentFile.isFile()) { 
			File[] childFile = parentFile.listFiles();

			for(int i=0;i<childFile.length;i++) {

				if( childFile[i].isDirectory()) {
					
					System.out.println(childFile[i].getName());
				}
			}

		}


	}//main
}


