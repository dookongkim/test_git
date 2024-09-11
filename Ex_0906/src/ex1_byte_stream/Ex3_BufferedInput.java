package ex1_byte_stream;

import java.io.BufferedInputStream;
import java.io.File;
import java.io.FileInputStream;
import java.util.Scanner;

public class Ex3_BufferedInput {
	public static void main(String[] args) {
		
		//입력 : a
		//a의 갯수 : 2
		
		//입력 : 홍
		//홍의 갯수 : 2
		Scanner sc=new Scanner(System.in);
		
		File f=new File("c:/IOtest/test.txt");
		byte[] read=new byte[(int)f.length()];

		FileInputStream fis=null;
		BufferedInputStream bis=null;
		
		int count=0;
		
		try {
			fis=new FileInputStream(f);
			bis=new BufferedInputStream(fis);
			
			bis.read(read);
			String res=new String(read).trim();
			
			
			System.out.print("입력 : ");
			String input=sc.next();
			char k;
			k=input.charAt(0);
			
			for(int i=0;i<res.length();i++) {
				
				if( k==res.charAt(i) ) {
					count++;
				}
			}
			System.out.println(input+"의 갯수 : "+count);
			
			
		} catch (Exception e) {
			// TODO: handle exception
		}finally {
			try {
				if(fis!=null)
					fis.close();
				if(bis!=null)
					bis.close();
				
			} catch (Exception e2) {
				// TODO: handle exception
			}
		}
		
		
		
	}//main
}
