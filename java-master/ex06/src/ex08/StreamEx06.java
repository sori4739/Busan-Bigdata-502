package ex08;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class StreamEx06 {

	public static void main(String[] args) throws Exception {
		FileOutputStream output = new FileOutputStream("d:/file.txt");
		System.out.println("file.txt 파일이 생성되었습니다.");
		output.close();
	}

}
