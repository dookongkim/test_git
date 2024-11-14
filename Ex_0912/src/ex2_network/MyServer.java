package ex2_network;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.ServerSocket;
import java.net.Socket;

public class MyServer extends Thread{

	ServerSocket ss;
	
	
	
	public MyServer() {
		
	 
		try {
			
			ss=new ServerSocket(3000);
			
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}
	
	
	
	
	
	@Override
	public void run() {
		
		while(true) {
			
			try {
				
				Socket s= ss.accept();
				String ip=s.getInetAddress().getHostAddress();
				
				//클라이언트는 접속과 동시에 문자열을 전송하기 때문에
				//서버에서 그 문자열을 읽어와야 함
				BufferedReader reader=new BufferedReader(new InputStreamReader( s.getInputStream() ));
				
				String msg=reader.readLine();
				
				System.out.println(ip+" : "+msg);
				
				
			} catch (Exception e) {
				// TODO: handle exception
			}
		}
		
	
	}
	
}
