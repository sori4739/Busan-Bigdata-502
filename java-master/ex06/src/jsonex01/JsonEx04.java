package jsonex01;

import java.util.ArrayList;

import com.google.gson.Gson;

class Member2{
	String username;
	int password;
	ArrayList<String> hobby= new ArrayList<String>();
	
}
public class JsonEx04 {

	public static void main(String[] args) {
		String data = "{\"username\":\"ssar\", \"password\":1234, \"hobby\":[\"≥Û±∏\",\"√‡±∏\",\"≥¨Ω√\"]}";
		System.out.println(data);
		
		
		Gson gson = new Gson();
		Member2 m2 = gson.fromJson(data, Member2.class);
		System.out.println(m2.username);
		System.out.println(m2.password);
		System.out.println(m2.hobby);
		
		



	}

}
