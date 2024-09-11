package ex3_work;

import java.io.BufferedInputStream;
import java.io.BufferedOutputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.util.Random;
import java.util.Scanner;

public class HangMain {
	public static void main(String[] args) {
		System.out.println("***HANGMAN***");
		Random r=new Random();
		Scanner sc=new Scanner(System.in);

		String [] word= {"apple","project","computer"};
		int random=r.nextInt(word.length);
		int cnt=0;

		String answer=word[random];// 랜덤단어 지정
		char[] quiz=new char[answer.length()];//quiz 배열에 단어 넣음
		char[] myanswer=answer.toCharArray();
		
		
		for(int i=0;i<quiz.length;i++) 
			quiz[i]='☆';	//☆☆☆☆☆☆☆

		System.out.print("Word : ");
		for(int i=0;i<quiz.length;i++) {
			System.out.print(quiz[i]);
		}
		char[] exit=new char[answer.length()];
		//단어맞추기 시작
		a:while(true) {
			System.out.print(" >> ");
			String input=sc.next();
			char in=input.charAt(0);
			cnt++;
			if(input.length()>1||in<'a'||in>'z') {
				System.out.println("한글자의 영 소문자만 입력 가능합니다.");
				continue a;
			}
			for(int i=0;i<quiz.length;i++) {
				if(quiz[i]!='☆') {
					if(myanswer[i]==in) {
						System.out.println(in+"은(는) 이미 입력한 문자입니다.");
						continue a;
					}
				}
				if(in==myanswer[i]) {
					quiz[i]=in;
					exit[i]=quiz[i];
				}
				
			}//for
			
			String ex="";
			System.out.print("Word : ");
			for(int i=0;i<quiz.length;i++) {
				System.out.print(quiz[i]);
				ex+=exit[i];
			}
			System.out.println();
			
			if(ex.equals(answer)) {
				System.out.println(answer+" 정답");
				System.out.println(cnt+"회 만에 정답");
				break;
			}

		}//while


		//---------------------------------------
		//점수 저장하기
		boolean go=true;
		File f=new File("c:/IOtest/myscore.txt");

		FileInputStream fis=null;
		BufferedInputStream bis=null;
		FileOutputStream fos=null;
		BufferedOutputStream bos=null;

		String score=""+cnt;

		byte[] b_read=new byte[(int)f.length()];

		try {
			fis=new FileInputStream(f);
			bis=new BufferedInputStream(fis);
			bis.read(b_read);
			String myscore=new String(b_read);
			if(Integer.parseInt(myscore)>cnt) {
				System.out.println("최고기록 달성");
				go=true;
			}
			else {
				go=false;
			}
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
		//------------------------------------
		if(go) {
			try {
				fos=new FileOutputStream(f);
				bos=new BufferedOutputStream(fos);
				bos.write(score.getBytes());
				bos.flush();
			} catch (Exception e) {
				// TODO: handle exception
			}finally {
				try {
					if(fos!=null)
						fos.close();
					if(bos!=null)
						bos.close();
				} catch (Exception e2) {
					// TODO: handle exception
				}

			}
		}
		// cnt 저장 완료 





	}//main
}
