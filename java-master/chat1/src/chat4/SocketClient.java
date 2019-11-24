package chat4;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.net.Socket;
import java.util.Scanner;

public class SocketClient {
	
	private Socket socket;
	private BufferedReader reader;
	private PrintWriter pw;
	private Scanner sc;
	
	public SocketClient() {
		try {
			socket = new Socket("localhost" , 5000);
			SocketThread st = new SocketThread();
			st.start();
			
			pw = new PrintWriter(socket.getOutputStream(), true);
			sc =new Scanner(System.in);
			while(true) {
				String line = sc.nextLine();
				pw.println(line);
			}
		} catch (Exception e) {
			e.printStackTrace();
		}finally {
			pw.close();
			sc.close();
		}
	}
	
	class SocketThread extends Thread{
		@Override
		public void run() {
			try {
				reader = new BufferedReader(new InputStreamReader(socket.getInputStream()));
				String line;
				while((line = reader.readLine()) != null) {
					System.out.println(line);
				}
			} catch (IOException e) {
				e.printStackTrace();
			}
			
		
		}
	}
	
	
	public static void main(String[] args) {
		new SocketClient();
	}

}
