package jsonex01;


import com.google.gson.Gson;


class User{
	String username ;
	int password ;
}


public class JsonEx02 {

	public static void main(String[] args) {
		String data = "{\"username\":\"ssar\", \"password\":1234}";
		System.out.println(data);
		
		

		
		Gson gson = new Gson();
		User u = gson.fromJson(data, User.class);
		System.out.println(u.username);
		System.out.println(u.password);

	}

}
