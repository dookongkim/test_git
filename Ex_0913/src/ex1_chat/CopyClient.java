package ex1_chat;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.net.Socket;

public class CopyClient extends Thread{

	Socket s;
	BufferedReader in;
	PrintWriter out;
	ChatServer server;
	String ip;

	public CopyClient(Socket s,ChatServer cs) {
		//생성자에서 원본클라이언트의 Socket 정보와 Server 정보를 받는다
		this.s=s;
		this.server=cs;

		try {

			out=new PrintWriter(s.getOutputStream(),true);
			in=new BufferedReader(new InputStreamReader(s.getInputStream()));

			ip=s.getInetAddress().getHostAddress();


		} catch (Exception e) {
			// TODO: handle exception
		}


	}//생성자



	@Override
	public void run() {

		while(true) {

			try {
				String msg=in.readLine();
				if(msg.equals("xx:~!X")) {
					out.println("xx:~!X");
					
					server.removeClient(this);
					break;	
				}
				
				server.sendMessage(ip + " : "+msg);


			} catch (Exception e) {
				// TODO: handle exception
			}
		}//while


	}//run
}
