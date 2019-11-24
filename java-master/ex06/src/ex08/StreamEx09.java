package ex08;

import java.io.FileNotFoundException;
import java.io.PrintWriter;

public class StreamEx09 {

	public static void main(String[] args) throws Exception {
		PrintWriter out = new PrintWriter("d:/file4.txt");
		for (int i = 1; i <11; i++) {
			String data = i + "번째 줄입니다.";
			out.println(data);
		}
		out.close();
	}

}
