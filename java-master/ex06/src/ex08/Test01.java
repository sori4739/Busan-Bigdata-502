package ex08;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.net.MalformedURLException;
import java.net.URL;

import javax.net.ssl.HttpsURLConnection;

public class Test01 {

	public static void main(String[] args) throws Exception {
		URL url = new URL(
				"https://blog.naver.com//PostView.nhn?blogId=jagasary1&logNo=221564060817&from=search&redirect=Log&widgetTypeCall=true&topReferer=https%3A%2F%2Fsearch.naver.com%2Fsearch.naver%3Fsm%3Dtab_hty.top%26where%3Dnexearch%26query%3D%25EA%25B0%2580%25EC%2595%25BC%25EC%2584%25A0%25EC%25A7%2580%25EA%25B5%25AD%25EB%25B0%25A5%26oquery%3D%25EB%258F%2599%25EC%259D%2598%25EB%258C%2580%25ED%2595%2599%25EA%25B5%2590%2B%25EC%2588%2598%25EA%25B5%25AC%25EB%25A0%2588%26tqi%3DUTOQ7sp0J14ssewMZGwssssstX8-151607&directAccess=false");
		HttpsURLConnection conn = (HttpsURLConnection) url.openConnection();// 스트림 연결

		BufferedReader br = new BufferedReader(new InputStreamReader(conn.getInputStream()));

		String input;
		StringBuffer sb = new StringBuffer();
		while((input = br.readLine()) !=null) {
			sb.append(input);
		}
		PrintWriter out = new PrintWriter("e:/blog.html");
		out.println(sb.toString());
		out.close();

	}

}
