package ex08;

import java.io.InputStream;
import java.io.InputStreamReader;

public class StreamEx03 {

	public static void main(String[] args) {
		InputStream in = System.in;//����Ʈ ��Ʈ�� ����
		//1. ���� = ����Ʈ�� ���ڷ� ��ȯ (ĳ���� ���ʿ�)
		//3. ���� : �迭�̱� ������ ũ�⸦ �̸� �����ؾ� ��. 
		InputStreamReader reader = new InputStreamReader(in);

		try {
			//2.���� =���ڸ� ������ ������ ����.
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
