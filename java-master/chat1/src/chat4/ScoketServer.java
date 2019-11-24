package chat4;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.net.ServerSocket;
import java.net.Socket;
import java.util.Vector;

import javax.print.attribute.standard.Severity;

public class ScoketServer {

	private ServerSocket serverSocket;
	private Vector<SocketThread> vc; // Ŭ���̾�Ʈ ������ ������ �ִ� ����Ʈ
	
	
	
	public ScoketServer() {
		try {
			serverSocket = new ServerSocket(5000);
			vc = new Vector<>();

			while (true) {
				System.out.println("Ŭ���̾�Ʈ ��û ����� ...");
				Socket socket = serverSocket.accept();
				System.out.println("Ŭ���̾�Ʈ ��û ����...");
				SocketThread st = new SocketThread(socket);
				st.start();
				vc.add(st);// Vector(����ȭ) = ArrayList(�񵿱�ȭ)

			}
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	class SocketThread extends Thread {
		private String username;
		private Socket socket;
		private BufferedReader reader;
		private PrintWriter pw;

		public SocketThread(Socket socket) {
			this.socket = socket;
		}
		
		@Override
		public void run() {
			try {
				reader = new BufferedReader(new InputStreamReader(socket.getInputStream()));
				pw = new PrintWriter(socket.getOutputStream(),true);
				
				//���� �޽����� ���̵�� �޴´�.
				pw.println("���̵� �Է��ϼ���");
				username = reader.readLine();
				
				String line;
				while((line = reader.readLine()) != null) {
					System.out.println(username+" : "+line);
					for (SocketThread st : vc) {
						st.pw.println(username+" : "+line);
						
					} 
				}
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			super.run();
		}

	}

	public static void main(String[] args) {
		new ScoketServer();
	}
}
