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
		// 서버쪽 accept()호출하기
		try {
			socket = new Socket("localhost", 20000);

			pw = new PrintWriter(socket.getOutputStream());

			Scanner sc = new Scanner(System.in);

			reader = new BufferedReader(new InputStreamReader(socket.getInputStream()));

			Thread t1 = new Thread(new ReaderThread());
			t1.start();

			// 메인쓰레드의 역활
			while (true) {
				String line = sc.nextLine();
				pw.println(line);
				pw.flush();// 수도관에 남은 물을 비우는것
			}
		} catch (Exception e) {

			e.printStackTrace();
		}
	}// end 생성자

	class ReaderThread implements Runnable {
		// 새로운 쓰레드
		@Override
		public void run() {
			String line = null;
			try {
				while ((line = reader.readLine()) != null) {
					System.out.println("서버로부터온 메세지 : " + line);
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
