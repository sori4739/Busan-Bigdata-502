package chat3;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.net.Socket;
import java.net.UnknownHostException;
import java.util.Scanner;

public class SocketClient {

	private Socket socket;
	private PrintWriter pw;
	private BufferedReader reader;

	public SocketClient() {
		// ������ accept()ȣ���ϱ�
		try {
			socket = new Socket("localhost", 20000);

			pw = new PrintWriter(socket.getOutputStream());

			Scanner sc = new Scanner(System.in);

			reader = new BufferedReader(new InputStreamReader(socket.getInputStream()));

			Thread t1 = new Thread(new ReaderThread());
			t1.start();

			// ���ξ������� ��Ȱ
			while (true) {
				String line = sc.nextLine();
				pw.println(line);
				pw.flush();// �������� ���� ���� ���°�
			}
		} catch (Exception e) {

			e.printStackTrace();
		}
	}// end ������

	class ReaderThread implements Runnable {
		// ���ο� ������
		@Override
		public void run() {
			String line = null;
			try {
				while ((line = reader.readLine()) != null) {
					System.out.println("�����κ��Ϳ� �޼��� : " + line);
				}
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}

		}
	}

	public static void main(String[] args) {
		new SocketClient();
	}
}
