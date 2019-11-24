package yts;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.net.MalformedURLException;
import java.net.URL;
import javax.net.ssl.HttpsURLConnection;

import com.google.gson.Gson;
/**
 * 1.URl ��ü ����
 * 2.HttpsURLConnection ��ü ����(Stream ����)
 * 3.BufferedReader ��ü ����
 * 4.while���� ���ؼ� readLine()�Լ��� �ٿ�ε�
 * 5.�ٿ���� ������(JsonString)�� StringBuilder�� ���
 * 6.JsonString�� ��Ī�Ǵ� Ŭ���� �����!!
 * 7.JsonString�� Gson��ü�� fromJson�Լ��� �̿��Ͽ� �ڹ� Object�� ��ȯ
 */
public class YtsApp {

	public static void main(String[] args) throws Exception {
		URL url = new URL("https://yts.lt/api/v2/list_movies.json?limit=3&sort_by=rating");
		HttpsURLConnection conn = (HttpsURLConnection)url.openConnection();
		conn.setRequestProperty("User-Agent", "Mozilla/5.0 (Windows NT 6.1; WOW64) AppleWebKit/537.11 (KHTML, like Gecko) Chrome/23.0.1271.95 Safari/537.11");
		BufferedReader br = new BufferedReader(new InputStreamReader(conn.getInputStream()));
		String input;
		StringBuffer sb = new StringBuffer();
		while((input = br.readLine()) !=null) {
			sb.append(input);
		}
//		System.out.println(sb.toString());
		Gson gson = new Gson();
		Yts yts = gson.fromJson(sb.toString(), Yts.class);
		System.out.println(yts.status);
		System.out.println(yts.status_message);
		System.out.println(yts.data.limit);
		System.out.println(yts.data.movie_count);
		System.out.println(yts.data.page_number);
		
		for (Movie m : yts.data.movies) {
			System.out.println(m.title);
			System.out.println(m.year);
			System.out.println(m.rating);
			System.out.println(m.synopsis);
			System.out.println(m.medium_cover_image);
			
			
		}
		
	


	}

}
