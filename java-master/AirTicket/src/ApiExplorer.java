import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.UnsupportedEncodingException;
import java.net.HttpURLConnection;
import java.net.URL;
import java.net.URLEncoder;

import com.google.gson.Gson;

public class ApiExplorer {

	public static void search(String depName, String arrName, String depPlandTime) throws Exception {
		  StringBuilder urlBuilder = new StringBuilder("http://openapi.tago.go.kr/openapi/service/DmstcFlightNvgInfoService/getFlightOpratInfoList"); /*URL*/
	        urlBuilder.append("?" + URLEncoder.encode("ServiceKey","UTF-8") + "=dFtRenz23n044g9bYi9dD7kTbiMWdGB7ztFIpv2pMpjZChF2fMMgxwcxYky2mUbeYgm6ShD6jNylcqrgThtrkg%3D%3D"); /*Service Key*/
	        urlBuilder.append("&" + URLEncoder.encode("numOfRows","UTF-8") + "=" + URLEncoder.encode("20", "UTF-8")); /*�� ������ ��� ��*/
	        urlBuilder.append("&" + URLEncoder.encode("pageNo","UTF-8") + "=" + URLEncoder.encode("1", "UTF-8")); /*������ ��ȣ*/
	        urlBuilder.append("&" + URLEncoder.encode("depAirportId","UTF-8") + "=" + URLEncoder.encode(Util.airportID.get(depName), "UTF-8")); /*��߰���ID*/
	        urlBuilder.append("&" + URLEncoder.encode("arrAirportId","UTF-8") + "=" + URLEncoder.encode(Util.airportID.get(arrName), "UTF-8")); /*��������ID*/
	        urlBuilder.append("&" + URLEncoder.encode("depPlandTime","UTF-8") + "=" + URLEncoder.encode(depPlandTime, "UTF-8")); /*�����*/
	        urlBuilder.append("&" + URLEncoder.encode("_type","UTF-8") + "=" + URLEncoder.encode("json", "UTF-8")); /*�����*/
	        URL url = new URL(urlBuilder.toString());
	        HttpURLConnection conn = (HttpURLConnection) url.openConnection();
	        conn.setRequestMethod("GET");
	        conn.setRequestProperty("Content-type", "application/json");
	        System.out.println("Response code: " + conn.getResponseCode());
	        BufferedReader rd;
	        if(conn.getResponseCode() >= 200 && conn.getResponseCode() <= 300) {
	            rd = new BufferedReader(new InputStreamReader(conn.getInputStream(),"UTF-8"));
	        } else {
	            rd = new BufferedReader(new InputStreamReader(conn.getErrorStream(),"UTF-8"));
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
	        
	        //Gson�� ���ؼ� �ڹ� ������Ʈ�� ��ȯ�ϱ�
	        
	        Gson gson = new Gson();
	        Airplane airplane = gson.fromJson(jsonData, Airplane.class);
	        for (Item i  : airplane.response.body.items.item) {
	        	System.out.println("�װ��� :"+i.airlineNm);
	        	System.out.println("�װ��� :"+i.vihicleId);
	        	System.out.println("��߽ð� :"+i.arrPlandTime);
	        	System.out.println("�����ð� :"+i.depPlandTime);
				System.out.println("���ڳ�� �ݾ� :"+i.economyCharge);
				System.out.println("����Ͻ� �ݾ� :"+i.prestigeCharge);
				
			}
	        
	}
	public static void main(String[] args) {
		Util.airPortSet();
		Util.airLineSet();
		
		try {
			search("����", "����", "20190905");
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}

}
