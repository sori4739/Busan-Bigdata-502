package jsonex01;

import com.google.gson.Gson;

class Team{
	String teamName;
	int teamYear;
}

class Member{
	String username;
	int password;
	Team team;
}


public class JsonEx03 {

	public static void main(String[] args) {
		String data = "{\"username\":\"ssar\", \"password\":1234, \"team\":{\"teamName\":\"·Ôµ¥\", \"teamYear\":1980}}";
		Gson gson = new Gson();
		
		
		Member m = gson.fromJson(data, Member.class);
		System.out.println(m.password);
		System.out.println(m.username);
		System.out.println(m.team.teamName);
		System.out.println(m.team.teamYear);
		
		
	}

}
