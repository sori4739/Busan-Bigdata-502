package ex08;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileOutputStream;

public class StreamEx05 {

	public static void main(String[] args) {
		byte[] b = {7,51,3,4,-1,24};
		
		
		try {
			FileOutputStream fout = new  FileOutputStream("d:\\test.txt");
			for (int i = 0; i < b.length; i++) {
				fout.write(b[i]);
			}
			fout.close();
		} catch (Exception e) {
			System.out.println("d:\\test.txt 에 저장할수 없습니다.");
			return;
		}
		System.out.println("d:\\test.txt 를 저장하였습니다.");
	}

}
