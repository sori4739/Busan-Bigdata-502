package chat3;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.net.ServerSocket;
import java.net.Socket;
import java.util.Scanner;

//N:N 통신 양방향

public class SocketServer {
	
	// 연결을 받는 소켓
	private ServerSocket server;
	// 메시지를 받을 소켓
	private Socket socket;
	

	public SocketServer() {
		try {
			server = new ServerSocket(20000);
			while (true) {
				System.out.println("클라이언트로 부터 접속 대기중...");
				// accept()로 대기하다가 클라이언트로 접속하면
				// 임의의 포트번호로 소켓을 새로 생성하고
				// 해당 소켓으로 통신을 시작한다.
				socket = server.accept();
				System.out.println("요청이 성공, 새로운 소켓 생성됨.");

				
				
			WriterThread wt = new WriterThread(socket);
			wt.start();
			ReaderThread rt = new ReaderThread(socket);
			rt.start();
				
			}

		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}// 생성자 종료

	class ReaderThread extends Thread {
		
		// 데이터를 받는 스트림
		private BufferedReader reader;
		private Socket socket;
		
		public ReaderThread(Socket socket) {
			this.socket = socket;
		}
		// 문자를 받는 쓰레드
		@Override
		public void run() {
			try {
				reader = new BufferedReader(new InputStreamReader(socket.getInputStream()));
				String line = null;
				while ((line = reader.readLine()) != null) {
					System.out.println("클라이언트 : " + line);
				}
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
	}

	class WriterThread extends Thread {
		
		// 데이터를 쓰는 스트림
		private PrintWriter pw;
		private Socket socket;
		
		public WriterThread(Socket socket) {
			this.socket = socket;
		}
		
		// 새로운 쓰레드는 문자를 쓰는 역할을 계속 수행한다.
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
