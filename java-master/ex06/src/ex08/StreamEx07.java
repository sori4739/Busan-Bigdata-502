package ex08;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;

public class StreamEx07 {

	public static void main(String[] args) throws Exception {
		FileOutputStream output = new FileOutputStream("d:/file2.txt");
		for (int i = 1; i < 11; i++) {
			String data = i +" ��° ���Դϴ�.\r\n";//������ \r\n, ������\n
			output.write(data.getBytes());
		}
		output.close();
	}

}
