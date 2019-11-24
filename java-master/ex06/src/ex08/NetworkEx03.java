package ex08;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.net.MalformedURLException;
import java.net.URL;

import javax.net.ssl.HttpsURLConnection;

import org.jsoup.Jsoup;
import org.jsoup.nodes.Document;
import org.jsoup.nodes.Element;
import org.jsoup.select.Elements;

public class NetworkEx03 {

	public static void main(String[] args) throws Exception {
		URL url = new URL("https://search.naver.com/search.naver?sm=top_hty&fbm=1&ie=utf8&query=%EB%A7%9B%EC%A7%91");
		HttpsURLConnection conn = (HttpsURLConnection)url.openConnection();//스트림 연결
		
		BufferedReader br = new BufferedReader(new InputStreamReader(conn.getInputStream()));
		
		String input;
		StringBuffer sb= new StringBuffer();
		while((input = br.readLine()) !=null) {
			sb.append(input);//append 차례대로 넣겠다.
		}
		PrintWriter out = new PrintWriter("e:/String.html");
		out.println(sb.toString());
		out.close();
		
		String html = sb.toString();
		System.out.println(html);
		Document doc = Jsoup.parse(html);
		Element e = doc.selectFirst("#nxfr_htp .section_head h2");
		
		String html2 = e.text();
		System.out.println(html2);
		
	}

}
