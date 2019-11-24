package ex08;

import java.io.InputStream;
import java.io.InputStreamReader;

public class StreamEx03 {

	public static void main(String[] args) {
		InputStream in = System.in;//바이트 스트림 연결
		//1. 장점 = 바이트를 문자로 변환 (캐스팅 노필요)
		//3. 단점 : 배열이기 떄문에 크기를 미리 저장해야 함. 
		InputStreamReader reader = new InputStreamReader(in);

		try {
			//2.장점 =문자를 여러건 받을수 있음.
			char[] inData = new char[3];
			reader.read(inData);
			
			for (int i = 0; i < inData.length; i++) {
				System.out.print(inData[i]);
			}
		} catch (Exception e) {
			// TODO: handle exception
		}
	}

}
