package ex08;

import java.io.InputStream;

/**
 * ��Ʈ���� ��������, ���������� Ʋ�� ���� ������,��׸� ���� ������ ����.
 * A - B ���� ����� �Ϸų�!! ��Ʈ���� �ʿ�!!
 * ���� �帧 = ��Ʈ��(Stream)
 * 
 * @author it
 *
 */
public class StreamEx02 {
	public static void main(String[] args) {
		//Ű����� ���� ����� ����Ʈ ��Ʈ�� ��ü
		InputStream in = System.in;
		//in �� �ԷµȰ��� ����� ���� ����Ÿ���� ��Ʈ�� ���´� �ƽ�Ű �ڵ� ����.
		try {
			int inData = in.read();//���� ����Ÿ�� int , �ƽ�Ű �ڵ� ,����� 1byte�� �޴´�.
			System.out.println(inData);
			char c = (char)inData;
			System.out.println(c);
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
}
