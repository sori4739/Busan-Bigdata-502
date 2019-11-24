package chat1;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.ServerSocket;
import java.net.Socket;
//1:1 통신 단방향
public class SoketServer {
	
	ServerSocket serverSocket;
	Socket socket;
	BufferedReader reader;
	
	//소켓 = 전화기
	public SoketServer() {
		
		try {
			//1.서버소켓 생성
			serverSocket = new ServerSocket(10000);
			
			//2.클라이언트로 부터 접속 대기
			System.out.println("클라이언트로 부터 접속 대기중...");
			//while문을 돌면서 접속하는 것을 지켜보고 있음.
			socket = serverSocket.accept();//대기하고있다가 새로운 직접적으로 통신하는 소켓을 만들고 다른 클라이언트 연결을 기다린다,연결을 기다리기 위해서 쓰레드가 필요하다. 작업을해줄
			System.out.println("클라이언트 연결됨.");
			
			reader = new BufferedReader(new InputStreamReader(socket.getInputStream()));
			
			String input =null;
			while((input=reader.readLine())!=null) {
				System.out.println("클라이언트 메세지 : "+ input);
			}
			
			reader.close();
			socket.close();
			serverSocket.close();
			
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
	
	public static void main(String[] args) {
		new SoketServer();
	}
}
