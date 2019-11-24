package chat1;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.ServerSocket;
import java.net.Socket;
//1:1 ��� �ܹ���
public class SoketServer {
	
	ServerSocket serverSocket;
	Socket socket;
	BufferedReader reader;
	
	//���� = ��ȭ��
	public SoketServer() {
		
		try {
			//1.�������� ����
			serverSocket = new ServerSocket(10000);
			
			//2.Ŭ���̾�Ʈ�� ���� ���� ���
			System.out.println("Ŭ���̾�Ʈ�� ���� ���� �����...");
			//while���� ���鼭 �����ϴ� ���� ���Ѻ��� ����.
			socket = serverSocket.accept();//����ϰ��ִٰ� ���ο� ���������� ����ϴ� ������ ����� �ٸ� Ŭ���̾�Ʈ ������ ��ٸ���,������ ��ٸ��� ���ؼ� �����尡 �ʿ��ϴ�. �۾�������
			System.out.println("Ŭ���̾�Ʈ �����.");
			
			reader = new BufferedReader(new InputStreamReader(socket.getInputStream()));
			
			String input =null;
			while((input=reader.readLine())!=null) {
				System.out.println("Ŭ���̾�Ʈ �޼��� : "+ input);
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
