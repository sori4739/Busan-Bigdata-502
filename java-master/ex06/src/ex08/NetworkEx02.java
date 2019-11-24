package ex08;

import java.io.IOException;

import org.jsoup.Jsoup;
import org.jsoup.nodes.Document;

public class NetworkEx02 {

	public static void main(String[] args) throws Exception {
		Document doc = Jsoup.connect("https://search.naver.com/search.naver?sm=top_hty&fbm=1&ie=utf8&query=%EB%A7%9B%EC%A7%91").get();
		

	}

}
