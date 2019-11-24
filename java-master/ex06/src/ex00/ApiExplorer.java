package ex00;
import java.io.InputStreamReader;
import java.net.HttpURLConnection;
import java.net.URL;
import java.net.URLEncoder;

import com.google.gson.Gson;

import java.io.BufferedReader;
import java.io.IOException;

public class ApiExplorer {
    public static void main(String[] args) throws Exception {
        StringBuilder urlBuilder = new StringBuilder("http://newsky2.kma.go.kr/service/SecndSrtpdFrcstInfoService2/ForecastGrib"); /*URL*/
        urlBuilder.append("?" + URLEncoder.encode("ServiceKey","UTF-8") + "=dFtRenz23n044g9bYi9dD7kTbiMWdGB7ztFIpv2pMpjZChF2fMMgxwcxYky2mUbeYgm6ShD6jNylcqrgThtrkg%3D%3D"); /*Service Key*/
        urlBuilder.append("&" + URLEncoder.encode("ServiceKey","UTF-8") + "=" + URLEncoder.encode("dFtRenz23n044g9bYi9dD7kTbiMWdGB7ztFIpv2pMpjZChF2fMMgxwcxYky2mUbeYgm6ShD6jNylcqrgThtrkg%3D%3D", "UTF-8")); /*���� ����*/
        urlBuilder.append("&" + URLEncoder.encode("base_date","UTF-8") + "=" + URLEncoder.encode("20190904", "UTF-8")); /*��15�� 12�� 1�� ��ǥ*/
        urlBuilder.append("&" + URLEncoder.encode("base_time","UTF-8") + "=" + URLEncoder.encode("1100", "UTF-8")); /*06�� ��ǥ(���ô���) -�Žð� 40�� ���� ȣ��*/
        urlBuilder.append("&" + URLEncoder.encode("nx","UTF-8") + "=" + URLEncoder.encode("98", "UTF-8")); /*���������� X ��ǥ��*/
        urlBuilder.append("&" + URLEncoder.encode("ny","UTF-8") + "=" + URLEncoder.encode("75", "UTF-8")); /*���������� Y ��ǥ��*/
        urlBuilder.append("&" + URLEncoder.encode("numOfRows","UTF-8") + "=" + URLEncoder.encode("10", "UTF-8")); /*�� ������ ��� ��*/
        urlBuilder.append("&" + URLEncoder.encode("pageNo","UTF-8") + "=" + URLEncoder.encode("1", "UTF-8")); /*������ ��ȣ*/
        urlBuilder.append("&" + URLEncoder.encode("_type","UTF-8") + "=" + URLEncoder.encode("json", "UTF-8")); /*xml(�⺻��), json*/
       String myUrl = urlBuilder.toString();
//        System.out.println(myUrl);
        
        URL url = new URL(myUrl);
        HttpURLConnection conn = (HttpURLConnection) url.openConnection();
        conn.setRequestMethod("GET");
        conn.setRequestProperty("Content-type", "application/json");
//        System.out.println("Response code: " + conn.getResponseCode());
        BufferedReader rd;
        if(conn.getResponseCode() >= 200 && conn.getResponseCode() <= 300) {
            rd = new BufferedReader(new InputStreamReader(conn.getInputStream()));
        } else {
            rd = new BufferedReader(new InputStreamReader(conn.getErrorStream()));
        }
        StringBuilder sb = new StringBuilder();
        String line;
        while ((line = rd.readLine()) != null) {
            sb.append(line);
        }
        rd.close();
        conn.disconnect();
        System.out.println(sb.toString());
        
        String jsonData = sb.toString();
        
        //�ڹ� ������Ʈ ��ȯ
        //1 Ŭ���� �����
        //2 Gson��ü �̿� �Ľ�
        //3 ���� ������ ��� ��� (1100, ������)
        Gson gson = new Gson();
        ResPonseData r = gson.fromJson(jsonData, ResPonseData.class);
      //  System.out.println(r.response.getHeader().resultCode);
        
        for (Item i : r.response.getBody().items.item) {
			if(i.category.equals("T1H")) {
				System.out.println(i.obsrValue);
			}
		}
      
    }
}
