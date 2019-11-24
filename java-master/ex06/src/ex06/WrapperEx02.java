package ex06;

import java.util.HashMap;

public class WrapperEx02 {

	public static void main(String[] args) {
		String data = "이름:강호동,금액:10000";//통신으로 이런 값을 받음
		
		HashMap<String, Integer> account = 
				new HashMap<String, Integer>();
		account.put("강호동", 500000);
		account.put("이수근", 300000);
		
		//Parsing (구문 분석)
		String parse[] = data.split(",");
		//parse.length 크기가 2
		System.out.println(parse[0]);
		System.out.println(parse[1]);
		
		String temp1[] = parse[0].split(":");//length = 2
		String temp2[] = parse[1].split(":");//length = 2
		
		String name = temp1[1];
		int money = Integer.parseInt(temp2[1]);
		
		System.out.println("name : "+name);
		System.out.println("money : "+money);
		System.out.println("강호동 계좌 : "+account.get("강호동"));
		
		System.out.println(money + account.get("강호동"));
		
		

	}

}
