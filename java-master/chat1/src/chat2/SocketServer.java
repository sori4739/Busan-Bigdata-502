package chat2;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.net.ServerSocket;
import java.net.Socket;
import java.util.Scanner;

//1:1통신 양방향 

public class SocketServer {
	// 데이터를 받는 스트림
	private BufferedReader reader;
	// 연결을 받는 소켓
	private ServerSocket server;
	// 메시지를 받을 소켓
	private Socket socket;
	// 데이터를 쓰는 스트림
	private PrintWriter pw;

	public SocketServer() {
		try {
			server = new ServerSocket(20000);
			System.out.println("클라이언트로 부터 접속 대기중...");
			// accept()로 대기하다가 클라이언트로 접속하면
			// 임의의 포트번호로 소켓을 새로 생성하고
			// 해당 소켓으로 통신을 시작한다.
			socket = server.accept();
			System.out.println("요청이 성공, 새로운 소켓 생성됨.");

			reader = new BufferedReader(new InputStreamReader(socket.getInputStream()));
			pw = new PrintWriter(socket.getOutputStream());
			Thread t1 = new Thread(new WriterThread());
			t1.start();// run()메소드가 자동 호출됨.

			String line = null;
			// 메인쓰레드는 문자를 받는 역할을 계속 수행한다.
			while ((line = reader.readLine()) != null) {
				System.out.println("클라이언트 : " + line);
			}

			reader.close();
			socket.close();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}// 생성자 종료

	class WriterThread implements Runnable {
		// 새로운 쓰레드는 문자를 쓰는 역할을 계속 수행한다.
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
