package chat3;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.net.ServerSocket;
import java.net.Socket;
import java.util.Scanner;

//N:N ��� �����

public class SocketServer {
	
	// ������ �޴� ����
	private ServerSocket server;
	// �޽����� ���� ����
	private Socket socket;
	

	public SocketServer() {
		try {
			server = new ServerSocket(20000);
			while (true) {
				System.out.println("Ŭ���̾�Ʈ�� ���� ���� �����...");
				// accept()�� ����ϴٰ� Ŭ���̾�Ʈ�� �����ϸ�
				// ������ ��Ʈ��ȣ�� ������ ���� �����ϰ�
				// �ش� �������� ����� �����Ѵ�.
				socket = server.accept();
				System.out.println("��û�� ����, ���ο� ���� ������.");

				
				
			WriterThread wt = new WriterThread(socket);
			wt.start();
			ReaderThread rt = new ReaderThread(socket);
			rt.start();
				
			}

		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}// ������ ����

	class ReaderThread extends Thread {
		
		// �����͸� �޴� ��Ʈ��
		private BufferedReader reader;
		private Socket socket;
		
		public ReaderThread(Socket socket) {
			this.socket = socket;
		}
		// ���ڸ� �޴� ������
		@Override
		public void run() {
			try {
				reader = new BufferedReader(new InputStreamReader(socket.getInputStream()));
				String line = null;
				while ((line = reader.readLine()) != null) {
					System.out.println("Ŭ���̾�Ʈ : " + line);
				}
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
	}

	class WriterThread extends Thread {
		
		// �����͸� ���� ��Ʈ��
		private PrintWriter pw;
		private Socket socket;
		
		public WriterThread(Socket socket) {
			this.socket = socket;
		}
		
		// ���ο� ������� ���ڸ� ���� ������ ��� �����Ѵ�.
		@Override
		public void run() {
			Scanner sc = new Scanner(System.in);
			try {
				pw = new PrintWriter(socket.getOutputStream());
				while (true) {
					String line = sc.nextLine();
					pw.println(line);
					pw.flush();
				}
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			
		}
	}

	public static void main(String[] args) {
		new SocketServer();

	}
}
