package chat1;

import java.io.IOException;
import java.io.PrintWriter;
import java.net.Socket;
import java.net.UnknownHostException;
import java.util.Scanner;

public class SoketClient {

	Socket socket;
	PrintWriter pw;
	
	public SoketClient() {
		//localhost, 127.0.0.1, 192.168.0.44
		//인수 2개 (ip주소 , 포트)
		try {
			socket = new Socket("localhost" , 10000);
			//서버소켓 연결
			pw = new PrintWriter(socket.getOutputStream());
			//키보드 연결
			Scanner sc =new Scanner(System.in);
			
			while(true) {
				String output = sc.next();
				pw.println(output);
				pw.flush();
			}
			
			
		} catch (Exception e) {
			e.printStackTrace();
		}
			
	}
	
	public static void main(String[] args) {
		new SoketClient();

	}

}
