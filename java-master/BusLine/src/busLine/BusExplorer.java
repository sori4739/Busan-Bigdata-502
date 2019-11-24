package busLine;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.UnsupportedEncodingException;
import java.net.HttpURLConnection;
import java.net.URL;
import java.net.URLEncoder;
import java.util.Scanner;

import com.google.gson.Gson;

public class BusExplorer {

	public static void search(String nodeNm) throws Exception {
		   StringBuilder urlBuilder = new StringBuilder("http://61.43.246.153/openapi-data/service/busanBIMS2/stopArr"); /*URL*/
	        urlBuilder.append("?" + URLEncoder.encode("ServiceKey","UTF-8") + "=dFtRenz23n044g9bYi9dD7kTbiMWdGB7ztFIpv2pMpjZChF2fMMgxwcxYky2mUbeYgm6ShD6jNylcqrgThtrkg%3D%3D"); /*Service Key*/
	        urlBuilder.append("&" + URLEncoder.encode("ServiceKey","UTF-8") + "=" + URLEncoder.encode("-", "UTF-8")); /*공공데이터포털에서 받은 인증키*/
	        urlBuilder.append("&" + URLEncoder.encode("bstopid","UTF-8") + "=" + URLEncoder.encode("199040101", "UTF-8")); /*정류소ID*/
	        urlBuilder.append("&" + URLEncoder.encode("_type","UTF-8") + "=" + URLEncoder.encode("json", "UTF-8")); /*출발일*/
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
	       //System.out.println(sb.toString());
	        String jsonData = sb.toString();
	        
	       // GSON뿌리기
	        Gson gson = new Gson();
	        Bus bus = gson.fromJson(jsonData, Bus.class);
	        for (Item i : bus.response.body.items.item) {
	        	System.out.println(i.arsNo);
				System.out.println("정류소 아이디 : "+i.bstopId);
				System.out.println("노선 정류소 순번 : "+i.bstopIdx);
				System.out.println("버스 종류: "+i.bustype);
				System.out.println("첫번째 차량번호 : "+i.carNo1);
				System.out.println("두번째 차량번호 : "+i.carNo2);
				System.out.println("GPS X좌표 : "+i.gpsX);
				System.out.println("GPS Y좌표 : "+i.gpsY);
				System.out.println("노선 ID : "+i.lineid);
				System.out.println("버스 번호 : "+i.lineNo);
				System.out.println("저상버스 : "+i.lowplate1);
				System.out.println("저상버스 : "+i.lowplate2);
				System.out.println("남은 도착시간 : "+i.min1);
				System.out.println("남은 도착시간 : "+i.min2);
				System.out.println("정류소 명 : "+i.nodeNm);
				System.out.println("남은 정류소 수 : "+i.station1);
				System.out.println("남은 정류소 수 : "+i.station2);
				System.out.println("========================");
	        }
	}
		
	public static void main(String[] args) throws Exception {
		Scanner sc = new Scanner(System.in);
		System.out.println("정류소명을 입력하세요.");
		String nodeNm = sc.next();
		
		BusExplorer.search(nodeNm);
	}

}
