package ex08;

import java.io.FileWriter;
import java.io.IOException;

public class StreamEx08 {

	public static void main(String[] args) throws Exception {
		FileWriter fw = new FileWriter("d:\\file3.txt");
		for (int i = 1; i < 11; i++) {
			String data = i + " 번째 줄입니다.\r\n";
			fw.write(data);
		}
		fw.close();

	}

}
