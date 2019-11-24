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
		//�μ� 2�� (ip�ּ� , ��Ʈ)
		try {
			socket = new Socket("localhost" , 10000);
			//�������� ����
			pw = new PrintWriter(socket.getOutputStream());
			//Ű���� ����
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
