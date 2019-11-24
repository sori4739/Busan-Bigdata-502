package ex08;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;

public class StreamEx04 {

	public static void main(String[] args) {
		BufferedReader br = new BufferedReader(
			new InputStreamReader(System.in)	
			);
		
		while(true) {
			try {
				String inData = br.readLine();
				System.out.println(inData);
			} catch (Exception e) {
				e.printStackTrace();
			}
		}
		
	}

}
