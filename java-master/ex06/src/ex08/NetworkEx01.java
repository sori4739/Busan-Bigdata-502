package ex08;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.net.MalformedURLException;
import java.net.URL;
import java.util.Scanner;

import javax.net.ssl.HttpsURLConnection;

public class NetworkEx01 {

	public static void main(String[] args) throws Exception {
		URL url = new URL("https://www.naver.com");
		//Stream 연결!! conn 객체는? 선!!
		HttpsURLConnection conn = (HttpsURLConnection)url.openConnection();//다운 캐스팅 
		
		//Scanner sc= new Scanner(conn.getInputStream());
		BufferedReader br = new BufferedReader(new InputStreamReader(conn.getInputStream()));
		
		String input;
		StringBuffer sb= new StringBuffer();
		while((input = br.readLine()) !=null) {
			sb.append(input);
		}
		
		PrintWriter out = new PrintWriter("e:/naver.html");
		out.println(sb.toString());
		out.close();
	}
}
