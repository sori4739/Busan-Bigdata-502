package ex08;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.net.MalformedURLException;
import java.net.URL;

import javax.net.ssl.HttpsURLConnection;

public class StreamEx01 {

	public static void main(String[] args) {
		//A ------------------ B ����
		//(1) ip�ּ�:32bit = 42�� 9õ�� 192.168.0.100 (255,255,255,255) ipv4
		//64bit -- �� --ipv6
		
		String url = "https://news.naver.com/main/read.nhn?sid1=100&oid=011&aid=0003610015";
		
		try {
			URL u = new URL(url);// �ּҸ� ��� ��ü
			//stream�� ������ ��ü
			HttpsURLConnection conn = (HttpsURLConnection)u.openConnection();
			System.out.println(conn.getInputStream());//�ٿ�ε�
			
			BufferedReader in = new BufferedReader(new InputStreamReader(conn.getInputStream()));
			String input;
            StringBuilder sb = new StringBuilder();

            while ((input = in.readLine()) != null) {
               sb.append(input);
            }
            in.close();

            String html = sb.toString();
            System.out.println(html);
			
			
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

}
