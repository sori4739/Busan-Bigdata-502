package chat2;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.net.ServerSocket;
import java.net.Socket;
import java.util.Scanner;

//1:1��� ����� 

public class SocketServer {
	// �����͸� �޴� ��Ʈ��
	private BufferedReader reader;
	// ������ �޴� ����
	private ServerSocket server;
	// �޽����� ���� ����
	private Socket socket;
	// �����͸� ���� ��Ʈ��
	private PrintWriter pw;

	public SocketServer() {
		try {
			server = new ServerSocket(20000);
			System.out.println("Ŭ���̾�Ʈ�� ���� ���� �����...");
			// accept()�� ����ϴٰ� Ŭ���̾�Ʈ�� �����ϸ�
			// ������ ��Ʈ��ȣ�� ������ ���� �����ϰ�
			// �ش� �������� ����� �����Ѵ�.
			socket = server.accept();
			System.out.println("��û�� ����, ���ο� ���� ������.");

			reader = new BufferedReader(new InputStreamReader(socket.getInputStream()));
			pw = new PrintWriter(socket.getOutputStream());
			Thread t1 = new Thread(new WriterThread());
			t1.start();// run()�޼ҵ尡 �ڵ� ȣ���.

			String line = null;
			// ���ξ������ ���ڸ� �޴� ������ ��� �����Ѵ�.
			while ((line = reader.readLine()) != null) {
				System.out.println("Ŭ���̾�Ʈ : " + line);
			}

			reader.close();
			socket.close();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}// ������ ����

	class WriterThread implements Runnable {
		// ���ο� ������� ���ڸ� ���� ������ ��� �����Ѵ�.
		@Override
		public void run() {
			Scanner sc = new Scanner(System.in);
			while (true) {
				String line = sc.nextLine();
				pw.println(line);
				pw.flush();
			}
		}
	}

	public static void main(String[] args) {
		new SocketServer();

	}
}
